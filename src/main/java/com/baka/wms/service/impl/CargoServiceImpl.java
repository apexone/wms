package com.baka.wms.service.impl;

import com.baka.wms.domain.Cargo;
import com.baka.wms.repository.CargoRepository;
import com.baka.wms.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CargoServiceImpl implements CargoService {
    private CargoRepository cargoRepository;

    @Autowired
    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public Cargo createCargo() {
        Cargo cargo = new Cargo();
        cargo.setName("test");
        cargo.setDescription("description");
        cargo.setId(UUID.randomUUID());
        cargo.setCreatedBy("Bart");
        return cargoRepository.save(cargo);
    }
}
