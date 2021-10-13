package ru.cft.devicestore.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "HARD_DRIVE")
@Data
public class HardDrive extends Device implements BaseEntity<HardDrive>{


    @NotNull(message = "Capacity cannot be null")
    @Min(value = 1, message = "Capacity must be strictly positive")
    @Column(name = "CAPACITY")
    int capacity;

    public HardDrive(BigDecimal price,
                     String serialNumber,
                     String manufacturer,
                     int amount,
                     int capacity) {
        super(price, serialNumber, manufacturer, amount);
        this.capacity = capacity;
    }

    @Override
    public void update(HardDrive other) {
        super.update(other);
        this.capacity = other.capacity;
    }
}
