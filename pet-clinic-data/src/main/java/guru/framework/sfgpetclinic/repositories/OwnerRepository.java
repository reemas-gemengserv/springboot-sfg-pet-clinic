package guru.framework.sfgpetclinic.repositories;

import guru.framework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName (String lastName);

//    List<Owner> findAllByLastNameLike(String lastName);
}
