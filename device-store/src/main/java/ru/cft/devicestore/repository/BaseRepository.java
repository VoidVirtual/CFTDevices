package ru.cft.devicestore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.cft.devicestore.entity.Device;
import ru.cft.devicestore.entity.BaseEntity;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity<T>> extends CrudRepository<T, Long> {
    @Query("SELECT d FROM Device d WHERE d.serialNumber = ?1")
        Optional<Device> findBySerialNumber(String serialNumber);
}
