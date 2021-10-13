package ru.cft.devicestore.entity;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "MONITOR")
public class Monitor extends Device implements BaseEntity<Monitor> {


    @Getter
    @NotNull
    @Min(value = 1, message = "Diagonal length must be strictly positive")
    @Column(name = "DIAGONAL_LENGTH")
    BigDecimal diagonalLength;

    public Monitor(){

    }

    public Monitor(BigDecimal price,
                   String serialNumber,
                   String manufacturer,
                   int available,
                   BigDecimal diagonalLength) {
        super(price, serialNumber, manufacturer, available);
        this.diagonalLength = diagonalLength;
    }

    public void update(Monitor other){
        super.update(other);
        diagonalLength = other.diagonalLength;
    }
}

