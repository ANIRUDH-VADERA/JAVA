package activity11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class activity11q1 extends Application {

    public void start(Stage primaryStage) {
        int[] flag = { 0, 0, 0, 0, 0 };
        Button btn1 = new Button();
        btn1.setText("Red");
        Button btn2 = new Button();
        btn2.setText("Green");
        Button btn3 = new Button();
        btn3.setText("Blue");
        Button btn4 = new Button();
        btn4.setText("Pink");
        Button btn5 = new Button();
        btn5.setText("Black");

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (flag[0] == 0) {
                    flag[0] = 1;
                    btn2.setStyle("");
                    btn3.setStyle("");
                    btn4.setStyle("");
                    btn5.setStyle("");
                    flag[1] = 0;
                    flag[2] = 0;
                    flag[3] = 0;
                    flag[4] = 0;

                } else {
                    flag[0] = 0;
                }
                System.out.println("Red");
                if (flag[0] == 1) {
                    btn1.setStyle("-fx-background-color: red;-fx-text-fill: white; ");
                } else {
                    btn1.setStyle("");
                }
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (flag[1] == 0) {
                    flag[1] = 1;
                    btn1.setStyle("");
                    btn3.setStyle("");
                    btn4.setStyle("");
                    btn5.setStyle("");
                    flag[0] = 0;
                    flag[2] = 0;
                    flag[3] = 0;
                    flag[4] = 0;
                } else {
                    flag[1] = 0;
                }
                System.out.println("Green");
                if (flag[1] == 1) {
                    btn2.setStyle("-fx-background-color: green;-fx-text-fill: white; ");
                } else {
                    btn2.setStyle("");
                }
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (flag[2] == 0) {
                    flag[2] = 1;
                    btn2.setStyle("");
                    btn1.setStyle("");
                    btn4.setStyle("");
                    btn5.setStyle("");
                    flag[1] = 0;
                    flag[0] = 0;
                    flag[3] = 0;
                    flag[4] = 0;
                } else {
                    flag[2] = 0;
                }
                System.out.println("Blue");
                if (flag[2] == 1) {
                    btn3.setStyle("-fx-background-color: blue;-fx-text-fill: white; ");
                } else {
                    btn3.setStyle("");
                }
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (flag[3] == 0) {
                    flag[3] = 1;
                    btn2.setStyle("");
                    btn3.setStyle("");
                    btn1.setStyle("");
                    btn5.setStyle("");
                    flag[1] = 0;
                    flag[2] = 0;
                    flag[0] = 0;
                    flag[4] = 0;
                } else {
                    flag[3] = 0;
                }
                System.out.println("Pink");
                if (flag[3] == 1) {
                    btn4.setStyle("-fx-background-color: pink;-fx-text-fill: white; ");
                } else {
                    btn4.setStyle("");
                }
            }
        });

        btn5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (flag[4] == 0) {
                    flag[4] = 1;
                    btn2.setStyle("");
                    btn3.setStyle("");
                    btn4.setStyle("");
                    btn1.setStyle("");
                    flag[1] = 0;
                    flag[2] = 0;
                    flag[3] = 0;
                    flag[0] = 0;
                } else {
                    flag[4] = 0;
                }
                System.out.println("Black");
                if (flag[4] == 1) {
                    btn5.setStyle("-fx-background-color: black;-fx-text-fill: white; ");
                } else {
                    btn5.setStyle("");
                }
            }
        });
        btn1.setMaxSize(100, 200);
        btn2.setMaxSize(100, 200);
        btn3.setMaxSize(100, 200);
        btn4.setMaxSize(100, 200);
        btn5.setMaxSize(100, 200);
        GridPane root = new GridPane();
        root.add(btn1, 0, 0);
        root.add(btn2, 0, 1);
        root.add(btn3, 1, 0);
        root.add(btn4, 1, 1);
        root.add(btn5, 0, 2);

        Scene scene = new Scene(root, 300, 250);
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        GridPane.setHalignment(btn1, HPos.CENTER);
        GridPane.setValignment(btn1, VPos.CENTER);
        GridPane.setHalignment(btn2, HPos.CENTER);
        GridPane.setValignment(btn2, VPos.CENTER);
        GridPane.setHalignment(btn3, HPos.CENTER);
        GridPane.setValignment(btn3, VPos.CENTER);
        GridPane.setHalignment(btn4, HPos.CENTER);
        GridPane.setValignment(btn4, VPos.CENTER);
        GridPane.setHalignment(btn5, HPos.CENTER);
        GridPane.setValignment(btn5, VPos.CENTER);

        primaryStage.setTitle("ANIRUDH VADERA (20BCE2940)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
