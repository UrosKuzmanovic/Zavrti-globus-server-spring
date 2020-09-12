package rs.ac.bg.fon.silab.TravelAgent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.silab.TravelAgent.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
