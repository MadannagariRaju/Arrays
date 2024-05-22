class Solution {
    public int lengthOfLastWord(String s) {
        // String str[]=s.split(" ");
        // return str[str.length-1].length();

        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') {
                return count;
            }
            count++;
        }
        return count;
    }
}