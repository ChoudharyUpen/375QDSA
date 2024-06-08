class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // this question is nothing but Activity Selection
       
     // Step 1: Sorting the Array Based on 2nd Number
        Arrays.sort(arr, Comparator.comparingInt(a -> a.y));

        int chainLen = 1;
        int chainEnd = arr[0].y; // Last Selected pair end //chain end

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].x > chainEnd) {
                chainLen++;
                chainEnd = arr[i].y;
            }
        }
        return chainLen;
    }
    
    }
