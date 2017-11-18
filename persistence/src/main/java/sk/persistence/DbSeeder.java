package sk.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sk.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(final HotelRepository repository) {
        this.hotelRepository = repository;
    }

    @Override
    public void run(final String... strings) throws Exception {
        Hotel marriot = new Hotel("Taj", 5, true);
        Hotel ibis = new Hotel("Ibis", 3, false);
        Hotel goldenTulip = new Hotel("Golden Tulip", 4, true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldenTulip);

        hotelRepository.save(hotels);
    }
}
