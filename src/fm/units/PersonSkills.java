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
 * Last changed: 28/07/2015
 */
public class PersonSkills extends GUIBase {
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
    
    private void populatingSkills(){
        skills.add(new Skill(handling, plAndGk));     // 0
        skills.add(new Skill(sprint, plyOnly));       // 1
        skills.add(new Skill(throwin, plAndGk));      // 2
        skills.add(new Skill(shoot, plyOnly));        // 3
        skills.add(new Skill(headers, plyOnly));      // 4
        skills.add(new Skill(oneOnOne, plAndGk));     // 5
        skills.add(new Skill(pass, plyOnly));         // 6
        skills.add(new Skill(cross, plyOnly));        // 7
        skills.add(new Skill(firstTouch, plyOnly));   // 8
        skills.add(new Skill(ritm, plyOnly));         // 9
        skills.add(new Skill(agility, plAndGk));      // 10
        skills.add(new Skill(decision, plyOnly));     // 11
        skills.add(new Skill(power, plyOnly));        // 12
        skills.add(new Skill(distribution, gkpOnly)); // 13
        skills.add(new Skill(conf, plAndGk));         // 14
        skills.add(new Skill(balance, gkpOnly));      // 15
        skills.add(new Skill(strength, plyOnly));     // 16
        skills.add(new Skill(intel, plyOnly));        // 17
        skills.add(new Skill(jump, plAndGk));         // 18
        skills.add(new Skill(composure, plyOnly));    // 19
        skills.add(new Skill(leader, plAndGk));       // 20
        skills.add(new Skill(communication, plAndGk));// 21
        skills.add(new Skill(stamina, plyOnly));      // 22
        skills.add(new Skill(vision, plyOnly));       // 23
        skills.add(new Skill(goalKicker, gkpOnly));   // 24
        skills.add(new Skill(pos, gkpOnly));          // 25
        skills.add(new Skill(reflex, gkpOnly));       // 26
        
    }
}
