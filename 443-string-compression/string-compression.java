class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
         while( readIndex < chars.length)
         {
            char currentstr = chars[readIndex];
            int count = 0;
            while( readIndex < chars.length && chars[readIndex] == currentstr)
            {
               
                readIndex++;
                 count++;
            }
            chars[writeIndex++] = currentstr;
            if(count > 1)
            {
                String countstr = String.valueOf(count);
                for(int i = 0 ;i < countstr.length(); i++ )
                {
                    chars[writeIndex++] = countstr.charAt(i);
                }
            }}
return writeIndex;
         }
        
    
}