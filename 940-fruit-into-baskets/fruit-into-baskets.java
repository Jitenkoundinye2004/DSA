class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0, res = Integer.MIN_VALUE;
        HashMap<Integer,Integer> f = new HashMap<>();

        for(int high = 0; high<n;high++){
            f.put(fruits[high],f.getOrDefault(fruits[high],0)+1);
            while(f.size()>2){
                f.put(fruits[low],f.getOrDefault(fruits[low],0)-1);
                if(f.get(fruits[low])==0){
                    f.remove(fruits[low]);
                }
                low++;
            }
            int len= high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}