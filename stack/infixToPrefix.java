import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; //infix expression
        Stack<String> val = new  Stack<>();
        Stack<Character> op = new  Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String s = "";
                s += ch;
                val.push(s);
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(str.charAt(i));
            else if(ch == ')'){
                while(op.peek() != '('){
                    //work
                    String val2 = val.pop();
                    String val1 = val.pop();
                    String o = "";
                    o = o + op.peek() + val1 + val2;
                    val.push(o);
                    op.pop();
                }
                op.pop(); // '(' hata diya
            }
            else{ // soch samaj ke dalenge(precidence)
                if(ch == '+' || ch == '-'){
                    //work
                    String val2 = val.pop();
                    String val1 = val.pop();
                    String o = "";
                    o = o + op.peek() + val1 + val2;
                    val.push(o);
                    op.pop();
                    //push
                    op.push(ch);
                }
                else{
                    if(op.peek() == '+' || op.peek() == '-'){
                        op.push(ch);
                    }
                    else{
                        //work
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String o = "";
                        o = o + op.peek() + val1 + val2;
                        val.push(o);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size() != 1){
            String val2 = val.pop();
            String val1 = val.pop();
            String o = "";
            o = o + op.peek() + val1 + val2;
            val.push(o);
            op.pop();
        }

        System.out.println(val.peek());
    }
}
