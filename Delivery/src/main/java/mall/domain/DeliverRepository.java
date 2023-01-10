package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="delivers", path="delivers")
public interface DeliverRepository extends PagingAndSortingRepository<Deliver, Long>{

}
