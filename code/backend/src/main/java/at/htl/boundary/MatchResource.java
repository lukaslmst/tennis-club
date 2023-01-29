package at.htl.boundary;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import at.htl.entity.Match;
import at.htl.control.MatchRepository;


@Path("/match")
public class MatchResource {

    @Inject
    MatchRepository matchRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> findAll(){
        return matchRepository.listAll();
    };

    @GET
    @Path("{matchId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void getById(long matchId){
        matchRepository.findById(matchId);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Match match){
        matchRepository.persist(match);
    }

    @DELETE
    @Transactional
    public void delete(Match match){
        matchRepository.delete(match);

    }



}