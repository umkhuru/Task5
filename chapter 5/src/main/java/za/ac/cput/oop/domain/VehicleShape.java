package za.ac.cput.oop.domain;

/**
 * Created by Ethon on 4/7/2016.
 */
public abstract class VehicleShape {

    VehicleShape nextVehicleShape;

    public void setnextVehicleShape(VehicleShape nextVehicleShape) {
        this.nextVehicleShape = nextVehicleShape;
    }
    public abstract String handleRequest(int request);

    public abstract void nextVehicleShape(VehicleShapeHatchBack hatch);
}
