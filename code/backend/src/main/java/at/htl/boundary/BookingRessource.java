package at.htl.boundary;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;
import at.htl.control.BookingRepository;
import at.htl.entity.Booking;
import org.jboss.logging.Logger;

@Path("/booking")
public class BookingRessource {

    BookingRepository bookingRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Booking> findAll(){ return bookingRepository.listAll(); }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Booking findById(@PathParam("id") Long id){ return bookingRepository.findById(id); };

    //Get List of Bookings by Date
    @GET
    @Path("date")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Booking> findByDate(@QueryParam("date") String date){ return bookingRepository.findByDate(date); }



}