import java.util.Scanner;

public class Main {
    public static long modulo(long num,long mod){
        if(num>0){
            return (num+mod)%mod;
        }
        while(num<=0){
            num+=mod;
        }
        num+=mod;
        return num%mod;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p=13;
        int n=10;
        int k=3;

        try {
            System.out.print("Enter prime number: ");
            p = Math.abs(scanner.nextInt());
            if(p<=2){
                System.out.println("Warning: prime number must be more than 2. Changed to 3");
                p=3;
            }
            do {
                System.out.print("Enter square number: ");
                n = Math.abs(scanner.nextInt());
                //if Legendre!=1 - algo cannot be used. program must be terminated (or reroll?)
                System.out.println("Legendre must equals 1. Checking... Legendre symbol is "+Cipolla.legendreSymbol(n,p));
            }while(Cipolla.legendreSymbol(n,p)!=1);
            System.out.print("Enter amount of repeats: ");
            k = Math.abs(scanner.nextInt());
            if(k==0){
                System.out.println("Warning: prime number must be more than 0. Changed to 1");
                k=1;
            }
        }catch (Exception e){
            System.out.println("Error! "+e);
        }

        System.out.println("\nPrime number: "+p+"\nSquare: "+n+"\nRepeats: "+k);
        System.out.println("\nInput: X^2 ≡ "+n+" (mod "+p+")");

        Cipolla.algorithm(n,p,k);

    }
}