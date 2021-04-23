package mainExecution;

import entityData.Player;
import worldData.mapData;

import java.io.IOException;
import java.util.Arrays;


public class mainClass {

    mapData world = new mapData();

    public static void main(String[] args) throws IOException {
        //TODO: Make this open the CMD and open this program in said CMD
        //Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","start"}); //Open CMD, doesn't yet run program in CMD

        System.out.println(Arrays.toString(Player.location));

        for(int i=0;i<100;i++){
            entityData.Player.movePlayer();
            System.out.println(Arrays.toString(Player.location));
            System.out.println("Standing on: " + mapData.Overworld[Player.location[1]][Player.location[2]].tileName);
        }
    }
}