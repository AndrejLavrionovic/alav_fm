package fm.components;

import fm.alav.NumberRangeException;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 27/07/2015
 * Time: 17:48
 * Last changed: 28/07/2015
 */
public class Team{
    // CONSTANTS
    //**************************************************************************
    private final int MAX_RATING = 100;
    private static final Logger OUT = Logger.getLogger("Team");
    
    // VARIABLES
    //**************************************************************************
    private String teamName;
    private int teamRating = 0;
    
    // METHODS (GET/SET)
    //**************************************************************************
    public String getTeamName(){
        return this.teamName;
    }
    public int getTeamRating(){
        return this.teamRating;
    }
    
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public void setTeamRating(int teamRating){
        try{
            if(teamRating >= 0 && teamRating < 101){
                this.teamRating = teamRating;
            }
            else{
                if(teamRating < 0){
                    this.teamRating = 0;
                }
                else if(teamRating > 100){
                    this.teamRating = 100;
                }
                throw new NumberRangeException("WARNING: Team rating cannot be "+
                        "less then 0 and greater then 100");
            }
        } catch(NumberRangeException e){
            OUT.warning(e.toString());
        }
    }
    
    // OTHER METHODS
    //**************************************************************************
    public void modifyRating(int ratingPoints){
        try{
            if(0 <= this.teamRating && this.teamRating <=100){
                this.teamRating += ratingPoints;
                if(this.teamRating > 100){
                    this.teamRating = 100;
                    throw new NumberRangeException("WARNING: Team ratng rich maximum.");
                }
                else if(this.teamRating < 0){
                    this.teamRating = 0;
                    throw new NumberRangeException("WARNING: Team rating reach minimum.");
                }
            }
            else{
                throw new NumberRangeException("WARNING: Team rating cannot be less then 0 "+
                        "or greater then 100.");
            }
        } catch(NumberRangeException e){
            OUT.warning(e.toString());
        }
    }
}
