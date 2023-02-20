class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(int i= 0; i<x.length(); i++) {
            
            char a = x.charAt(i);
            if(stack.isEmpty() == false) {
               
                if(a == '}' && stack.peek() == '{')
                    stack.pop();
                    
                else if(a == ')' && stack.peek() == '(')
                    stack.pop();
                    
                else if (a == ']' && stack.peek() == '[')
                    stack.pop();
                    
                else
                    stack.add(a);
            }
            else {
                stack.add(a);
            }
            
        }
        if(stack.isEmpty())
            return true;
        else
            return false; 
    }
}