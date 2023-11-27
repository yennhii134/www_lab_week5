package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillType;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "skill_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "skill_type")
    private SkillType skillType;
    @Column(name = "skill_name", columnDefinition = "varchar(255)")
    private String skillName;
    @Column(name = "skill_desc", columnDefinition = "varchar(255)")
    private String skillDesc;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

    public Skill(SkillType skillType, String skillName, String skillDesc, List<JobSkill> jobSkills) {
        this.skillType = skillType;
        this.skillName = skillName;
        this.skillDesc = skillDesc;
        this.jobSkills = jobSkills;
    }
}
