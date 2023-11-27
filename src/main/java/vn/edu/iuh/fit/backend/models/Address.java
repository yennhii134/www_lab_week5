package vn.edu.iuh.fit.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "add_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "country")
    private CountryCode country;
    @Column(name = "zipcode", columnDefinition = "varchar(7)")
    private String zipCode;
    @Column(name = "number", columnDefinition = "varchar(20)")
    private String number;
    @Column(name = "city", columnDefinition = "varchar(50)")
    private String city;
    @Column(name = "street", columnDefinition = "varchar(150)")
    private String street;

    public Address(String number,String street, String city, String zipCode, CountryCode country) {
        this.country = country;
        this.zipCode = zipCode;
        this.number = number;
        this.city = city;
        this.street = street;
    }


}
