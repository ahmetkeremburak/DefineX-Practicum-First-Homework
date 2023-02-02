package service;

import java.util.LinkedList;
import java.util.List;

import model.BaseResidence;
import model.House;
import model.Summerhouse;
import model.Villa;
import repo.ResidenceRepo;


/**
 * @author Ahmet Kerem Burak
 * Contains methods to calculate and return total prices, average ares for every house type
 * Returns residents befit to given room and lounge numbers
 *
 */
public class ResidenceService {
	
	private final ResidenceRepo repo = new ResidenceRepo();
	
	/*
	 * Total of every house's price
	 */
	public double housesTotalPrice() {
		double total = 0;
		List<House> houses = repo.getHousesList();
		for (House house : houses) {
			total += house.getPrice();
		}
		return total;
	}
	
	/*
	 * Total of every villas's price
	 */
	public double villasTotalPrice() {
		double total = 0;
		List<Villa> villas = repo.getVillasList();
		for (Villa villa : villas) {
			total += villa.getPrice();
		}
		return total;
	}
	
	/*
	 * Total of every Summerhouse's price
	 */
	public double summerhousesTotalPrice() {
		double total = 0;
		List<Summerhouse> summerhouses = repo.getSummerhousesList();
		for (Summerhouse summerhouse : summerhouses) {
			total += summerhouse.getPrice();
		}
		return total;
	}
	
	/*
	 * Total of every residence's price
	 */
	public double totalPrice() {
		double total = summerhousesTotalPrice() + villasTotalPrice() + housesTotalPrice();
		return total;
	}
	
	/*
	 * Average of every house area
	 */
	public double housesAvgSqmeter() {
		double total = 0;
		int counter = 0;
		List<House> houses = repo.getHousesList();
		for (House house : houses) {
			total += house.getSqmeter();
			counter++;
		}
		return total / counter;	
	}
	
	/*
	 * Average of every villa area
	 */
	public double villasAvgSqmeter() {
		double total = 0;
		int counter = 0;
		List<Villa> villas = repo.getVillasList();
		for (Villa villa : villas) {
			total += villa.getSqmeter();
			counter++;
		}
		return total / counter;	
	}
	
	/*
	 * Average of every Summerhouse area
	 */
	public double summerhousesAvgSqmeter() {
		double total = 0;
		int counter = 0;
		List<Summerhouse> summerhouses = repo.getSummerhousesList();
		for (Summerhouse summerhouse : summerhouses) {
			total += summerhouse.getSqmeter();
			counter++;
		}
		return total / counter;	
	}
	
	/*
	 * Average of every residence area
	 */
	public double totalAvgSqrmeter() {
		double avg = (housesAvgSqmeter() + summerhousesAvgSqmeter() + villasAvgSqmeter()) / 3;
		return avg;
	}
	
	/*
	 * A list of residences with required number of rooms and lounges
	 * @param room number of rooms
	 * @param lounge number of lounges
	 * @return a list of residences with desired number of rooms and lounges
	 */
	public List<BaseResidence> findByRoomLoungeNumber(int room, int lounge){
		List<BaseResidence> residences = new LinkedList<BaseResidence>();
		for (House residence : repo.getHousesList()) {
			if(residence.getNumberOfRoom() == room && residence.getNumberOfLounge() == lounge) {
				residences.add(residence);
			}
		}
		for (Villa residence : repo.getVillasList()) {
			if(residence.getNumberOfRoom() == room && residence.getNumberOfLounge() == lounge) {
				residences.add(residence);
			}
		}
		for (Summerhouse residence : repo.getSummerhousesList()) {
			if(residence.getNumberOfRoom() == room && residence.getNumberOfLounge() == lounge) {
				residences.add(residence);
			}
		}
		
		return residences;
		
	}
}

