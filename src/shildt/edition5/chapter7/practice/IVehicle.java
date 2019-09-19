package shildt.edition5.chapter7.practice;

public interface IVehicle {

    int range();

    double fuelNeeded(int miles);

    //методы доступа к переменным экземпляра
    int getPassengers();

    void setPassengers(int p);

    int getFuelCup();

    void setFuelCup(int fuel);

    int getMpg();

    void setMpg(int mpg);

}
