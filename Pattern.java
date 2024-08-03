package DSA_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prac_Pattern{
    public void square(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void hollow_square(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(i==0 || j==0 || i==n-1 || j==n-1){
                   System.out.print(" *");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    public void rectangle(int n){
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void triangle(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle2(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void diamond(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("* ");
            }
            for(int j=1; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class Pattern{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size for the Pattern");
        int n=Integer.parseInt(br.readLine());
        Prac_Pattern pp=new Prac_Pattern();
        //pp.square(n);
        //pp.hollow_square(n);
        //pp.rectangle(n);
        //pp.triangle(n);
        //pp.triangle2(n);
        //pp.diamond(n);
        pp.pyramid(n);

    }
}
