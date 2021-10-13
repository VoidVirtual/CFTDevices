package ru.cft.devicestore.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.cft.devicestore.entity.Laptop;
import ru.cft.devicestore.repository.LaptopRepository;

import javax.validation.Validator;

@RestController
@RequestMapping("/laptops")
public class LaptopController extends BaseController<Laptop> {
    public LaptopController(LaptopRepository repository){
        super(repository);
    }
}
