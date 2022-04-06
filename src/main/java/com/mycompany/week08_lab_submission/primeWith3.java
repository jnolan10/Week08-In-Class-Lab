package com.mycompany.week08_lab_submission;

public class primeWith3 {
    
    public static void main(String[] args) {
        System.out.println(sumPrime(1000));
    }
    
    public static int sumPrime(int n)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if((isPrime(i) && hasDigit3(i)) == true)
                sum +=i;
        }
        
        return sum;
    }
    
    public static boolean isPrime(int x){
        for(int i = 2; i < x ; i++)
        {
            if((x % i) == 0)
                return false;
        }
        return true;
    }
    
    public static boolean hasDigit3(int x){
        String str = ""+x;
        
        return str.contains("3");
    }
}
