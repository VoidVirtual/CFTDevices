package ru.cft.devicestore.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.devicestore.entity.HardDrive;
import ru.cft.devicestore.repository.HardDriveRepository;

import javax.validation.Validator;

@RestController
@Validated
@RequestMapping("/hard-drives")
public class HardDriveController extends BaseController<HardDrive> {
    public HardDriveController(HardDriveRepository repository){
        super(repository);
    }
}
