public:
    string smallestNumber(int s, int d){
         //if we have put 9 at all places and still it is 
        //smaller than s than return -1 
        if((9*d)<s) return "-1";
        //ye hum return karenge
        string ans="";
        //pecha sa fill kar rahe hai is liye i=d-1
        for(int i=d-1;i>=0;i--)
        {
            //if sum >9 hai tau us place pa 9 fill kar do
            //sum ma sa 9 minus kardo
            if(s>9)
            {
                ans='9'+ans;
                s -=9;
            }
            else
            {
                //agar space kahtm ho gya or pointer 
                //first place pa poch gya tau sedha 
                //us value ko dal do answer ma
                if(i==0)
                {
                    ans=to_string(s)+ans;
                }
                else
                {
                    //and ma agar 8 bacha hai tau 7 ko 
                    //fill kar do phela 
                    ans=to_string(s-1)+ans;
                    i--;
                    //fir jab tak place pa 0 bharata jo jab
                    //tak 1st position pa na aa jao
                    while(i>0){
                        ans='0'+ans;
                        i--;
                }
                //or and mai first position pa 1 daal do 
                //bacha huva
                ans='1'+ans;
                break;
            }
        }
        }
    return ans;
    }
