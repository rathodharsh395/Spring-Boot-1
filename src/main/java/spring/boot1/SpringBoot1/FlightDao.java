package spring.boot1.SpringBoot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDao implements FlightService {

	@Autowired
	FlightRepos repos;
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return repos.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		List<Flight> listOfFlight= repos.findAll();
		return listOfFlight;
	}

	public Flight getFlightByNumber(int number) {
		Flight flight = repos.getById(number);
		return flight;
	}

}
