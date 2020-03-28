PROJECT TITLE: Kingdoms RPG
PURPOSE OF PROJECT: Entertainment and Practicing object-oriented JAVA
VERSION or DATE: January 2020
HOW TO START THIS PROJECT: run Driver to use this project
AUTHORS: Sarkisyan C.
USER INSTRUCTIONS:run Driver to use this project.
_______________________________
This is the compendium of classes and programs needed to play
the RPG game created in the booklet. These programs store
the amounts of inventory and the levels of your holdings, as well
as calculating transactions and other such things. It also keeps
a log of all your moves. Basicaly: this will be used so you don't
have to write everything on paper. The full guide book will be 
available digitaly as well.
 
 todo:
 -make classes:
    -desert (11)
    -grassland (4,6,13,14)
        -give some of them var isLandlocked
 -allow users to chose from turn types and display whose turn it is:
    -turn types:
        -explore
        -infrastructure
        -powerup
        -fight
        -trade
___________
 Here are some improvised rules.
-at the begining of the game, the map generates with players each randomly
 getting a kingdom.
    -preexisting map broken into peices(or, later, several pre-existing maps
    with one randomly chosen)
        -each is broken up into islands with different terains and further
        broken into peices.
    -random# generator links player with a peice of the map and asks them to 
     name it.
        -any other peices are assigned names from an array at random. they
        are revealed during exploration rolls.
   