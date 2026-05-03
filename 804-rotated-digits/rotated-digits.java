class Solution {
    public int rotatedDigits(int n) {
        boolean isValid=true, isDiff=false;
        int count=0;
        for(int i=0;i<=n;i++)
        {
            isValid=true; isDiff=false;
            int x=i;
            while(x!=0)
            {
                int s=x%10;
                if(s==3||s==7||s==4)
                {
                    isValid=false;
                    break;
                }
                if(s==2||s==5||s==6||s==9)
                    isDiff=true;
                x/=10;
            }
            if(isValid && isDiff)
                count++;
        }
        return count;
    }
}