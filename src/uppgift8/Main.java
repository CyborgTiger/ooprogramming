package uppgift8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {



    }
    public String fileReader(String filepath){
        String tempLine;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/tiago/IdeaProjects/ooprogramming/src/uppgift8/text.txt"))){
            while ((tempLine = bufferedReader.readLine()) != null ){
                outputString(tempLine);
            }
        } catch (IOException e) {
            System.out.println("error");
            throw new RuntimeException(e);
        }
        return tempLine;
    }

    public void outputString(String tempLine){
        System.out.println(tempLine);

    }
}
