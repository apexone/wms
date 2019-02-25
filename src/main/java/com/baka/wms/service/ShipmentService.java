package com.baka.wms.service;

import com.baka.wms.domain.Shipment;
import org.springframework.stereotype.Service;

@Service
public interface ShipmentService {
    Shipment createShipment();
}
