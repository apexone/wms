package com.baka.wms.controller;

import com.baka.wms.domain.Cargo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/cargo")
public class CargoController {
    @GetMapping(value = "/{cargoId}")
    public @ResponseBody
    Cargo getTestData(@PathVariable String cargoId) {
        Cargo object = new Cargo();
        object.setName("Hello World");
        return object;
    }
}
