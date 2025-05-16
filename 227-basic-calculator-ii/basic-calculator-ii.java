class Solution 
{
    Stack<Integer> stack ;
    int num;
    public int calculate(String s) 
    {
        stack = new Stack<>();
        num = 0;
        char op ='+';
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if('0' <= ch && ch <= '9')
            {
                num = (num * 10)+ch - '0';
            }
            else if(ch == '+')
            {
                operate(op);
                op = ch;
            }
            else if(ch == '-')
            {
                operate(op);
                op = ch;
            }
            else if(ch == '*')
            {
                operate(op);
                op = ch;
            }
            else if(ch == '/')
            {
                operate(op);
                op = ch;
            }
        }    
        operate(op);
        int sum =0;
        for(int i : stack)
            sum += i;
        return sum;
    }
    public void operate(char ch)
    {
        if(ch == '+')
        {
            stack.push(num);
            num = 0;
        }
        else if(ch == '-')
        {
            stack.push(num * (-1));
            num = 0;
        }
        else if(ch == '*')
        {
            int n2 = stack.pop();
            stack.push(num * n2);
            num =0;
        }
        else
        {
            int n2 = stack.pop();
            stack.push(n2 / num);
            num =0;
        }
    }
}