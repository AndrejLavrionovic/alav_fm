/*
 * Copyright 2015 Alav Technologies. All rights reserved.
 * 
 * This source code is the confidential and proprietary
 * information of Alav Technology.
 * 
 * ("Confidential information"). You shall not disclose such
 * confidential information and shell use it only in accordance
 * with the terms of the license agreement you entered info with
 * Alav Technology.
 */

package fm;

import fm.components.Team;
import fm.units.Person;
import fm.units.PersonSkills;
import javax.swing.JOptionPane;
import fm.units.Player;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import fm.units.Skill;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 28/07/2015
 * Time: 16:21
 * Last changed: 30/07/2015
 */
public class Program {
    
    // CONSTANTS
    //**************************************************************************
    final static int PLAYER = 1;
    final static int GOALKEEPER = 2;
    
    public static void main(String[] args) throws IllegalArgumentException{
        
        // VARIABLES
        //**********************************************************************
        String msg = "";
        String number;
        int num;
        
        // testing fm.componenrs.Team.increaseRating() method
        // creating new instance of type Team
        Team team = new Team();
        
        // assigning teamName and teamRating fields by valid values
        //**********************************************************************
//        team.setTeamName("Galway Utd");
//        number = JOptionPane.showInputDialog("Enter " + team.getTeamName() + " rating:");
//        team.setTeamRating(Integer.parseInt(number));
//        
//        num = 0;
//        
//        while(num != 999){
//            // increasing teamRating by valid Number
//        msg += team.getTeamName() + " rating is " + team.getTeamRating();
//        JOptionPane.showMessageDialog(null, msg, team.getTeamName(), JOptionPane.WARNING_MESSAGE);
//        number = JOptionPane.showInputDialog("Enter number for increasing rating");
//        num = Integer.parseInt(number);
//        team.modifyRating(num);
//        msg += "\nRating increased by " + num;
//        msg += "\n" + team.getTeamName() + " rating now is " + team.getTeamRating();
//        JOptionPane.showMessageDialog(null, msg, team.getTeamName(), JOptionPane.WARNING_MESSAGE);
//        msg = "";
//        }
        
        // testing setSkillsValues() method in fm.units.Player.java
        //**********************************************************************
        Person p = new Player("Andrej", "Lavrinovic");
        p.setSkillsValues(1);
        List<Skill> skl = p.getSkills();
        
        System.out.println("\n************Skilss Values**************");
        System.out.println("| No. | Skill name      | Skill Value |");
        System.out.println("=======================================");
        System.out.println("|     |                 |             |");
        
        for(int i = 0; i < skl.size(); i++){
            Skill s = skl.get(i);
            String name = s.getSkillName();
            Float skV = s.getSkillVolume();
            System.out.printf("| %3d | %-16s| %-12.1f|%n", (i + 1), name,  skV);
        }
        
        System.out.println("=====================================");
        
        // testing calculateSkillLevel() method in fm.units.Person.java
        //**********************************************************************
        //Person p = new Player("Andrej", "Lavrinovic");
        PersonSkills ps = new PersonSkills();
        p.setSkillsValues(PLAYER);
        p.calculateSkillLevel(PLAYER, ps.getSkills());
        System.out.println("Skill value of " + p.getFirstName() + " " + 
                p.getLastName() + " is " + p.getSkillLevel());
        
    } // main
} // class
