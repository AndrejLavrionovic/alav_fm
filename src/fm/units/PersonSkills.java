package fm.units;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 20/07/2015
 * Time: 16:45
 * Last changed: 31/07/2015
 */
public class PersonSkills{
    // VARIBLES
    //**************************************************************************
    private final int[] plyOnly = {1};
    private final int[] gkpOnly = {2};
    private final int[] plAndGk = {1, 2};
    
    // COLLECTIONS
    //**************************************************************************
    List<Skill> skills = new ArrayList<Skill>();
    
    // Populating
    //skills.add("Handling");
    
    // CONSTRUCTOR
    //**************************************************************************
    public PersonSkills(){
        populatingSkills();
    }
    
    // METHODD (GET/SET)
    //**************************************************************************
    public List<Skill> getSkills(){
        return this.skills;
    }
    
    // OTHER METHODS
    //**************************************************************************
    private void populatingSkills(){
        skills.add(new Skill("Handling", plAndGk));     // 0
        skills.add(new Skill("Sprinting", plyOnly));       // 1
        skills.add(new Skill("Throw-in", plAndGk));      // 2
        skills.add(new Skill("Shoting", plyOnly));        // 3
        skills.add(new Skill("Header", plyOnly));      // 4
        skills.add(new Skill("One-on-One", plAndGk));     // 5
        skills.add(new Skill("Passing", plyOnly));         // 6
        skills.add(new Skill("Crossing", plyOnly));        // 7
        skills.add(new Skill("First Touch", plyOnly));   // 8
        skills.add(new Skill("Pacing", plyOnly));         // 9
        skills.add(new Skill("Agility", plAndGk));      // 10
        skills.add(new Skill("Decision Making", plyOnly));     // 11
        skills.add(new Skill("Power", plyOnly));        // 12
        skills.add(new Skill("Destribution", gkpOnly)); // 13
        skills.add(new Skill("Confidence", plAndGk));         // 14
        skills.add(new Skill("Balance", gkpOnly));      // 15
        skills.add(new Skill("Strength", plyOnly));     // 16
        skills.add(new Skill("Inteligence", plyOnly));        // 17
        skills.add(new Skill("Jumping", plAndGk));         // 18
        skills.add(new Skill("Composure", plyOnly));    // 19
        skills.add(new Skill("Leadership", plAndGk));       // 20
        skills.add(new Skill("Communication", plAndGk));// 21
        skills.add(new Skill("Stamina", plyOnly));      // 22
        skills.add(new Skill("vision", plyOnly));       // 23
        skills.add(new Skill("Goalkicking", gkpOnly));   // 24
        skills.add(new Skill("Positioning", gkpOnly));          // 25
        skills.add(new Skill("Reflex", gkpOnly));       // 26
        
    }
}
