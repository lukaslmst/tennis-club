package at.htl.control;

import at.htl.entity.TennisCourt;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TennisCourtRepository implements PanacheRepository<TennisCourt> {

}
