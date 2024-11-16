class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(smap.containsKey(sc)){
                smap.put(sc, smap.get(sc)+1);
            }
            else{
                smap.put(sc,1);
            }
            if(tmap.containsKey(tc)){
                tmap.put(tc, tmap.get(tc)+1);
            }
            else{
                tmap.put(tc,1);
            }
    }
    if(smap.equals(tmap)){
        return true;
    }
    else{
        return false;
    }
    }
}