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
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 28/07/2015
 * Time: 16:21
 * Last changed: 
 */
public class Program {
    public static void main(String[] args){
        
        // VARIABLES
        //**********************************************************************
        String msg = "";
        String number;
        
        // testing fm.componenrs.Team.increaseRating() method
        // creating new instance of type Team
        Team team = new Team();
        
        // assigning teamName and teamRating fields by valid values
        team.setTeamName("Galway Utd");
        number = JOptionPane.showInputDialog("Enter " + team.getTeamName() + " rating:");
        team.setTeamRating(Integer.parseInt(number));
        
        // increasing teamRating by valid Number
        msg += team.getTeamName() + " rating is " + team.getTeamRating();
        JOptionPane.showMessageDialog(null, msg, team.getTeamName(), JOptionPane.WARNING_MESSAGE);
        number = JOptionPane.showInputDialog("Enter number for increasing rating");
        int num = Integer.parseInt(number);
        team.modifyRating(num);
        msg += "\nRating increased by " + num;
        msg += "\n" + team.getTeamName() + " rating now is " + team.getTeamRating();
        JOptionPane.showMessageDialog(null, msg, team.getTeamName(), JOptionPane.WARNING_MESSAGE);
        
    } // main
} // class
