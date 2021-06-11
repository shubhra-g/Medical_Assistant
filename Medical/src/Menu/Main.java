package Menu;

import Input.*;
import Validation.AgeValidation;
import Validation.GenderValidation;
import Validation.Number;
import Validation.PatientName;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                                               |");
        System.out.println("|                   WELCOME                     |");
        System.out.println("|                      TO                       |");
        System.out.println("|               MEDICAL ASSISTANT               |");
        System.out.println("|                                               |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Random rand = new Random();
        screenclean s=new screenclean();
        int uid = rand.nextInt(1000);
        System.out.println("Welcome to the Registration Panel");
        System.out.print("\nEnter patient name: ");// taking input from user
        String name = sc.nextLine();
        PatientName p = new PatientName();
        p.Checkname(name);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        AgeValidation a = new AgeValidation();//object of age validator
        a.Agevalidation(age);

        System.out.print("Enter gender(m/f): ");
        char gender = sc.next().charAt(0);
        GenderValidation g = new GenderValidation();//object of gender validator
        g.Gendervalidation(gender);

        System.out.print("Enter contact number: ");
        String contact = sc.next();
        Number n = new Number(); //object for contact validator
        n.valid(contact);

        if (p.Checkname() && a.isage() && g.isGender() && n.isNumberValid()) {
            try{
                s.clearScreen();} catch(Exception e){e.getMessage();}
            System.out.println("=============================================================");
            System.out.println("Registration successful and your patient id is:" + uid);
            System.out.println("=============================================================");
            System.out.println("press 1 to continue");
            sc.nextInt();
            try{ s.clearScreen();}catch(Exception e){e.getMessage();}
            menu(); }
        else {
            System.out.println("=============================================================");
            System.out.println("Details entered above are Incorrect\nRegistration unsuccessful\nRegister Again");
            System.out.println("=============================================================");
            System.out.println("press 1 to continue");
            sc.nextInt();
            try{ s.clearScreen();
                main(args);}catch(Exception e){e.getMessage();}
        }
    }

    public static void menu() {
        Scanner Z = new Scanner(System.in);
        screenclean z=new screenclean();
        Find f1 = new Find();

        System.out.println("              |==============================================|");
        System.out.println("              |                 WELCOME TO                   |");
        System.out.println("              |             MEDICAL ASSISTANT                |");
        System.out.println("              |==============================================|");
        System.out.println("Press 1 if you want to know disease associated with your Symptoms from our data base");
        System.out.println("Press 2 if you want to know symptoms of any particular disease from our database");

        System.out.println("Enter Your Choice");
        int i = Z.nextInt();
        //creating switch statement for menu() method
        switch (i) {
            case 1 -> {
                try {screenclean s=new screenclean();
                    s.clearScreen();
                    f1.findsymptom();
                } catch (Exception ignored) {
                }
            }
            case 2 -> {
                try {screenclean s=new screenclean();
                    s.clearScreen();
                    f1.findDisease();
                } catch (Exception ignored) {
                }
            }
            default -> {
                System.out.println("invalid choice\n try again");
                System.out.println("=============================================================");
                System.out.println("press 1 to continue");
                Z.nextInt();
                try{ z.clearScreen();}catch(Exception e){e.getMessage();}
                menu();
            }
        }
        Z.close();
    }
}