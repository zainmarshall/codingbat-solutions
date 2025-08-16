
public class warmup2 {

    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + str;
        }
        return s;
    }

    public String frontTimes(String str, int n) {
        String three = "";
        if (str.length() < 3) {
            three = str;
        } else {
            three = str.substring(0, 3);
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + three;
        }
        return s;
    }

}
