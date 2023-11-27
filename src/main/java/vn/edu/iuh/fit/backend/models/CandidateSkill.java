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
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id" ,nullable = false)
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate candidate;
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfos;

    public CandidateSkill(Candidate candidate, Skill skill, SkillLevel skillLevel, String moreInfos) {
        this.candidate = candidate;
        this.skill = skill;
        this.skillLevel = skillLevel;
        this.moreInfos = moreInfos;
    }
}
