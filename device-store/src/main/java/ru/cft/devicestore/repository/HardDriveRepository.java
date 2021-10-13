package ru.cft.devicestore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.devicestore.entity.HardDrive;

@Repository
public interface HardDriveRepository extends BaseRepository<HardDrive> {

}
