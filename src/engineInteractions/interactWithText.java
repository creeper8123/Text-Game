package engineInteractions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class interactWithText {
    public static String readValueFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void printValueToConsole(String dataToPrint, int delayTime, boolean gotoNextLine){
        String extraDelay = ",.?!;";
        try{
            char[] dataToPrintArray = dataToPrint.toCharArray();
            for(char i : dataToPrintArray){
                if(extraDelay.contains(Character.toString(i))){
                    Thread.sleep(delayTime* 8L);
                }else{
                    Thread.sleep(delayTime);
                }
                System.out.print(i);
            }
            if(gotoNextLine){
                System.out.println();
            }else{
                System.out.print("");
            }
        } catch(Exception e){
            if(gotoNextLine){
                System.out.println();
            }else{
                System.out.print("");
            }
        }
    }
}