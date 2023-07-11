
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.HPos;
// import javafx.geometry.Pos;
// import javafx.geometry.VPos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.ComboBox;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;
// import javafx.scene.text.Text;
// import javafx.scene.Group;
// import javafx.scene.control.Alert;
// import javafx.scene.control.DatePicker;

// public class AirlineBookingSystem extends Application {

// @Override
// public void start(Stage primaryStage)
// throws Exception, ClassNotFoundException, InstantiationException,
// IllegalAccessException {
// GridPane rootNode = new GridPane();
// // rootNode.setPadding(new Insets(15));
// rootNode.setHgap(5);
// rootNode.setVgap(5);
// rootNode.setAlignment(Pos.CENTER);

// Scene myScene = new Scene(rootNode, 700, 500);
// rootNode.add(new Label("Enter Name:"), 0, 0);
// TextField name = new TextField();
// rootNode.add(name, 1, 0);
// rootNode.add(new Label("Enter phone number:"), 0, 1);
// TextField phno = new TextField();
// rootNode.add(phno, 1, 1);
// rootNode.add(new Label("Enter Source:"), 0, 2);
// TextField source = new TextField();
// rootNode.add(source, 1, 2);
// rootNode.add(new Label("Enter Destination:"), 0, 3);
// TextField dest = new TextField();
// rootNode.add(dest, 1, 3);
// rootNode.add(new Label("Enter Date of departure:"), 0, 4);
// DatePicker dod = new DatePicker();
// rootNode.add(dod, 1, 4);
// rootNode.add(new Label("Enter Number of passengers:"), 0, 5);
// TextField nop = new TextField();
// rootNode.add(nop, 1, 5);
// rootNode.add(new Label("Enter class: "), 0, 6);
// ComboBox comboBox = new ComboBox();
// comboBox.getItems().add("Business");
// comboBox.getItems().add("First");
// comboBox.getItems().add("Economy");
// rootNode.add(comboBox, 1, 6);
// Button btn = new Button("Book");
// rootNode.add(btn, 1, 7);
// GridPane.setHalignment(btn, HPos.LEFT);

// GridPane rootNode2 = new GridPane();
// Scene myScene2 = new Scene(rootNode2, 700, 500);
// rootNode2.setHgap(5);
// rootNode2.setVgap(5);
// rootNode2.setAlignment(Pos.CENTER);
// Button btn2 = new Button("Book more tickets");

// btn.setOnAction(new EventHandler<ActionEvent>() {
// @Override
// public void handle(ActionEvent event) {
// String s = "";
// int flag = 2;
// Alert a = new Alert(Alert.AlertType.ERROR);
// a.setHeaderText("SQL ERROR");
// try {
// String names = name.getText();
// String phone = phno.getText();
// String src = source.getText();
// String dest1 = dest.getText();
// String dod1 = dod.getValue().toString();
// String nop1 = nop.getText();
// String cls1 = (String) comboBox.getValue();

// if (names.equals("") || phone.equals("") || src.equals("") ||
// dest1.equals("") || dod1.equals("")
// || nop1.equals("")
// || cls1.equals("")) {
// s = "Please fill all the fields";
// s += "\nName: " + names + "\nPhone number: " + phone + "\nSource: " + src +
// "\nDestination: "
// + dest1 + "\nDate of departure: " + dod1
// + "\nNumber of passengers: " + nop1 + "\nClass: " + cls1;
// } else {
// s = "Name: " + names + "\nPhone number: " + phone + "\nSource: " + src +
// "\nDestination: "
// + dest1 + "\nDate of departure: " + dod1
// + "\nNumber of passengers: " + nop1 + "\nClass: " + cls1;
// try {

// Connection con = null;// Establish a connection
// Class.forName("com.mysql.cj.jdbc.Driver").newInstance();// loads the driver
// // define the connection propertiesi.e dbname, username and password
// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline",
// "root", "");
// System.out.println("Connection Successful");
// Statement sqlStatements = con.createStatement(); // insert a record into
// table
// // Execute the Query
// String querryString = "INSERT INTO ticket_details VALUES('" + names + "'," +
// phone + ",'"
// + src + "','" + dest1 + "','" + dod1 + "'," + nop1 + ",'" + cls1 + "');";
// System.out.println(querryString);
// sqlStatements.executeUpdate(querryString);
// System.out.println("Record inserted");
// sqlStatements.close();
// con.close();
// flag = 0;

// } catch (SQLException e) {

// System.out.println(e.getMessage());
// flag = 1;
// }
// }
// Text t = new Text(s);

// rootNode2.add(t, 1, 1);
// rootNode2.add(btn2, 1, 2);

// } catch (Exception e) {
// s = "";
// }
// Label heading;
// if (flag == 0) {
// heading = new Label("Booking Successful");
// heading.setStyle("-fx-font-size: 20px;");
// rootNode2.add(heading, 0, 0);
// rootNode2.add(btn2, 0, 1);
// primaryStage.setScene(myScene2);
// } else {
// heading = new Label("Booking Unsuccessful");
// heading.setStyle("-fx-font-size: 20px;");
// primaryStage.setScene(myScene2);
// rootNode2.add(heading, 0, 0);
// rootNode2.add(btn2, 0, 1);
// a.show();
// }

// s = "";

// }
// });
// btn2.setOnAction(new EventHandler<ActionEvent>() {
// @Override
// public void handle(ActionEvent event) {
// primaryStage.setScene(myScene);
// rootNode2.getChildren().clear();
// }
// });
// primaryStage.setScene(myScene);
// primaryStage.setTitle("Air ticket booking system Ayush Dwivedi 20BCE2939");
// primaryStage.setScene(myScene);
// primaryStage.show();

// }

// public static void main(String[] args) {
// launch(args);
// }
// }
