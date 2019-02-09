package com.baka.wms.controller;

import com.baka.wms.domain.Cargo;
import com.baka.wms.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cargo")
public class CargoController {
    private CargoService cargoService;

    @Autowired
    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping(value = "/{cargoId}")
    public @ResponseBody
    Cargo getTestData(@PathVariable String cargoId) {
        Cargo object = new Cargo();
        object.setName("Hello World");
        return object;
    }

    @PostMapping(value = "")
    public @ResponseBody
    Cargo createCargo() {
        return cargoService.createCargo();
    }
}
