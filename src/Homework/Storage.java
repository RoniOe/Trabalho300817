package Homework;

import javax.swing.JOptionPane;

public class Storage {
	
	private String storage = "";
	
	public String storage(String stor){
		Main main = new Main();
		if (storage.equals("")){
			storage = storage.concat(storage+main.storage);
			JOptionPane.showMessageDialog(null, storage);
		}else {
			storage = storage.concat(storage+"\n\n"+main.storage);
			JOptionPane.showMessageDialog(null, storage);
		}
		return storage;
		
	}
}
