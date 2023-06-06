
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN-PC
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
           Parent parentroot = FXMLLoader.load(getClass().getResource("Main Dashboard.fxml"));
           Scene scene = new Scene(parentroot,400,400);
           scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
           primaryStage.setTitle("Coffee store Onofre");
           primaryStage.setScene(scene);
           primaryStage.show();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        
        }
    }public static void main(String[]args){
    launch(args);
    }
    
}
