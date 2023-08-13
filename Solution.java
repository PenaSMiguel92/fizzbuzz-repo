import java.util.*;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new LinkedList<>();
        for (int index = 1; index <= n; index++) {
            if (index % 3 == 0 || index % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (index % 3 == 0) {
                answer.add("Fizz");
            } else if (index % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(index));
            }
        }
        return answer;
    }
}
