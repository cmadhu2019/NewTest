import java.util.ArrayList;

class file {
    public static void main(String args[]) {
        String st = "abcd122xwer3";
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> sentence = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < st.length()) {
            i = j;
            while (i < st.length() - 1 && Character.isDigit(st.charAt(i)) == Character.isDigit(st.charAt(i + 1))) {
                i = i + 1;
            }
            if (Character.isDigit(st.charAt(j))) {
                number.add(st.substring(j, i + 1));
            } else {
                sentence.add(st.substring(j, i + 1));
            }
            j = i + 1;
        }
        System.out.println(sentence);
        System.out.println(number);
        
    
    }
}
