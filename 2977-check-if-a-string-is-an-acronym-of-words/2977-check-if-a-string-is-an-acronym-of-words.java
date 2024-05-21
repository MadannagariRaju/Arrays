class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        for(int i=0;i<words.size();i++) {
            String str=words.get(i);
            res=res+str.charAt(0);
        }
        if(res.equals(s)) return true;

        return false;
    }
}