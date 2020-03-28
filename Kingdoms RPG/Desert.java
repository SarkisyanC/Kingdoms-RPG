
/**
 * Holds information for a Desert
 *
 * @author Sarkisyan C.
 * @version 1:25:20
 */
public class Desert
{
    private boolean hasSulfur;//maybe assign this one a random (50/50 chance?)
    private boolean hasSpices;
    public Desert ()
    {
        hasSulfur = true;//temp
        hasSpices = true;
    }
    public boolean searchSulfur()
    {
        return hasSulfur;
    }
    public boolean searchSpices()
    {
        return hasSpices;
    }
}
