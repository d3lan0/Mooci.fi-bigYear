/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName){
        this.name = name; 
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void incrementObservationCount(){
        this.observationCount++;
    }
    
    public int getObservationCount(){
        return this.observationCount;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
    
}
