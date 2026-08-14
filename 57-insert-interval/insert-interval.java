class Solution {
    public int[][] merge(ArrayList<int[]> temp){
        int start1 = temp.get(0)[0];
        int end1 = temp.get(0)[1];
        ArrayList<int[]> result = new ArrayList<>();
        for(int i=1;i<temp.size();i++){
            int start2 = temp.get(i)[0];
            int end2 = temp.get(i)[1];
            if(end1>=start2){
                start1 = start1;
                end1 = Math.max(end1,end2);
                continue;
            }else{
                result.add(new int[]{start1,end1});
                start1 = start2;
                end1 = end2;
            }
        }
        result.add(new int[]{start1,end1});
        return result.toArray(new int[result.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
       boolean insert = false;
       ArrayList<int[]>temp = new ArrayList<>(intervals.length+1);

       for(int i=0;i<intervals.length;i++){
        if(insert==false && intervals[i][0]>newInterval[0]){
            temp.add(newInterval);
            insert=true;
        }
        temp.add(intervals[i]);
       }
       if(insert==false){
        temp.add(newInterval);
       }

       return merge(temp);
    }
}