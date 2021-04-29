package mainExecution;

import entityData.Player;
import worldData.mapData;

import java.io.IOException;

public class mainClass {

    public static mapData world = new mapData();
    public static Player player = new Player();

    public static void main(String[] args) throws IOException {

        //TODO: Make this open the CMD and open this program in said CMD
        //Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","start"}); //Open CMD, doesn't yet run program in CMD

        for(int i=0;i<100;i++){
            player.doAction(player);
            System.out.println("===Next iteration===");
        }
    }
}