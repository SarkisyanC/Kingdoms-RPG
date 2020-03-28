
/**
 * Holds information for a Forest
 *
 * @author Sarkisyan C.
 * @version 1:25:20
 */
public class Forest
{
    private boolean hasFertileLand;//maybe assign this one a random (50/50 chance?)
   private boolean hasIron;
    public Forest ()
    {
        hasFertileLand = true;//temp
        hasIron = true;
    }
    public boolean searchFertileLand()
    {
        return hasFertileLand;
    }
    public boolean searchIron()
    {
        return hasIron;
    } 
}
