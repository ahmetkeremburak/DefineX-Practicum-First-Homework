package model;

public class BaseResidence {
	
	private double price;
	private double sqmeter;
	private int numberOfRoom;
	private int numberOfLounge;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSqmeter() {
		return sqmeter;
	}
	public void setSqmeter(double sqmeter) {
		this.sqmeter = sqmeter;
	}
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}
	public int getNumberOfLounge() {
		return numberOfLounge;
	}
	public void setNumberOfLounge(int numberOfLounge) {
		this.numberOfLounge = numberOfLounge;
	}
	
	 @Override
	public String toString() {
	    return String.format("\nPrice:" + "%.2f" +
	                " \nNumber of Rooms " + this.getNumberOfRoom() +
	                " \nNumber of Lounges : " + this.getNumberOfLounge() +
	                " \nArea " + "%.2f" +
	                "\n------------------------------", this.getPrice(), this.getSqmeter());
	                
	}
}
