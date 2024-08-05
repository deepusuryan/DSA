package DSA_Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class BasicMaths{
    public static int countDigit(long n){
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
    public static long reverseNum(long n){
        long revNum=0;
        while(n>0){
            long lastD=n % 10;
            revNum=(revNum*10)+lastD;
            n=n/10;
        }
        return revNum;
    }
    public static boolean checkPalindrome(long n){
        long duplicate=n;
        long revNum=0;
        while(n>0){
            long lastD=n % 10;
            revNum=(revNum*10)+lastD;
            n=n/10;
        }
        if(revNum==duplicate){
            System.out.println("This is an palindrome");
            return true;
        }
        else{
            System.out.println("This is not an palindrome");
            return false;
        }
    }
    public static boolean CheckArmstrongNum(long n){
        long duplicate=n;
        long sum=0;
        while(n>0){
            long lastD=n % 10;
            sum=sum+(lastD*lastD*lastD);
            n=n/10;
        }
        if(sum==duplicate){
            System.out.println("This is an Armstrong Number");
            return true;
        }
        else{
            System.out.println("This is not an Armstrong number");
            return false;
        }
    }
    public static void printDivisors(Byte n){
        System.out.println("Factors of number is");
        TreeSet<Byte> list=new TreeSet<>();
        for(Byte i=1; i<=n; i++){
            if(n%i ==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static boolean CheckPrime(Byte n){
        Byte counter=0;
        for(Byte i=1; i<=n; i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static int findHCF(int n, int m){
        int gcd=1;
        for(int i=1; i<=Math.min(n , m); i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter digit");
        long N=sc.nextLong();
        System.out.println("Count Digit is :"+countDigit(N));
        System.out.println("Reverse of a number is :"+reverseNum(N));
        checkPalindrome(N);
        CheckArmstrongNum(N);
        System.out.println("Enter the number");
        Byte num= sc.nextByte();
        printDivisors(num);
        boolean isPrime=CheckPrime(num);
        if(isPrime){
            System.out.println(num+" This ia a prime number");
        }
        else{
            System.out.println(num+" This is not a prime number");
        } */
        System.out.println("For HCF enter two numbers");
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println(findHCF(n,m));
    }
}