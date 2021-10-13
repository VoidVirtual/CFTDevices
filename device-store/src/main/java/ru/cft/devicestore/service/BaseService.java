package ru.cft.devicestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.beanvalidation.CustomValidatorBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import ru.cft.devicestore.exception.NotFoundException;
import ru.cft.devicestore.entity.BaseEntity;
import ru.cft.devicestore.exception.SerialNumberException;
import ru.cft.devicestore.repository.BaseRepository;

import javax.validation.Valid;
import javax.validation.Validator;

public class BaseService <T extends BaseEntity<T>>{

    private BaseRepository<T> repository;

    public BaseService(BaseRepository<T> repository) {
        this.repository = repository;
    }
    public Iterable<T> getAll(){
        return repository.findAll();
    }

    public T get(Long id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    public T add(T entity) {
        if(!repository.findBySerialNumber(entity.getSerialNumber()).isEmpty()){
            throw new SerialNumberException(entity.getSerialNumber());
        }
        return repository.save(entity);
    }

    public T update(Long updatableId, T newEntity){
        T updatable = get(updatableId);
        updatable.update(newEntity);
        return add(updatable);
    }

    public void remove(Long id){
        repository.deleteById(id);
    }

}
