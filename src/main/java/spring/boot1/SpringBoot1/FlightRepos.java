package spring.boot1.SpringBoot1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepos  extends JpaRepository<Flight, Integer>{

}
