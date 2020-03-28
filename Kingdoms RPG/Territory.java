
/**
 * Holds information about each Territory
 *
 * @author Sarkisyan C.
 * @version 1:25:20
 */
public class Territory
{
   private static final int NUM_TERRITORIES = 16;
   
   //the land files for each teritory on the map
   private Tundra ter1 = new Tundra();
   private Tundra ter2 = new Tundra();
   private Forest ter3 = new Forest();
   private Grassland ter4 = new Grassland();
   private Grassland ter5 = new Grassland();
   private Forest ter6 = new Forest();
   private Forest ter7 = new Forest();
   private Forest ter8 = new Forest();
   private Forest ter9 = new Forest();
   private Desert ter10 = new Desert();
   private Desert ter11 = new Desert();
   private Grassland ter12 = new Grassland();
   private Grassland ter13 = new Grassland();
   private Grassland ter14 = new Grassland();
   private Forest ter15 = new Forest();
   private Forest ter16 = new Forest();
   
   public Territory (int userKingdomNum)
   {
       
   }
   public static int getNumTerritories()
   {
       return NUM_TERRITORIES;
   }
}