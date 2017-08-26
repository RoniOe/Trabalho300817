package Homework;

import javax.swing.JOptionPane;

public class Payments {
	
	private int portion,discount;
	private double Value;
	
	public double getValuePortionJuri() {
		int port = 5 * this.portion;
		return this.Value + port;
	}
	
	public double getValuePortionFisi() {
		int port = 5 * this.portion;
		return this.Value + port;
	}
	
	public double getValueDiscountJuri() {
		return this.Value - 10;
	}
	
	public double getValueDiscountFisi() {
		return this.Value - 5;
	}
	
	public boolean testingPortionOrDiscount() {
		// TODO Auto-generated method stub
		String [] options = {"Parcelado", "Á Vista"};
		Object request = JOptionPane.showInputDialog(null, "Parcelado ou á vista??", "Homework", JOptionPane.INFORMATION_MESSAGE
				, null, options, options[0]);
		if (request.equals(options[0])){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void setvalue(double Value) {
		this.Value = Value;
	}
	
	public void setPort(int Port) {
		this.portion = Port;
	}
	
}
