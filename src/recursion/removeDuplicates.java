package recursion;

public class removeDuplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

        // base
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // work(Logic)
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']){
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "aaappnaacollleggee";
        removeDuplicates(str, 0,  new StringBuilder(""),new boolean[26]);
    }
}
