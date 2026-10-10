class Solution {
    public void reverseString(char[] s) {
        char x;
        int b=s.length-1;
        for(int i=0; i<b; i++){
            x = s[i];
            s[i]=s[b];
            s[b]=x;
            b--;
        }
    }
}