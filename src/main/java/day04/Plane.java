package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengerList = new ArrayList<>();

    public boolean addPassanger(Passenger passenger){
            if(passengerList.size()<maxCapacity){
                passengerList.add(passenger);
                return true;
            }else{
                return false;
            }
    }

    public int numberOfPackages(){
        int numberOfPackages = 0;
        for (Passenger i : passengerList){
            numberOfPackages += i.getNumberOfPackage();
        }
        return numberOfPackages;
    }
}
