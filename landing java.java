// LandingPage.java
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LandingPage extends Application {

    @Override
    public void start(Stage stage) {
        // ----- HEADER -----
        Label title = new Label("Welcome to My Landing Page");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        title.setTextFill(Color.WHITE);

        HBox header = new HBox(title);
        header.setStyle("-fx-background-color: #0078D7;");
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));

        // ----- MAIN CONTENT -----
        Label intro = new Label("Build beautiful web interfaces using JavaFX or web technologies!");
        intro.setFont(Font.font("Verdana", 16));
        intro.setWrapText(true);

        Button learnMore = new Button("Learn More");
        learnMore.setStyle("-fx-background-color: #0078D7; -fx-text-fill: white; -fx-font-size: 14px;");
        learnMore.setOnAction(e -> System.out.println("Learn More clicked!"));

        Button getStarted = new Button("Get Started");
        getStarted.setStyle("-fx-background-color: #00B050; -fx-text-fill: white; -fx-font-size: 14px;");
        getStarted.setOnAction(e -> System.out.println("Get Started clicked!"));

        HBox buttonBox = new HBox(15, learnMore, getStarted);
        buttonBox.setAlignment(Pos.CENTER);

        VBox content = new VBox(20, intro, buttonBox);
        content.setPadding(new Insets(40));
        content.setAlignment(Pos.CENTER);
        content.setStyle("-fx-background-color: #F4F6F7;");

        // ----- FEATURES SECTION -----
        Label featureTitle = new Label("✨ Features:");
        featureTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label features = new Label(
            "• Responsive and modern design\n" +
            "• Smooth layout and easy navigation\n" +
            "• Engaging call-to-action sections\n" +
            "• Customizable color palette and fonts"
        );
        features.setFont(Font.font("Arial", 15));
        features.setPadding(new Insets(10));

        VBox featureBox = new VBox(10, featureTitle, features);
        featureBox.setPadding(new Insets(20));
        featureBox.setAlignment(Pos.TOP_LEFT);

        // ----- FOOTER -----
        Label footerText = new Label("© 2025 Swetha Varma | All Rights Reserved");
        footerText.setTextFill(Color.WHITE);
        footerText.setFont(Font.font("Arial", 13));

        HBox footer = new HBox(footerText);
        footer.setStyle("-fx-background-color: #333333;");
        footer.setAlignment(Pos.CENTER);
        footer.setPadding(new Insets(15));

        // ----- PAGE LAYOUT -----
        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setCenter(content);
        root.setBottom(footer);
        root.setRight(featureBox);

        // ----- SCENE SETTINGS -----
        Scene scene = new Scene(root, 900, 500);
        stage.setTitle("Landing Page (JavaFX)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}