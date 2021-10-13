package ru.cft.devicestore.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.cft.devicestore.entity.BaseEntity;
import ru.cft.devicestore.repository.BaseRepository;
import ru.cft.devicestore.service.BaseService;

import javax.transaction.Transactional;
import javax.validation.Valid;

public class BaseController<T extends BaseEntity<T>> {
    private final BaseService<T> service;

    public BaseController(BaseRepository<T> repository) {
        service = new BaseService<T>(repository);
    }

    @GetMapping("/")
    public Iterable<T> list(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public T read(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping("/create")
    @Transactional
    public ResponseEntity create(@RequestBody @Valid T entity, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().build();
        }
        service.add(entity);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/edit")
    @Transactional
    public ResponseEntity update(@PathVariable Long id,
                                 @RequestBody @Valid T entity,
                                 BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().build();
        }
        service.update(id, entity);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id) {
        service.remove(id);
    }
}