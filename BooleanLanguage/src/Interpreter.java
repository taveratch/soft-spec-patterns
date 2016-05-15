/**
 * Created by TAWEESOFT on 5/5/16 AD.
 */
public class Interpreter {

    public boolean interpret(String s){
        String[] tokens = s.split("\\s+");
        int index = 0;
        Expression lastExpr = null;
        while(index < tokens.length) {
            String token = tokens[index];
            if(token.equalsIgnoreCase("EQ")){
                String nextToken = "";
                for(int i = index + 1 ; i<tokens.length;i++)
                    nextToken += tokens[i]+" ";
                boolean result =interpret(nextToken);
                Expression wholeResult = new ValueExpression(result+"");
                lastExpr = new EqualExpression(lastExpr , wholeResult);
                index = tokens.length;
            }else if(token.equalsIgnoreCase("AND")) {
                String nextToken = tokens[index + 1];
                Expression rightExpr = new ValueExpression(nextToken);
                lastExpr = new AndExpression(lastExpr , rightExpr);
                index += 2;
            }else if(token.equalsIgnoreCase("OR")) {
                String nextToken = tokens[index + 1];
                Expression rightExpr = new ValueExpression(nextToken);
                lastExpr = new OrExpression(lastExpr , rightExpr);
                index += 2;
            }else{
                lastExpr = new ValueExpression(token);
                index++;
            }
        }
        System.out.println(lastExpr);
        return lastExpr.interpret();
    }

    public static void main(String [] ar ){
        Interpreter i = new Interpreter();
        boolean result = i.interpret("true EQ false AND false OR false");
        System.out.println(result);
    }
}
