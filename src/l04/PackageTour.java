package l04;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    private int pakageSeats;



    public PackageTour(String packageName, List<Tour> tours) {

        this.packageName = packageName;
        this.tours = tours;
        int count=0;
        int min=0;
        for(Tour tour:tours){
            if(count==1){
                min=Math.min(min,tour.getAvailableSeats());
            }
            else{
                min=tour.getAvailableSeats();
                count=1;
            }

        }
        pakageSeats=min;

    }

    @Override
    public String getName() {
        String tourName="";
        for(Tour tour:tours){
            tourName+=tour.getName()+"\n";
        }
        return tourName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {

        return pakageSeats;
    }

    public String getPackageName() {
        return packageName;
    }

    public void addPakageSeats(int pakageSeats) {
        if(pakageSeats>this.pakageSeats){
            System.out.println("ที่นั่งไม่เพียงพอ");

        }else{
            this.pakageSeats -= pakageSeats;
        }

    }

    public int getPakageSeats() {
        return pakageSeats;
    }
}
