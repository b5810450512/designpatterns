package l04;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvailableSeats() {

        return allSeats-reservedSeats;
    }

    public int getAllSeats() {
        return allSeats;
    }


    public void addReservedSeats(int reservedSeats) {
        if(reservedSeats>getAvailableSeats()){
            System.out.println("ที่นั่งไม่เพียงพอ");
        }else{
            this.reservedSeats+= reservedSeats;
        }

    }
}
