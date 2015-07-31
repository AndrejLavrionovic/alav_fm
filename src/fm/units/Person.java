package fm.units;

/**
 *
 * @author Andrej Lavrinovic
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 17/07/2015
 * Time: 12:51
 * Last changed: 31/07/2015
 */

import java.util.List;
import java.util.logging.Logger;

public class Person extends PersonSkills {
    // CONSTANTS
    //**************************************************************************
    protected static final int MAX_SKILL = 20;
    private static final Logger OUT = Logger.getLogger("Person");
    private final int PLAYER = 1;
    private final int GOALKEEPER = 2;
    private final int MANAGER = 3;
    private final int DOC = 4;
    
    // VARIBLES
    //**************************************************************************
    private String firstName;
    private String lastName;
    private float skillLevel;
    private String role;
    
    private List<Skill> skills;
    
    // private PersonSkills ps = new PersonSkills();
    
    // CONSTRUCTOR
    //**************************************************************************
    public Person(String firsName, String lastName){
        this.firstName = firsName;
        this.lastName = lastName;
    }
    
    // METHODS (GET/SET)
    //**************************************************************************
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public float getSkillLevel(){
        return this.skillLevel;
    }
    public String getRole(){
        return this.role;
    }
    public List<Skill> getSkills(){
        return getSkills();
    }
    
    public void setRole(String position){
        this.role = position;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    // OTHER METHODS
    //**************************************************************************
    public void calculateSkillLevel(int role, List<Skill> skills)
    throws IllegalArgumentException {
        
        float total = 0f;
        int groupOfSkills = 0;
        
        if(role != PLAYER && role != GOALKEEPER && role != MANAGER && role != DOC){
            throw new IllegalArgumentException("ERROR: Role is not valid");
        }
        else{
            for(int i = 0; i < skills.size(); i++){
                Skill s = skills.get(i);
                int group[] = s.getSkillGroup();
                if(searchForSkill(role, group)){
                    total += s.getSkillVolume();
                    groupOfSkills++;
                }
            }
            this.skillLevel = total / groupOfSkills;
        }
    }
    
    private boolean searchForSkill(int role, int[] group){
        boolean match = false;
        if(group.length > 1){
            for(int i = 0; i < group.length; i++){
                if(group[i] == role){
                    match = true;
                    return match;
                }
            }
        }
        else{
            if(group[0] == role){
                match = true;
                return match;
            }
        }
        return match;
    }
    
    public void setSkillsValues(int position)throws IllegalArgumentException{
        
        // position must be just 1 or 2 in this stage
        // where 1 for Player
        // 2 for Goalkeeper
        if(position == PLAYER || position == GOALKEEPER){

            for(int i = 0; i < this.skills.size(); i++){
                Skill s = this.skills.get(i);
                // searching for player's skills
                int[] group = s.getSkillGroup();
                if(searchForSkill(position, group)){
                    s.setSkillVolume(5.6f);
                }
                else{
                    s.setSkillVolume(Float.NaN);
                }
            }
        }
        else{
            throw new IllegalArgumentException("ERROR: Position is not valid.");
        }
    }
}
