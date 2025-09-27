//https://practice.geeksforgeeks.org/problems/counts-zeros-xor-pairs0349/1

class Complete{
    
   
    // Function for finding maximum and value pair
    public static long calculate (int arr[], int n) {
        //Complete the function
                HashMap<Integer, Long> freq = new HashMap<>();
        long count=0;
        for(int val:arr){
        
            count += freq.getOrDefault(val, 0l);
            freq.put(val, freq.getOrDefault(val, 0l) + 1l);
        }
        
        return count;
    }
    
    
}
