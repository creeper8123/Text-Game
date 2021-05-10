package mainExecution;

import entityData.Player;
import worldData.mapData;

import java.io.IOException;
import java.util.Arrays;

public class mainClass {

    public static mapData world = new mapData();
    public static Player player = new Player();

    public static void main(String[] args) throws IOException {

        //TODO: Make this open the CMD and open this program in said CMD
        //Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","start"}); //Open CMD, doesn't yet run program in CMD

        for(int i=0; i<100; i++){
            player.doNormalAction(player, world);
            System.out.println("");
            System.out.println(Arrays.toString(player.location));
            System.out.println("Standing on: " +  world.Overworld[player.location[2]][player.location[3]].tileName);
            System.out.println("N: " +  world.Overworld[player.location[2]-1][player.location[3]].tileName);
            System.out.println("E: " +  world.Overworld[player.location[2]][player.location[3]+1].tileName);
            System.out.println("W: " +  world.Overworld[player.location[2]][player.location[3]-1].tileName);
            System.out.println("S: " +  world.Overworld[player.location[2]+1][player.location[3]].tileName);
            System.out.println("!DEBUG! ===Next iteration==="); //TODO: Remove this line completely when done
        }
    }
}