import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Activity {

    int [] first = new  int[7];//start time
    int [] second = new int[7];//finish time


    public  void handleFile()
    {

        String track = "C:\\Users\\Ruhul Ameen\\IdeaProjects\\ActivitySelection Problem\\try.txt";

        FileReader file = null;

        try {
            file = new FileReader(track);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(file);

        for (int i =0 ; sc.hasNextLine(); i++)
        {
            first[i] = sc.nextInt();
            second[i+1] = sc.nextInt();

        }


       /* for (int x=0;x< num.length ; x++)
        {
            System.out.println(num[x]);
            System.out.println(row[x]);
        } */

    }


    void activitySelection()
    {
        Arrays.sort(second);//firstly sorting the finishing time
        int i = 0;
        System.out.println("Activity Selected: ");
        System.out.println(i + " ");//printing the initial

        for (int j = 0; j < 6 ;j++)
        {
           if(first[j] >= second[i]) //check the start with finish
           {
               System.out.println(j + " ");//print if get desired
               i = j;// assign new finish time

           }

        }


    }

    public static void main(String[] args)
    {
        Activity selection = new Activity();
        selection.handleFile();
        selection.activitySelection();
    }
}
