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

import java.util.logging.Logger;

public class Person extends PersonSkills {
    // CONSTANTS
    //**************************************************************************
    protected static final int MAX_SKILL = 20;
    private static final Logger LOGGER = Logger.getLogger("Person");
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
    
    // private PersonSkills ps = new PersonSkills();
    
    // CONSTRUCTOR
    //**************************************************************************
    public Person(String firsName, String lastName){
        super();
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
    public void calculateSkillLevel(int role)
    throws IllegalArgumentException {
        
        float total = 0f;
        int groupOfSkills = 0;
        
        if(role != PLAYER && role != GOALKEEPER && role != MANAGER && role != DOC){
            throw new IllegalArgumentException("ERROR: Role is not valid");
        }
        else{
            int i;
            for(i = 0; i < skills.size(); i++){
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
        try{
            if(role != PLAYER && role != GOALKEEPER && role != MANAGER && role != DOC){
                throw new IllegalArgumentException("ERROR: Role is not valid");
            }
            else{
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
            }
        } catch(IllegalArgumentException e){
            LOGGER.warning(e.toString());
        }
        return match;
    }
    
    public void setSkillsValues(int role)throws IllegalArgumentException{
        
        // position must be just 1 or 2 in this stage
        // where 1 for Player
        // 2 for Goalkeeper
        if(role == PLAYER || role == GOALKEEPER ||
                role == MANAGER || role == DOC){
            int i;
            for(i = 0; i < this.skills.size(); i++){
                Skill s = this.skills.get(i);
                // searching for player's skills
                int[] group = s.getSkillGroup();
                if(searchForSkill(role, group)){
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
