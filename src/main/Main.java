package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.ResidenceService;

/**
 * @author Ahmet Kerem Burak
 * <p> 
 * main method as well as methods to print info on the console
 *</p>
 */
public class Main {

	public static void main(String[] args) {
		ResidenceService service = new ResidenceService();
		printPrice("houses", service.housesTotalPrice());
		printPrice("villas", service.villasTotalPrice());
		printPrice("summerhouses", service.summerhousesTotalPrice());
		printPrice("all residences", service.totalPrice());
		printArea("houses", service.housesAvgSqmeter());
		printArea("villas", service.villasAvgSqmeter());
		printArea("summerhouses", service.villasAvgSqmeter());
		printArea("all residences", service.totalAvgSqrmeter());
		findByRoomLounge(service);
	}
	
	private static void printPrice(String house, double price) {
        System.out.printf("Total price of " + house + " is " + "%.2f" + " dollars\n", price);
    }

    
    private static void printArea(String house, double area) {
        System.out.printf("Average area of " + house + " is " + "%.2f " + "square meters\n", area);
    }
    
    /*
     * Finds residences with desired room and lounge number.
     * @param service
     */
    private static void findByRoomLounge(ResidenceService service) {
    	Scanner scn = new Scanner(System.in);
    	boolean loop = false;
		int roomNumber = 0;
		int loungeNumber = 0;
		
    	do {
    	try {
    	System.out.print("Enter desired number of rooms: ");
		roomNumber = scn.nextInt();
		System.out.print("Enter desired number of lounges: ");
		loungeNumber = scn.nextInt();
		loop = false;
		scn.close();
		}
		catch(InputMismatchException e) {
			loop = true;
			System.out.println("You must enter a number.\nTry again");
		}
		}while(loop);
    	
    	if(service.findByRoomLoungeNumber(roomNumber, loungeNumber).isEmpty()) {
    		System.out.println("Residence meeting the desired requirements does not exist");
    	}
    	else {
    		System.out.println(service.findByRoomLoungeNumber(roomNumber, loungeNumber));
    	}
    }

}
