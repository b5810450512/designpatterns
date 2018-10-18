package l04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour=new SingleTour("Thai",1000.0,20);

        System.out.println(singleTour.getName());
        System.out.println(singleTour.getPrice());
        System.out.println(singleTour.getAllSeats());
        singleTour.addReservedSeats(15);
        System.out.println(singleTour.getAvailableSeats());
        singleTour.addReservedSeats(3);
        System.out.println(singleTour.getAvailableSeats());
        System.out.println("***************************************************************");

        List<Tour> tours=new ArrayList<>();
        tours.add(new SingleTour("Bangkok",5000.0,20));
        tours.add(new SingleTour("Samutprakarn",1200.0,15));
        tours.add(new SingleTour("ChaCherngsao",900.0,25));
        tours.add(new SingleTour("Nontaburi",1000.0,10));



        PackageTour packageTour=new PackageTour("Thailand",tours);

        System.out.println(packageTour.getAvailableSeats());
        System.out.print(packageTour.getName());
        System.out.println(packageTour.getPackageName());
        System.out.println(packageTour.getPrice());
        System.out.println(packageTour.getPakageSeats());
        packageTour.addPakageSeats(5);
        System.out.println(packageTour.getAvailableSeats());
        System.out.println(packageTour.getPakageSeats());
        packageTour.addPakageSeats(6);





    }
}
