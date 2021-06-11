package Input;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Properties;
import java.util.Scanner; // Import the Scanner class to read text files

class ShowOutput {
    Properties prop = new Properties();

    void Diagnosis(String symp) {
        // list of diseases
        String diseases = symp;
        String d1 = new String("heart attack");
        String d2 = new String("pneumonia");
        String d3 = new String("lung cancer");
        String d4 = new String("bladder diseases");
        String d5 = new String("liver diseases");
        String d6 = new String("skin cancer");
        String d7 = new String("headache disorder");
        String d8 = new String("osteoatharitis");
        String d9 = new String("anorexia nervosa");
        String d10 = new String("gallstones");
        String[] data = new String[8];

        // logic to print appropriate disease

        if (diseases.equals(d1)) {
            try {  //to read data from file
                File myObj = new File("../Medical/txt/diseases/heart attack.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d2)) {
            try {
                File myObj = new File("../Medical/txt/diseases/pneumonia.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d3)) {
            try {
                File myObj = new File("../Medical/txt/diseases/lung cancer.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d4)) {
            try {
                File myObj = new File("../Medical/txt/diseases/bladder diseases.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d5)) {
            try {
                File myObj = new File("../Medical/txt/diseases/liver diseases.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d6)) {
            try {
                File myObj = new File("../Medical/txt/diseases/skin cancer.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d7)) {
            try {
                File myObj = new File("../Medical/txt/diseases/headache disorder.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d8)) {
            try {
                File myObj = new File("../Medical/txt/diseases/osteoatharitis.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d9)) {
            try {
                File myObj = new File("../Medical/txt/diseases/anorexia nervosa.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (diseases.equals(d10)) {
            try {
                File myObj = new File("../Medical/txt/diseases/gallstones.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    void AddSymptoms(String symp) {
        String symptom = symp;
        String d1 = new String("chest pain");
        String d2 = new String("shortness of breathe");
        String d3 = new String("cough");
        String d4 = new String("vomiting");
        String d5 = new String("fatique");
        String d6 = new String("sweating");
        String d7 = new String("loss of appetite");
        String d8 = new String("unconciousness");
        String d9 = new String("fainting");
        String d10 = new String("headache");
        String[] data = new String[4];

        if (symptom.equals(d1)) {
            try {  //to read data from file
                File myObj = new File("../Medical/txt/symptom/chest pain.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d2)) {
            try {
                File myObj = new File("../Medical/txt/symptom/shortness of breathe.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d3)) {
            try {
                File myObj = new File("../Medical/txt/symptom/cough.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d4)) {
            try {
                File myObj = new File("../Medical/txt/symptom/vomiting.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d5)) {
            try {
                File myObj = new File("../Medical/txt/symptom/fatique.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d6)) {
            try {
                File myObj = new File("../Medical/txt/symptom/sweating.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d7)) {
            try {
                File myObj = new File("../Medical/txt/symptom/loss of appetite.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d8)) {
            try {
                File myObj = new File("../Medical/txt/symptom/unconciousness.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (symptom.equals(d9)) {
            try {
                File myObj = new File("../Medical/txt/symptom/fainting.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
        if (symptom.equals(d10)) {
            try {
                File myObj = new File("../Medical/txt/symptom/headache.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}