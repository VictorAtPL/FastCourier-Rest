package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Powiadomienie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin( origins = "*" )
@RepositoryRestResource(path = "powiadomienia")
public interface PowiadomienieRepository extends PagingAndSortingRepository<Powiadomienie, Long> {
}
