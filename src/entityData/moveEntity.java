package entityData;

import worldData.mapData;

import java.util.ArrayList;



public class moveEntity {

    private static final String[] moveDirections = {"North", "East", "West", "South"};

    public static ArrayList<String> getViableDirections(int[] entityLocation, mapData world){
        ArrayList<String> outputData = new ArrayList<String>();
        //Overworld
        if(Player.world == 0){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.Overworld[entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.Overworld.length-1){ //Is east clear to walk?
                if(world.Overworld[entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.Overworld[entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.Overworld[Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.Overworld[entityLocation[1] + 1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        //Ice Dungeon
        }else if(Player.world == 1){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.dungeonIce[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonIce[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.dungeonIce[entityLocation[0]][Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonIce[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        //Fire Dungeon
        }else if(Player.world == 2){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.dungeonFire[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonFire[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.dungeonFire[entityLocation[0]][Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonFire[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        //Ocean Dungeon
        }else if(Player.world == 3){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.dungeonOcean[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonOcean[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.dungeonOcean[entityLocation[0]][Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonOcean[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        //Poison Dungeon
        }else if(Player.world == 4){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.dungeonPoison[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonPoison[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.dungeonPoison[entityLocation[0]][Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonPoison[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        //Final Dungeon
        }else if(Player.world == 5){
            if(Player.location[1] > 0){ //Is North clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]-1][entityLocation[2]].isWalkable){
                    outputData.add(moveEntity.moveDirections[0]);
                }
            }
            if(Player.location[2] < world.dungeonFinal[entityLocation[0]].length-1){ //Is east clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]][entityLocation[2]+1].isWalkable){
                    outputData.add(moveEntity.moveDirections[1]);
                }
            }
            if(Player.location[2] > 0){ //Is west clear to walk?
                if(world.dungeonFinal[entityLocation[0]][entityLocation[1]][entityLocation[2]-1].isWalkable){
                    outputData.add(moveEntity.moveDirections[2]);
                }
            }
            if (Player.location[1] < world.dungeonFinal[entityLocation[0]][Player.location[0]].length - 1) { //Is south clear to walk?
                if (world.dungeonFinal[entityLocation[0]][entityLocation[1]+1][entityLocation[2]].isWalkable) {
                    outputData.add(moveEntity.moveDirections[3]);
                }
            }
        }
        return outputData;
    }
}
