package entityData;

import worldData.mapData;

import java.util.ArrayList;

public class moveEntity {

    private static final String[] moveDirections = {"North", "East", "West", "South"};

    public static ArrayList<String> getViableDirections(int[] entityLocation){
        ArrayList<String> outputData = new ArrayList<String>();
        if(Player.location[1] > 0){ //Is North clear to walk?
            if(mapData.Overworld[entityLocation[1]-1][entityLocation[2]].isWalkable){
                outputData.add(moveEntity.moveDirections[0]);
            }
        }
        if(Player.location[2] < mapData.Overworld.length-1){ //Is east clear to walk?
            if(mapData.Overworld[entityLocation[1]][entityLocation[2]+1].isWalkable){
                outputData.add(moveEntity.moveDirections[1]);
            }
        }
        if(Player.location[2] > 0){ //Is west clear to walk?
            if(mapData.Overworld[entityLocation[1]][entityLocation[2]-1].isWalkable){
                outputData.add(moveEntity.moveDirections[2]);
            }
        }
        if (Player.location[1] < mapData.Overworld[Player.location[0]].length - 1) { //Is south clear to walk?
            if (mapData.Overworld[entityLocation[1]+1][entityLocation[2]].isWalkable) {
                outputData.add(moveEntity.moveDirections[3]);
            }
        }
        return outputData;
    }
}
