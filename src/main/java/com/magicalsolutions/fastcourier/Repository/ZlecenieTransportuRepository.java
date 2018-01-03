package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZlecenieTransportu;
import com.magicalsolutions.fastcourier.Projection.ZlecenieProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "zleceniatransportu", excerptProjection = ZlecenieProjection.class)
public interface ZlecenieTransportuRepository extends CrudRepository<ZlecenieTransportu, Long> {
}