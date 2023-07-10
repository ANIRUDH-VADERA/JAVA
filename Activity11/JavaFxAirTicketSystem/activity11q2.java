// package activity11;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.HPos;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.ComboBox;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;
// import javafx.scene.text.Text;

// public class activity11q2 extends Application {
// public void start(Stage primaryStage) throws Exception {
// GridPane rootNode = new GridPane();
// rootNode.setHgap(5);
// rootNode.setVgap(5);
// rootNode.setAlignment(Pos.CENTER);

// Scene myScene = new Scene(rootNode, 700, 500);

// rootNode.add(new Label("Enter Source:"), 0, 0);
// TextField source = new TextField();
// rootNode.add(source, 1, 0);
// rootNode.add(new Label("Enter Destination:"), 0, 1);
// TextField dest = new TextField();
// rootNode.add(dest, 1, 1);
// rootNode.add(new Label("Enter Date of departure:"), 0, 2);
// TextField dod = new TextField();
// rootNode.add(dod, 1, 2);
// rootNode.add(new Label("Enter Number of passengers:"), 0, 3);
// TextField nop = new TextField();
// rootNode.add(nop, 1, 3);
// rootNode.add(new Label("Enter class: "), 0, 4);
// ComboBox comboBox = new ComboBox();
// comboBox.getItems().add("Business");
// comboBox.getItems().add("First");
// comboBox.getItems().add("Economy");
// rootNode.add(comboBox, 1, 4);
// Button btn = new Button("Book");
// rootNode.add(btn, 1, 5);
// GridPane.setHalignment(btn, HPos.LEFT);

// GridPane rootNode2 = new GridPane();
// Scene myScene2 = new Scene(rootNode2, 700, 500);
// rootNode2.setHgap(5);
// rootNode2.setVgap(5);
// rootNode2.setAlignment(Pos.CENTER);
// Button btn2 = new Button("Edit details");
// int flag = 0;
// btn.setOnAction(new EventHandler<ActionEvent>() {
// public void handle(ActionEvent event) {
// String s = "";
// if (flag == 0) {
// try {
// String src = source.getText();
// String dest1 = dest.getText();
// String dod1 = dod.getText();
// String nop1 = nop.getText();
// String cls1 = (String) comboBox.getValue();

// if (src.equals("") || dest1.equals("") || dod1.equals("") || nop1.equals("")
// || cls1.equals("")) {
// s = "Please fill all the fields";
// } else {
// s = "Source: " + src + "\nDestination: " + dest1 + "\nDate of departure: " +
// dod1
// + "\nNumber of passengers: " + nop1 + "\nClass: " + cls1;
// }
// Text t = new Text(s);

// rootNode2.add(t, 1, 1);
// rootNode2.add(btn2, 1, 2);

// } catch (Exception e) {
// s = "";
// }
// rootNode2.add(new Label("Details of Booking:"), 1, 0);
// primaryStage.setScene(myScene2);
// s = "";
// }
// }
// });
// btn2.setOnAction(new EventHandler<ActionEvent>() {
// public void handle(ActionEvent event) {
// primaryStage.setScene(myScene);
// rootNode2.getChildren().clear();
// }
// });
// primaryStage.setScene(myScene);
// primaryStage.setTitle("Air ticket booking system ANIRUDH VADERA
// (20BCE2940)");
// primaryStage.setScene(myScene);
// primaryStage.show();

// }

// public static void main(String[] args) {
// launch(args);
// }
// }