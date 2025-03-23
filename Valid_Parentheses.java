//time O(n) // space O(n)
import java.util.Stack;
public class Valid_Parentheses{
 static boolean isBalanced(String s){
     Stack<Character> st=new Stack<>();
     for(int i=0;i<s.length();i++){
         //check if the character is open bracket
         if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
             st.push(s.charAt(i));
         }else{//check the matches
             
             if(!st.empty()&&((st.peek()=='('&&s.charAt(i)==')')||
            ((st.peek()=='{'&&s.charAt(i)=='}')||((st.peek()=='['&&s.charAt(i)==']'))))){
              st.pop();  
            } else{
                return false;
            }
         }
     }//return empty
     return st.empty();
 }  public static void main(String[] args) {
        String s = "{([])}";
        if (isBalanced(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
 
}