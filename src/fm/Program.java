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
 * Last changed: 05/08/2015
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
//        Person p = new Player("Andrej", "Lavrinovic");
//        p.setSkillsValues(PLAYER);
//        List<Skill> skl = p.getSkills();
//        
//        System.out.println("\n************Skilss Values**************");
//        System.out.println("| No. | Skill name      | Skill Value |");
//        System.out.println("=======================================");
//        System.out.println("|     |                 |             |");
//        
//        for(int i = 0; i < skl.size(); i++){
//            Skill s = skl.get(i);
//            String name = s.getSkillName();
//            Float skV = s.getSkillVolume();
//            System.out.printf("| %3d | %-16s| %-12.1f|%n", (i + 1), name,  skV);
//        }
//        
//        System.out.println("=====================================");
//        
//        // testing calculateSkillLevel() method in fm.units.Person.java
//        //**********************************************************************
//        p.calculateSkillLevel(GOALKEEPER);
//        System.out.println("Skill value of " + p.getFirstName() + " " + 
//                p.getLastName() + " is " + p.getSkillLevel());
        
        // testing fm.units.Skill.modifySkill() method
        //**********************************************************************
//        System.out.println("\n\tTesting fm.units.Skill.modifySkill() method"+
//                " for Max and Min rules");
//        System.out.println("\tSkill value must be between 3 and 20"+
//                " and modification must be in -1 to 1 range");
//        System.out.println("\tfirst skill value is 10");
//        Skill s = new Skill("Jumping");
//        s.setSkillVolume(10f);
//        
//        num = 0;
//        float vol;
//        
//        while(num != -999){
//            msg = "";
//            vol = s.getSkillVolume();
//            msg += "Skill value is " + String.format("%.1f", s.getSkillVolume());
//            number = JOptionPane.showInputDialog("Enter number for changing skill");
//            s.modifySkill(Float.parseFloat(number));
//            msg += "\nSkill modified on " + number;
//            msg += "\nNew skill value is " + String.format("%.1f", s.getSkillVolume());
//            JOptionPane.showMessageDialog(null, msg, s.getSkillName(), JOptionPane.INFORMATION_MESSAGE);
//            num = Integer.parseInt(JOptionPane.showInputDialog("Enter -999 to exit or 1 to set new Skill."));
//            if(num != -999){
//                switch(num){
//                    case 1:
//                        number = JOptionPane.showInputDialog("Enter number for set new skill between (3.0 and 20.0)");
//                        s.setSkillVolume(Float.parseFloat(number));
//                }
//            }
//        }
        
        // testin GUIBase and environment properties retrieving
        //**********************************************************************
        Player pl = new Player("Andrey", "Lavrinovic");
        pl.setSkillsValues(1);
        List<Skill> sk = pl.getSkills();
        for(int i = 0; i < sk.size(); i++){
            System.out.println("First skill name is --> " + sk.get(i).getSkillName());
        }
    } // main
} // class
