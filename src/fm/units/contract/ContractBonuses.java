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

import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 10/08/2015
 * Time: 16:13
 * Last changed: 10/08/2015
 */
public class ContractBonuses {
    
    // LOGGER
    //**************************************************************************
    private final static Logger LOGGER = Logger.getLogger("ConractBonuses.class");

    // COLLECTIONS
    //**************************************************************************
    protected Map<String, Float> bonuses = new Hashtable<>();
    
    // CONSTRUCTOR
    //**************************************************************************
    public ContractBonuses(){
        populateBonusses();
    }
    
    // OTHER METHODS
    //**************************************************************************
    private Map<String, Float> populateBonusses(){
        bonuses.put("Goal Bonus", 0f);
        bonuses.put("Appearance Fee", 0f);
        bonuses.put("Clean Sheet Bonus", 0f);
        bonuses.put("Team of the Year", 0f);
        bonuses.put("Top Goal Scorer (Devision)", 0f);
        bonuses.put("Top Goal Scorer (Team)", 0f);
        bonuses.put("Promotion Bonus", 0f);
        bonuses.put("Avoid Relegation Bonus", 0f);
        bonuses.put("International Cup Bonus", 0f);
        bonuses.put("Unused Substitues Fee", 0f);
        
        return bonuses;
    }
    
    public void setBonus(String key, float newValue){
        if(bonuses.containsKey(key)){
            /*
            * This statement will be changed. New class will be created
            * bonusRange.class that will colculate and validate newValue range
            * based on parameters such as Team budget, Salary, Summary Offer and
            * so on. newValue must not be negative or equals to 0.
            */
            if(newValue > 0){
                bonuses.put(key, newValue);
            }
            else{
                LOGGER.warning("Bonus value must be greater than 0.");
            }
        }
        else{
            LOGGER.warning("This type of bonus is not exist.");
        }
    }
    
    public Float getBonusValue(String key){
        try{
            if(bonuses.containsKey(key)){
                return bonuses.get(key);
            }
            else{
                throw new RuntimeException("This bonus is not exist.");
            }
        } catch(RuntimeException e){
            LOGGER.warning(e.toString());
            return 0f;
        }
    }
}
