
/**
 * Write a description of class Rulebook here.
 *
 * @author Sarkisyan C.
 * @version 1:27:20
 */
public class Rulebook
{
    //exploration fields:
    private static final String explorationOverview = "Exploration comes in two phases and has to be completed in foreign territories.\nYou can only explore lands bordering yours, unless you have ships -- then you must travel to the land, then explore.\nThe phases must be completed in order.\nPhase 1 determines who is in the area. Phase 2 determines the reasources you find in the area.";
    private static final String explorationPhase1 = "The number you roll determines the type of current inhabitants:\n1-3: No one is there\n4-6: You have found a small, peacefull tribe (10 Strength).\n\tThey will trade with you for 1% or let you pass through their teritory for free.\n7-10: Violent, wild tribe*incomp*";
    private static final String explorationPhase2 = "";    
    //exploration get methods:
    public static String getExplorationOverview ()
    {
     return explorationOverview;   
    }
    public static String getExplorationPhase1 ()
    {
     return explorationPhase1;   
    }
    public static String getExplorationPhase2 ()
    {
     return explorationPhase2;   
    }
}
   