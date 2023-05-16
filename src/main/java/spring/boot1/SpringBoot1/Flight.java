package spring.boot1.SpringBoot1;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Flight_table")
public class Flight {
	@Id
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private double price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate flightdate; 
	private String layOvers;
	
	
	public LocalDate getFlightdate() {
		return flightdate;
	}
	public void setFlightdate(LocalDate flightdate) {
		this.flightdate = flightdate;
	}
	public String getLayOvers() {
		return layOvers;
	}
	public void setLayOvers(String layOvers) {
		this.layOvers = layOvers;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	

}
