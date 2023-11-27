package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "job_desc", nullable = false, columnDefinition = "varchar(2000)")
    private String jobDesc;
    @Column(name = "job_name", nullable = false, columnDefinition = "varchar(255)")
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<JobSkill> jobSkills;

    public Job( String jobDesc, String jobName, Company company,List<JobSkill> jobSkills){
        this.jobDesc = jobDesc;
        this.jobName = jobName;
        this.company = company;
        this.jobSkills = jobSkills;
    }
}
