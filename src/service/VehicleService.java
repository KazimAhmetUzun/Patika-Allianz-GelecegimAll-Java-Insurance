package service;

import model.Vehicle;
import model.Accident;
import model.ColorTypeEnum;

import java.util.ArrayList;

public class VehicleService {

    public Vehicle createVehicle(String brand, String model, String plate, String chassisNumber, int modelYear, ArrayList<Accident> accidentList, ColorTypeEnum color) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setPlate(plate);
        vehicle.setChassisNumber(chassisNumber);
        vehicle.setModelYear(modelYear);
        vehicle.setAccidentList(accidentList);
        vehicle.setColor(color);
        return vehicle;
    }
}
