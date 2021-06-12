import java.io.*;
import java.util.Arrays;

public class LSArrayAppOriginal {

    public static void main(String[] args) throws IOException {
        printAreas("8", "3", "12");

    }
    public static int printAreas (String stage, String day, String startTime) throws IOException {
        FileInputStream fstream = new FileInputStream("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        int counter = 0;
        String[][] stage1 = new String[500][];
        String[][] stage2 = new String[500][];
        String[][] stage3 = new String[500][];
        String[][] stage4 = new String[500][];
        String[][] stage5 = new String[500][];
        String[][] stage6 = new String[500][];
        String[][] stage7 = new String[500][];
        String[][] stage8 = new String[500][];
        int i, j, k, l ,m , n, o, p;
        i = j = k = l = m = n = o = p = 0;
        while ((strLine = br.readLine()) != null)   {

            //System.out.println (strLine);
            String[] strArray= strLine.split("[_ ,]");

            switch (strArray[0]) {
                case "1":
                    stage1[i] = strArray;
                    i += 1;
                    break;
                case "2":
                    stage2[j] = strArray;
                    j += 1;
                    break;
                case "3":
                    stage3[k] = strArray;
                    k += 1;
                    break;
                case "4":
                    stage4[l] = strArray;
                    l += 1;
                    break;
                case "5":
                    stage5[m] = strArray;
                    m += 1;
                    break;
                case "6":
                    stage6[n] = strArray;
                    n += 1;
                    break;
                case "7":
                    stage7[o] = strArray;
                    o += 1;
                    break;
                case "8":
                    stage8[p] = strArray;
                    p += 1;
                    break;
            }
            //System.out.println(Arrays.toString(strArray));
        }

        String[][][] stages = {stage1, stage2, stage3, stage4, stage5, stage6, stage7, stage8};
        //for(int a =0; a<stages.length; a++){
            //System.out.println(Arrays.toString(stages[a][0]));
        //}
        //System.out.println(Arrays.toString(stages));
        fstream.close();
        if(stage.equals("1")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage1[count][1].equals(day) && stage1[count][2].equals(startTime)){
                        System.out.println(Arrays.toString(stage1[count]));
                        counter = count;
                        System.out.println(count);
                        found = true;
                    }else{count++;}
                }
        }
        if(stage.equals("2")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage2[count][1].equals(day) && stage2[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage2[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("3")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage3[count][1].equals(day) && stage3[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage3[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("4")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage4[count][1].equals(day) && stage4[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage4[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("5")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage5[count][1].equals(day) && stage5[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage5[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("6")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage6[count][1].equals(day) && stage6[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage6[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("7")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage7[count][1].equals(day) && stage7[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage7[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
        if(stage.equals("8")){
            boolean found = false;
            counter = 0;
            int count = 0;
            while(!found){
                if(stage8[count][1].equals(day) && stage8[count][2].equals(startTime)){
                    System.out.println(Arrays.toString(stage8[count]));
                    counter = count;
                    System.out.println(count);
                    found = true;
                }else{count++;}
            }
        }
    return counter;}

}

