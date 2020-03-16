package finki.ukim.mk.carrent.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarHistory {

    private Long id;
    private LocalDate registrationDate;
    private String breaksStatus;
    private String frontGlassStatus;
    private String wheelsStatus;
    private String engineStatus;
    private int kmDistancePassed;
    private String detailsDescription;

    private Car car;

    public void createCarHistory(LocalDate registrationDate, String breaksStatus, String frontGlssStatus, String wheelStatus, String engineStatus, int kmPassed, String description, Car car){
        this.registrationDate = registrationDate;
        this.breaksStatus = breaksStatus;
        this.frontGlassStatus = frontGlssStatus;
        this.wheelsStatus = wheelStatus;
        this.engineStatus = engineStatus;
        this.kmDistancePassed = kmPassed;
        this.detailsDescription = description;
        this.car = car;
    }
}