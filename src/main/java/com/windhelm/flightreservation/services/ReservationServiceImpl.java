package com.windhelm.flightreservation.services;

import com.windhelm.flightreservation.dto.ReservationRequest;
import com.windhelm.flightreservation.entities.Flight;
import com.windhelm.flightreservation.entities.Passenger;
import com.windhelm.flightreservation.entities.Reservation;
import com.windhelm.flightreservation.repos.FlightRepository;
import com.windhelm.flightreservation.repos.PassengerRepository;
import com.windhelm.flightreservation.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        //Make Payment

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).get();

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setPhone(request.getPassengerPhone());
        passenger.setEmail(request.getPassengerEmail());
        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);
        Reservation savedReservation = reservationRepository.save(reservation);
        return savedReservation;
    }
}
