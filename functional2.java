import java.util.*;

public class functional2 {

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(i -> i < 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(i -> i % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(i -> i >= 13 && i <= 19);
        return nums;
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(i -> i.contains("z"));
        return strings;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(i -> i.length() >= 4);
        return strings;
    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(i -> i.length() == 3 || i.length() == 4);
        return strings;
    }

    public List<String> noYY(List<String> strings) {
        strings.replaceAll(i -> i + "y");
        strings.removeIf(i -> i.contains("yy"));
        return strings;
    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(i -> i * i + 10);
        nums.removeIf(i -> i % 10 == 5 || i % 10 == 6);
        return nums;
    }

}
