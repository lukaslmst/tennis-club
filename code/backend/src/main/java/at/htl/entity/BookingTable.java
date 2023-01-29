package at.htl.entity;

import javax.persistence.*;
import java.util.Date;



@Entity
public class BookingTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long bookingId;

    @Column
    private Date durration;

    @Column
    private Date dateOfReservation;

    @ManyToOne
    private TennisCourt tennisCourtToBook;

    @ManyToOne
    private Player playerWhoBooked;

    @Column
    private double price;

    public BookingTable() {
    }


    public BookingTable(TennisCourt tennisCourtToBook, Player playerWhoBooked, double price) {
        this.tennisCourtToBook = tennisCourtToBook;
        this.playerWhoBooked = playerWhoBooked;
        this.price = price;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public TennisCourt getTennisCourtToBook() {
        return tennisCourtToBook;
    }

    public void setTennisCourtToBook(TennisCourt tennisCourtToBook) {
        this.tennisCourtToBook = tennisCourtToBook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDurration() {
        return durration;
    }

    public void setDurration(Date durration) {
        this.durration = durration;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public TennisCourt getTennisCourt() {
        return tennisCourtToBook;
    }

    public void setTennisCourt(TennisCourt tennisCourt) {
        this.tennisCourtToBook = tennisCourt;
    }

    public Player getPlayerWhoBooked() {
        return playerWhoBooked;
    }

    public void setPlayerWhoBooked(Player playerWhoBooked) {
        this.playerWhoBooked = playerWhoBooked;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", durration=" + durration +
                ", dateOfReservation=" + dateOfReservation +
                ", tennisCourt=" + tennisCourtToBook +
                ", playerWhoBooked=" + playerWhoBooked +
                '}';
    }
}