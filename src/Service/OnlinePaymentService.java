package Service;

public interface OnlinePaymentService {
	Double paymentFee(double amount);
	Double Interest(double amount, int month);
}
