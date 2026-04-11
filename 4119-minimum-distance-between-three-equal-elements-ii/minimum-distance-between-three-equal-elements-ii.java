class Solution {
    public int minimumDistance(int[] nums) {
        int middy[] = nums;
        Map<Integer,List<Integer>> mapz = new HashMap<>();
        int as = Integer.MAX_VALUE;
        for(int i = 0 ; i < middy.length; i++)
            {
                mapz.computeIfAbsent(middy[i], k-> new ArrayList<>()).add(i);
            }
        for(List<Integer> indi : mapz.values())
            {
                if(indi.size() >=3 ) {
                    for(int i = 0 ; i + 2 < indi.size(); i++){
                        int diss = 2 * (indi.get(i+2)-indi.get(i));
                        as = Math.min(as,diss);
                }}}
        return as == Integer.MAX_VALUE ? -1 : as;
        
    }
}