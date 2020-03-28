
/**
 * Holds information for a Grassland
 *
 * @author Sarkisyan C.
 * @version 1:25:20
 */
public class Grassland
{
   private boolean hasLumber;
   private boolean hasCoal;//are you sure you want this?//maybe assign this one a random (50/50 chance?)
    public Grassland ()
    {
        hasLumber = true;//temp
        hasCoal = true;
    }
    public boolean searchLumber()
    {
        return hasLumber;
    }
    public boolean searchCoal()
    {
        return hasCoal;
    } 
}
