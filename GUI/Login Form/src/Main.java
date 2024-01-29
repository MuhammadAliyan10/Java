
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
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

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
        Label log = new Label();
        log.setText("Please enter your email and password");
        mainTabContent.getChildren().add(log);

        TextField fullName = new TextField();
        fullName.setPromptText("Enter your full Name");
        fullName.setMaxWidth(550);
        fullName.setMinHeight(40);
        fullName.setPrefWidth(550);
        fullName.setMinHeight(40);
        fullName.setFont(new javafx.scene.text.Font(15));
        fullName.getStyleClass().add("search_input");
        fullName.setVisible(false);
        fullName.setManaged(false);
        mainTabContent.getChildren().addAll(fullName);

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter your email address");
        emailTextField.setMaxWidth(550);
        emailTextField.setMinHeight(40);
        emailTextField.setPrefWidth(550);
        emailTextField.setMinHeight(40);
        emailTextField.setFont(new javafx.scene.text.Font(15));
        emailTextField.getStyleClass().add("search_input");
        mainTabContent.getChildren().addAll(emailTextField);
        TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("Enter your password");
        passwordTextField.setMaxWidth(550);
        passwordTextField.setMinHeight(40);
        passwordTextField.setPrefWidth(550);
        passwordTextField.setMinHeight(40);
        passwordTextField.setFont(new javafx.scene.text.Font(15));
        passwordTextField.getStyleClass().add("search_input");
        mainTabContent.getChildren().addAll(passwordTextField);

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
                    primaryStage.setTitle("Google");
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

        // Submit Button
        Button logIn = new Button();
        logIn.setText("Login");
        logIn.getStyleClass().add("search_button");
        logIn.setDisable(true);
        Button signUp = new Button();
        signUp.setText("Signup");
        signUp.getStyleClass().add("search_button");

        logIn.setOnAction(event -> {
            logIn.setDisable(true);
            signUp.setDisable(false);
            header.setText("Log In");
            fullName.setVisible(false);
            fullName.setManaged(false);
            log.setVisible(true);
            log.setManaged(true);
        });

        signUp.setOnAction(event -> {
            signUp.setDisable(true);
            logIn.setDisable(false);
            header.setText("Sign Up");
            fullName.setVisible(true);
            fullName.setManaged(true);
            log.setVisible(false);
            log.setManaged(false);

        });

        // Hbox for button
        HBox button = new HBox(10);
        button.getChildren().addAll(logIn, signUp);
        HBox.setMargin(logIn, new Insets(0, 10, 153, 530));
        mainTabContent.getChildren().addAll(button);

        LoginmainTab.setContent(mainTabContent);
        loginTabPane.getTabs().add(LoginmainTab);
        VBox.setMargin(emailTextField, new Insets(10, 0, 0, 0));
        VBox.setMargin(passwordTextField, new Insets(10, 0, 0, 0));
        VBox.setMargin(header, new Insets(0, 0, 50, 0));
        VBox.setMargin(log, new Insets(0, 200, 0, 0));

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
                // System.out.println(emaildb + ", " + passworddb + ", " + name);

                if (emaildb.equals(email) && passworddb.equals(passworddb)) {

                    finalValue = "Finded";

                } else {
                    finalValue = "NotFinded";

                }

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
