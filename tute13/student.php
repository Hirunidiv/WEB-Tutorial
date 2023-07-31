<?php
// Create a connection to the database
$conn = new mysqli('localhost', 'username', 'password', 'university');

// Check if the connection was successful
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Prepare and execute the SQL query to retrieve student data from the table
$sql = "SELECT * FROM students";
$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html>
<head>
  <title>Students List</title>
</head>
<body>
  <h2>Students List</h2>
  <table border="1">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Password</th>
    </tr>
    <?php
    // Loop through the result set and display data in table rows
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<td>".$row['id']."</td>";
            echo "<td>".$row['name']."</td>";
            echo "<td>".$row['email']."</td>";
            echo "<td>".$row['password']."</td>";
            echo "</tr>";
        }
    } else {
        echo "<tr><td colspan='4'>No students found.</td></tr>";
    }
    ?>
  </table>
</body>
</html>

<?php
// Close the database connection
$conn->close();
?>
