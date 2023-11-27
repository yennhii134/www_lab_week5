package vn.edu.iuh.fit.backend.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @Column(name = "can_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "dob", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @Column(name = "phone", nullable = false, columnDefinition = "varchar(15)")
    private String  phone;
    @Column(name = "email", nullable = false, columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "full_name", nullable = false, columnDefinition = "varchar(255)")
    private String fullName;
    @OneToOne
    @JoinColumn(referencedColumnName = "add_id", name = "address", nullable = false)
    private Address address;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;
    @OneToMany(mappedBy = "candidate")
    private List<Experience> experiences;

    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email) {
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.fullName = fullName;
    }

}
