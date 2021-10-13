package ru.cft.devicestore.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.devicestore.entity.Monitor;
import ru.cft.devicestore.repository.MonitorRepository;

import javax.validation.Validator;

@RestController
@Validated
@RequestMapping("/monitors")
public class MonitorController extends BaseController<Monitor> {
    public MonitorController(MonitorRepository repository) {
        super(repository);
    }
}
