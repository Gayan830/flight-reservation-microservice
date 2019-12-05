package com.windhelm.flightreservation.services;

import com.windhelm.flightreservation.dto.ReservationRequest;
import com.windhelm.flightreservation.entities.Reservation;

public interface ReservationService {

    Reservation bookFlight(ReservationRequest request);
}
