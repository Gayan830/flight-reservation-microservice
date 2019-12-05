package com.windhelm.flightreservation.controllers;

import com.windhelm.flightreservation.dto.ReservationUpdateRequest;
import com.windhelm.flightreservation.entities.Reservation;
import com.windhelm.flightreservation.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestController {

    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping("/reservations/{id}")
    public Reservation findReservation(@PathVariable("id") long id){
        return reservationRepository.findById(id).get();
    }



    @RequestMapping("/reservationsGetMapping")
    public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
        Reservation reservation = reservationRepository.findById(request.getId()).get();
        reservation.setNumberOfBags(request.getNumberOfBags());
        reservation.setCheckedIn(request.getCheckedIn());
        return reservationRepository.save(reservation);
    }
}