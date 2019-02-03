package com.baka.wms.service;

import com.baka.wms.domain.Cargo;
import org.springframework.stereotype.Service;

@Service
public interface CargoService {
    Cargo createCargo();
}
