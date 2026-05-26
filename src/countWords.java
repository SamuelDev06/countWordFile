import java.io.File;
import java.util.Scanner;

public class countWords {

        public static void main(String[] args){
            try{
                //try to open myFile
                File myFile = new File("myFile.txt");
                Scanner myScannerFile = new Scanner(myFile);
                int compteur = 0 ;

                while(myScannerFile.hasNextLine()){

                    //Receive number of line and count words
                    String myLine = myScannerFile.nextLine() ;
                    String [] myTab = myLine.split(" ") ;
                    compteur = compteur + myTab.length ;



                }



            }catch(Exception exception){
                //display error message
                System.out.println(exception);

            }
        }

}
