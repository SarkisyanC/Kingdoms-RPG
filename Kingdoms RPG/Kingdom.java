
/**
 * Creates a Kingdom
 * @author Sarkisyan_C
 * @version 1:25:20
 */

public class Kingdom
{
    private String kingdomName;
    private int kingdomNum;
    private final String [] STOCK_NAMES = {"Anthrax","Binewe", "Cylo", "Dimene", "Corin", "Abernathy", "Simaoe", "Destrire", "Vae", "Friuh", "Dio", "Cambagia", "Sidatree","Taix","Neziv","Madolna"};
    
    public Kingdom (int userKingdomNum)
        {
            kingdomName = STOCK_NAMES [userKingdomNum];
            kingdomNum = userKingdomNum;
            Territory land = new Territory (userKingdomNum);
        }
    public String getName()
    {
      return kingdomName;  
    }
    public int getKingdomNum()
    {
      return kingdomNum;  
    }
    public void setName(String name)
    {
       kingdomName = name; 
    }
    public void addTerritory(int kingdomNum) //reffers to the kingdomNum of the one you're adding
    {
        
    }
    public void addCitizen (String type)
    {
        //do a switch statement for each cit. type
        switch (type)
        {
            case "Royal": 
            /** may need to make arrays in player to hold
             * these instead (ie if you make multiple royals with one 
             * reffrence name it will override...)
             * */
                //prompt user to put in the other atributes of a royal
                //Royal royal = new Royal ();  
            break;
            case "Merchant":
                //prompt user to put in the other atributes of a Merchant
                //Merchant merchant = new Merchant ();  
            break;
            default:
            System.out.println("The citizen type you have entered ( "+ type + " ) is not a valid Citizen type");
            break;
        }
    }
}
