package ru.cft.devicestore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.devicestore.entity.Desktop;

@Repository
public interface DesktopRepository extends BaseRepository<Desktop> {

}
