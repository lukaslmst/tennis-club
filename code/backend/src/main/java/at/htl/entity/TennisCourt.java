package at.htl.entity;


import javax.persistence.*;


@Entity
public class TennisCourt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long tennisCourtId;

    @Column
    private String location;

    @OneToOne
    private Match currentMatch;

    public TennisCourt(String location, Match currentMatch) {
        this.location = location;
        this.currentMatch = currentMatch;
    }

    public TennisCourt() {
    }


    //getter and setter

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Match getCurrentMatch() {
        return currentMatch;
    }

    public void setCurrentMatch(Match currentMatch) {
        this.currentMatch = currentMatch;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TennisCourt{" +
                "tennisCourtId=" + tennisCourtId +
                ", location='" + location + '\'' +
                ", currentMatch=" + currentMatch +
                '}';
    }
}