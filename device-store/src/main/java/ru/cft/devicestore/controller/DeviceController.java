package ru.cft.devicestore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.devicestore.exception.NotFoundException;
import ru.cft.devicestore.entity.Device;
import ru.cft.devicestore.repository.DeviceRepository;

@RestController
@Validated
@RequestMapping("/devices")
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;

    public DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }
    @GetMapping("/{id}")
    public Device get(@PathVariable Long id){
        return deviceRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
