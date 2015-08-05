package fm.units;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 27/07/2015
 * Time: 18:05
 * Last changed: 05/07/2015
 */

import java.util.ResourceBundle;
import java.util.logging.Logger;

public class GUIBase {

    // Retrieve properties file
    public static final ResourceBundle BUNDLE = ResourceBundle.getBundle("fm.units.resources.env");
    
    // Declare Logger
    private static final Logger OUT = Logger.getLogger("GUIBase");
    
    public GUIBase(){
    
        // Assigning parameters from properties file
        // Skills
        handling = getParam(HANDLING);
        sprint = getParam(SPRINT);
        throwin = getParam(THROW);
        shoot = getParam(SHOOT);
        headers = getParam(HEADER);
        oneOnOne = getParam(ONE_ON_ONE);
        pass = getParam(PASS);
        cross = getParam(CROSS);
        firstTouch = getParam(FIRST_TOUCH);
        ritm = getParam(PACE);
        agility = getParam(AGILITY);
        stamina = getParam(STAMINA);
        power = getParam(POWER);
        jump = getParam(JUMP);
        balance = getParam(BALANCE);
        strength = getParam(STRENGHT);
        intel = getParam(INTEL);
        vision = getParam(VISION);
        composure = getParam(COMPASURE);
        leader = getParam(LEADER);
        communication = getParam(COMMUNICATION);
        decision = getParam(DESISION);
        goalKicker = getParam(GOAL_KICK);
        pos = getParam(POSITIONING);
        reflex = getParam(REFLEX);
        distribution = getParam(DISTRIBUTION);
        conf = getParam(CONF);
        // roles
        player = getParam(PLAYER);
        man = getParam(MAN);
        // player positions
        fr = getParam(FR);
        lm = getParam(LM);
        rm = getParam(RM);
        am = getParam(AM);
        dm = getParam(DM);
        cm = getParam(CM);
        ld = getParam(LD);
        rd = getParam(RD);
        cd = getParam(CD);
        lw = getParam(LW);
        rw = getParam(RW);
        gk = getParam(GK);
        
    }
    
    // Parameters from properties file
    // skills
    public static final String HANDLING = "handling";
    public static final String SPRINT = "sprint";
    public static final String THROW = "throwin";
    public static final String SHOOT = "shoot";
    public static final String HEADER = "headers";
    public static final String ONE_ON_ONE = "oneOnOne";
    public static final String PASS = "pass";
    public static final String CROSS = "cross";
    public static final String FIRST_TOUCH = "firstTouch";
    public static final String PACE = "ritm";
    public static final String AGILITY = "agility";
    public static final String STAMINA = "stamina";
    public static final String POWER = "power";
    public static final String JUMP = "jump";
    public static final String BALANCE = "balance";
    public static final String STRENGHT = "strength";
    public static final String INTEL = "intel";
    public static final String VISION = "vision";
    public static final String COMPASURE = "composure";
    public static final String LEADER = "leader";
    public static final String COMMUNICATION = "communication";
    public static final String DESISION = "decision";
    public static final String GOAL_KICK = "goalKicker";
    public static final String POSITIONING = "pos";
    public static final String REFLEX = "reflex";
    public static final String DISTRIBUTION = "distribution";
    public static final String CONF = "conf";
    // roles
    public static final String PLAYER = "player";
    public static final String MAN = "man";
    // player positions
    public static final String FR = "fr";
    public static final String LM = "lm";
    public static final String RM = "rm";
    public static final String AM = "am";
    public static final String DM = "dm";
    public static final String CM = "cm";
    public static final String LD = "ld";
    public static final String RD = "rd";
    public static final String CD = "cd";
    public static final String LW = "lw";
    public static final String RW = "rw";
    public static final String GK = "gk";
    
    // Declaration variables
    // skills
    public static String handling;
    public static String sprint;
    public static String throwin;
    public static String shoot;
    public static String headers;
    public static String oneOnOne;
    public static String pass;
    public static String cross;
    public static String firstTouch;
    public static String ritm;
    public static String agility;
    public static String stamina;
    public static String power;
    public static String jump;
    public static String balance;
    public static String strength;
    public static String intel;
    public static String vision;
    public static String composure;
    public static String leader;
    public static String communication;
    public static String decision;
    public static String goalKicker;
    public static String pos;
    public static String reflex;
    public static String distribution;
    public static String conf;
    // roles
    public static String player;
    public static String man;
    // player positions
    public static String fr;
    public static String lm;
    public static String rm;
    public static String am;
    public static String dm;
    public static String cm;
    public static String ld;
    public static String rd;
    public static String cd;
    public static String lw;
    public static String rw;
    public static String gk;
    
    // METHODS
    //**************************************************************************
    public static String getParam(String paramName){
        String value = BUNDLE.getString(paramName);
        
        if(value == null || value.length() < 1){
            throw new IllegalArgumentException("Required parameter "+ paramName + " was not set");
        }
        // OUT.info(paramName + " was successfuly returned from env.properties file.");
        return value;
    }
    
}
