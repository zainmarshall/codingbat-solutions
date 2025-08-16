

public class warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public int sumDouble(int a, int b) {
        return a == b ? 2 * (a + b) : a + b;
    }

    public int diff21(int n) {
        return n <= 21 ? Math.abs(21 - n) : 2 * Math.abs(21 - n);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            return hour < 7 || hour > 20;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return a < 0 ^ b < 0;
    }
}
