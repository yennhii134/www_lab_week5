package vn.edu.iuh.fit.backend.enums;

public enum SkillType {
    SOFT_SKILL,
    UNSPECIFIC,
    TECHNICAL_SKILL;
    private int value;
    SkillType(int value){
        this.value = value;
    }
    SkillType(){

    }
    public int getValue(){
        return this.value;
    }
}
