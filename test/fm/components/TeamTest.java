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
package fm.components;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import fm.alav.NumberRangeException;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 28/07/2015
 * Time: 16:21
 * Last changed: 29/07/2015
 */
public class TeamTest {
    
    // Creating instance of Team
    Team t = new Team();
    
    public TeamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* TeamTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* TeamTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* TeamTest: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* TeamTest: @After method");
    }
    
    /*
    * Testing setTeamRating() method: if the teamRating asigning corract
    */
    @Test
    public void checkCorrectnessOfTeamRating(){
        System.out.println("* TeamTest: Testing method 1 - checkCorrectnessOfTeamRating()");
        t.setTeamRating(-25);
        assertEquals("Team rating must be 0 after assinging the negative number",
                0, t.getTeamRating());
        t.setTeamRating(125);
        assertEquals("Team rating must be 100 after assinging a nubmer greater "+
                "then 100", 100, t.getTeamRating());
        t.setTeamRating(50);
        assertEquals("Expected: 50, as it signed in", 50, t.getTeamRating());
    }
    
    /*
    * Testing modifyRating() method: 
    */
    @Test
    public void checkForProperRatingModification(){
        System.out.println("* TeamTest: Testing method 2 - checkForProperRatingModification()");
        t.setTeamRating(50);
        t.modifyRating(51);
        assertEquals("Rating expecting to be 100", 100, t.getTeamRating());
        t.setTeamRating(50);
        t.modifyRating(-51);
        assertEquals("Rating expected to be 0", 0, t.getTeamRating());
        t.modifyRating(50);
        assertEquals("Rating expected to be 50", 50, t.getTeamRating());
    }
}
