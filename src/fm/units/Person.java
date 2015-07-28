package fm.units;

/**
 *
 * @author Andrej Lavrinovic
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 17/07/2015
 * Time: 12:51
 * Last changed: 28/07/2015
 */

import java.util.List;

public class Person {
    // CONSTANTS
    //**************************************************************************
    protected static final int MAX_SKILL = 20;
    
    // VARIBLES
    //**************************************************************************
    private String firstName;
    private String lastName;
    private int skillLevel;
    private String role;
    
    private List<Skill> skills;
    
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
    public int getSkillLevel(){
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
    protected void calculateSkillLevel(double[] skills){
        double total = 0.0;
        int i;
        for(i = 0; i < skills.length; i++){
            total += skills[i];
        }
        this.skillLevel = (int)((total / skills.length) * 100 / MAX_SKILL);
    }
}
