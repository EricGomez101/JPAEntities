package app.spring5webapp.repositories;

import app.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{

}
