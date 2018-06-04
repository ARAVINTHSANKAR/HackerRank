import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.out;

public class CalculateMaximumTips {

    public int calculateMaxTips() {
        int reservation = [];
        reservation = getReservation();
    }
    
    public int getReservation() {
        int returnArr = [];
        boolean isOk;
        Scanner sc;
        int totalReservation, aCount, bCount;
        sc = new Scanner(System.in);
        out.println("Enter the total Reservation Count");
        totalReservation = sc.nextInt();
        out.println("Enter the A and B's count");
        aCount = sc.nextInt();
        bCount = sc.nextInt();
        isOk = validateReservation(totalReservation, aCount, bCount);;
        if(isOk) {
            returnArr[0] = totalReservation;
            returnArr[1] = aCount;
            returnArr[2] = bCount;
            return returnArr;
        } else {
            return returnArr[0] = 0;
        }
    }
    
    public boolean validateReservation() {
        
    }
    
    public static void main(String[] args) {
        CalculateMaximumTips calcMaxTips = new CalculateMaximumTips();
        int prgmCount, testCaseCount;
        Scanner scanner;
        scanner = new Scanner(System.in);
        out.println("Enter number of test cases you want to perform");
        testCaseCount = scanner.nextInt();
        prgmCount = 0;
        while(prgmCount != testCaseCount)
        {
            calcMaxTips.calculateMaxTips();
        }
        prgmCount ++;
    }
}