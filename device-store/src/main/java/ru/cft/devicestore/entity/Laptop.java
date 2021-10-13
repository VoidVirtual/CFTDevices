package ru.cft.devicestore.entity;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "LAPTOP")
public class Laptop extends Device implements BaseEntity<Laptop>{

    @Getter
    @NotNull
    @Column(name = "DISPLAY_LENGTH")
    int displayLength;

    public Laptop(){

    }

    public Laptop(BigDecimal price,
                  String serialNumber,
                  String manufacturer,
                  int available,
                  int displayLength) {
        super(price, serialNumber, manufacturer, available);
        this.displayLength = displayLength;
    }

    public void update(Laptop other){
        super.update(other);
        displayLength = other.displayLength;
    }
}
