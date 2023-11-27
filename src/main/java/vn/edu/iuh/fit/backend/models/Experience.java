package vn.edu.iuh.fit.backend.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @Column(name = "exp_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "from_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private LocalDate fromDate;
    @Column(name = "to_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private LocalDate toDate;
    @Column(name = "role", columnDefinition = "varchar(100)")
    private String role;
    @Column(name = "company", columnDefinition = "varchar(120)")
    private String company;
    @Column(name = "work_desc", columnDefinition = "varchar(400)")
    private String workDesc;
    @ManyToOne
    @JoinColumn(name = "candidate", nullable = false)
    private Candidate candidate;

    public Experience(LocalDate fromDate, LocalDate toDate, String role, String company, String workDesc, Candidate candidate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.role = role;
        this.company = company;
        this.workDesc = workDesc;
        this.candidate = candidate;
    }
}
