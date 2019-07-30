package Service;

public class PayalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(double amount) {
		return (amount+(amount*0.02));
	}

	@Override
	public Double Interest(double amount, int month) {
		return (amount+((amount*0.01)*month));
	}
}
