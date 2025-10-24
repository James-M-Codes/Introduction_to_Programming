
/**
 * This Model class defines how the calculator reads and outputs inputted data.
 *
 * @author (James Maile)
 * @version (1.03)
 */
public class Model
{
    View view;
    Controller controller;
    Calculator calculator = null;
    
    public Model(Calculator c){
        calculator = c;    
    }
    public void doAdd(){
        String resultStr = null;
        try{
            int num1 = Integer.parseInt(view.textNum1.getText());
            int num2 = Integer.parseInt(view.textNum2.getText());
            int result = calculator.add(num1,num2);
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "+";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
    }
    public void doSub(){
        String resultStr = null;
        try{
            int num1 = Integer.parseInt(view.textNum1.getText());
            int num2 = Integer.parseInt(view.textNum2.getText());
            //Pulled subtraction method from calculator
            int result = calculator.sub(num1,num2);
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "-";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
        
        
        }
    public void doPow(){
        String resultStr = null;
        try{
            int num1 = Integer.parseInt(view.textNum1.getText());
            int num2 = Integer.parseInt(view.textNum2.getText());
            //Pulled power method from calculator
            int result = calculator.pow(num1,num2);
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "^";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
        
        
        }
    public void doPer(){
        String resultStr = null;
        try{
            double num1 = Double.parseDouble(view.textNum1.getText());
            double num2 = Double.parseDouble(view.textNum2.getText());
            //Pulled percentage method from calculator
            double result = calculator.per(num1, num2); 
            
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "%";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
        
        
        }
    public void doMul(){
        String resultStr = null;
        try{
            int num1 = Integer.parseInt(view.textNum1.getText());
            int num2 = Integer.parseInt(view.textNum2.getText());
            //pulled muliplication method from Calculator class
            int result = calculator.mul(num1,num2);
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "*";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
        
        
        }
    public void doDiv(){
        String resultStr = null;
        try{
            int num1 = Integer.parseInt(view.textNum1.getText());
            int num2 = Integer.parseInt(view.textNum2.getText());
            //pulled dividing method from Calculator class
            int result = calculator.div(num1,num2);
            resultStr = result + "";
        }
        catch(Exception e){
            resultStr = "Whole numbers please :)";
            view.update("","", resultStr);
        }
        String operatorIcon = "/";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
        
        
        }
    public void doSqrt() {
        String resultStr = null;
        try {
           double num = Double.parseDouble(view.textNum1.getText());
           //Pulled Sqrt method from calculator class
           double result = calculator.sqrt(num); 
           resultStr = String.valueOf(result);
        } catch (NumberFormatException e) {
          resultStr = "Please Input a Number :)";
        } catch (IllegalArgumentException e) {
          resultStr = e.getMessage();
        }
        String operatorIcon = "√";
        String equation = "= ";
        view.update(operatorIcon, equation, resultStr);
    }
        }

        
        
        
    
    
    

