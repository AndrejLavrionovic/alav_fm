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
package fm.units.contract;

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
public class ContractBonusesTest {
    
    // CONSTANTS
    final float DELTA = 1E-1F;
    
    // INSTANTS
    ContractBonuses cb;
    
    public ContractBonusesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* ContractBonusesTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* ContractBonusesTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* ContractBonusesTest: @Before method");
        
        // Instances
        cb = new ContractBonuses();
    }
    
    @After
    public void tearDown() {
        System.out.println("* ContractBonusesTest: @After method");
        cb = null;
    }

    /*
    * Testing setBonus() method for proper key
    */
    @Test
    public void checkIsKeyValidInSetValueMethod(){
        System.out.println("* ContractBonusesTest: Testing method 1 - "
                + "checkIfValueIsChangedInSetValueMethod()");
        
        String key = "Goal Bonus";
        Float newValue = 100f;
        cb.setBonus(key, newValue);
        
        assertEquals("Key should be - Goal Bonus - valid", 100f, cb.getBonusValue(key), DELTA);
        
        key = "Appearance Fee";
        cb.setBonus(key, newValue);
        assertEquals("Key should be - Appearance Fee - valid", 100f, cb.getBonusValue(key), DELTA);
        
        key = "GoalBonus";
        cb.setBonus(key, newValue);
        assertEquals("Key should be - GoalBonus - NOT valid", 0f, cb.getBonusValue(key), DELTA);
        
    }
    
    /*
    * Testing setBonus() method for proper value
    */
    @Test
    public void checkForProperBonusValueInSetValueMethod(){
        System.out.println("* ContractBonusesTest: Testing method 2 - "
                + "checkForProperBonusValueInSetValueMethod()");
        
        String key = "Goal Bonus";
        Float newValue = 0f;
        cb.setBonus(key, newValue);
        
        assertEquals("newValue = 0, must be GREATER then 0.", 0f, cb.getBonusValue(key), DELTA);
        
        newValue = -10f;
        cb.setBonus(key, newValue);
        assertEquals("newValue = -10, must be GREATER then 0.", 0f, cb.getBonusValue(key), DELTA);
        
        newValue = 1234f;
        cb.setBonus(key, newValue);
        assertEquals("newValue = 1234, must be GREATER then 0.", 1234f, cb.getBonusValue(key), DELTA);
    }
}
