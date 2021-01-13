package bll.impl;

import bean.Flight;
import bll.IFlightService;
import dao.IFlightDao;
import dao.impl.FlightDaoimpl;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceimpl implements IFlightService {

    IFlightDao iFlightDao;
    public FlightServiceimpl(){//dao层接口
        iFlightDao=new FlightDaoimpl();
    }//构造方法

    @Override
    public void insertFlight(Flight flight) throws SQLException {
       iFlightDao.insertFlight(flight);
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

    public IFlightDao getiFlightDao() {
        return iFlightDao;
    }

    public void setiFlightDao(IFlightDao iFlightDao) {
        this.iFlightDao = iFlightDao;
    }
}
