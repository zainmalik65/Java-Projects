/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytree;
/*
/lab8,lab9,lab11,lab12,lab13,lab0,lab15,lab16,lab17,lab18,lab19
        //Hb1,Hb3,Hb4,Hb5,Hb6,Hb7,Hb8,Hb9,Hb9,Hb10,Hb11,Hb12,Hb13,layouttt,layouttt2
             Vx4.getChildren().removeAll(Hb1,Hb3,Hb4,Hb5,Hb6,Hb7,Hb8,Hb9,Hb9,Hb10,Hb11,Hb12,Hb13,layouttt,layouttt2);
             Vx4.getChildren().addAll()
      
*/
/**
 *
 * @author Zain Malik
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NewClass extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston");

        
        //Form
        TextField ageInput = new TextField();
        Label lab29=new Label();
       lab29.setFont(Font.font ("Verdana", 15));
       
        

        button = new Button("Click me");
        button.setOnAction( e -> {
        lab29.setText(ageInput.getText());     
        }
        );

        
        
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(ageInput, button,lab29);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Validate age
    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }


}