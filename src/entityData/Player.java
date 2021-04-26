package entityData;



import mainExecution.mainClass;

import java.io.IOException;

public class Player {
    public static int health = 100;

    public static int[] location = {0, 15, 15}; //spawn is {0, 15, 15}. Format is {Floor, x, y}
    public static int world = 0;

    public static void movePlayer() throws IOException {
        String[] canMoveTo = moveEntity.getViableDirections(Player.location, mainClass.world).toArray(new String[0]);
        int moveTo = engineInteractions.processList.chooseFromList(canMoveTo);
        switch (canMoveTo[moveTo]) {
            case "North" -> Player.location[1] -= 1;
            case "East" -> Player.location[2] += 1;
            case "West" -> Player.location[2] -= 1;
            case "South" -> Player.location[1] += 1;
        }
    }


}