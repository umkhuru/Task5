package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.VehicleShape;
import za.ac.cput.oop.domain.VehicleShapeCoupe;
import za.ac.cput.oop.domain.VehicleShapeHatchBack;
import za.ac.cput.oop.domain.VehicleShapeSedan;

/**
 * Created by Ethon on 4/7/2016.
 */
public class VehicleShapeFactoryChainOfRe {

    public static String getVehicleShape(int value){
        VehicleShape chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static VehicleShape setUpChain(){
        VehicleShapeCoupe coupe = new VehicleShapeCoupe();
        VehicleShapeHatchBack hatch = new VehicleShapeHatchBack();
        VehicleShapeSedan sedan = new VehicleShapeSedan();
        coupe.nextVehicleShape(hatch);
        hatch.nextVehicleShape(hatch);
        return coupe;
    }
}
