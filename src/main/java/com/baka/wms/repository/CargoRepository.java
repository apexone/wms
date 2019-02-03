package com.baka.wms.repository;

import com.baka.wms.domain.Cargo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CargoRepository extends CrudRepository<Cargo, UUID> {
}
