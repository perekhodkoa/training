package training.com;

/**
 * Created by sentinel on 6/20/17.
 */
public class RepeatingCharacters {

    public String replaceRepeating(String a){
        int[] chars = new int[26];
        StringBuilder s = new StringBuilder();

        for (int i=0; i<a.length();i++){

            int charIdx = a.charAt(i)-'a';
            if (chars[charIdx]== 0)
                chars[charIdx] = a.charAt(i);
            else
                chars[charIdx]=(chars[charIdx]-'a'+1)%26+'a';

            s.append((char)chars[charIdx]);


        }

        return s.toString();
    }

    public static void main(String[] args) {

        RepeatingCharacters r = new RepeatingCharacters();
        System.out.print(r.replaceRepeating("abbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
