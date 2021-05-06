package itemData;

public class spell{
    public String name = null; //Name of the spell for conditionals
    public String showName = null; //Name of the spell to be displayed
    public boolean isInvisible = false; //Can the player see this spell? (Only used for 'none')
    public int damage = 0; //How much to reduce the health by if it hits.
    public int maxDamageVariation = 0; //Amount of damage that can vary from the base amount
    public double critChance = 0.00; //Chance to get a critical hit, doubling damage (0-1)
    public boolean selfDamage = false; //Can the spell hit the player if it misses its target? Chance to hit the player is the following: (if the spell misses) selfDamageChance = (1-accuracy)/2
    public int spellCount = 0; //-1 is infinite
    public int maxSpellCount = 0; //-1 is infinite
    public int attackScope = 0; //0 is one target, >0 is this number + 1, -1 is all targets (excluding player), -2 is on all targets (including player)
    public int manaCost = 0; //Cost of mana used to cast, irrelevant of whether or not it hits.
    public double accuracy = 0.00; //Chance of the spell to hit the target (0-1)
    public String spawnsFluid = null; //Name of the fluid spawned, else null
    public int fluidScope = 0; //0 is leave no fluid, 1 is on that target, 2 is on all targets (including player), 3 is all targets (including player) and on arena floor
    public double fluidChance = 0.00; //Chance to get covered in fluid if it's !null (0-1)
    public String statusEffect = null; //Name of the effect given, else null
    public double statusEffectChance = 0.00; //Chance to get the effect if it's !null (0-1)


