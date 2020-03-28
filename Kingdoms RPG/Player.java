
/**
 * Makes main characters in the game.
 * @author Sarkisyan_C
 * @version 1:24:20
 */
public class Player
{
    //stores Player's name
    String playerName;
    //stores Player's Kingdom
    Kingdom playerKingdom;
    //(maybe just use methods to get these from other classes))

    //todo: add feilds *probably use expanding arrays to store them*
    //todo: add constructors
    public Player (String userName)
    {
       playerName = userName;
       //KingdomPicker.assignKingdom();//add back in when fixed or something like it
       //playerKingdom = new Kingdom (kingdomName);//change so it updates the name of one of the other kingdoms
    }
    
    public static void changeName(String name)
    {
     //a thing that updatess the current name slot
    }
    public void setKingdom (Kingdom userKingdom)
    {
       playerKingdom =  userKingdom;
    }
    // get player name here
    public String getName()
    {
      return playerName;//temp
    }
    //getNumPlayers here
}
