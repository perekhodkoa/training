package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class ExcelConvertor {

    public String convertToName(int x){

        int rest = x;
        String name = "";
        while (rest>0) {
            int modulo = (rest - 1) %26;
            name = (char)(65+modulo)+name;
            rest = (rest - modulo)/26;
        }

        return name;
    }

    public int convertToIdx(String name){

        int idx = 0;
        int multiplier = 1;

        for (int i =name.length()-1;i>=0;i--){
            idx += (name.charAt(i)-'A'+1)*multiplier;
            multiplier *= 26;

        }
        return idx;
    }

    public static void main(String[] args){

        ExcelConvertor ec = new ExcelConvertor();
        System.out.println(ec.convertToName(3600));
        System.out.println(ec.convertToIdx("BB"));
    }
}
