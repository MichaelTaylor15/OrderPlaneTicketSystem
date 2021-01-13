package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
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
    public Set<Flight>  getAllFlight() throws SQLException {
        Set<Flight> allFlight=new HashSet<Flight>();
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection connecttion=DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";//sql语句
        PreparedStatement pstmt=connecttion.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            String id=rs.getString("ID");
            String flightId=rs.getString("FLIHJT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int currentSeatNum=rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport=rs.getString("DEPARTURE_AIRPORT ");
            String destinationAirport=rs.getString("DESTINATION_AIRPORT");
            String departureTime=rs.getString("DEPARTURE_TIME");
            Flight flight=new Flight(id,flightId,planeType,currentSeatNum,departureAirport,destinationAirport,departureTime);
        }
        return allFlight;
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
