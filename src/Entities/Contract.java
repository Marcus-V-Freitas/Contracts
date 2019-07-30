package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	List<Installment> installments=new ArrayList<>();
	
	public Contract()
	{}	
	public Contract(Integer number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getTotalValue() {
		return totalValue;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}


	public List<Installment> getInstallments() {
		return installments;
	}


	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
	
	public void Total(){
		for(Installment installment: installments) {
			System.out.println(sdf.format(installment.getDueDate())+" "+  installment.getAmount());
		}
	}
	
	

}
