package dao;
import bean.Flight;


import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlight() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;//获取航班起飞时间
    Flight getFlightBydepartureAirPort(String departureAirPort);//获取航班起飞机场
    Flight getFlightByDestinationAirPort(String detinationAirPort);//获取航班目的地机场
    void undateFlight(Flight flight);//更新航班

}
