class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] chararrs = s.toCharArray();
        char[] chararrt = t.toCharArray();

        Arrays.sort(chararrs);
        String se = Arrays.toString(chararrs);

        Arrays.sort(chararrt);
        String st = Arrays.toString(chararrt);
        
        return se.equals(st);
        
    }
}