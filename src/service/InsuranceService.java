package service;

import model.Insurance;
import model.InsuranceTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class InsuranceService {
    private List<Insurance> insurances;

    public InsuranceService() {
        this.insurances = new ArrayList<>();
    }

    public void createInsurance(InsuranceTypeEnum insuranceType, String name) {
        Insurance insurance = new Insurance(insuranceType, name);
        insurances.add(insurance);
    }

    public void updateInsuranceType(String name, InsuranceTypeEnum insuranceType) {
        Insurance insurance = findInsuranceByName(name);
        if (insurance != null) {
            insurance.setInsuranceTypeEnum(insuranceType);
        }
    }

    public void updateInsuranceName(InsuranceTypeEnum insuranceType, String newName) {
        Insurance insurance = findInsuranceByType(insuranceType);
        if (insurance != null) {
            insurance.setName(newName);
        }
    }

    public void deleteInsurance(String name) {
        Insurance insurance = findInsuranceByName(name);
        if (insurance != null) {
            insurances.remove(insurance);
        }
    }

    public Insurance getInsuranceByName(String name) {
        Insurance insurance = findInsuranceByName(name);
        if (insurance == null) {
            insurance = new Insurance(null, null); // veya throw Exception
        }
        return insurance;
    }

    public Insurance getInsuranceByType(InsuranceTypeEnum insuranceType) {
        Insurance insurance = findInsuranceByType(insuranceType);
        if (insurance == null) {
            insurance = new Insurance(null, null); // veya throw Exception
        }
        return insurance;
    }

    private Insurance findInsuranceByName(String name) {
        for (Insurance insurance : insurances) {
            if (insurance.getName().equals(name)) {
                return insurance;
            }
        }
        return null;
    }

    private Insurance findInsuranceByType(InsuranceTypeEnum insuranceType) {
        for (Insurance insurance : insurances) {
            if (insurance.getInsuranceTypeEnum() == insuranceType) {
                return insurance;
            }
        }
        return null;
    }
}
