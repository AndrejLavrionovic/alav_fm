/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package units;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 
 * Time: 
 * Last changed: 
 */
public class PersonSkills {
    // VARIBLES
    //**************************************************************************
    private int[] playerBunch = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                                 16, 17, 18, 19, 20, 22, 23};
    private int[] goalkeeperBunch = {0, 10, 15, 21, 23, 24, 25, 26};
    
    // COLLECTIONS
    //**************************************************************************
    List<String> skillBunch = new ArrayList<String>();
    List<String> skills = new ArrayList<String>();
    
    // Populating
    //skills.add("Handling");
    
    // CONSTRUCTOR
    //**************************************************************************
    public PersonSkills(int role){
        populatingSkills();
        if(role == 1) setSkillBunch(this.playerBunch);
        else if(role == 2) setSkillBunch(this.goalkeeperBunch);
    }
    
    private void populatingSkills(){
        skills.add("Handling");skills.add("Sprinting");skills.add("Throw-ins");
        skills.add("Shooting");skills.add("Headers");skills.add("One-on-Ones");
        skills.add("Passing");skills.add("Crossing");skills.add("First touch");
        skills.add("Pace");skills.add("Agility");skills.add("Decision-making");
        skills.add("Power");skills.add("Endurance");skills.add("Distribution");
        skills.add("Balance");skills.add("Strenght");skills.add("Inteligence");
        skills.add("Vision");skills.add("Composure");skills.add("Leadership");
        skills.add("Communication");skills.add("Stamina");skills.add("Jumping");
        skills.add("Goal-kicking");skills.add("Positioning");skills.add("Reflexes");
    }
    
    protected void setSkillBunch(int[] bunch){
        for(int i = 0; i < bunch.length; i++){
            this.skillBunch.add(skills.get(bunch[i]));
        }
    }
}
