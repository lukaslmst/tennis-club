package at.htl.control;

import at.htl.entity.BookingTable;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class BookingRepository implements PanacheRepository<BookingTable> {
    public List<BookingTable> findByDate(String date) {
        return list("date", date);
    }
}

