import java.util.Scanner;

public class CriaTable {

    public static void main(String[] args){

        Scanner rfcColumns = new Scanner(System.in);  //Create a Scanner object
        System.out.print("Enter table columns: ");
        String readColumns = rfcColumns.nextLine();  //Read user input
        String columnToBeSplitted = readColumns;
        String[] splitParts = columnToBeSplitted.split(";");
        System.out.println("Paste the next lines into Talend Open Studio tJavaFlex (main):");
        for (int i = 0; i < splitParts.length; i++){
            String actualColumn = splitParts[i];
            System.out.println("row1." + actualColumn + " = table.getString(\"" + actualColumn +"\");");
        }
    }
}
