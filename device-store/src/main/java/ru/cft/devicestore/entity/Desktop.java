package ru.cft.devicestore.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "DESKTOP")
public class Desktop extends Device implements BaseEntity<Desktop>{

    @NotNull
    @Column(name = "FORM_FACTOR")
    private DesktopFormFactor formFactor;

    public Desktop(){

    }

    public Desktop(BigDecimal price,
                   String serialNumber,
                   String manufacturer,
                   int available,
                   DesktopFormFactor formFactor) {
        super(price, serialNumber, manufacturer, available);
        this.formFactor = formFactor;
    }

    public void update(Desktop other){
        super.update(other);
        this.formFactor = other.formFactor;
    }
}
