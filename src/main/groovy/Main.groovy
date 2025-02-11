static void main(String[] args) {
  Scanner scanner = new Scanner(System.in)

  // Enter details for Monster 1
  println("Enter details for Monster 1:")
  print("Name: ")
  String name1 = scanner.nextLine()
  int health1 = getPositiveIntInput(scanner, "Health (positive integer): ")
  int attackPower1 = getPositiveIntInput(scanner, "Attack Power (positive integer): ")
  int defense1 = getPositiveIntInput(scanner, "Defense (positive integer): ")
  Monster monster1 = new Monster(name1, health1, attackPower1, defense1)

  // Enter details for Monster 2
  println("\nEnter details for Monster 2:")
  print("Name: ")
  String name2 = scanner.nextLine()
  int health2 = getPositiveIntInput(scanner, "Health (positive integer): ")
  int attackPower2 = getPositiveIntInput(scanner, "Attack Power (positive integer): ")
  int defense2 = getPositiveIntInput(scanner, "Defense (positive integer): ")
  Monster monster2 = new Monster(name2, health2, attackPower2, defense2)

  // Start the fight
  Fight fight = new Fight(monster1, monster2)
  fight.start()
}

  static int getPositiveIntInput(Scanner scanner, String prompt)
  {
    while (true) {
      try {
        print(prompt)
        int input = scanner.nextInt()
        if (input > 0) {
          return input
        } else {
          println("Input must be a positive integer. Please try again.")
        }
      } catch (InputMismatchException e) {
        println("Invalid input. Please enter a positive integer.")
        scanner.nextLine() // Clear the invalid input from the scanner buffer
      }
    }


  }
