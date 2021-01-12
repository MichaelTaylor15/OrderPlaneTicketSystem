package UI;

import bean.Flight;
import bll.IFlightService;
import bll.impl.FlightServiceimpl;

import java.util.Scanner;
import java.util.UUID;

public class mainUI {
    public static void main(String[] args) {
        while(true){
            System.out.println("请根据提示信息进行操作！");
            System.out.println("按1,录入航班信息");
            System.out.println("按2,显示所有航班信息");
            System.out.println("按3,查询航班信息");
            System.out.println("按4,机票预定");
            System.out.println("按5,机票退订");
            System.out.println("按6,退出系统");

            int choice;
            Scanner scanner=new Scanner(System.in);
            choice =scanner.nextInt();
            if (choice==1){
                System.out.println("请输入航班信息:");
                String id = UUID.randomUUID().toString();
                System.out.println(id.replace("-",""));
                System.out.print("请输入航班编号:");
                String flightId=scanner.next();
                System.out.print("请输入机型:");
                String flightType=scanner.next();
                System.out.print("请输入座位数:");
                int currentSeats=scanner.nextInt();
                System.out.print("请输入起飞机场:");
                String departureAirport=scanner.next();
                System.out.print("请输入目的地机场:");
                String destinationAirport=scanner.next();
                System.out.print("请输入起飞时间:");
                String departureTime=scanner.next();
                Flight flight=new Flight(id,flightId,flightType,currentSeats,departureAirport,destinationAirport,departureTime);

                IFlightService iFlightService=new FlightServiceimpl();//bll层
                iFlightService.insertFlight(flight);
            }
            else if(choice==6){
                System.exit(0);
            }

        }

    }
}
