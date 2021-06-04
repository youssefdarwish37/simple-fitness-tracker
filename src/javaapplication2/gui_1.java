
package javaapplication2;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class gui_1 {

    Stage stage;
    Scene scene;
    gui_2 second;
    calc b;

    public gui_1(Stage stage) {
        this.stage = stage;
    }
    public void prepareScene()
    {
         //intializing the background image 
    BackgroundImage o= new BackgroundImage(new Image("https://i.ibb.co/rGmGZPC/pexels-photo-669578.jpg",550,370,false,true),
    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
    BackgroundSize.DEFAULT);
     //intializing the buttons and setting the actions
     
        Label ul=new Label("CHOOSE ACTIVITY:"); 
        ul.setFont(new Font("Verdana",10));
        ul.setTextFill(Color.web("A52A2A"));
        Label pl=new Label("   ENTER TIME:");
        pl.setFont(new Font("Verdana",11));
        pl.setTextFill(Color.web("A52A2A"));
        pl.setPrefWidth(100);
       
            
        TextField t=new TextField();
        t.setPrefWidth(40);
       
        Button swimming=new Button("SWIMMING");
        swimming.setPrefWidth(150);
        swimming.setTextFill(Color.web("A52A2A"));
        swimming.setOnAction(e ->
        {swimming.setTextFill(Color.web("#0076a3"));
        b.setCalories("swimming");
        b.set_heart_rate("swimming");
        }
        );
        
        Button runing=new Button("RUNNING");
        runing.setPrefWidth(150);
        runing.setTextFill(Color.web("A52A2A"));
        runing.setOnAction(e ->
        {
        runing.setTextFill(Color.web("#0076a3"));
        b.setCalories("running");
        b.set_heart_rate("running");
        }
        );
        
        Button Kickboxing=new Button("KICK BOXING");
        Kickboxing.setPrefWidth(150);
        Kickboxing.setTextFill(Color.web("A52A2A"));
        Kickboxing.setOnAction(e ->
        {
        Kickboxing.setTextFill(Color.web("#0076a3"));
        b.setCalories("kickboxing");
        b.set_heart_rate("kickboxing");
        }
        );
        
        Button strength=new Button("STRENGTH TRAINING");
        strength.setPrefWidth(150);
        strength.setTextFill(Color.web("A52A2A"));    
        strength.setOnAction(e ->
        {
        strength.setTextFill(Color.web("#0076a3"));    
        b.setCalories("strength");
        b.set_heart_rate("strength");
        }
        );
        
      Button result=new Button("SEE RESULTS");
      result.setTextFill(Color.web("0x0000FF")); 
      result.setOnAction(e ->
      {
      second.prepareScene();
      stage.setScene(second.getscene());
      }
      );
           
Button calcu=new Button("CALCULATE");
calcu.setTextFill(Color.web("0x0000FF")); 
 calcu.setOnAction(e->
        { Integer time= Integer.valueOf(t.getText());
        b.setTime(time);
        b.setCalories_burnt();
        b.setTotal_heart_rate();
        t.setText("");
        }
        );
        
        Label minutes=new Label("minutes");
        minutes.setFont(new Font("Arial",12));
        Label space=new Label(" ");
       ///// drawing
        
        GridPane grid=new GridPane();
        grid.add(ul, 1, 0);
        grid.add(swimming, 2, 0);
        grid.add(runing, 2, 1);
        grid.add(Kickboxing, 3, 0);
        grid.add(strength, 3, 1);
        grid.add(pl, 1, 2);
        grid.add(t, 2, 2);
        grid.add(minutes, 3, 2);
        grid.add(calcu,2,3);
        grid.add(space, 0, 4);
        grid.add(result,0,5);
        grid.setBackground(new Background ( o ));

        scene =new Scene(grid,550,350);

    }
    public Scene getscene()
    {
    return scene;
    }

    public void setSecond(gui_2 second) {
        this.second = second;
    }    
    public void setcalc(calc b)
{
this.b=b;
}

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
}

