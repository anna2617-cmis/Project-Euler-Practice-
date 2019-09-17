
import java.util.ArrayList; 
public class primeFactor
{
    public static void main(String args[]){
        System.out.println(primeFactor(prime(600851475143L), 600851475143L)); 
    }

    public static ArrayList prime(long n){
        ArrayList<Integer> primeN = new ArrayList(); 
        primeN.add(2);
        for(int a = 3; a < n; a ++){
            boolean isPrime = true; 
            for (int b = 0; b < primeN.size(); b ++){
                if (a % primeN.get(b) == 0){
                    isPrime = false; 
                    b = primeN.size(); 
                }
            }
            if (isPrime){
                primeN.add(a); 
            }
        }
        return primeN; 
    }

    public static int primeFactor(ArrayList primeN, long n){
        ArrayList<Integer> primeF = new ArrayList(); 

        for(int b = 0; b < primeN.size(); b++){
            if (n % (int)primeN.get(b) == 0){
                n = n / (int)primeN.get(b); 
                primeF.add((int)primeN.get(b)); 
            }
        }

        return primeF.get(primeF.size()-1); 
    }
}
