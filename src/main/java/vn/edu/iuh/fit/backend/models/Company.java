package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "about", columnDefinition = "varchar(2000)")
    private String about;
    @Column(name = "comp_name", columnDefinition = "varchar(255)", nullable = false)
    private String compName;
    @Column(name = "email", columnDefinition = "varchar(255)", nullable = false)
    private String email;
    @Column(name = "phone", columnDefinition = "varchar(255)", nullable = false)
    private String phone;
    @Column(name = "web_url", columnDefinition = "varchar(255)")
    private String webURL;
    @OneToOne
    @JoinColumn(referencedColumnName = "add_id", name = "address", nullable = false)
    private Address address;
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
    public Company(Address address, String about, String compName, String email, String phone, String webURL, List<Job> jobs) {
        this.address = address;
        this.about = about;
        this.compName = compName;
        this.email = email;
        this.phone = phone;
        this.webURL = webURL;
        this.jobs = jobs;
    }
}
