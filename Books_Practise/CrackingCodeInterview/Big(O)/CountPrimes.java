public class CountPrimes {
    public static int countPrimes(int n) {
        boolean [] primes=new boolean[n];

        for (int i = 2;i*i < primes.length; i++) {
            if(!primes[i]){
                for (int j = i; j *i< primes.length; j++) {
                    primes[i*j]=true;
                }
            }
        }
        int count=0;
        for (int i = 2; i < primes.length; i++) {
            if(!primes[i]){
                count++;

            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
