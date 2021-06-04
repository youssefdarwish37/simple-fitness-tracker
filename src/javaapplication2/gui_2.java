package javaapplication2;

import java.text.DecimalFormat;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class gui_2{
    Stage stage;
    Scene scene;
    gui_1 first;
    calc b;
    private static DecimalFormat d =new DecimalFormat("#.###");

    public gui_2(Stage stage) {
        this.stage = stage;
    }
    public void prepareScene()
    {
        //intializing the background image and the labels
        BackgroundImage o= new BackgroundImage(new Image("https://i.ibb.co/xgCxPj7/Main-image-800x600.jpg",500,400,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
        BackgroundSize.DEFAULT);
        Label label1=new Label("TOTAL RESULTS");
        label1.setFont(new Font("Arial",22));
        Line label2=new Line(0,0,200,0);
        Label label3=new Label("TOTAL CALORIES BURNED ="+b.getCalories_burnt());
        Label label4=new Label("TOTAL HEART RATE="+d.format(b.getTotal_heart_rate()));
        Label label5=new Label("ACTIVITES RANK");
        Line label6=new Line(0,0,150,0);
        label5.setFont(new Font("Arial",18));
        Label label7=new Label("RUNNING");
        label7.setTextFill(Color.web("A52A2A"));
        Label label8=new Label("CALORIES BURNED ="+b.getRu_cal());
        Label label9=new Label("HEART RATE INCREASED="+d.format(b.getRu_h()));
        Label label10=new Label("SWIMMING");
        label10.setTextFill(Color.web("A52A2A"));
        Label label11=new Label("CALORIES BURNED ="+b.getSw_cal());
        Label label12=new Label("HEART RATE INCREASED="+d.format(b.getSw_h()));
        Label label13=new Label("KICKBOXING");
        label13.setTextFill(Color.web("A52A2A"));
        Label label14=new Label("CALORIES BURNED ="+b.getKb_cal());
        Label label15=new Label("HEART RATE INCREASED="+d.format(b.getKb_h()));
        Label label16=new Label("STRENGTH");
        label16.setTextFill(Color.web("A52A2A"));
        Label label17=new Label("CALORIES BURNED ="+b.getSt_cal());
        Label label18=new Label("HEART RATE INCREASED="+d.format(b.getSt_h()));
        Label label19=new Label(" ");
        // setting actions for the buttons
        Button back=new Button("GO BACK");
        back.setTextFill(Color.web("0x0000FF"));
        back.setOnAction(e -> stage.setScene(first.getscene()));
        // ////////drawing
   GridPane sp = new GridPane();
            sp.add(label1,0,0);
            sp.add(label2,0,2);
            sp.add(label3,0,3);
            sp.add(label4,0,4);
            sp.add(label5,0,5);
            sp.add(label6,0,6);
            sp.add(label7,0,7);
            sp.add(label8,0,8);
            sp.add(label9,0,9);
            sp.add(label10,0,10);
            sp.add(label11,0,11);
            sp.add(label12,0,12);
            sp.add(label13,0,13);
            sp.add(label14,0,14);
            sp.add(label15,0,15);
            sp.add(label16,0,16);
            sp.add(label17,0,17);
            sp.add(label18,0,18);
            sp.add(label19,0,19);
            sp.add(back,0,20);
            sp.setBackground(new Background ( o ));
scene=new Scene(sp,500,400);
    }

    public Scene getscene() {
        return scene;
    }

public void setFirst(gui_1 first) {
        this.first = first;
    }

public void setcalc(calc b) {
this.b=b;
}
    
}
