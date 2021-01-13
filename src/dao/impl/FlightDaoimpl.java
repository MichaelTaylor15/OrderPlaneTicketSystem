package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoimpl implements IFlightDao {
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection connection= DriverManager.getConnection(url,username,password);

        //System.out.println(connection);//测试oracle是否链接成功

        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";//用？代替，七个参数
        PreparedStatement pstmt=connection.prepareStatement(sql);
        pstmt.setString(1,flight.getId());//1代表第一项
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlanType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirport());
        pstmt.setString(6,flight.getDestnationAirport());
        pstmt.setString(7,flight.getDepartureTime());

        pstmt.executeUpdate();//更新
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
