package Input;

import exceptions.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Properties;
import java.util.*;

public class Find {
    screenclean a=new screenclean();
    Scanner sc = new Scanner(System.in);
    // check whether the symptom entered is present in database or not
    public void findsymptom()throws UnrecognizedDiseaseException{
        BufferedReader getIt = new BufferedReader(new InputStreamReader(System.in));
        String symp = "";
        int count = 0;
        ShowOutput s = new ShowOutput();
        Properties prop = new Properties();
        try {
            FileInputStream fstream = new FileInputStream("../Medical/txt/symptoms.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            System.out.println("\nEnter Symptom");
            symp = getIt.readLine();
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                if (symp.equals(strLine)) {
                    System.out.println("\nSymptom found\n");
                    s.AddSymptoms(symp);
                    break;
                } else {
                    count++;
                }
            }
            if (count > 10) {
                throw new UnrecognizedSymptomException("\nUnrecognised Symptom: ");
            }
        } catch(UnrecognizedSymptomException e){System.out.println(e+prop.getProperty("UnrecognisedsymptomMessage"));
            System.out.println("=============================================================");
            System.out.println("press 1 to continue");
            sc.nextInt();

            try{a.clearScreen();} catch(Exception b){b.getMessage();}
            findsymptom();}
        catch(Exception e){
            System.out.println(e);}
    }
    public void findDisease() throws UnrecognizedDiseaseException {
        BufferedReader getIt = new BufferedReader(new InputStreamReader(System.in));
        String symp = "";
        int count=0;
        ShowOutput s = new ShowOutput();
        Properties prop=new Properties();
        try {
            FileInputStream fstream = new FileInputStream("../Medical/txt/disease.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            System.out.println("\nEnter disease");
            symp = getIt.readLine();


            while ((strLine = br.readLine()) != null) {
                // Print the content on the console#
                if (symp.equals(strLine)) {
                    System.out.println("\nDisease Found\n");
                    s.Diagnosis(symp);
                    break;
                } else {
                    count++;
                }
            }
            if (count>=10)
            {
                throw new UnrecognizedDiseaseException("\nUnrecognised Disease");
            }
            //Close the input stream
        }catch(UnrecognizedDiseaseException e){System.out.println(e+prop.getProperty("UnrecogniseddiseaseMessage"));
            System.out.println("=============================================================");
            System.out.println("press 1 to continue");
            sc.nextInt();
            try{a.clearScreen();} catch(Exception b){b.getMessage();}
            findDisease();}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
