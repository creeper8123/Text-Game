package worldData.tileInfo;

public class tileDungeonIce {
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

    public boolean isSlippery = false; //If true, the player will slide until the next non-slippery tile or wall

    public  boolean isTeleporter = false; //Does the player teleport when stepping on this tile?
    public int[] teleportTo = new int[]{0, 0, 15, 15}; //Where does the player teleport to? (Format: {Map #, Floor, x, y})

    public tileDungeonIce(String inputData){
        tileName = inputData;

        switch (inputData){
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
            case "Slippery Ice" -> {
                isWalkable = true;
                localTemp = 12;
                isFlammable = false;
                isBurning = false;
                baseBurnTime = 0;
                canHoldFluid = true;
                fluidOnGround = "none";
                fluidLevel = 1;
                isSlippery = true;
            }
        }
    }
}
