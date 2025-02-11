class Fight
{
    Monster monster1
    Monster monster2

    Fight(Monster monster1, Monster monster2)
    {
        this.monster1 = monster1
        this.monster2 = monster2
    }

    void start() {
        println "The battle begins between ${monster1.name} and ${monster2.name}!"
        println "--------------------------------"

        while (monster1.isAlive() && monster2.isAlive())
        {
            // Monster 1 attacks Monster 2
            println "${monster1.name} attacks ${monster2.name}!"
            int damage = monster1.attack()
            monster2.takeDamage(damage)

            // End the fight if Monster 2 dies
            if (!monster2.isAlive()) break

            // Monster 2 attacks Monster 1
            println "${monster2.name} attacks ${monster1.name}!"
            damage = monster2.attack()
            monster1.takeDamage(damage)

            // Divider for clarity
            println "--------------------------------"
        }

        // Announce the winner
        if (monster1.isAlive())
            println "${monster1.name} is victorious!"
        else
            println "${monster2.name} is victorious!"

    }

}
