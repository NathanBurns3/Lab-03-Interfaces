import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListWriter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object> item = new ArrayList<>();

        while (SafeInput.getYNConfirm(in, "Add a word to the list?")) {
            System.out.print("Word: ");
            String x = in.nextLine();
            item.add(x);
        }

        String textFileName = SafeInput.getNonZeroLenString(in, "\nEnter text file name");

        try {
            PrintWriter writer = new PrintWriter(textFileName);

            for(Object var : item) {
                writer.println(var);
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
