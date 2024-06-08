class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        // this question is nothing but Activity Selection
        //learned from apna college dsa course 
        //learn more about .y what is this and overall program
        
       // Step 1: Sorting the Array Based on 2nd Number
        Arrays.sort(arr, Comparator.comparingInt(a -> a.y));

        //Step 2 Calculating the total length of chain initlailiy it is 1.
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
