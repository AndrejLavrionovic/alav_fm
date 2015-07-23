package units;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 23/07/2015
 * Time: 17:38
 * Last changed: 
 */
public class Skill {
    // CONSTANTS
    //**************************************************************************
    private final float MAX_MOD_VOL = 1.0f; // Maximal skill value that can be reduced or increased by
    private final float MIN_DEC_VOL = 5.0f; // Minimal skill that can be reduced
    
    // VARIBLES
    //**************************************************************************
    private String skillName;
    private float skillVolume = 0.0f;
    private char skillGroup;
    
    // METHODS (GET/SET)
    //**************************************************************************
    protected String getSkillName(){
        return this.skillName;
    }
    protected float getSkillVolume(){
        return this.skillVolume;
    }
    protected char getSkillGroup(){
        return this.skillGroup;
    }
    
    protected void setSkillVolume(float skillVolume){
        this.skillVolume = skillVolume;
    }
    protected void setSkillName(String skillName){
        this.skillName = skillName;
    }
    protected void setSkillGroup(char skillGroup){
        this.skillGroup = skillGroup;
    }
    
    // OTHER METHODS
    //**************************************************************************
    protected void increaseSkillVolume(float skillVolume){
        if(skillVolume <= MAX_MOD_VOL){
            this.skillVolume += skillVolume;
        }
        else {this.skillVolume += MAX_MOD_VOL;}
    }
    protected void decreaseSkillVolume(float skillVolume){
        if(this.skillVolume > MIN_DEC_VOL){
            if(skillVolume <= MAX_MOD_VOL){
                this.skillVolume -= skillVolume;
            }
            else {this.skillVolume -= MAX_MOD_VOL;}
        }
        
    }
}
