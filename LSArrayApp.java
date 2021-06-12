import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Sanele Hlongwane
 */

public class LSArrayApp {
    /**
     * This is a program that returns areas experiencing loadshedding for the given parameters
     * provided that they are valid. Not parsing any parameters returns a list of stages, days, times and areas
     * experiencing loadshedding.
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        String[] one = new String[3];
        int temp = 0;
        for(String s: args){
            one[temp] = s;
            temp ++;
        }
        if(one[0] == null){printAllAreas();}else{
            if (printAreas(one[0], one[1], one[2]).equals("Invalid Parameters")) {
                System.out.println("Invalid Parameters: "+one[0]+" "+one[1]+" "+one[2]);
            }else{
        System.out.println("The areas experiencing Load Shedding are: "+printAreas(one[0], one[1], one[2]));}}

    }
    public static String printAreas (String stage, String day, String startTime) throws IOException {
        /**
         * Returns the specific areas given that valid parameters are parsed, otherwise "Invalid Parameters" will be returned
         */
        FileInputStream fstream = new FileInputStream("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int counter = 0;
        int index = 0;
        String areas = null;
        String[][] data = new String[3000][];

        while ((strLine = br.readLine()) != null){

            String[] strArray= strLine.split(" ",2);
            data[index] = strArray;
            index++;

        }
        fstream.close();
        String currentItem ;
        int i= 0;

        String parameterString = stage+"_"+day+"_"+startTime;
        boolean bfound = false;
        try{while(i<3000 && bfound == false){
            currentItem = data[i][0];
            if(currentItem.equals(parameterString)){
                bfound = true;
                areas = data[i][1];
                counter++;
            }else{i++;counter++;}
        }
        if(areas!= null){
        System.out.println("Number of comparisons: "+counter);
            return areas;}else{return "Does Not Exist";}}catch (Exception e){return "Invalid Parameters";}
        }

    public static String printAllAreas () throws IOException {
        /**
         * Returns a list of all areas experiencing loadshedding
         */
        FileInputStream fstream = new FileInputStream("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int counter = 0;
        int index = 0;
        String[][] data = new String[3000][];

        while ((strLine = br.readLine()) != null) {

            String[] strArray = strLine.split(" ", 2);
            data[index] = strArray;
            index++;

        }
        fstream.close();
        for(int i =0; i<2976; i++){
            System.out.println("Stage: "+(data[i][0]).split("_")[0]+" Day: "+(data[i][0]).split("_")[1]+" Starting time: "+(data[i][0]).split("_")[2]+" Areas: "+(data[i][1]));
        }


    return "Number of comparisons: 0";}
    }


