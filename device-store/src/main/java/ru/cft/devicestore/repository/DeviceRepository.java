package ru.cft.devicestore.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.devicestore.entity.Device;

import java.util.Optional;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {

}
