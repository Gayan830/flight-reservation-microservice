package com.windhelm.flightreservation.controllers;

import com.windhelm.flightreservation.dto.ReservationRequest;
import com.windhelm.flightreservation.entities.Flight;
import com.windhelm.flightreservation.entities.Reservation;
import com.windhelm.flightreservation.repos.FlightRepository;
import com.windhelm.flightreservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap){
        Flight flight = flightRepository.findById(flightId).get();
        modelMap.addAttribute("flight",flight);
        return "showCompleteReservation";
    }

    @RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request, ModelMap modelMap){
        Reservation reservation = reservationService.bookFlight(request);
        modelMap.addAttribute("msg","reservation created successfully and the id : "+reservation.getId());
        return "reservationConfirmation";
    }
}
