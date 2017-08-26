package Homework;

import javax.swing.JOptionPane;

public class Data extends Payments{
	
	private boolean company;
	private String companyOrPerson,product;
	
	public boolean testingcompany() {
		// TODO Auto-generated method stub
		String [] options = {"Juridica", "Fisica"};
		Object request = JOptionPane.showInputDialog(null, "Pessoa juridica ou fisica?", "Homework", JOptionPane.INFORMATION_MESSAGE
				, null, options, options[0]);
		if (request.equals(options[0])){
			return true;
		}else{
			return false;
		}
	}
}