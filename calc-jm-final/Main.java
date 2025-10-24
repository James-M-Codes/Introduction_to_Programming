import javafx.application.Application;
import javafx.stage.Stage;

// Calculator Main class
/**
 * The main handles the launching of the program. thats's it's main job
 *
 * @author
 * @version (1.00) 
 */
public class Main extends Application {
    
    public static void main( String args[] ){
        // The main method only gets used when launching from the command line
        // launch initialises the system and then calls start
        // In BlueJ, BlueJ calls start itself
        launch(args);
    }
    
    @Override
    public void start(Stage window){
        
        // Create  Model, View and Controller objects
        Calculator cal = new Calculator();
        Model model = new Model(cal);
        View view = new View();
        Controller  controller = new  Controller();
        
        // Link them together so they can talk to each other
        // Each one has instances variable for the other two
        model.view = view;
        model.controller = controller;
        
        view.model = model;
        view.controller = controller;
        
        controller.model = model;
        controller.view = view;
        
        // start up the GUI (view), and then tell the model to initialise and display itself
        view.start(window);         
    }
}
