document.getElementById("gradeButton").addEventListener("click", calculateAverageAndSum);

function calculateAverageAndSum() {
    const mark1 = parseFloat(document.getElementById("mark1").value);
    const mark2 = parseFloat(document.getElementById("mark2").value);
    const mark3 = parseFloat(document.getElementById("mark3").value);
    const mark4 = parseFloat(document.getElementById("mark4").value);
    const mark5 = parseFloat(document.getElementById("mark5").value);

    // Check if any of the inputs are empty or invalid
    if (isNaN(mark1) || isNaN(mark2) || isNaN(mark3) || isNaN(mark4) || isNaN(mark5)) {
        alert("Please enter valid marks in all fields.");
        return;
    }

    // Calculate the total and average
    const total = mark1 + mark2 + mark3 + mark4 + mark5;
    const average = total / 5;

    // Display the results
    alert(`Total Marks: ${total}\nAverage: ${average.toFixed(2)}`);

    // Check if the average is greater than 30 and display the appropriate message
    if (average > 30) {
        alert("Congrats! You passed.");
    } else {
        alert("Better luck next time.");
    }
}
