import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
class FileHandling{
    public static void main(String args[]){
        try {
            // Creating an object of a file
            /*File myObj = new File("FileHandlingNewFilef1.txt"); 
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } 
            else {
                System.out.println("File already exists.");
            }*/
            FileWriter myWriter = new FileWriter("FileHandlingNewFilef1.txt",true);
            //myWriter.write("Java is the prominent programming language of the millenium!");
            //myWriter.write("\nHiiiii");
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.newLine();
            bw.write("new line");
            bw.newLine();
            bw.write("new line2");
            bw.close();
            myWriter.close();
            
            File myObj = new File("FileHandlingNewFilef1.txt");  
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(" ");
                System.out.println(Arrays.toString(data));
                }
            myReader.close();
            }
            
        catch(Exception e){
            e.printStackTrace();
        }
    }
}