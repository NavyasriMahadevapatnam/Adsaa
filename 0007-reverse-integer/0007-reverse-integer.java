class Solution {
    public int reverse(int x) {
        int rev=0;
        int org=x;
        if(x<0){
            x=x*-1;
        }
        while(x>0){
            int a=x%10;
             if((rev>Integer.MAX_VALUE/10) || (rev==Integer.MAX_VALUE/10) &&  x>7){
            return 0;
        }if((rev<Integer.MIN_VALUE/10) || (rev==Integer.MIN_VALUE/10) && x<-7){
            return 0;
        }
            rev=rev*10+a;
            x=x/10;
        }if(org<0){
            return -rev;
        }
       
       
        return rev;
    }
}