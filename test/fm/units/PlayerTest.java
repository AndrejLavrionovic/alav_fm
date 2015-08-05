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

import java.util.List;
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
public class PlayerTest {
    
    // Implements
    Player p;
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* PlayerTest: @Beforeclass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* PlayerTest: @Afterclass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* PlayerTest: @Before method");
        this.p = new Player("Andrey", "Lavrinovic");
    }
    
    @After
    public void tearDown() {
        System.out.println("* PlayerTest: @After method");
        this.p = null;
    }
}
