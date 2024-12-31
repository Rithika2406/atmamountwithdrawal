import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner S = new Scanner(System.in);

        int x = S.nextInt(); 
        double y = S.nextDouble(); 

        if (x % 5 == 0 && x + 0.50 <= y) {
            double z = y - x - 0.50;
            System.out.printf("%.2f%n", z); 
        } else {
            System.out.printf("%.2f%n", y); 
        }
    }
}
