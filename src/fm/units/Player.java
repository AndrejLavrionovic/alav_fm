package fm.units;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 17/07/2015
 * Time: 12:51
 * Last changed: 31/07/2015
 */

public class Player extends Person  {
    
    // CONSTANTS
    //**************************************************************************
    private final static Logger OUT = Logger.getLogger("Player");
    
    // VARIABLES
    //**************************************************************************
    private String position;
    
    // CONSTRUCTOR
    //**************************************************************************
    public Player(String firstName, String lastName){
        super(firstName, lastName);
        super.setRole("Player");
    }
    
    // METHODS (GET/SET)
    //**************************************************************************
    public String getPosition(){
        return this.position;
    }
//    public List<Skill> getSkills(){
//        return sk.skills;
//    }
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
    
//    public void setSkillsValues(int position)throws IllegalArgumentException{
//        
//        // position must be just 1 or 2 in this stage
//        // where 1 for Player
//        // 2 for Goalkeeper
//        if(position == PLAYER || position == GOALKEEPER){
//
//            for(int i = 0; i < sk.skills.size(); i++){
//                Skill s = sk.skills.get(i);
//                // searching for player's skills
//                int[] group = s.getSkillGroup();
//                if(searchForSkill(position, group)){
//                    s.setSkillVolume(5.6f);
//                }
//                else{
//                    s.setSkillVolume(Float.NaN);
//                }
//            }
//        }
//        else{
//            throw new IllegalArgumentException("ERROR: Position is not valid.");
//        }
//    }
    
//    private boolean searchForSkill(int role, int[] group){
//        boolean match = false;
//        if(group.length > 1){
//            for(int i = 0; i < group.length; i++){
//                if(group[i] == role){
//                    match = true;
//                    return match;
//                }
//            }
//        }
//        else{
//            if(group[0] == role){
//                match = true;
//                return match;
//            }
//        }
//        return match;
//    }
}
