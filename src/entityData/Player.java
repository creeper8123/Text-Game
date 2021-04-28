package entityData;



import mainExecution.mainClass;
import worldData.mapData;

import java.io.IOException;
import java.util.ArrayList;

public class Player {
    public int health;
    public Player(){
        this.health = 100;
    }


    public int[] location = {0, 15, 15}; //spawn is {0, 15, 15}. Format is {Floor, x, y}
    public int world = 0;

    public void movePlayer(Player player) throws IOException {
        String[] canMoveTo = player.getViableDirections(player.location, mainClass.world, player).toArray(new String[0]);
        int moveTo = engineInteractions.processList.chooseFromList(canMoveTo);
        switch (canMoveTo[moveTo]) {
            case "North" -> player.location[1] -= 1;
            case "East" -> player.location[2] += 1;
            case "West" -> player.location[2] -= 1;
            case "South" -> player.location[1] += 1;
        }
    }

    private static final String[] moveDirections = {"North", "East", "West", "South"};

    public ArrayList<String> getViableDirections(int[] entityLocation, mapData world, Player player){
        ArrayList<String> outputData = new ArrayList<>();
        //Overworld
        if(player.world == 0){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.Overworld[entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.Overworld.length-1){ //Is east clear to walk?
                if(world.Overworld[entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.Overworld[entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.Overworld[player.location[0]].length - 1) { //Is south clear to walk?
                if (world.Overworld[entityLocation[1] + 1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            //Ice Dungeon
        }else if(player.world == 1){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.dungeonIce[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.dungeonIce[entityLocation[0]][player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonIce[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            //Fire Dungeon
        }else if(player.world == 2){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.dungeonFire[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.dungeonFire[entityLocation[0]][player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonFire[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            //Ocean Dungeon
        }else if(player.world == 3){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.dungeonOcean[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.dungeonOcean[entityLocation[0]][player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonOcean[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            //Poison Dungeon
        }else if(player.world == 4){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.dungeonPoison[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.dungeonPoison[entityLocation[0]][player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonPoison[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            //Final Dungeon
        }else if(player.world == 5){
            if(player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[2] < world.dungeonFinal[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[1] < world.dungeonFinal[entityLocation[0]][player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonFinal[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
        }
        return outputData;
    }


}