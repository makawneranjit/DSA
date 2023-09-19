class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String str : operations) {
            if(str.equals("C"))
                stack.pop();

            else if(str.equals("D")) {
                int num = stack.peek();
                num = num * 2; 
                stack.add(num); 
            }

            else if(str.equals("+")) {
                int num1 = stack.pop();
                int sum  = num1+ stack.peek(); 
                stack.add(num1);
                stack.add(sum);
            }

            //add to stack if character is digit
            else {
                int num = Integer.parseInt(str);
                stack.add(num); 
            }
        }

        int ans = 0; 
        while(!stack.isEmpty()) {
            ans += stack.pop(); 
        }


        return ans; 
    }
}
