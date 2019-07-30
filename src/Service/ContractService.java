package Service;

import java.util.Calendar;
import java.util.Date;

import Entities.Contract;
import Entities.Installment;

public class ContractService {
	
	private OnlinePaymentService payment;
	
	
	public ContractService(OnlinePaymentService payment) {
		this.payment = payment;
	}


	public void ProcessContract(Contract contract, int Moths) {
		double amount=(contract.getTotalValue()/Moths);
		for(int i=1;i<=Moths;i++) {
			double amountFee=payment.Interest(amount, i);
			Calendar cal=Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date outDate=cal.getTime();
			double updateAmount=payment.paymentFee(amountFee);
		contract.addInstallment(new Installment(outDate, updateAmount));
		 amountFee=0;
		 updateAmount=0;
	}
}
	}
