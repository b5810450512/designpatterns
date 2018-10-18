package l05;


public class TicketingMachine {
    private String destStation="",currentStation="Bearing";
    private boolean ready,coinsReady,finish;
    private int price,currentAmount;



    public void chooseStation(String destStation){

        if(ready&&(!destStation.equals(this.destStation))){
            System.out.println(currentStation);
            this.destStation=destStation;
            price=100; // สมมติให้ เป็นราคา100
            ready=false;
            System.out.println(price);
            System.out.println(destStation);
            coinsReady=true;
        }
        else{
            System.out.println("Try again!");
        }

    }

    public void insertCoins(int amount){
        if(coinsReady){
            this.currentAmount+=amount;
            if(this.currentAmount<price){
                System.out.println(price-this.currentAmount);//เงินที่ต้องจ่ายให้ครบ

            }else if(this.currentAmount>price){
                int change=0;
                change=this.currentAmount-price;
                System.out.println(change);
                coinsReady=false;
                finish=true;
                System.out.println("Complete");

            }else{
                coinsReady=false;
                finish=true;
                System.out.println("Complete");
            }
        }

    }

    public void retrieveTicket(){
        if(finish){
            System.out.println("Your ticket is here");
            System.out.println("Current Station is "+this.currentStation);
            System.out.println("Destination is "+ this.destStation);
            finish=false;
            ready=true;
        }

    }



}
