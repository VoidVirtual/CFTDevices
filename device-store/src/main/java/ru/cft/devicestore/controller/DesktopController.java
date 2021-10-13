package ru.cft.devicestore.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.devicestore.entity.Desktop;
import ru.cft.devicestore.repository.DesktopRepository;

import javax.validation.Validator;

@RestController
@Validated
@RequestMapping("/desktops")
public class DesktopController extends BaseController<Desktop> {
    public DesktopController(DesktopRepository repository){
        super(repository);
    }
}
