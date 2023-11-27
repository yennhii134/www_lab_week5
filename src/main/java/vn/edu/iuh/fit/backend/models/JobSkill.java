package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", columnDefinition = "varchar(100)")
    private String moreInfos;

}
