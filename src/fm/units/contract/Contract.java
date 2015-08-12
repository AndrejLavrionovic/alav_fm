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

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 10/08/2015
 * Time: 15:28
 * Last changed: 10/08/2015
 */
public class Contract {

    // VARIABLES
    //**************************************************************************
    private String contractName; // same as contractor name (ex. Andrey Lavrinovic)
    private int contractNumber; // distinct number
    private float contractPrice;
    private float contractSalary;
    private String contractTeam;
    private String contractType;
    
    // CONSTRUCTORS
    //**************************************************************************
    public Contract(String contractName){
        this.contractName = contractName;
    }
    
    //METHODS(GET/SET)
    //**************************************************************************
    public String getContactName(){
        return this.contractName;
    }
    public int getContractNumber(){
        return this.contractNumber;
    }
    public float getContractPrice(){
        return this.contractPrice;
    }
    public float getContractSalary(){
        return this.contractSalary;
    }
    public String getContractTeam(){
        return this.contractTeam;
    }
    public String getContractType(){
        return this.contractType;
    }
    
    public void setContractPrice(float contractPrice){
        this.contractPrice = contractPrice;
    }
    public void setContractSalary(float contractSalary){
        this.contractSalary = contractSalary;
    }
    public void setContractTeam(String contractTeam){
        this.contractTeam = contractTeam;
    }
    public void setContractType(String contractType){
        this.contractType = contractType;
    }
    
    // OTHER METHODS
    //**************************************************************************
    public void changeContractPrice(float mod){
        this.contractPrice += mod;
    }
    
    public void changeContractSalary(float mod){
        this.contractSalary += mod;
    }
    
}
    
