// canvas to display game board

// draw a grid
function drawGrid(ctx, cellSize) {
    ctx.beginPath();
    for (let i = 0; i <= 6; i++) {
        ctx.moveTo(0, i * cellSize);
        ctx.lineTo(cols * cellSize, i * cellSize);
    }
    for (let j = 0; j <= 6; j++) {
        ctx.moveTo(j * cellSize, 0);
        ctx.lineTo(j * cellSize, 6 * cellSize);
    }
    ctx.strokeStyle = "#ddd";
    ctx.stroke();
}
