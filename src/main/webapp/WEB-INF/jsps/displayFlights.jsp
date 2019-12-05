<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Display Flights</title>
</head>
<body>
    <h2>Flights</h2>
    <table>
        <tr>
            <th>Airline</th>
            <th>Departure City</th>
            <th>Arrival City</th>
            <th>Departure Time</th>
        </tr>
        <c:forEach items="${flights}" var="flight">
            <tr>
                <td>${flight.operatingAirlines}</td>
                <td>${flight.departureCity}</td>
                <td>${flight.arrivalCity}</td>
                <td>${flight.estimatedDepartureTime}</td>
                <td><a href="showCompleteReservation?flightId=${flight.id}">select</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
