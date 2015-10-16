package de.beuth.vsys.telefon.main;


import java.util.Scanner;

/**
 * Created by Rafaela Neff on 13.10.15.
 */
public class Telefonserver {
   Telefonverzeichnis telefonverzeichnis;

    public static void main (String [] args){
    	Telefonserver telefonserver = new Telefonserver();
    	telefonserver.start();
    }
    
    public  void start (){

        
        Scanner scanInput = new Scanner(System.in);
        
        //Input search criteria name
        System.out.print("\nIf you are searching for a name please enter it here: ");
        String inputName = scanInput.nextLine();

        
        //Input search criteria number
        System.out.print("If you are searching for a number please enter it here: ");
        String inputNumber = scanInput.nextLine();
        
        if (inputName.matches("\\s*") || inputNumber.matches("\\s*")) {
			System.out.println("  - you have entered an invalid search, please try again");
		}
        System.out.println("\nYou've entered: " + inputName + " as a surename and " + inputNumber
                + "\nas a telefonnumber");
    

    }

   
    
//    @SuppressWarnings("resource")
//	public void createScanner(){
//    	 String input = "1 fish 2 fish red fish blue fish";
//         Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//         System.out.println(s.nextInt());
//         System.out.println(s.nextInt());
//         System.out.println(s.next());
//         System.out.println(s.next());
//         s.close();
//    }
}
