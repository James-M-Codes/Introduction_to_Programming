
/**
 * The controller enables the program to do the tasks it's made to preform in this instance
 * it allows the programm recognise buttons like add, subtract, divide, multiply and etc etc.
 *
 * @author (James Maile)
 * @version (1.03)
 */
public class Controller
{
    Model model;
    View view;
    
    public void doCalculating(String action){
        
        switch(action){
            case "+":
                model.doAdd();
                break;
            // add your code to make other buton works ("-","X","÷")
            
            
            //Subtraction added here
            case "-":
                model.doSub();
                break;
                
            //Multiplication added here
            case "*":
                model.doMul();
                break;
            
            //dividing added here
            case "/":
                model.doDiv();
                break;
            
            //percentage added here
            case "%":
                model.doPer();
                break;
            
            //power added here
            case "^":
                model.doPow();
                break;
                
            //square root added here
            case "√":
                model.doSqrt();
                break;
                
            default: view.textResult.setText("Sorry, I cannot do this calcualting");
        }
    }
}
