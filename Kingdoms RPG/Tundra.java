
/**
 * Holds information for a Tundra
 *
 * @author Sarkisyan C.
 * @version 1:25:20
 */
public class Tundra
{
    private boolean hasGold;//maybe assign this one a random (50/50 chance?)
    private boolean hasFurs;
    public Tundra ()
    {
        hasGold = true;//temp
        hasFurs = true;
    }
    public boolean searchGold()
    {
        return hasGold;
    }
    public boolean searchFurs()
    {
        return hasFurs;
    }
}