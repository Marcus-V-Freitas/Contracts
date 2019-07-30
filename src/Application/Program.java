package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contract;
import Service.ContractService;
import Service.PayalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter contract data");
		System.out.println("Number:");
		Integer number=sc.nextInt();
		System.out.println("Date (dd/MM/yyyy):");
		Date date=sdf.parse(sc.next());
		System.out.println("Contract value:");
		Double totalValue=sc.nextDouble();
		ContractService cs=new ContractService(new PayalService());
		System.out.println("Enter number of installments: ");
		int Moths=sc.nextInt();
		Contract c=new Contract(number, date, totalValue);
		cs.ProcessContract(c, Moths);
		c.Total();
		sc.close();
		
	}

}
