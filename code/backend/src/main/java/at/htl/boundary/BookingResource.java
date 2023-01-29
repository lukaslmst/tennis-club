package at.htl.boundary;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import at.htl.control.BookingRepository;
import at.htl.entity.BookingTable;

@Path("/booking")
public class BookingResource {

    BookingRepository bookingRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookingTable> findAll(){ return bookingRepository.listAll(); }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookingTable findById(@PathParam("id") Long id){ return bookingRepository.findById(id); };

    //Get List of Bookings by Date
    @GET
    @Path("date")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookingTable> findByDate(@QueryParam("date") String date){ return bookingRepository.findByDate(date); }

    @DELETE
    @Transactional
    public void delete(BookingTable booking){ bookingRepository.delete(booking); }

}