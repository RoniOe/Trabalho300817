package Homework;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {
	
	public static String storage = "";
	
	private static double value,finalValue;
	private static int port;
	private static String product,name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		Storage storag = new Storage();
		while (true) {
			boolean juriOrFisi = data.testingcompany();
			if (juriOrFisi == true){
				name = JOptionPane.showInputDialog("Digite o nome de sua empresa:");
				data.setName(name);
			}else{
				name =  JOptionPane.showInputDialog("Digite seu nome completo:");
				data.setName(name);
			}
			product = JOptionPane.showInputDialog("Digite o nome do produto:");
			data.setProduct(product);
			value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
			data.setvalue(value);
			boolean porOrDis = data.testingPortionOrDiscount();
			if (porOrDis == true && juriOrFisi == true){
				port = Integer.parseInt(JOptionPane.showInputDialog("Parcelar em quantas vezes?"));
				data.setPort(port);
				finalValue = data.getValuePortionJuri();
				
				storage = "A empresa "+name+" está comprando um(a) "+product+" no valor de R$"+value+" em "+port+ "x. O valor final do(a) "
				+product+" a prazo será:R$"+finalValue;
				
			}else if (porOrDis == true && juriOrFisi == false){
				port = Integer.parseInt(JOptionPane.showInputDialog("Parcelar em quantas vezes?"));
				data.setPort(port);
				finalValue = data.getValuePortionFisi();
				
				storage = ""+name+" está comprando um(a) "+product+" no valor de R$"+value+" em "+port+ "x. O valor final do(a) "
						+product+" a prazo será:R$"+finalValue;
				
			}else if (porOrDis == false && juriOrFisi == true){
				finalValue = data.getValueDiscountJuri();
				
				storage = "A empresa "+name+" está comprando um(a) "+product+" no valor de R$"+value+". O valor final do(a) "
						+product+" será:R$"+finalValue;
				
			}else{
				finalValue = data.getValueDiscountFisi();
				
				storage = ""+name+" está comprando um(a) "+product+" no valor de R$"+value+". O valor final do(a) "
						+product+" será:R$"+finalValue;
				
			}
			int stay = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (stay == 0){
				storag.storage(storage);
			}else {
				storage = storag.storage(storage);
				break;
			}
		}
	}
	
}