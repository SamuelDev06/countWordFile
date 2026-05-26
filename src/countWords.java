import java.io.File;
import java.util.Scanner;

public class countWords {

        public static void main(String[] args){
            try{
                //try to open myFile
                File myFile = new File("myFile");
                Scanner myScannerFile = new Scanner(myFile);
                int compteur = 0 ;


                while(myScannerFile.hasNextLine()){

                    //Receive number of line and count words
                    String myLine = myScannerFile.nextLine() ;
                    String [] myTab = myLine.trim().split(" ") ;
                    compteur = compteur + myTab.length ;




                }
                //display words number
                System.out.println("le nombre de mot dans le fichier est :" + compteur);



            }catch(Exception exception){
                //display error message
                System.out.println(exception);

            }
        }

}
