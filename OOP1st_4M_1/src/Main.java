import pk.edu.iub.Students.Players;
import pk.edu.iub.Students.Students;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean status = true;


        Students stu = new Students();
        /*stu.stuName="Gulraiz";
        stu.stuRollNumber=49;

        System.out.println(stu.stuName);
        System.out.println(stu.stuRollNumber);*/
int i=1;
        while(status) {
            Players p = new Players();

            System.out.println("Player Object Created.");
            Scanner sc  =new Scanner(System.in);
            System.out.println("Player Details ");

            System.out.println("Enter the name of the player: ");
            p.pName=sc.nextLine();
            System.out.println("Name: " + p.pName);
            System.out.println("Gender: " + p.pGender);
            System.out.println("Primary Cloths: " + p.pPrimaryCloths);
            System.out.println("Secondary Cloths: " + p.pSecondaryCloths);
            System.out.println("Primary Weapon: " + p.pPrimaryWeapon);
            System.out.println("Secondary Weapon: " + p.pSecondaryWeapon);

        if(i==2){
            status=false;
        }else{
            i=i+1;
        }
        }
/*

        Players p2 = new Players();

        System.out.println("Player Details ");
        System.out.println("Name: "+p2.pName);
        System.out.println("Name: "+p2.pGender);
        System.out.println("Name: "+p2.pPrimaryCloths);
        System.out.println("Name: "+p2.pSecondaryCloths);
        System.out.println("Name: "+p2.pPrimaryWeapon);
        System.out.println("Name: "+p2.pSecondaryWeapon);
*/




    }
}