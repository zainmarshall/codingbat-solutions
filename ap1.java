import java.util.*;
public class ap1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        if (scores.length == 2) {
            return scores[0] > scores[1] ? scores[0] : scores[1];
        }
        return average(scores, 0, scores.length / 2) > average(scores, scores.length / 2, scores.length - 1) ? average(scores, 0, scores.length / 2) : average(scores, scores.length / 2, scores.length - 1);
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int total = 0;
        for (String s : words) {
            if (s.length() == len) {
                total++;
            }
        }
        return total;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = words[i];
        }
        return arr;
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        for (int i = 0; i <= String.valueOf(n).length(); i++) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int m = n;

        for (int i = 0; i < String.valueOf(m).length(); i++) {
            if (n % 10 == 0) {
                return false;
            }

            if (m % (n % 10) != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
            if (index == count) {
                return arr;
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
                arr[index] = nums[i];
                index++;
            }
            if (index == count) {
                return arr;
            }
        }
        return arr;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0
                    && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i] == answers[i]) {
                score += 4;
            } else if (answers[i] != "?") {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int size = 0;
        for (String word : words) {
            if (word != target) {
                size++;
            }
        }
        String[] newWords = new String[size];
        int pos = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                newWords[pos] = word;
                pos++;
            }
        }
        return newWords;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] arr) {
        int largest = 0;
        for (int i : arr) {
            if (i % 10 == 0 && i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int x = 0;
        for (int i = start; i < end; i++) {
            x += Math.abs(heights[i + 1] - heights[i]);

        }
        return x;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i + 1]) {
                sum = sum + 2 * (heights[i + 1] - heights[i]); 
            }else {
                sum = sum + heights[i] - heights[i + 1];
            }
        }

        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (bName.compareTo(aName) < 0) {
            return 1;
        } else {
            if (aId < bId) {
                return -1;
            } else if (aId == bId) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] c = new String[n];
        int x = 0;
        int y = 0;
        List<String> cList = new ArrayList<>(Arrays.asList(c));

        for (int i = 0; i < n; i++) {

            if (a[x].compareTo(b[y]) < 0) {
                if (!cList.contains(a[x])) {
                    c[i] = a[x];
                    cList.add(a[x]);
                } else {
                    i--;
                }
                x++;
            } else {
                if (!cList.contains(b[y])) {
                    c[i] = b[y];
                    cList.add(b[y]);
                } else {
                    i--;
                }
                y++;
            }

        }
        return c;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int aIndex = 0;
        int bIndex = 0;

        if (a[0].equals(b[0])) {
            count++;
            aIndex++;
            bIndex++;
        } else if (a[0].compareTo(b[0]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }

        while (aIndex < a.length && bIndex < b.length) {
            if (aIndex > 0 && a[aIndex - 1].equals(a[aIndex])) {
                aIndex++;
            } else if (a[aIndex].equals(b[bIndex])) {
                count++;
                aIndex++;
                bIndex++;
            } else if (a[aIndex].compareTo(b[bIndex]) < 0) {
                aIndex++;
            } else {
                bIndex++;
            }
        }

        return count;
    }
}
