package itemData.spell;

import itemData.inventory;

public class spell extends inventory {
    public String name; //Name of the spell
    public boolean isInvisible = false; //Can the player see this spell? (Only used for 'none')
    public int damage; //How much to reduce the health by if it hits.
    public int maxDamageVariation; //Amount of damage that can vary from the base amount
    public double critChance; //Chance to get a critical hit, doubling damage (0-1)
    public boolean selfDamage; //Can the spell hit the player if it misses its target? Chance to hit the player is the following: (if the spell misses) selfDamageChance = (1-accuracy)/2
    public int spellCount; //-1 is infinite
    public int attackScope; //0 is one target, 1 is all targets (excluding player), 2 is on all targets (including player)
    public int manaCost; //Cost of mana used to cast, irrelevant of whether or not it hits.
    public double accuracy; //Chance of the spell to hit the target (0-1)
    public String spawnsFluid; //Name of the fluid spawned, else null
    public int fluidScope; //0 is leave no fluid, 1 is on that target, 2 is on all targets (including player), 3 is all targets (including player) and on arena floor
    public double fluidChance; //Chance to get covered in fluid if it's !null (0-1)
    public String statusEffect; //Name of the effect given, else null
    public double statusEffectChance; //Chance to get the effect if it's !null (0-1)
    //public specialEffect specialEffect = null; //Does the spell do anything special?


