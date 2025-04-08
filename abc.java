 class abc{

    public static String check(int seq[]){
        int n = seq.length  ;
        int diffStore [] = new int [n] ; 
        for(int i = 1 ; i<n ; i++){
            int diff  = Math.abs(seq[i] - seq[i-1]) ; 
            if ( diff >= n) return "Not Jolly";
            diffStore[diff] = 1 ; 
        }


        for (int i = 1 ; i< n ; i++){
            if (diffStore[i]==0) return "Not Jolly " ; 
        }
        return "Jolly" ; 
    }
 public static void main(String[] args) {
    int seq[] = {10, 9, 7, 6};
    System.out.println(check(seq));
 }
}