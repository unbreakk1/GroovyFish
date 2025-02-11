static void main(String[] args)
{
  // Create two monsters
  Monster dragon = new Monster("Dragon", 100, 20, 5)
  Monster ogre = new Monster("Ogre", 120, 15, 10)

  // Start the fight
  Fight fight = new Fight(dragon, ogre)
  fight.start()

  //i don't want anything to do with groovy! :)
}