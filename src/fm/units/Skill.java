package fm.units;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 23/07/2015
 * Time: 17:38
 * Last changed: 28/07/2015
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
    private char[] skillType;
    private List<String> skillAcceptance = new ArrayList<String>();
    private int[] skillGroup;
    
    // CONSTRUCTORS
    //**************************************************************************
    public Skill(String skillName){
        this.skillName = skillName;
    }
    public Skill(String skillName, int[] skillGroup){
        this.skillName = skillName;
        this.skillGroup = skillGroup.clone();
    }
    
    // METHODS (GET/SET)
    //**************************************************************************
    protected String getSkillName(){
        return this.skillName;
    }
    protected float getSkillVolume(){
        return this.skillVolume;
    }
    protected char[] getSkillType(){
        return this.skillType.clone();
    }
    protected int[] getSkillGroup(){
        return this.skillGroup.clone();
    }
    
    protected void setSkillVolume(float skillVolume){
        this.skillVolume = skillVolume;
    }
    protected void setSkillName(String skillName){
        this.skillName = skillName;
    }
    protected void setSkillType(char[] skillType){
        this.skillType = skillType.clone();
    }
    protected void setSkillGroup(int[] skillGroup){
        this.skillGroup = skillGroup.clone();
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
