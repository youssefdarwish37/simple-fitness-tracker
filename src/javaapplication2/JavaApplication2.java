package javaapplication2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

public class JavaApplication2 extends Application {
    
 
    public static void main(String[] args) {launch(args);}
        
    @Override
    public void start(Stage primaryStage) throws Exception{
    primaryStage.setTitle("SIMPLE FITNESS TRACKER");
    calc b =new calc();
    gui_1 first=new gui_1(primaryStage);
    gui_2 second=new gui_2(primaryStage);
    first.setcalc(b);
    second.setcalc(b);
    first.prepareScene();
    first.setSecond(second);
    second.setFirst(first);
    primaryStage.setScene(first.getscene());
    primaryStage.show();
}
}