    public spell(String spellType){
        name = spellType;
        if(spellType == null){
            isInvisible = true;
            showName = null;
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
        }else{
            switch (spellType) {
                case "magicBolt" -> {
                    showName = "Magic Bolt";
                    damage = 10;
                    maxDamageVariation = 2;
                    critChance = 0.02;
                    selfDamage = false;
                    spellCount = -1;
                    maxSpellCount = -1;
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
                    showName = "Arcane Bolt";
                    damage = 18;
                    maxDamageVariation = 4;
                    critChance = 0.03;
                    selfDamage = false;
                    spellCount = -1;
                    maxSpellCount = -1;
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
                    showName = "Arcane Blast";
                    damage = 24;
                    maxDamageVariation = 6;
                    critChance = 0.04;
                    selfDamage = false;
                    spellCount = -1;
                    maxSpellCount = -1;
                    attackScope = 0;
                    manaCost = 8;
                    accuracy = 1.00;
                    spawnsFluid = null;
                    fluidScope = 0;
                    fluidChance = 0.0;
                    statusEffect = null;
                    statusEffectChance = 0;
                }
                case "bouncingBolt" -> {
                    showName = "Bouncing Bolt";
                    damage = 6;
                    maxDamageVariation = 1;
                    critChance = 0.02;
                    selfDamage = true;
                    spellCount = -1;
                    maxSpellCount = -1;
                    attackScope = 1;
                    manaCost = 4;
                    accuracy = 0.85;
                    spawnsFluid = null;
                    fluidScope = 0;
                    fluidChance = 0.0;
                    statusEffect = null;
                    statusEffectChance = 0;
                }
                case "bouncingBolt+" -> {
                    showName = "Ricocheting Bolt";
                    damage = 12;
                    maxDamageVariation = 3;
                    critChance = 0.03;
                    selfDamage = true;
                    spellCount = -1;
                    maxSpellCount = -1;
                    attackScope = 1;
                    manaCost = 6;
                    accuracy = 0.90;
                    spawnsFluid = null;
                    fluidScope = 0;
                    fluidChance = 0.0;
                    statusEffect = null;
                    statusEffectChance = 0;
                }
                case "bouncingBolt++" -> {
                    showName = "Ricocheting Blast";
                    damage = 18;
                    maxDamageVariation = 4;
                    critChance = 0.04;
                    selfDamage = true;
                    spellCount = -1;
                    maxSpellCount = -1;
                    attackScope = 2;
                    manaCost = 8;
                    accuracy = 0.95;
                    spawnsFluid = null;
                    fluidScope = 0;
                    fluidChance = 0.0;
                    statusEffect = null;
                    statusEffectChance = 0;
                }
                case "fireBall" -> {
                    showName = "Fire Ball";
                    damage = 20;
                    maxDamageVariation = 8;
                    critChance = 0.05;
                    selfDamage = true;
                    spellCount = 6;
                    maxSpellCount = 6;
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
                    showName = "Fire Bolt";
                    damage = 30;
                    maxDamageVariation = 10;
                    critChance = 0.075;
                    selfDamage = true;
                    spellCount = 8;
                    maxSpellCount = 8;
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
                    showName = "Inferno Bolt";
                    damage = 40;
                    maxDamageVariation = 12;
                    critChance = 0.1;
                    selfDamage = true;
                    spellCount = 12;
                    maxSpellCount = 12;
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
                    showName = "Water Bolt";
                    damage = 15;
                    maxDamageVariation = 4;
                    critChance = 0.03;
                    selfDamage = false;
                    spellCount = 6;
                    maxSpellCount = 6;
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
                    showName = "Aqua Bolt";
                    damage = 23;
                    maxDamageVariation = 6;
                    critChance = 0.04;
                    selfDamage = false;
                    spellCount = 8;
                    maxSpellCount = 8;
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
                    showName = "Aqua Jet";
                    damage = 30;
                    maxDamageVariation = 8;
                    critChance = 0.05;
                    selfDamage = false;
                    spellCount = 12;
                    maxSpellCount = 12;
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
                    showName = "Oil Ball";
                    damage = 4;
                    maxDamageVariation = 2;
                    critChance = 0.02;
                    selfDamage = true;
                    spellCount = 6;
                    maxSpellCount = 6;
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
                    showName = "Oil Slick";
                    damage = 8;
                    maxDamageVariation = 4;
                    critChance = 0.03;
                    selfDamage = true;
                    spellCount = 8;
                    maxSpellCount = 8;
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
                    showName = "Oil Jet";
                    damage = 12;
                    maxDamageVariation = 6;
                    critChance = 0.04;
                    selfDamage = true;
                    spellCount = 12;
                    maxSpellCount = 12;
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
                    showName = "Acid Ball";
                    damage = 4;
                    maxDamageVariation = 1;
                    critChance = 0.02;
                    selfDamage = true;
                    spellCount = 6;
                    maxSpellCount = 6;
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
                    showName = "Acid Bolt";
                    damage = 6;
                    maxDamageVariation = 2;
                    critChance = 0.03;
                    selfDamage = true;
                    spellCount = 7;
                    maxSpellCount = 7;
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
                    showName = "Acid Jet";
                    damage = 8;
                    maxDamageVariation = 3;
                    critChance = 0.04;
                    selfDamage = true;
                    spellCount = 9;
                    maxSpellCount = 9;
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
                    showName = "Lava Ball";
                    damage = 80;
                    maxDamageVariation = 20;
                    critChance = 0.1;
                    selfDamage = true;
                    spellCount = 1;
                    maxSpellCount = 1;
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
                    showName = "Lava Bolt";
                    damage = 120;
                    maxDamageVariation = 30;
                    critChance = 0.2;
                    selfDamage = true;
                    spellCount = 1;
                    maxSpellCount = 1;
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
                    showName = "Molten Jet";
                    damage = 160;
                    maxDamageVariation = 40;
                    critChance = 0.3;
                    selfDamage = true;
                    spellCount = 2;
                    maxSpellCount = 2;
                    attackScope = 0;
                    manaCost = 120;
                    accuracy = 0.85;
                    spawnsFluid = "lava";
                    fluidScope = 1;
                    fluidChance = 0.9;
                    statusEffect = "On Fire";
                    statusEffectChance = 0.85;
                }
                default -> {
                    isInvisible = true;
                    showName = null;
                    damage = 0;
                    maxDamageVariation = 0;
                    critChance = 0.0;
                    selfDamage = false;
                    spellCount = 0;
                    maxSpellCount = 0;
                    attackScope = 0;
                    manaCost = 0;
                    accuracy = 0.0;
                    spawnsFluid = null;
                    fluidScope = 0;
                    fluidChance = 0.0;
                    statusEffect = null;
                    statusEffectChance = 0;
                }
            }
        }
    }
}