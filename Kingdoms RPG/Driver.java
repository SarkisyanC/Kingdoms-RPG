    
    /**
     * Gives access to the gameplay
     * @author Sarkisyan_C
     * @version 1:27:20
     */
    import java.util.Scanner;
    import java.util.Random;
    
    public class Driver
    {
       public static void main (String [] args)
       {
           //variables:
           Scanner input = new Scanner(System.in);
           Random dice = new Random();
           int userInt;
           int playerNum = 1;
           Kingdom [] fullMap = new Kingdom [Territory.getNumTerritories()];
           String done = "no";
           //The actual program:
           
           //makes Kingdoms
            for (int i = 0; i < Territory.getNumTerritories(); i++)
            {
               fullMap[i] = new Kingdom (i); 
            }
           
           //user interface
           //initialization
           System.out.println("Welcome to D&D!\nHow many players do you have?");
           userInt = input.nextInt();
           String userString;
           Player [] allPlayers = new Player [userInt];
           int [] randomNum = new int [allPlayers.length];
           int rollNum;
           
           //creates Players
           for (int i = 0; i < userInt; i++)
           {
               randomNum[i] = dice.nextInt(Territory.getNumTerritories());
               //checks that you didn't already use that territory number
               for (int a=0; a<randomNum.length; a++)
               {
                   if (i != 0)//ensures this isn't the first case
                   {
                       if(randomNum [i] == randomNum [a])
                       {
                          randomNum [i] = dice.nextInt(Territory.getNumTerritories());
                       }
                    }
               }
               System.out.println("input your Monarch's name:");
                userString = input.next();
                allPlayers[i] = new Player (userString);
                System.out.println("input your Kingdom name:");
                userString = input.next();
                //changes territory name to user's inputed kingdomName
                fullMap[randomNum [i]].setName(userString);
                //Sets a player's kingdom as the territory just chosen
                allPlayers[i].setKingdom(fullMap[randomNum [i]]);
           }
           //testor to make sure you know what each kingdom is called
           for (int i = 0; i < Territory.getNumTerritories(); i++)
           {
               System.out.println("kingdom # "+ i + " is called: " + fullMap[i].getName());
           }
           
           //the part that lets you take turns
           while (done == "no")
           {
            for (int i = 0; i < allPlayers.length; i++)
            {
              System.out.println(allPlayers[i].getName() +": Please select what you would like to do with your turn (enter the coresponding number): \n1. explore\n2. infrastructure\n3. powerup\n4. fight\n5. trade\n6. ally");
              userInt = input.nextInt();
                switch (userInt)
              {
                 case 1://explore
                 //option to see rules
                 System.out.println("Would you like to view the rules for exploration? \n (1)yes, (2)no?");
                 userInt = input.nextInt();
                 switch (userInt)
                 {
                     case 1:
                     System.out.println(Rulebook.getExplorationOverview());
                     break;
                 }
                 //choses phase
                 System.out.println("Choose which phase of exploration you will use:\nPhase 1 or Phase 2");
                 userInt = input.nextInt();
                 switch (userInt)
                 {
                   case 1:   //phase 1 (if not your land)
                   //option to see rules
                   System.out.println("Would you like to view the options for phase 1 exploration? \n (1)yes, (2)no?");
                   switch (userInt)
                 {
                     case 1:
                     System.out.println(Rulebook.getExplorationPhase1());
                     break;
                 }
                   rollNum = dice.nextInt(20);
                   break;
                   case 2:
                   //option to see rules
                   System.out.println("Would you like to view the options for phase 2 exploration? \n (1)yes, (2)no?");
                   switch (userInt)
                 {
                     case 1:
                     System.out.println(Rulebook.getExplorationPhase2());
                     break;
                 }
                   rollNum = dice.nextInt(20);
                   break;
                 }
                 //rolls dice
                 
                 //phase 1 (if not your land)
                 //phase 2
                 
                 break;
                 case 2://infrastructure
                 //phase 1:
                 //phase 2:
                 break;
                 case 3://powerup
                 
                 break;
                 case 4://fight
                 
                 break;
                 case 5://trade
                 
                 break;
                 case 6://ally
                 
                 break;
               }
            }
           }
           
       }
    }