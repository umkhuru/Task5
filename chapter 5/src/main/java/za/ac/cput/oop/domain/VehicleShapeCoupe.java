package za.ac.cput.oop.domain;

/**
 * Created by Ethon on 4/7/2016.
 */
public  class VehicleShapeCoupe extends VehicleShape {

    @Override
    public String handleRequest(int request) {
        if(request > 75){
            return "Coupe";
        }else{
            if (nextVehicleShape!=null) {
                return nextVehicleShape.handleRequest(request);
            }
            return "Not in Stock";
        }
    }

    @Override
    public void nextVehicleShape(VehicleShapeHatchBack hatch) {

    }
}
