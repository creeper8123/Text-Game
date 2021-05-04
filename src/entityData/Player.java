package entityData;



import worldData.mapData;
import itemData.*;

import java.io.IOException;
import java.util.ArrayList;

public class Player {
    public int health;
    public int[] location = {0, 15, 15}; //spawn is {0, 15, 15}. Format is {Floor, x, y}
    public int world;
    public boolean inBattle;
    
    public buff[] perks = {new buff(null), new buff(null), new buff(null), new buff(null), new buff(null), new buff(null)};
    public item[] items = new item[4];
    public spell[] spells = {new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null)};
    public potion[] potions = new potion[4];

    public Player(){
        this.health = 100;
        this.world = mapData.OVERWORLD;
        this.inBattle = false;
        if(Math.random() > 0.5){
            spells[0] = new spell("magicBolt");
        }else{
            spells[0] = new spell("bouncingBolt");
        }
    }

    public void doAction(Player player, mapData world) throws IOException {
        String[] options = {"Move", "Spells","Perks", "Potions", "Items", "Info", "Exit"};
        int nextInstruction = 0;
        do{
            int selectedOption = engineInteractions.processList.chooseFromList(options, "Valid Commands");
            switch (options[selectedOption]) {
                case "Move" -> nextInstruction = movePlayer(player, world, true);
                case "Spells" -> {
                    String[] spellsName = new String[spells.length + 1];
                    for(int i=0;i!=spells.length;i++){
                        spellsName[i] = spells[i].showName;
                    }
                    spellsName[8] = "Back";
                    engineInteractions.processList.chooseFromList(spellsName, "Available Spells");
                    nextInstruction = 0;
                }
                case "Perks" -> {
                    String[] perkName = new String[perks.length + 1];
                    for(int i = 0; i!= perks.length; i++){
                        perkName[i] = null;//perks[i].showName
                    }
                    perkName[perks.length] = "Back";
                    engineInteractions.processList.chooseFromList(perkName, "Equipped Equipment");
                    nextInstruction = 0;
                }
                case "Potions" -> {
                    String[] potionName = new String[potions.length + 1];
                    for(int i = 0; i!= potions.length; i++){
                        potionName[i] = null;//potions[i].showName
                    }
                    potionName[potions.length] = "Back";
                    engineInteractions.processList.chooseFromList(potionName, "Available Potions");
                    nextInstruction = 0;
                }
                case "Items" -> {
                    String[] itemName = new String[items.length + 1];
                    for(int i = 0; i!= items.length; i++){
                        itemName[i] = null;//items[i].showName
                    }
                    itemName[items.length] = "Back";
                    engineInteractions.processList.chooseFromList(itemName, "Available Items");
                    nextInstruction = 0;
                }
                case "Info" -> {
                    engineInteractions.interactWithText.printValueToConsole("LOL nothing here (Info)", 25, true);
                    nextInstruction = 0;
                }
                case "Exit" ->{
                    engineInteractions.interactWithText.printValueToConsole("Are you sure you want to exit?", 25, true);
                    String[] exitOptions = {"Yes", "No"};
                    int selectedExitOption = engineInteractions.processList.chooseFromList(exitOptions, "Valid Commands");
                    if(selectedExitOption == 0){
                        engineInteractions.interactWithText.printValueToConsole("", 1000, false);
                        engineInteractions.interactWithText.printValueToConsole("Goodbye, and thank you for playing!", 100, true);
                        System.exit(-2);
                    }
                    nextInstruction = -1;
                }
                default -> System.out.println("You shouldn't see this");
            }
        }while(nextInstruction == -1);
    }

    public static final String[] moveDirections = {"North", "East", "West", "South"};
    public int movePlayer(Player player, mapData world, boolean addBack) throws IOException {
        String[] canMoveTo = player.getViableDirections(player.location, world, player, addBack).toArray(new String[0]);
        int moveTo = engineInteractions.processList.chooseFromList(canMoveTo, "Viable Directions");
        switch (canMoveTo[moveTo]) {
            case "North" -> player.location[1] -= 1;
            case "East" -> player.location[2] += 1;
            case "West" -> player.location[2] -= 1;
            case "South" -> player.location[1] += 1;
            case "Back" -> {
                return -1;
            }
        }
        return 0;
    }

    private ArrayList<String> getViableDirections(int[] entityLocation, mapData world, Player player, boolean addBack){
        ArrayList<String> outputData = new ArrayList<>();
        //Overworld
        if(player.world == mapData.OVERWORLD){
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
        }else if(player.world == mapData.DUNGEON_ICE){
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
        }else if(player.world == mapData.DUNGEON_FIRE){
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
        }else if(player.world == mapData.DUNGEON_OCEAN){
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
        }else if(player.world == mapData.DUNGEON_POISON){
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
        }else if(player.world == mapData.DUNGEON_FINAL){
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
        if(addBack){
            outputData.add("Back");
        }
        return outputData;
    }
}