class Solution {
    public int romanToInt(String s) {
        
        HashMap <Character , Integer> mymap = new HashMap<>();
        mymap.put('I',1);
        mymap.put('V',5);
        mymap.put('X',10);
        mymap.put('L',50);
        mymap.put('C',100);
        mymap.put('D',500);
        mymap.put('M',1000);

        if (s.length() == 0 ){

            return 0;
        }
        int n = s.length();
        int res = 0 ;
        for (int i = 0 ; i < n  ; i ++ ){

            if (i < s.length() - 1 && mymap.get(s.charAt(i)) < mymap.get(s.charAt(i + 1))) {
                res -= mymap.get(s.charAt(i));
            } else {
                res += mymap.get(s.charAt(i));
            }
        }

        return res;
        

    }
}