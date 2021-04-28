package engineInteractions;

import java.io.IOException;
import java.util.Locale;

public class processList {
    public static int determineSelected(String[] baseList, String userInput){
        try{
            //If it's a valid index, return said index.
            int num = Integer.parseInt(userInput);
            if(num > 0 && num <= baseList.length){
                return num-1;
            }

        }catch(Exception e){
            //If it's not a valid index, check to see if the user input text from the list
            try{
                for(int i=0;i!= baseList.length;i++){
                    if(baseList[i].toLowerCase(Locale.ROOT).equals(userInput.toLowerCase(Locale.ROOT))){
                        return i;
                    }
                }
            }catch(Exception f){
                return -1;
            }
        }
        //If no valid index is found.
        return -1;
    }

    public static int chooseFromList(String[] listToDisplay) throws IOException {
        int num;
        do{
            for(int i=0; i!=listToDisplay.length;i++) {
               interactWithText.printValueToConsole("[" + (i + 1) + "] " + listToDisplay[i], 25, true);
            }
            System.out.println();
            interactWithText.printValueToConsole("Enter an option from the provided list: ", 25, false);
            num = determineSelected(listToDisplay, interactWithText.readValueFromConsole());
            if(num == -1){
                interactWithText.printValueToConsole("", 100, true);
                interactWithText.printValueToConsole("! Invalid Entry !", 25, true);
                interactWithText.printValueToConsole("", 100, true);
            }
        }while(num == -1);
        return num;
    }
}