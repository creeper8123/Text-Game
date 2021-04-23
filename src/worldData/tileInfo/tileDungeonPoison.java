package worldData.tileInfo;

public class tileDungeonPoison {
    public String tileName; //The name to display the tile as

    public String description; //A general description of the tile.

    public boolean isWalkable; // Can the player walk on this tile?

    public int localTemp; //Do liquids freeze on this tile?

    public boolean isFlammable; //Does this tile burn?
    public boolean isBurning = false; //Is this tile currently on fire?
    public int baseBurnTime; //How many updates does it burn? (-1 is infinite)

    public boolean canHoldFluid; //Does liquid stay on this tile?
    public String fluidOnGround; //What liquid is on this tile?
    public int fluidLevel; //How many updates till the fluid disperses? (-1 is infinite)

    public  boolean isTeleport; //Does the player teleport when stepping on this tile?
    public String teleportTo; //Where does the player teleport to? (Format: "Map, [x, y]")

    public tileDungeonPoison(String inputData){
        tileName = inputData;
    }
}
