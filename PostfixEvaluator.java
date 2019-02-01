package com.company;
import java.util.Scanner;
import java.util.Stack;
public class PostfixEvaluator {
    private final static char ADD='+';
    private final static char SUBTRACT ='-';
    private final static char MULTIPLY='*';
    private final static char Divide='/';
    private Stack<Integer> stack;

    public PostfixEvaluator()
    {
        stack=new Stack<Integer>();
    }

    public int evaluate(String expr)
    {

        int op1,op2,result=0;
        String token;
        Scanner parser=new Scanner(expr);

        while (parser.hasNext())      //need study
        {

            token=parser.next();
            if(isOperator(token))
            {
                op2=(stack.pop().intValue());
                op1=(stack.pop().intValue());
                result=evaluateSingleopertor(token.charAt(0),op1,op2);
                stack.push(new Integer(result));

            }
            else
                stack.push(new Integer(Integer.parseInt(token)));
        }
        return result;
    }

private boolean isOperator(String token)
{
    return (token.equals("+")||token.equals("-")||
            token.equals("*")||token.equals("/"));

}

private int evaluateSingleopertor(char operation, int op1,int op2)
{
    int result=0;
    switch(operation)
    {
        case ADD:
            result=op1+op2;
            break;
        case SUBTRACT:
            result=op1-op2;
            break;
        case MULTIPLY:
            result=op1*op2;
            break;
        case Divide:
            result=op1/op2;
            break;
    }
    return result;
}

}
