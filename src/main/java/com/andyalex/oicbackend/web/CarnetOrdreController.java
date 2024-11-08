package com.andyalex.oicbackend.web;

import com.andyalex.oicbackend.entities.CarnetOrdre;
import com.andyalex.oicbackend.repository.CarnetOrdreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CarnetOrdreController {

    private CarnetOrdreRepository carnetOrdreRepository;
    public CarnetOrdreController(CarnetOrdreRepository carnetOrdreRepository) {
        this.carnetOrdreRepository = carnetOrdreRepository;
    }
    @GetMapping("/carnet-ordres")
    public List<CarnetOrdre> carnetOrdreList() {
        return (List<CarnetOrdre>) this.carnetOrdreRepository.findAll();
    }

    @GetMapping("/carnet-ordres/{id}")
    public CarnetOrdre carnetOrdreById(@PathVariable Long id) {
        return this.carnetOrdreRepository.findById(id).get();
    }
}
