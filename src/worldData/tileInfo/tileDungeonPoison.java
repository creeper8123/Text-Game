package worldData.tileInfo;

public class tileDungeonPoison {
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
    public String teleportTo = "0, [0, 16, 16]"; //Where does the player teleport to? (Format: "Map #, [Floor, x, y]")

    public tileDungeonPoison(String inputData){
        tileName = inputData;
    }
}
