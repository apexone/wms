package com.baka.wms.controller;

import com.baka.wms.domain.Shipment;
import com.baka.wms.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipment")
public class ShipmentController {
    private ShipmentService shipmentService;

    @Autowired
    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping(value = "/{shipmentId}")
    public @ResponseBody
    Shipment getTestData(@PathVariable String cargoId) {
        Shipment object = new Shipment();
        object.setName("Hello World");
        return object;
    }

    @PostMapping(value = "")
    public @ResponseBody
    Shipment createShipment() {
        return shipmentService.createShipment();
    }
}
