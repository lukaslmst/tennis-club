package at.htl.boundary;

import at.htl.control.TennisCourtRepository;
import at.htl.entity.TennisCourt;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/tennis-court")
public class TennisCourtResource {

    @Inject
    TennisCourtRepository tennisCourtRepository;

    @GET
    public List<TennisCourt> findAll() {
        return tennisCourtRepository.listAll();
    }

    @GET
    @Path("{tennisCourtId}")
    public void getById(Long tennisCourtId){
        tennisCourtRepository.findById(tennisCourtId);
    }

    @POST
    public void create(TennisCourt tennisCourt) {
        tennisCourtRepository.persist(tennisCourt);
    }

    @DELETE
    public void delete(TennisCourt tennisCourt) {
        tennisCourtRepository.delete(tennisCourt);

    }

}