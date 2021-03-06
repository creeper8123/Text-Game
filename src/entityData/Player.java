package entityData;



import engineInteractions.processList;
import worldData.mapData;
import itemData.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    public int health;
    public int[] location; //spawn is {0, 0, 15, 15}. Format is {World, Floor, x, y}
    public boolean inBattle;

    public buff[] perks = {new buff(null), new buff(null), new buff(null), new buff(null), new buff(null), new buff(null)};
    //6 buffs
    public item[] items = {new item(null), new item(null), new item(null), new item(null)};
    //4 items
    public spell[] spells = {new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null), new spell(null)};
    //8 spells
    public potion[] potions = {new potion(null), new potion(null), new potion(null), new potion(null)};
    //4 potions

    public Player(){
        this.health = 100;
        this.location = new int[]{0, 0, 15, 15};
        this.inBattle = false;
        double randomNum = Math.random();
        if(randomNum < (double) 1/3){
            spells[0] = new spell("magicBolt");
        }else if(randomNum < (double) 2/3){
            spells[0] = new spell("bouncingBolt");
        }else{
            spells[0] = new spell("fireBall");
        }
    }

    public void doNormalAction(Player player, mapData world) throws IOException {
        final String[] options = {"Move", "Spells","Perks", "Potions", "Items", "Info", "Exit"};
        int nextInstruction = 0;
        do{
            int selectedOptionLvl1 = engineInteractions.processList.chooseFromList(options, "Valid commands");
            switch (options[selectedOptionLvl1]) {
                case "Move" -> nextInstruction = movePlayer(player, world, true, "Teleporter");
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
                        perkName[i] = perks[i].showName;
                    }
                    perkName[perks.length] = "Back";
                    int selectedOptionLvl2 = 0;
                    do{
                        selectedOptionLvl2 = engineInteractions.processList.chooseFromList(perkName, "Equipped Equipment");
                        if(selectedOptionLvl2 != perks.length){
                            System.out.println("Show Perk Options");
                        }
                    }while(selectedOptionLvl2 != perks.length);
                    nextInstruction = 0;
                }
                case "Potions" -> {
                    String[] potionName = new String[potions.length + 1];
                    for(int i = 0; i!= potions.length; i++){
                        potionName[i] = potions[i].showName;
                    }
                    potionName[potions.length] = "Back";
                    engineInteractions.processList.chooseFromList(potionName, "Available potions");
                    nextInstruction = 0;
                }
                case "Items" -> {
                    String[] itemName = new String[items.length + 1];
                    for(int i = 0; i!= items.length; i++){
                        itemName[i] = items[i].showName;
                    }
                    itemName[items.length] = "Back";
                    engineInteractions.processList.chooseFromList(itemName, "Available items");
                    nextInstruction = 0;
                }
                case "Info" -> {
                    final String[] infoOptions = {"Area", "Spells", "Perks", "Potions", "Items", "Back"};
                    int nextInstruction2 = 0;
                    do{
                        int selectedOptionLvl2 = engineInteractions.processList.chooseFromList(infoOptions, "Get more info about");
                        switch(infoOptions[selectedOptionLvl2]){
                            case "Area" ->{
                                ArrayList<String> newLookOptions = new ArrayList<>();
                                if(player.location[0] == mapData.OVERWORLD){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.Overworld[player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.Overworld.length-1)){
                                        newLookOptions.add("South");
                                    }
                                }else if(player.location[0] == mapData.DUNGEON_ICE){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.dungeonIce[player.location[1]][player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.dungeonIce[player.location[1]].length-1)){
                                        newLookOptions.add("South");
                                    }
                                }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.dungeonFire[player.location[1]][player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.dungeonFire[player.location[1]].length-1)){
                                        newLookOptions.add("South");
                                    }
                                }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.dungeonOcean[player.location[1]][player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.dungeonOcean[player.location[1]].length-1)){
                                        newLookOptions.add("South");
                                    }
                                }else if(player.location[0] == mapData.DUNGEON_POISON){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.dungeonPoison[player.location[1]][player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.dungeonPoison[player.location[1]].length-1)){
                                        newLookOptions.add("South");
                                    }
                                }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                    if(!(player.location[2] == 0)){
                                        newLookOptions.add("North");
                                    }
                                    if(!(player.location[3] == world.dungeonIce[player.location[2]].length-1)){
                                        newLookOptions.add("East");
                                    }
                                    if(!(player.location[3] == 0)){
                                        newLookOptions.add("West");
                                    }
                                    if(!(player.location[2] == world.dungeonIce.length-1)){
                                        newLookOptions.add("South");
                                    }
                                }
                                newLookOptions.add("Current");
                                newLookOptions.add("Back");
                                String[] finalLookOptions = newLookOptions.toArray(new String[0]);
                                int selectedOptionLvl3 = engineInteractions.processList.chooseFromList(finalLookOptions, "Get more info about");
                                switch(finalLookOptions[selectedOptionLvl3]){
                                    case "Current" ->{
                                        if(player.location[0] == mapData.OVERWORLD){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.Overworld[player.location[2]][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_ICE){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.dungeonIce[player.location[1]][player.location[2]][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.dungeonFire[player.location[1]][player.location[2]][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_POISON){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]].tileName, 25, true);
                                        }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                            engineInteractions.interactWithText.printValueToConsole("Under your feet, there is " + world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]].tileName, 25, true);
                                        }
                                        nextInstruction2 = 0;
                                    }
                                    case "North" ->{
                                        if(player.location[0] == mapData.OVERWORLD){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.Overworld[player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_ICE){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.dungeonIce[player.location[1]][player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.dungeonFire[player.location[1]][player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.dungeonOcean[player.location[1]][player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_POISON){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.dungeonPoison[player.location[1]][player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                            engineInteractions.interactWithText.printValueToConsole("To your north, there is " + world.dungeonFinal[player.location[1]][player.location[2]-1][player.location[3]].tileName, 25, true);
                                        }
                                        nextInstruction2 = 0;
                                    }
                                    case "East" ->{
                                        if(player.location[0] == mapData.OVERWORLD){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.Overworld[player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_ICE){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.dungeonIce[player.location[1]][player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.dungeonFire[player.location[1]][player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_POISON){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                            engineInteractions.interactWithText.printValueToConsole("To your east, there is " + world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]+1].tileName, 25, true);
                                        }
                                        nextInstruction2 = 0;
                                    }
                                    case "West" ->{
                                        if(player.location[0] == mapData.OVERWORLD){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.Overworld[player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_ICE){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.dungeonIce[player.location[1]][player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.dungeonFire[player.location[1]][player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_POISON){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                            engineInteractions.interactWithText.printValueToConsole("To your west, there is " + world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]-1].tileName, 25, true);
                                        }
                                        nextInstruction2 = 0;
                                    }
                                    case "South" ->{
                                        if(player.location[0] == mapData.OVERWORLD){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.Overworld[player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_ICE){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.dungeonIce[player.location[1]][player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_FIRE){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.dungeonFire[player.location[1]][player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.dungeonOcean[player.location[1]][player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }else if(player.location[0] == mapData.DUNGEON_POISON){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.dungeonPoison[player.location[1]][player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }else  if(player.location[0] == mapData.DUNGEON_FINAL){
                                            engineInteractions.interactWithText.printValueToConsole("To your south, there is " + world.dungeonFinal[player.location[1]][player.location[2]+1][player.location[3]].tileName, 25, true);
                                        }
                                        nextInstruction2 = 0;
                                    }
                                    case "Back" ->{
                                        nextInstruction2 = -1;
                                    }
                                }
                                nextInstruction = -1;
                            }
                            case "Spells" ->{
                                String[] spellsName = new String[spells.length + 1];
                                for(int i=0;i!=spells.length;i++){
                                    spellsName[i] = spells[i].showName;
                                }
                                spellsName[8] = "Back";
                                int selectedOptionLvl3 = engineInteractions.processList.chooseFromList(spellsName, "Available Spells");
                                if(spellsName[selectedOptionLvl3].equals("Back")){
                                    nextInstruction2 = -1;
                                }else{
                                    engineInteractions.interactWithText.printValueToConsole("Name: " + spells[selectedOptionLvl3].showName, 25, true);
                                    engineInteractions.interactWithText.printValueToConsole("Damage: " + spells[selectedOptionLvl3].damage + "??" + spells[selectedOptionLvl3].maxDamageVariation, 25, true);
                                    nextInstruction2 = 0;
                                    nextInstruction = -1;
                                }
                            }
                            case "Perks" ->{
                                System.out.println("Perks Info");
                                nextInstruction = 0;
                            }
                            case "Potions" ->{
                                System.out.println("Potions Info");
                                nextInstruction = 0;
                            }
                            case "Items" ->{
                                System.out.println("Items Info");
                                nextInstruction = 0;
                            }
                            case "Back" ->{
                                System.out.println("Back");
                                nextInstruction = -1;
                            }
                        }
                    }while(nextInstruction2 == -1);
                    //nextInstruction = 0;
                }
                case "Exit" ->{
                    engineInteractions.interactWithText.printValueToConsole("Are you sure you want to exit?", 25, true);
                    String[] exitOptions = {"Yes", "No"};
                    int selectedExitOption = engineInteractions.processList.chooseFromList(exitOptions, "Valid Commands");
                    if(selectedExitOption == 0){
                        engineInteractions.interactWithText.printValueToConsole("", 500, false);
                        engineInteractions.interactWithText.printValueToConsole("Goodbye!", 50, true);
                        System.exit(-2);
                    }
                    nextInstruction = -1;
                }
                default -> System.out.println("You shouldn't see this");
            }
            engineInteractions.interactWithText.printValueToConsole("", 100, true);
        }while(nextInstruction == -1);
    }

    public static String[] moveDirections = {"North", "East", "West", "South", "Teleport"};
    public int movePlayer(Player player, mapData world, boolean addBack, String teleporterName) throws IOException {
        String[] canMoveTo = player.getViableDirections(world, player, addBack).toArray(new String[0]);
        int moveTo = processList.chooseFromList(canMoveTo, "Viable Directions");
        switch (canMoveTo[moveTo]) {
            case "North" -> player.location[2] -= 1;
            case "East" -> player.location[3] += 1;
            case "West" -> player.location[3] -= 1;
            case "South" -> player.location[2] += 1;
            case "Teleport" -> {
                if(player.location[0] == mapData.OVERWORLD){
                    player.location = world.Overworld[player.location[2]][player.location[3]].teleportTo;
                }else if(player.location[0] == mapData.DUNGEON_ICE){
                    player.location = world.dungeonIce[player.location[1]][player.location[2]][player.location[3]].teleportTo;
                }else if(player.location[0] == mapData.DUNGEON_FIRE){
                    player.location = world.dungeonFire[player.location[1]][player.location[2]][player.location[3]].teleportTo;
                }else if(player.location[0] == mapData.DUNGEON_OCEAN){
                    player.location = world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]].teleportTo;
                }else if(player.location[0] == mapData.DUNGEON_POISON){
                    player.location = world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]].teleportTo;
                }else if(player.location[0] == mapData.DUNGEON_FINAL){
                    player.location = world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]].teleportTo;
                }
            }
            case "Back" -> {
                return -1;
            }
        }
        return 0;
    }

    private ArrayList<String> getViableDirections(mapData world, Player player, boolean addBack){
        ArrayList<String> outputData = new ArrayList<>();
        //Overworld
        if(player.location[0] == mapData.OVERWORLD){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.Overworld[player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.Overworld.length-1){ //Is east clear to walk?
                if(world.Overworld[player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.Overworld[player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.Overworld[player.location[1]].length - 1) { //Is south clear to walk?
                if (world.Overworld[player.location[2] + 1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }

            if(world.Overworld[player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
            //Ice Dungeon
        }else if(player.location[0] == mapData.DUNGEON_ICE){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.dungeonIce[player.location[1]][player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.dungeonIce[player.location[1]].length-1){ //Is east clear to walk?
                if(world.dungeonIce[player.location[1]][player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.dungeonIce[player.location[1]][player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.dungeonIce[player.location[1]][player.location[1]].length - 1) { //Is south clear to walk?
                if (world.dungeonIce[player.location[1]][player.location[2]+1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }

            if(world.dungeonIce[player.location[1]][player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
            //Fire Dungeon
        }else if(player.location[0] == mapData.DUNGEON_FIRE){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.dungeonFire[player.location[1]][player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.dungeonFire[player.location[1]].length-1){ //Is east clear to walk?
                if(world.dungeonFire[player.location[1]][player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.dungeonFire[player.location[1]][player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.dungeonFire[player.location[1]][player.location[1]].length - 1) { //Is south clear to walk?
                if (world.dungeonFire[player.location[1]][player.location[2]+1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            if(world.dungeonFire[player.location[1]][player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
            //Ocean Dungeon
        }else if(player.location[0] == mapData.DUNGEON_OCEAN){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.dungeonOcean[player.location[1]][player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.dungeonOcean[player.location[1]].length-1){ //Is east clear to walk?
                if(world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.dungeonOcean[player.location[1]][player.location[1]].length - 1) { //Is south clear to walk?
                if (world.dungeonOcean[player.location[1]][player.location[2]+1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            if(world.dungeonOcean[player.location[1]][player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
            //Poison Dungeon
        }else if(player.location[0] == mapData.DUNGEON_POISON){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.dungeonPoison[player.location[1]][player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.dungeonPoison[player.location[1]].length-1){ //Is east clear to walk?
                if(world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.dungeonPoison[player.location[1]][player.location[1]].length - 1) { //Is south clear to walk?
                if (world.dungeonPoison[player.location[1]][player.location[2]+1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            if(world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
            //Final Dungeon
        }else if(player.location[0] == mapData.DUNGEON_FINAL){
            if(player.location[2] > 0){ //Is North clear to walk?
                if(world.dungeonFinal[player.location[1]][player.location[2]-1][player.location[3]].isWalkable){
                    outputData.add(moveDirections[0]);
                }
            }
            if(player.location[3] < world.dungeonFinal[player.location[1]].length-1){ //Is east clear to walk?
                if(world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]+1].isWalkable){
                    outputData.add(moveDirections[1]);
                }
            }
            if(player.location[3] > 0){ //Is west clear to walk?
                if(world.dungeonFinal[player.location[1]][player.location[2]][player.location[3]-1].isWalkable){
                    outputData.add(moveDirections[2]);
                }
            }
            if (player.location[2] < world.dungeonFinal[player.location[1]][player.location[1]].length - 1) { //Is south clear to walk?
                if (world.dungeonFinal[player.location[1]][player.location[2]+1][player.location[3]].isWalkable) {
                    outputData.add(moveDirections[3]);
                }
            }
            if(world.dungeonPoison[player.location[1]][player.location[2]][player.location[3]].isTeleporter){
                outputData.add(moveDirections[4]);
            }
        }
        if(addBack){
            outputData.add("Back");
        }
        return outputData;
    }
}