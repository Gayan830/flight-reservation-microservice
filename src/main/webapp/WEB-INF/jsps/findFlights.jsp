<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Flights</title>
</head>
<body>
    <h2>Find Flights</h2>
    <form action="findFlights" method="post">
        From: <input type="text" name="from">
        To: <input type="text" name="to">
        Departure Date: <input type="text" name="departureDate">
        <input type="submit" value="search">
    </form>
</body>
</html>
