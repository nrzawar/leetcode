class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        int num = 0;
        while(n!=1 && !map.contains(num))
            {   
                map.add(n);
                num = 0;
                while(n>0){
                int d = n%10;
                num = num + (d*d);
                n = n/10;
                }
                System.out.println("num :" +num);
                
                n = num;
                
            }

        return (n == 1);
        
        
    }
}