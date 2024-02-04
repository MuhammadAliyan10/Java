
//!Import
import org.json.JSONArray;
import javafx.scene.control.ScrollPane;
import org.json.JSONObject;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javafx.scene.control.Hyperlink;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Main tab for initial UI setup
        TabPane loginTabPane = new TabPane();
        Tab LoginmainTab = new Tab("Login");
        LoginmainTab.setClosable(false);
        VBox mainTabContent = new VBox(20);
        mainTabContent.setBackground(
                new Background(new BackgroundFill(Color.web("#202124"), CornerRadii.EMPTY, Insets.EMPTY)));
        mainTabContent.setAlignment(Pos.CENTER);

        Label header = new Label();
        header.setText("Login");
        mainTabContent.getChildren().add(header);

        TextField firstName = new TextField();
        firstName.setPromptText("Enter your first Name");
        firstName.setMaxWidth(550);
        firstName.setMinHeight(40);
        firstName.setPrefWidth(550);
        firstName.setMinHeight(40);
        firstName.setFont(new javafx.scene.text.Font(15));
        firstName.getStyleClass().add("search_input");
        TextField lastName = new TextField();
        lastName.setPromptText("Enter your last Name");
        lastName.setMaxWidth(550);
        lastName.setMinHeight(40);
        lastName.setPrefWidth(550);
        lastName.setMinHeight(40);
        lastName.setFont(new javafx.scene.text.Font(15));
        lastName.getStyleClass().add("search_input");

        HBox upper = new HBox(10);
        upper.getChildren().addAll(firstName, lastName);
        HBox.setMargin(firstName, new Insets(0, 10, 10, 60));
        mainTabContent.getChildren().addAll(upper);

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter your email address");
        emailTextField.setMaxWidth(550);
        emailTextField.setMinHeight(40);
        emailTextField.setPrefWidth(550);
        emailTextField.setMinHeight(40);
        emailTextField.setFont(new javafx.scene.text.Font(15));
        emailTextField.getStyleClass().add("search_input");

        TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("Enter your password");
        passwordTextField.setMaxWidth(550);
        passwordTextField.setMinHeight(40);
        passwordTextField.setPrefWidth(550);
        passwordTextField.setMinHeight(40);
        passwordTextField.setFont(new javafx.scene.text.Font(15));
        passwordTextField.getStyleClass().add("search_input");

        HBox middleBox = new HBox(10);
        middleBox.getChildren().addAll(emailTextField, passwordTextField);
        HBox.setMargin(emailTextField, new Insets(0, 10, 10, 60));
        mainTabContent.getChildren().addAll(middleBox);

        TextField department = new TextField();
        department.setPromptText("Enter your department");
        department.setMaxWidth(550);
        department.setMinHeight(40);
        department.setPrefWidth(550);
        department.setMinHeight(40);
        department.setFont(new javafx.scene.text.Font(15));
        department.getStyleClass().add("search_input");
        TextField rollNumber = new TextField();
        rollNumber.setPromptText("Enter your regrestion number");
        rollNumber.setMaxWidth(550);
        rollNumber.setMinHeight(40);
        rollNumber.setPrefWidth(550);
        rollNumber.setMinHeight(40);
        rollNumber.setFont(new javafx.scene.text.Font(15));
        rollNumber.getStyleClass().add("search_input");

        HBox lowerTop = new HBox(10);
        lowerTop.getChildren().addAll(department, rollNumber);
        HBox.setMargin(department, new Insets(0, 10, 10, 60));
        mainTabContent.getChildren().addAll(lowerTop);

        ComboBox<Integer> dayComboBox = new ComboBox<>();
        ComboBox<String> monthComboBox = new ComboBox<>();
        ComboBox<Integer> yearComboBox = new ComboBox<>();

        for (int i = 1; i <= 31; i++) {
            dayComboBox.getItems().add(i);
        }

        monthComboBox.getItems().addAll(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December");

        for (int year = 1900; year <= 2024; year++) {
            yearComboBox.getItems().add(year);
        }

        HBox cbox = new HBox(10);
        cbox.getChildren().addAll(dayComboBox, monthComboBox, yearComboBox);
        HBox.setMargin(dayComboBox, new Insets(0, 10, 10, 150));
        mainTabContent.getChildren().addAll(cbox);

        Button sudmit = new Button();
        sudmit.setText("Sudmit");
        sudmit.getStyleClass().add("search_button");
        mainTabContent.getChildren().add(sudmit);
        sudmit.setOnAction(event -> {
            String email = emailTextField.getText();
            String password = passwordTextField.getText();

            try {
                String finalValue = authencation(email, password);
                if (finalValue == "Finded") {
                    loginTabPane.getTabs().remove(LoginmainTab);
                    Tab newmainTab = new Tab("Google");
                    LoginmainTab.setClosable(false);
                    VBox newmainTabContent = new VBox(20);
                    newmainTabContent.setBackground(
                            new Background(new BackgroundFill(Color.web("#202124"), CornerRadii.EMPTY, Insets.EMPTY)));
                    newmainTabContent.setAlignment(Pos.CENTER);
                    newmainTab.setContent(newmainTabContent);
                    loginTabPane.getTabs().add(newmainTab);
                    primaryStage.setTitle("Added");
                    primaryStage.setScene(new Scene(loginTabPane, 1270, 685));
                    primaryStage.show();

                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("No User Found");
                    alert.setHeaderText(null); // No header text
                    alert.setContentText("No user found.Please sign up.");
                    alert.showAndWait();
                }
            } catch (FileNotFoundException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }
        });

        LoginmainTab.setContent(mainTabContent);
        loginTabPane.getTabs().add(LoginmainTab);
        VBox.setMargin(emailTextField, new Insets(10, 0, 0, 0));
        VBox.setMargin(passwordTextField, new Insets(10, 0, 0, 0));
        VBox.setMargin(header, new Insets(0, 0, 50, 0));

        String cssFile = getClass().getResource("/Style.css").toExternalForm();
        mainTabContent.getStylesheets().add(cssFile);

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(loginTabPane, 1270, 685));
        primaryStage.show();
    }

    public String authencation(String email, String password) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        String finalValue = null;
        try (InputStream input = new FileInputStream(
                "E:\\Programming\\Java\\Java_Assignments\\GUI\\Login Form\\src\\config.properties")) {
            properties.load(input);
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String passwordE = properties.getProperty("db.password");
        try (
                Connection con = DriverManager.getConnection(url, username, passwordE);
                Statement stmt = con.createStatement()) {

            String strSelect = "select name, email, password from userinformation";
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                String name = rset.getString("name");
                String emaildb = rset.getString("email");
                String passworddb = rset.getString("password");

                finalValue = "Finded";

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return finalValue;

    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }

}
