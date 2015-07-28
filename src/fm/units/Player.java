package fm.units;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 17/07/2015
 * Time: 12:51
 * Last changed: 28/07/2015
 */

public class Player extends Person  {
    // VARIABLES
    //**************************************************************************
    // Connecting environment variables
    private final GUIBase env = new GUIBase();
    // Extracting Skills
    private final PersonSkills sk = new PersonSkills();
    
    private String position;
    private final int[] GKSkillBunch = {};
    
    // CONSTRUCTOR
    //**************************************************************************
    public Player(String firstName, String lastName){
        super(firstName, lastName);
        super.setRole(env.player);
    }
    
    // METHODS (GET/SET)
    //**************************************************************************
    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    
    // OTHER METHODS
    //**************************************************************************
    /*
    * Method: setSkillsValues.
    * This method takes an integer value, where
    * 1 - player skills
    * 2 - goalkeeper skills
    *
    */
    
    public void setSkillsValues(int position){
        Map<Integer, Float> skillsValues = new HashMap<Integer, Float>();
        
        for(int i = 0; i < sk.skills.size(); i++){
            Skill s = sk.skills.get(i);
            // searching for player's skills
            int[] group = s.getSkillGroup();
            if(searchForSkill(position, group)){
                skillsValues.put(i, Float.NaN);
            }
            else{
                skillsValues.put(i, Float.NaN);
            }
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
}
