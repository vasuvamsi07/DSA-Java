//Problem - TwoSum
//Pattern  - HashMap
class Solution{
  public int [] twoSum(int a[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i<a.length;i++){
            int complement = target - a[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(a[i],i);
        }
        return new int[]{};
        }
}
