package shildt.edition5.chapter4.Theory.Vehicle;

public class CompFuel {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(2,2,2);
        Vehicle sportsCar = new Vehicle(2,2,2);
        double gallons;
        int dist = 252;

        //присваиваем значения полям в обьекте minivan
        minivan.mpg = 21;
        minivan.fuelCap = 16;
        minivan.passengers = 7;

        //присваиваем значения поляв в обьекте sportsCar
        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportsCar.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}
