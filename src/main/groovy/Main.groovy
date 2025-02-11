static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in)

  // Create Monster 1
  println("Enter details for Monster 1:")
  print("Name: ")
  String name1 = scanner.nextLine()
  print("Health: ")
  int health1 = scanner.nextInt()
  print("Attack Power: ")
  int attack1 = scanner.nextInt()
  print("Defense: ")
  int defense1 = scanner.nextInt()
  scanner.nextLine() // Consume any leftover newline character
  Monster monster1 = new Monster(name1, health1, attack1, defense1)

  // Create Monster 2
  println("\nEnter details for Monster 2:")
  print("Name: ")
  String name2 = scanner.nextLine()
  print("Health: ")
  int health2 = scanner.nextInt()
  print("Attack Power: ")
  int attack2 = scanner.nextInt()
  print("Defense: ")
  int defense2 = scanner.nextInt()
  Monster monster2 = new Monster(name2, health2, attack2, defense2)

  // Start the Fight
  Fight fight = new Fight(monster1, monster2)
  fight.start()

}