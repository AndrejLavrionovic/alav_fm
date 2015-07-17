/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;

/**
 *
 * @author Andrej Lavrinovic
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 17/07/2015
 * Time: 12:51
 * Last changed: 
 */
public class Person {
    // CONSTANTS
    //**************************************************************************
    protected static final int MAX_SKILL = 20;
    
    // VARIBLES
    //**************************************************************************
    private String firstName;
    private String lastName;
    private int skillLevel;
    private String position;
    
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
    public String getPosition(){
        return this.position;
    }
    
    public void setPosition(String position){
        this.position = position;
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
