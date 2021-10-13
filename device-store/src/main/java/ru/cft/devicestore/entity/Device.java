package ru.cft.devicestore.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DEVICE")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
public abstract class Device{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @NotNull(message = "The price cannot be null")
    @Min(value = 0, message = "The price cannot be negative")
    @Column(name = "PRICE")
    private BigDecimal price;

    @NotNull(message = "The serial number cannot be null")
    @NotBlank(message = "The serial number cannot be blank")
    @Column(name = "serial_number", unique = true)
    private String serialNumber;

    @NotNull
    @NotBlank
    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "AVAILABLE")
    @NotNull
    @Min(value = 0, message = "The number of available devices cannot be negative")
    private int available;

    public Device(BigDecimal price, String serialNumber, String manufacturer, int available) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.available = available;
    }

    public void update(Device other){
        setAvailable(other.available);
        setManufacturer(other.manufacturer);
        setSerialNumber(other.serialNumber);
        setPrice(other.price);
    }
}
