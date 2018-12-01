/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author 10487
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the first degree of angle");
    int a1 = scan.nextInt();
    System.out.println("Please enter the second degree of angle");
    int a2 = scan.nextInt();
    System.out.println("Please enter the third degree of angle");
    int a3 = scan.nextInt();
    int total = a1+a2+a3;
    if(total!=180){
        System.out.println("It is not a triangle");
    }      
    if(total==180&&a1==a2||total==180&&a1==a3||total==180&&a2==a3){
        System.out.println("It is a triangle");
        System.out.println("It is a isoscles triangle");
    }
    if(a1!=a2&&a2!=a3&&a1!=a3&&total==180){
        System.out.println("It is a triangle");
    }
    }
}
    

