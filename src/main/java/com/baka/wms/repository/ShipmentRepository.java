package com.baka.wms.repository;

import com.baka.wms.domain.Shipment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ShipmentRepository extends CrudRepository<Shipment, UUID> {
}
