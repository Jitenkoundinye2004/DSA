class Solution {
    public int maximumSum(int[] arr) {
        int i = 0;
        int noDelete = arr[i];
        int oneDelete = Integer.MIN_VALUE;
        int result = arr[i];
        int n = arr.length;
        for(i =1; i<n;i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(arr[i], prevNoDelete+arr[i]);
            int v2 = 0;
            if(prevOneDelete==Integer.MIN_VALUE){
                v2 = arr[i];
            }else{
                v2 = prevOneDelete+arr[i];
            }

            oneDelete = Math.max(v2,prevNoDelete);

            result =Math.max(result, Math.max(noDelete,oneDelete));
        }
        return result;
    }
}