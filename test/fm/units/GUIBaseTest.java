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
public class GUIBaseTest {
    
    // Instance
    private GUIBase gb;
    
    public GUIBaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* GUIBaseTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* GUIBaseTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* GUIBaseTest: @Before method");
        gb = new GUIBase();
    }
    
    @After
    public void tearDown() {
        System.out.println("* GUIBaseTest: @After method");
        gb = null;
    }
    
    /*
    * Testing getParam() method for proper key=value pairs
    */
    @Test
    public void checkKeyValuePairs(){
        System.out.println("* GUIBaseTest: Testing method 1 - checkKeyValuePairs()");
        
        assertEquals("This key=value pair is not match", "Agility", gb.getParam("agility"));
        assertEquals("This key=value pair is not match", "Team Manager", gb.getParam("man"));
        assertEquals("This key=value pair is not match", "Attacking Midfielder", gb.getParam("am"));
    }
    
}
