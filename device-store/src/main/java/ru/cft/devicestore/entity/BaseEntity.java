package ru.cft.devicestore.entity;

public interface BaseEntity <T>{
    String getSerialNumber();
    void update(T other);
}
