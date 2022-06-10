/*2 pointer approach*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0,h=numbers.length-1;
        while(l<h)
        {
            if(numbers[l]+numbers[h]>target)
            {
                h--;
                
            }
            else if(numbers[l]+numbers[h]<target)
            {
                l++;
            }
            else if(numbers[l]+numbers[h]==target)
            {
                return new int[]{l+1, h+1};
            }
        }
        return null;
        
    }
}
/*Binary Search
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l,h=numbers.length-1;
        for(int i=0;i<numbers.length;i++)
        {
            
            l=i+1;
        while(l<=h)
        {   int  mid= (h-l)/2+l;
            if(numbers[i]+numbers[mid]>target)
            {
                h=mid-1;
                
            }
            else if(numbers[i]+numbers[mid]<target)
            {
                l=mid+1;
            }
            else if(numbers[i]+numbers[mid]==target)
            {
                return new int[]{i+1, mid+1};
            }
        }
        }
        return null;
        
    }
}
*/
