<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alien</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <div class="box">
        <h2>Output Is In The Console</h2>
        <h4 style="margin-top: 20px">Alien<h4>
        <form action="addAlien">
            <label for="id">Enter ID: </label>
            <input type="text" id="id" name="id" />
            <label for="name">Enter Alien Name: </label>
            <input type="text" id="name" name="name" />
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>