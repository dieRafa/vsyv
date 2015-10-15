package de.beuth.vsys.s798458.telefon.main;

public class Telefonverzeichnis {

	String[] telefonverzeichnis;

	void init() {
		telefonverzeichnis[0] = "Meier 4711";
		telefonverzeichnis[1] = "Schmitt 0815";
		telefonverzeichnis[2] = "Müller 4711";
		telefonverzeichnis[3] = "Meier 0816";
		telefonverzeichnis[4] = "Huber 0816";
		telefonverzeichnis[5] = "von Schulze 0878";
	}
	
	public String search (String input){
		for (int i = 0; i < telefonverzeichnis.length; i++){
			
		}
		return null;
	}

    String number(String input){
    	String [] temp = input.split(" ");
    	//if (temp.length < 2){
    		String number = temp [temp.length-1];
    	//}
		return number;
    }
    String  name (String input){
    	String name = null;
    	String [] temp = input.split(" ");
    	if (temp.length < 2){
    		int index =  temp.length-1;
    		for (int i = 0; i <= index; i++){
    		name = name + temp [i];
    		}
    		System.out.println(name);
    	}
    	return name;
    }
}