    public spell(String spellType){
        switch (spellType) {
            case "none" -> {
                isInvisible = true;
                name = "missingSpell";
                damage = 0;
                maxDamageVariation = 0;
                critChance = 0.0;
                selfDamage = false;
                spellCount = 0;
                attackScope = 0;
                manaCost = 0;
                accuracy = 0.0;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = null;
                statusEffectChance = 0;
            }

            case "magicBolt" -> {
                name = "Magic Bolt";
                damage = 10;
                maxDamageVariation = 2;
                critChance = 0.02;
                selfDamage = false;
                spellCount = -1;
                attackScope = 0;
                manaCost = 4;
                accuracy = 0.90;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = null;
                statusEffectChance = 0;
            }
            case "magicBolt+" -> {
                name = "Arcane Bolt";
                damage = 18;
                maxDamageVariation = 4;
                critChance = 0.03;
                selfDamage = false;
                spellCount = -1;
                attackScope = 0;
                manaCost = 6;
                accuracy = 0.94;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = null;
                statusEffectChance = 0;
            }
            case "magicBolt++" -> {
                name = "Arcane Blast";
                damage = 24;
                maxDamageVariation = 6;
                critChance = 0.04;
                selfDamage = false;
                spellCount = -1;
                attackScope = 0;
                manaCost = 8;
                accuracy = 1.00;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = null;
                statusEffectChance = 0;
                //specialEffect = itemData.spell.specialEffect("magicbolt++");
            }

            case "fireBall" -> {
                name = "Fire Ball";
                damage = 20;
                maxDamageVariation = 8;
                critChance = 0.05;
                selfDamage = true;
                spellCount = 6;
                attackScope = 0;
                manaCost = 10;
                accuracy = 0.50;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = "On Fire";
                statusEffectChance = 0.5;
            }
            case "fireBall+" -> {
                name = "Fire Bolt";
                damage = 30;
                maxDamageVariation = 10;
                critChance = 0.075;
                selfDamage = true;
                spellCount = 8;
                attackScope = 0;
                manaCost = 15;
                accuracy = 0.625;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = "On Fire";
                statusEffectChance = 0.7;
            }
            case "fireBall++" -> {
                name = "Inferno Bolt";
                damage = 40;
                maxDamageVariation = 12;
                critChance = 0.1;
                selfDamage = true;
                spellCount = 12;
                attackScope = 0;
                manaCost = 20;
                accuracy = 0.75;
                spawnsFluid = null;
                fluidScope = 0;
                fluidChance = 0.0;
                statusEffect = "On Fire";
                statusEffectChance = 0.9;
            }

            case "waterBolt" -> {
                name = "Water Bolt";
                damage = 15;
                maxDamageVariation = 4;
                critChance = 0.03;
                selfDamage = false;
                spellCount = 6;
                attackScope = 0;
                manaCost = 6;
                accuracy = 0.70;
                spawnsFluid = "water";
                fluidScope = 1;
                fluidChance = 0.8;
                statusEffect = null;
                statusEffectChance = 0.2;
            }
            case "waterBolt+" -> {
                name = "Aqua Bolt";
                damage = 23;
                maxDamageVariation = 6;
                critChance = 0.04;
                selfDamage = false;
                spellCount = 8;
                attackScope = 0;
                manaCost = 12;
                accuracy = 0.75;
                spawnsFluid = "water";
                fluidScope = 1;
                fluidChance = 0.85;
                statusEffect = null;
                statusEffectChance = 0.3;
            }
            case "waterBolt++" -> {
                name = "Aqua Jet";
                damage = 30;
                maxDamageVariation = 8;
                critChance = 0.05;
                selfDamage = false;
                spellCount = 12;
                attackScope = 0;
                manaCost = 18;
                accuracy = 0.8;
                spawnsFluid = "water";
                fluidScope = 1;
                fluidChance = 0.9;
                statusEffect = null;
                statusEffectChance = 0.4;
            }

            case "oilBall" -> {
                name = "Oil Ball";
                damage = 4;
                maxDamageVariation = 2;
                critChance = 0.02;
                selfDamage = true;
                spellCount = 6;
                attackScope = 0;
                manaCost = 20;
                accuracy = 0.80;
                spawnsFluid = "oil";
                fluidScope = 1;
                fluidChance = 0.75;
                statusEffect = null;
                statusEffectChance = 0.2;
            }
            case "oilBall+" -> {
                name = "Oil Slick";
                damage = 8;
                maxDamageVariation = 4;
                critChance = 0.03;
                selfDamage = true;
                spellCount = 6;
                attackScope = 0;
                manaCost = 25;
                accuracy = 0.8;
                spawnsFluid = "oil";
                fluidScope = 1;
                fluidChance = 0.85;
                statusEffect = null;
                statusEffectChance = 0.3;
            }
            case "oilBall++" -> {
                name = "Oil Jet";
                damage = 12;
                maxDamageVariation = 6;
                critChance = 0.04;
                selfDamage = true;
                spellCount = 8;
                attackScope = 0;
                manaCost = 30;
                accuracy = 0.85;
                spawnsFluid = "oil";
                fluidScope = 1;
                fluidChance = 0.9;
                statusEffect = null;
                statusEffectChance = 0.4;
            }

            case "acidBall" -> {
                name = "Acid Ball";
                damage = 4;
                maxDamageVariation = 1;
                critChance = 0.02;
                selfDamage = true;
                spellCount = 6;
                attackScope = 0;
                manaCost = 20;
                accuracy = 0.75;
                spawnsFluid = "acid";
                fluidScope = 1;
                fluidChance = 0.8;
                statusEffect = null;
                statusEffectChance = 0.2;
            }
            case "acidBall+" -> {
                name = "Acid Bolt";
                damage = 6;
                maxDamageVariation = 2;
                critChance = 0.03;
                selfDamage = true;
                spellCount = 7;
                attackScope = 0;
                manaCost = 25;
                accuracy = 0.8;
                spawnsFluid = "acid";
                fluidScope = 1;
                fluidChance = 0.85;
                statusEffect = null;
                statusEffectChance = 0.3;
            }
            case "acidBall++" -> {
                name = "Acid Jet";
                damage = 8;
                maxDamageVariation = 3;
                critChance = 0.04;
                selfDamage = true;
                spellCount = 8;
                attackScope = 0;
                manaCost = 30;
                accuracy = 0.85;
                spawnsFluid = "acid";
                fluidScope = 1;
                fluidChance = 0.9;
                statusEffect = null;
                statusEffectChance = 0.4;
            }

            case "lavaBall" -> {
                name = "Lava Ball";
                damage = 80;
                maxDamageVariation = 20;
                critChance = 0.1;
                selfDamage = true;
                spellCount = 1;
                attackScope = 0;
                manaCost = 80;
                accuracy = 0.75;
                spawnsFluid = "lava";
                fluidScope = 1;
                fluidChance = 0.75;
                statusEffect = "On Fire";
                statusEffectChance = 0.75;
            }
            case "lavaBall+" -> {
                name = "Lava Bolt";
                damage = 120;
                maxDamageVariation = 30;
                critChance = 0.2;
                selfDamage = true;
                spellCount = 2;
                attackScope = 0;
                manaCost = 100;
                accuracy = 0.8;
                spawnsFluid = "lava";
                fluidScope = 1;
                fluidChance = 0.85;
                statusEffect = "On Fire";
                statusEffectChance = 0.8;
            }
            case "lavaBall++" -> {
                name = "Molten Jet";
                damage = 160;
                maxDamageVariation = 40;
                critChance = 0.3;
                selfDamage = true;
                spellCount = 3;
                attackScope = 0;
                manaCost = 120;
                accuracy = 0.85;
                spawnsFluid = "lava";
                fluidScope = 1;
                fluidChance = 0.9;
                statusEffect = "On Fire";
                statusEffectChance = 0.85;
            }
        }
    }
}