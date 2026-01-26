class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
           
            for(int i = 1 ; i < n ;i++)
            {
                mini = Math.min(mini, arr[i] - arr[i-1]);
                
            }
             List<List<Integer>> ab = new ArrayList<>();
               for(int i = 1 ; i < n ;i++)
               {
                if((arr[i] - arr[i-1]) == mini){
                ab.add(Arrays.asList(arr[i-1],arr[i]));
               }}
            return ab;
    }
}