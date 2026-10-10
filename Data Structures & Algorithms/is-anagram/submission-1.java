class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char[] d = t.toCharArray();
        Arrays.sort(d);
        String a = new String(c);
        String b = new String(d);
        boolean isEqual = a.equals(b);
        return isEqual;

    }
}
