package bean;

import bll.IFlightService;
import bll.impl.FlightServiceimpl;

public class Flight {
    private String id;//航班号
    private String flightId;
    private String planType;//机型
    private String departureAirport;//出发地
    private String destnationAirport;//目的地
    private String departureTime;//出发日期
    private int  currentSeatsNum;//现存座位数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartureCity() {
        return departureAirport;
    }

    public void setDepartureCity(String departureCity) {
        this.departureAirport = departureCity;
    }

    public String getDestnation() {
        return destnationAirport;
    }

    public void setDestnation(String destnation) {
        this.destnationAirport = destnation;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestnationAirport() {
        return destnationAirport;
    }

    public void setDestnationAirport(String destnationAirport) {
        this.destnationAirport = destnationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }


    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int  currentSeatsNum) {
        currentSeatsNum = currentSeatsNum;
    }

    public Flight(String id,String flightId,String planType,int currentSeatsNum,String departureAirport,String destnationAirport,String departureTime){
        this.id=id;
        this.flightId=flightId;
        this.planType=planType;
        this.currentSeatsNum=currentSeatsNum;
        this.departureAirport=departureAirport;
        this.destnationAirport=destnationAirport;
        this.departureTime=departureTime;
        System.out.println("传到Flight了！");

    }
}
