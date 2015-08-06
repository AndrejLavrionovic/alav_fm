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
 * Last changed: 05/08/2015
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
}
