
import java.util.*;

public class functional1 {

    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(i -> i * 2);
        return nums;
    }

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(i -> i * i);
        return nums;
    }

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(i -> i + '*');
        return strings;
    }

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(i -> i + i + i);
        return strings;
    }

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(i -> 'y' + i + 'y');
        return strings;
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(i -> 10 * (i + 1));
        return nums;
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(i -> i % 10);
        return nums;
    }

    public List<String> lower(List<String> strings) {
        strings.replaceAll(i -> i.toLowerCase());
        return strings;
    }

    public List<String> noX(List<String> strings) {
        strings.replaceAll(i -> i.replace("x", ""));
        return strings;
    }

}
