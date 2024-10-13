import fetch from 'node-fetch';

async function decodeMessage(docURL) {
    try {
        // Fetch the Google Doc from the URL
        let response = await fetch(docURL);
        let html = await response.text();

        // Extract the table from the HTML content
        let parsedRows = extractTableData(html);
        // Debugging
        console.log("Parsed Rows: ", parsedRows);

        // Create a 2D grid from the parsed rows
        let grid = createGrid(parsedRows);

        // Print the message in the correct order
        printGrid(grid);
    } catch (error) {
        console.error("Error fetching or processing the document:", error);
    }
}

// Extract table data from the HTML

function extractTableData(html) {
    const cells = /<td.*?>(.*?)<\/td>/g;
    let matches = [...html.matchAll(cells)];

    let parsedRows = [];
    for (let i = 0; i < matches.length; i += 3) {
        let x = parseInt(matches[i][1].replace(/<[^>]*>?/gm, '').trim());
        let character = matches[i + 1][1].replace(/<[^>]*>?/gm, '').trim();
        let y = parseInt(matches[i + 2][1].replace(/<[^>]*>?/gm, '').trim());
        
        if (!isNaN(x) && !isNaN(y) && character) {
            parsedRows.push({ x, y, character });
        }
    }

    return parsedRows;
}


// Function to create a 2D grid and place the characters in it
function createGrid(parsedRows) {
    let grid = [];

    // Find max dimensions for grid
    let maxXSize = Math.max(...parsedRows.map(item => item.x));
    let maxYSize = Math.max(...parsedRows.map(item => item.y));

    // Initialize the grid with spaces (or another filler character)
    for (let i = 0; i <= maxYSize; i++) {
        grid[i] = new Array(maxXSize + 1).fill(' ');
    }

    // Place the characters in the grid based on their coordinates
    parsedRows.forEach(item => {
        if (!isNaN(item.x) && !isNaN(item.y) && item.character) {
            if (grid[item.y] && grid[item.y][item.x] !== undefined) {
                grid[item.y][item.x] = item.character;
            }
        }
    });

    return grid;
}

// Function to print the grid
function printGrid(grid) {
    grid.forEach(row => {
        console.log(row.join(''));
    });
}

// Function Call
decodeMessage('https://docs.google.com/document/d/e/2PACX-1vSHesOf9hv2sPOntssYrEdubmMQm8lwjfwv6NPjjmIRYs_FOYXtqrYgjh85jBUebK9swPXh_a5TJ5Kl/pub');
