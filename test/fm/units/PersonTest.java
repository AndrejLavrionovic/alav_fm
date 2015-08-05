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
package fm.units;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrei
 */
public class PersonTest {
        
    // CONSTANCES
    final int PLAYER = 1;
    final int GOALKEEPER = 2;
    final int MANAGER = 3;
    final int DOC = 4;
    final float DELTA = 1E-1F;
    
    Player p;
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* PersonTest: @BeforeClass method.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* PersonTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* PersonTest: @Before method");
    
        // Instance
        this.p = new Player("Andrey", "Lavrinovic");
    }
    
    @After
    public void tearDown() {
        System.out.println("* PersonTest: @After method");
        this.p = null;
    }
    // TESTS
    //**************************************************************************
    
    /*
    * Testing setSkillsValues() method for proper parameter
    */
    @Test(expected=IllegalArgumentException.class)
    public void checkSetSkillsValuesForException(){
        System.out.println("* PersonTest: Testing method 1 - checkSetSkillsValuesForException()");
        final int role = 0;
        p.setSkillsValues(role);
    }
    
    /*
    * Testing calculateSkillLevel() method for throing exception
    * If given argument is not valid method should trow IllegalArgumentException
    */
    @Test(expected=IllegalArgumentException.class)
    public void checkCalculateSkillLevelForException(){
        System.out.println("* PersonTest: Testing method 2 - checkCalculateSkillLevelForException()");
        final int role = 0;
        p.calculateSkillLevel(role);
    }
    
    /*
    * Testing calculateSkillLevel() for success
    */
    @Test
    public void checkCalculateSkillLevelForSuccess(){
        System.out.println("* PersonTest: Testing method 3 - checkCalculateSkillLevelForSuccess()");
        
        int role = PLAYER;
        p.setSkillsValues(role);
        p.calculateSkillLevel(role);
        assertEquals("The value of skill is not math", 5.6F, p.getSkillLevel(), DELTA);
        
        role = GOALKEEPER;
        p.setSkillsValues(role);
        p.calculateSkillLevel(role);
        assertEquals("The value of skill is not math", 5.6F, p.getSkillLevel(), DELTA);
    }
}
