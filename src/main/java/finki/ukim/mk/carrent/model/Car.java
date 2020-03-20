package finki.ukim.mk.carrent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_plate")
    private String plate;

    @Column(name = "car_mark")
    private String mark;

    @Column(name = "car_model")
    private String model;

    @Column(name = "car_color")
    private String color;

    private String imgLink;

    private int yearOfProduction;
    private int costPerDay;
    private double rating = 0;
    private int numberOfRatings = 0;

    @ManyToOne
    private Renter renter;

    public void calculateRating(int rating){
        this.numberOfRatings++;
        this.rating = (this.rating + rating) / numberOfRatings;
    }

    public void createCar(String plate, String mark, String model, String color, int yearOfProduction, int cost, String imgLink, Renter renter){
        this.plate = plate;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.costPerDay = cost;
        this.rating = 0;
        this.numberOfRatings = 0;
        this.imgLink = imgLink;
        this.renter = renter;
    }
}
