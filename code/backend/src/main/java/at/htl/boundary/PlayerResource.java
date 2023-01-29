package at.htl.boundary;

import at.htl.control.PlayerRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

import at.htl.entity.Player;
import org.jboss.logging.Logger;


@Path("/player")
public class PlayerResource {
    @Inject
    Logger logger;

    @Inject
    PlayerRepository playerRepository;

    private List<Player> players = new LinkedList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> findAll(){

        return playerRepository.listAll();
    };

    @GET
    @Path("{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player findById(@PathParam("playerId") long playerId){
        logger.info(playerId);
        return playerRepository.findById(playerId);
    }

    @GET
    @Path("firstlast")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> findById(
            @QueryParam("first") String firstName,
            @QueryParam("last") String lastName
    ){
        logger.info(lastName + " " + firstName);
        return playerRepository.findByFirstnameAndLastname(firstName, lastName);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Player player){
       playerRepository.persist(player);
    }

    @PATCH
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public void update(String firstName) {
        logger.info(players);
        logger.info(firstName);
        Player foundPlayer = players
                .stream()
                .filter(fn -> fn.getFirstname().equals(firstName))
                .findFirst()
                .get();
        logger.info(foundPlayer.getFirstname());
        foundPlayer.setFirstname(firstName);
    }


    @DELETE
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(Player player) {
    playerRepository.delete(player);
    }
}
