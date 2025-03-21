<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <div class="box">
        <h2>Output Is In The Console</h2>
        <h4 style="margin-top: 20px">Calculator<h4>
        <form action="calculate">
            <label for="num1">Enter 1st number: </label>
            <input type="text" id="num1" name="num1" />
            <label for="num2">Enter 2nd number: </label>
            <input type="text" id="num2" name="num2" />
            <input type="submit" value="Calculate">
        </form>
    </div>
</body>
</html>