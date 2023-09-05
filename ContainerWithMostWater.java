//medium LT
public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        return 0;
        
    }

    

    /**
     * @param args
     */
    public static void main(String[] args){
        // sliding window

        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;
        int left = 0;
        int right = arr.length-1;

       while( right > left){
        int currentArea = (right - left ) * (arr[left] > arr[right] ? arr[right]: arr[left] );
        if (currentArea  > maxWater){
            maxWater = currentArea;
        }

        if(arr[left] >= arr[right]){
            right--;
        }
        else{
            left++;
        }


       }
       System.out.println(maxWater);



    }
}