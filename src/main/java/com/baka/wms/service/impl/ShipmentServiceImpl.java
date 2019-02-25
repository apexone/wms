package com.baka.wms.service.impl;

import com.baka.wms.domain.Shipment;
import com.baka.wms.repository.ShipmentRepository;
import com.baka.wms.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShipmentServiceImpl implements ShipmentService{
    private ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public Shipment createShipment() {
        Shipment shipment = new Shipment();
        shipment.setName("test");
        shipment.setDescription("description");
        shipment.setId(UUID.randomUUID());
        shipment.setCreatedBy("Bart");
        return shipmentRepository.save(shipment);
    }
}
