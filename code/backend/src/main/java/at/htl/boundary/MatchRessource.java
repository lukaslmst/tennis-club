package at.htl.boundary;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import at.htl.entity.Match;
import org.jboss.logging.Logger;
import at.htl.control.MatchRepository;


@Path("/match")
public class MatchRessource {

    @Inject
    MatchRepository matchRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> findAll(){
        return matchRepository.listAll();
    };




    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Match match, @Context UriInfo uriInfo){
        Match saved = matchRepository.save(match);
        logger.info(saved.getMatchId() + " saved");
        URI location = uriInfo
                .getAbsolutePathBuilder()
                .path(String.valueOf(saved.getMatchId()))
                .build();
        return Response.created(location).build();
    }

    @DELETE
    @Path("{matchId}")
    @Transactional
    public Response delete(@PathParam("matchId") long matchId){
        Match match = matchRepository.findById(matchId);
        if(match == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        matchRepository.delete(match);
        return Response.noContent().build();
    }



}