package service;

import model.InsuranceRequest;
import model.Vehicle;
import model.Policy;
import model.Proposal;

import java.util.ArrayList;

public class InsuranceRequestService {

    public InsuranceRequest createInsuranceRequest(Vehicle vehicle, Policy policy) {
        InsuranceRequest insuranceRequest = new InsuranceRequest(vehicle, policy);
        return insuranceRequest;
    }

    public void addProposalToRequest(InsuranceRequest insuranceRequest, Proposal proposal) {
        if (insuranceRequest.getProposalList() != null) {
            insuranceRequest.getProposalList().add(proposal);
        } else {
            ArrayList<Proposal> proposalList = new ArrayList<>();
            proposalList.add(proposal);
            insuranceRequest.setProposalList(proposalList);
        }
    }
}
