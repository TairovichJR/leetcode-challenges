package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class DesignParkingSystem {

    Map<Integer, Integer> map = new HashMap<>();

    public DesignParkingSystem(int big, int medium, int small) {
        map.put(1, big);
        map.put(2, medium);
        map.put(3, small);
    }

    public boolean addCar(int carType) {
        Integer value = map.get(carType);
        if (value != null){
            if (value > 0){
                map.put(carType, value-1);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //                                                          1 slot    2 slots   0 slot
        DesignParkingSystem parkingSystem = new DesignParkingSystem(1,2,0);

        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(2));



    }
}
