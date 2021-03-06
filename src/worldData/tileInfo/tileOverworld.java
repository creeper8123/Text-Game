package worldData.tileInfo;

public class tileOverworld {
    public String tileName; //The name to display the tile as

    public String description = null; //A general description of the tile.

    public boolean isWalkable = true; // Can the player walk on this tile?

    public int localTemp = 72; //Do liquids freeze on this tile?

    public boolean isFlammable = true; //Does this tile burn?
    public boolean isBurning = false; //Is this tile currently on fire?
    public int baseBurnTime = 4; //How many updates does it burn? (-1 is infinite)

    public boolean canHoldFluid = true; //Does liquid stay on this tile?
    public String fluidOnGround = null; //What liquid is on this tile?
    public int fluidLevel = 0; //How many updates till the fluid disperses? (-1 is infinite)

    public  boolean isTeleporter = false; //Does the player teleport when stepping on this tile?
    public int[] teleportTo = new int[]{0, 0, 0, 15}; //Where does the player teleport to? (Format: {Map #, Floor, x, y})

    public tileOverworld(String tileType){
        tileName = tileType;
        switch (tileType) {
            case "Plains" -> {
                isWalkable = true;
                localTemp = 72;
                isFlammable = true;
                isBurning = false;
                baseBurnTime = 2;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 0;
                isTeleporter = true;
            }
            case "Forest" -> {
                isWalkable = true;
                localTemp = 65;
                isFlammable = true;
                isBurning = false;
                baseBurnTime = 5;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 0;
            }
            case "Desert" -> {
                isWalkable = true;
                localTemp = 98;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 0;
            }
            case "Wasteland" -> {
                isWalkable = true;
                localTemp = 45;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = false;
                fluidOnGround = "none";
                fluidLevel = 0;
            }
            case "HellScape" -> {
                isWalkable = true;
                localTemp = 120;
                isFlammable = true;
                isBurning = false;
                baseBurnTime = -1;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 0;
            }
            case "Lava" -> {
                isWalkable = false;
                localTemp = 999;
                isFlammable = true;
                isBurning = true;
                baseBurnTime = -1;
                canHoldFluid = true;
                fluidOnGround = "lava";
                fluidLevel = 0;
            }
            case "Ocean" -> {
                isWalkable = false;
                localTemp = 35;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "saltWater";
                fluidLevel = -1;
            }
            case "Lake" -> {
                isWalkable = false;
                localTemp = 50;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "water";
                fluidLevel = -1;
            }
            case "Poisoned Earth" -> {
                isWalkable = true;
                localTemp = 65;
                isFlammable = true;
                isBurning = false;
                baseBurnTime = 1;
                canHoldFluid = true;
                fluidOnGround = "acidWeak";
                fluidLevel = -1;
            }
            case "Mountains" -> {
                isWalkable = true;
                localTemp = 12;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 2;
            }
            case "Snowy Mountains" -> {
                isWalkable = true;
                localTemp = -3;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 1;
            }
            case "Wooden Bridge" -> {
                isWalkable = true;
                localTemp = 130;
                isFlammable = true;
                isBurning = false;
                baseBurnTime = 6;
                canHoldFluid = false;
                fluidOnGround = "none";
                fluidLevel = 0;
            }
            case "Ice" -> {
                isWalkable = true;
                localTemp = 0;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 1;
            }
            case "Obsidian" -> {
                isWalkable = true;
                localTemp = 200;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 1;
            }
            case "Scorched Earth" -> {
                isWalkable = true;
                localTemp = 100;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 3;
            }
        }
    }
}