package ru.cft.devicestore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cft.devicestore.entity.Laptop;

import java.util.List;

@Repository
public interface LaptopRepository extends BaseRepository<Laptop> {

}
