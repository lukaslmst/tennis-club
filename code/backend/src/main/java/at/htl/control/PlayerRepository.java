package at.htl.control;

import at.htl.entity.Player;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class PlayerRepository implements PanacheRepository<Player> {
    public List<Player> findByFirstnameAndLastname(String firstName, String lastName) {
        return find("firstname = ?1 and lastname = ?2", firstName, lastName).list();
    }
}

