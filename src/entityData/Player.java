package entityData;

import engineInteractions.processList;
import itemData.spell.spell;

import java.io.IOException;

public class Player {
    public static int health = 100;

    public static int[] location = {0, 15, 15}; //spawn is {0, 15, 15}. Format is {Floor, x, y}
    public static String world = "Overworld";

    public static spell[] spells = {new spell("None")};
    public static itemData.inventory[] inventory;




    public static void movePlayer() throws IOException {
        String[] canMoveTo = moveEntity.getViableDirections(Player.location).toArray(new String[0]);
        int moveTo = processList.chooseFromList(canMoveTo);
        switch (canMoveTo[moveTo]) {
            case "North" -> Player.location[1] -= 1;
            case "East" -> Player.location[2] += 1;
            case "West" -> Player.location[2] -= 1;
            case "South" -> Player.location[1] += 1;
        }
    }


}