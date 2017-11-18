package sk.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.domain.Hotel;
import sk.persistence.HotelRepository;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(final HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    
    @GetMapping("/hotels")
    public List<Hotel> getHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels;
    }
}
