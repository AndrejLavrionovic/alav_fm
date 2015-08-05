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
public class SkillTest {
    
    // Constants
    final float DELTA = 1e-1f;
    
    // Variables
    Skill sk;
    
    public SkillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* SkillTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* SkillTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* SkillTest: @Before method");
        
        // Instances
        sk = new Skill("Sprinting");
    }
    
    @After
    public void tearDown() {
        System.out.println("* SkillTest: @After method");
    }
    
    /*
    * Testing modifySkills() for max and min ruls
    */
    @Test
    public void checkingModifySkillsMethodForMaxMinRules(){
        System.out.println("* SkillTest: Testing method 1 - checkingModifySkillsMethodForMaxMinRules()");
        float skVol, vol;
        
        skVol = 5.0f; vol = -20.0f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Vol must be converted to MAX_MOD_VOL", 4.0f, sk.getSkillVolume(), DELTA);
        
        skVol = 3.5f; vol = -20.0f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Vol must be converted to MAX_MOD_VOL and skill value"+
                " must not be less then 3", 3.0f, sk.getSkillVolume(), DELTA);
        
        skVol = 18.0f; vol = 20.0f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Vol must be converted to MAX_MOD_VOL", 19.0f, sk.getSkillVolume(), DELTA);
        
        skVol = 19.5f; vol = 20.0f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Vol must be converted to MAX_MOD_VOL and skill value"+
                " must not be greater then 20", 20.0f, sk.getSkillVolume(), DELTA);
        
        skVol = 19.9f; vol = 0.5f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Skill value must not be greater then 20", 20.0f, sk.getSkillVolume(), DELTA);
        
        skVol = 3.1f; vol = -0.5f;
        sk.setSkillVolume(skVol);
        sk.modifySkill(vol);
        assertEquals("Skill value must not be less then 3", 3.0f, sk.getSkillVolume(), DELTA);
    }
}
