package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void processContract(Contract contract, Integer months) {
		Double basicValue = contract.getTotal() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate date = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicValue, i);
			double fee = onlinePaymentService.paymentFee(basicValue + interest);
			double quota = basicValue + interest + fee;
			
			contract.getList().add(new Installment(date, quota));
		}
		
	}
}
