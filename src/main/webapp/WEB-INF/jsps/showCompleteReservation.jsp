<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Complete Reservation</title>
</head>
<body>

    <h2>Complete Reservation</h2>

    Airline: ${flight.operatingAirlines}<br>
    Airline: ${flight.departureCity}<br>
    Airline: ${flight.arrivalCity}<br>

    <form action="completeReservation" method="post">
        <pre>
        <h2>Passenger Detail</h2>
        First Name : <input type="text" name="passengerFirstName">
        Last Name : <input type="text" name="passengerLastName">
        Email : <input type="email" name="passengerEmail">
        phone : <input type="text" name="passengerPhone">

        <h2>Card Detail</h2>
        Name: <input type="text" name="nameOnTheCard">
        Card No: <input type="text" name="cardNo">
        Expiry Date: <input type="text" name="expirationDate">
        Three Digit Sec Code: <input type="text" name="securityCode">
        <input type="hidden" name="flightId" value="${flight.id}">
        <input type="submit" value="confirm"/>
        </pre>
    </form>
</body>
</html>
