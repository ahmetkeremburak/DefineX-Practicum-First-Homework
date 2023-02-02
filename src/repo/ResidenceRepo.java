package repo;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import model.House;
import model.Summerhouse;
import model.Villa;

/**
 * @author Ahmet Kerem Burak
 * 
 * Repository for all types of residences
 *
 */
public class ResidenceRepo {
	private List<House> housesList = new LinkedList<>();
	private List<Villa> villasList = new LinkedList<>();
	private List<Summerhouse> summerhousesList = new LinkedList<>();
	private Random random = new Random();
	
	/*
	 * Constructor calls generate methods of every type of residence
	 */
	public ResidenceRepo() {
		generateHouses();
		generateVillas();
		generateSummerhouses();
	}
	
	public List<House> getHousesList() {
		return housesList;
	}

	public List<Villa> getVillasList() {
		return villasList;
	}

	public List<Summerhouse> getSummerhousesList() {
		return summerhousesList;
	}

	/*
	 * Generates houses using random attributes, adds houses to list in class
	 */
	private void generateHouses() {
		for(int i = 0; i < 3; i++) {
			House house = new House();
			house.setNumberOfLounge(this.random.nextInt(1, 5));
			house.setNumberOfRoom(this.random.nextInt(1, 10));
			house.setPrice(this.random.nextDouble(100, 99999));
			house.setSqmeter(this.random.nextDouble(50, 500));
			this.housesList.add(house);
		}
	}
	/*
	 * Generates villas using random attributes, adds villas to list in class
	 */
	private void generateVillas() {
		for(int i = 0; i < 3; i++) {
			Villa residence = new Villa();
			residence.setNumberOfLounge(this.random.nextInt(1, 5));
			residence.setNumberOfRoom(this.random.nextInt(1, 10));
			residence.setPrice(this.random.nextDouble(100, 99999));
			residence.setSqmeter(this.random.nextDouble(50, 500));
			this.villasList.add(residence);
		}
	}
	/*
	 * Generates Summerhouses using random attributes, adds to list in class
	 */
	private void generateSummerhouses() {
		for(int i = 0; i < 3; i++) {
			Summerhouse residence = new Summerhouse();
			residence.setNumberOfLounge(this.random.nextInt(1, 5));
			residence.setNumberOfRoom(this.random.nextInt(1, 10));
			residence.setPrice(this.random.nextDouble(100, 99999));
			residence.setSqmeter(this.random.nextDouble(50, 500));
			this.summerhousesList.add(residence);
		}
	}
}
