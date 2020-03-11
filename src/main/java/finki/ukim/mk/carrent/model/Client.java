package finki.ukim.mk.carrent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {

    private String embg;
    private  String name;
    private int age;
    private Sex sex;
    private String driverLicenceNumber;
    private boolean crimeRecord;

}
