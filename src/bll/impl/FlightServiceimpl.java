package bll.impl;

import bean.Flight;
import bll.IFlightService;

import java.util.Set;

public class FlightServiceimpl implements IFlightService {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println("flight传到bll了");
        System.out.println(flight);
    }

    @Override
    public Set<Flight> getAllFlight() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departure) {
        return null;
    }

    @Override
    public Flight getFlightBydepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String detinationAirPort) {
        return null;
    }

    @Override
    public void undateFlight(Flight flight) {

    }



}
