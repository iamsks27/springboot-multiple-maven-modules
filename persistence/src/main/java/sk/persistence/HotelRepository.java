package sk.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
