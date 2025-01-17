import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
           if ((!stack.empty()) && (stack.peek().equals(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        if (stack.empty()) {
            answer = 1;
        }

        return answer;
    }
}