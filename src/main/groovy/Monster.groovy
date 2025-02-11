class Monster
{
    String name
    int health
    int attackPower
    int defense

    Monster(String name, int health, int attackPower, int defense)
    {
        this.name = name
        this.health = health
        this.attackPower = attackPower
        this.defense = defense
    }

    // Method to attack another monster
    int attack()
    {
        // Add some randomness to the attack power
        return attackPower + (int)(Math.random() * 10) - 5 // +/- 5 variation
    }

    // Method to take damage
    void takeDamage(int damage)
    {
        int netDamage = damage - defense
        if (netDamage > 0)
        {
            health -= netDamage
            println "${name} takes ${netDamage} damage! Remaining health: ${health}"
        } else {
            println "${name} blocks the attack! No damage taken."
        }

        if (health <= 0)
            println "${name} has been defeated!"

    }

    boolean isAlive()
    {
        return health > 0
    }

}
