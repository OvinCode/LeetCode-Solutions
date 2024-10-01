class Solution {
    public boolean rotateString(String s, String goal) {

        char[] sarr = s.toCharArray();
        char[] res = new char[sarr.length];
        char[] go = goal.toCharArray();

        if (s.equals(goal)){

            return true;
        }

        int idx = 1;
        while (idx < sarr.length){
            for (int i = 0 ; i < goal.length() ; i ++){
                res[i] =  sarr[(i + idx) % sarr.length];
            }
            
            System.out.println(Arrays.toString(res));
            System.out.println(Arrays.toString(go));
            if (Arrays.toString(res).equals(Arrays.toString(go))){

                return true;
            }

            idx ++ ;
        }

        return false;
        

    }
}