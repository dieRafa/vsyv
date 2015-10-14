package de.beuth.vsys.s798458.telefon.main;

import java.util.Scanner;

/**
 * Created by Rafaela Neff on 13.10.15.
 */
public class Telefonserver {
    String [] telefonverzeichnis;

    public static void main (String [] args){
    	Telefonserver telefonserver = new Telefonserver();
    	telefonserver.start();
    }
    public  void start (){
        telefonverzeichnis [0] = "Meier 4711";
        telefonverzeichnis [1] = "Schmitt 0815";
        telefonverzeichnis [2] = "Müller 4711";
        telefonverzeichnis [3] = "Meier 0816";
        telefonverzeichnis [4] = "Huber 0816";
        telefonverzeichnis [5] = "von Schulze 0878";
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
    
    @SuppressWarnings("resource")
	public void createScanner(){
    	 String input = "1 fish 2 fish red fish blue fish";
         Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
         System.out.println(s.nextInt());
         System.out.println(s.nextInt());
         System.out.println(s.next());
         System.out.println(s.next());
         s.close();
    }
}
