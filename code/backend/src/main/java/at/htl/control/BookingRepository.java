package at.htl.control;

import at.htl.entity.Booking;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class BookingRepository implements PanacheRepository<Booking> {
    public List<Booking> findByDate(String date) {
        return list("date", date);
    }
}

