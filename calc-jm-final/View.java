import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
/**
 * Write a description of JavaFX class Calculator here.
 *
 * @author (James Maile)
 * @version (1.03)
 */
public class View
{
    int H = 400;         // Height of window pixels 
    int W = 350;         // Width  of window pixels 

    Model model;
    Controller controller;
    //components of the user interface
    Label      operator, equal,resultMeaasge, chistory;         // Title area
    TextField  textNum1,textNum2, textResult;
      // result area, where number appear
    GridPane   gridPane;      // main layout manager grid
    TilePane   buttonPane;    // tiled area for buttons
    
    //calchis (calchistory), appears as a single string 
    private String Calchis = "";
    
    public void start(Stage window){
        window.setTitle("Simple Calculator");
        
        // layout manager 
        gridPane = new GridPane();
        gridPane.setId("Layout");       // assign an id to be used in css file
        buttonPane = new TilePane();
        buttonPane.setId("Buttons");    // assign an id to be used in css file
        
        textNum1 = new TextField();
        gridPane.add(textNum1,1,1);
        
        operator = new Label("Operator:....");
        gridPane.add(operator,1,2);
        
        textNum2 = new TextField();
        gridPane.add(textNum2,1,3);
        
        equal = new Label("=  I am waiting for calculated result.... ");
        gridPane.add(equal,1,4);
        
        textResult = new TextField();
        textResult.setEditable(false);
        gridPane.add(textResult,1,5);
        
        //chistory - Label added to show history of calculations
        
        chistory = new Label("Past calculations^^ ");
        gridPane.add(chistory, 2, 1);
        
        
        
        // Buttons - these are laid out on a tiled pane, then
        // the whole pane is added to the main gridPane
        // Button text - empty strings are for blank spaces
        
        String[] buttonText = { "+","-","*","/","%","^","√"};
        
        // loop through the array, making a Button object for each label 
        // (and an empty text label for each blank space) and adding them to the buttonPane
        for(String text: buttonText){
            Button btn = new Button(text);
            buttonPane.getChildren().add(btn);
            btn.setOnAction(this::buttonClick);
        } 
        
        gridPane.add(buttonPane,1,6);
        Scene scene = new Scene(gridPane,W,H);
        scene.getStylesheets().add("Calculator.css"); // tell the app to use our css
        window.setScene(scene);
        window.show();
    }
    

    // This method is called when a button is pressed
    // It fetches the label on the button and passes it to the controller's process method
    public void buttonClick(ActionEvent event)
    {
        // this line asks the event to provide the actual Button object that was clicked
        Button btn = (Button) event.getSource();
        if (controller != null){
            String text = btn.getText();   // get the button text
            controller.doCalculating(text);
        }
    }
    public void update(String operIcon, String equalIcon, String result)
    {        
        if (model != null){
            operator.setText(operIcon);
            equal.setText(equalIcon);
            textResult.setText(result);
            chistory.setText(String.valueOf(result)+ "\n" +chistory.getText());
            

        }

    }
}

