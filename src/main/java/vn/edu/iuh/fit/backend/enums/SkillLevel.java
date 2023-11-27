package vn.edu.iuh.fit.backend.enums;

public enum SkillLevel {
    MASTER,
    BEGINER,
    ADVANCED,
    PROFESSIONAL,
    IMTERMEDIATE;
    private int value;
    SkillLevel(int value){
        this.value = value;
    }
    SkillLevel(){

    }
    public int getValue(){
        return this.value;
    }

}
