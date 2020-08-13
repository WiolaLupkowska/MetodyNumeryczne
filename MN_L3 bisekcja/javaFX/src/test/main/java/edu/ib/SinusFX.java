package edu.ib;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label; //IMPORTUJE JAVAFX PRZY LABEL
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class SinusFX extends Application {

    private TextField txtTime;
    private TextField txtN;
    private TextField txtF;


    public static void main(String[] args) {launch(args);}


    @Override
        public void start(Stage primaryStage){

        VBox layout= new VBox(); //Layout manager
        layout.setSpacing(10);
        layout.setPadding( new Insets(20,20,30,20));

        //b wazne na dole
        Label label= new Label("Parameters");
        label.setFont(Font.font("Times", FontWeight.BOLD,16));


        Label labelT= new Label("tStop");
        txtTime= new TextField();
        txtTime.setText("10");
        txtTime.setPrefWidth(80);

        Label labelN= new Label("n");
        txtN= new TextField();
        txtN.setText("10");
        txtN.setPrefWidth(80);

        Label labelF= new Label("f");
        txtF= new TextField();
        txtF.setText("10");
        txtF.setPrefWidth(80);

        HBox hBox= new HBox(labelT,txtTime,labelN,txtN,labelF,txtF); //horizontal box
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        layout.getChildren().add(label);
        layout.getChildren().add(hBox);


        primaryStage.setTitle("Sinus demo");
        Scene scene= new Scene(layout,500,600);
        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
