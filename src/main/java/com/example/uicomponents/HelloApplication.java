//package com.example.uicomponents;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.Slider;
//import javafx.scene.control.ToggleGroup;
//import javafx.scene.control.RadioButton;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        GridPane gridPane = new GridPane();
//        gridPane.setPadding(new Insets(100));
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
//        gridPane.setAlignment(Pos.CENTER);
//        Label nameLabel = new Label("Name : ");
//        TextField nameTextField = new TextField();
//        nameTextField.setPromptText("Enter your name");
//        Label passwordLabel = new Label("Password : ");
//        PasswordField passwordTextField = new PasswordField();
//        passwordTextField.setPromptText("Enter your password");
//        Label genderLabel = new Label("Gender : ");
//        RadioButton male = new RadioButton("Male");
//        RadioButton female = new RadioButton("Female");
//        ToggleGroup group = new ToggleGroup();
//        male.setToggleGroup(group);
//        female.setToggleGroup(group);
//        HBox radioButtons = new HBox(10,male,female);
//        Label checkBoxLabel = new Label("Check Box: ");
//        CheckBox java = new CheckBox("Java");
//        CheckBox c = new CheckBox("C");
//        CheckBox python = new CheckBox("Python");
//        CheckBox javascript = new CheckBox("Javascript");
//        HBox checkBoxOutline = new HBox(10,java,c,python,javascript);
//        Label countryLabel = new Label("Country : ");
//        ComboBox<String> countryList = new ComboBox<>();
//        countryList.getItems().addAll("India","US","North America","South America");
//        countryList.setPromptText("Select Country");
//        Label textAreaLabel  = new Label("Text : ");
//        TextArea textArea = new TextArea();
//        textArea.setPrefHeight(150);
//        Button btn = new Button("Submit");
//        btn.setOnAction(e->{
//            String name = nameTextField.getText();
//            String password = passwordTextField.getText();
//            String gender = male.isSelected()?"Male":"Female";
//            String country = countryList.getValue();
//            StringBuilder checkBoxResult = new StringBuilder();
//            if(java.isSelected())   checkBoxResult.append(" Java ");
//            if(c.isSelected()) checkBoxResult.append(" C ");
//            if(python.isSelected()) checkBoxResult.append(" Python ");
//            if(javascript.isSelected()) checkBoxResult.append(" Javascript ");
//            textArea.setText(
//                    "Name : "+name+"\nPassword : "+password+"\nGender : "+gender+"\nCountry : "+country+"\nSkills : "+checkBoxResult.toString()
//            );
//        });
//        nameLabel.setStyle("-fx-font-weight:bold; -fx-text-fill:white");
//        passwordLabel.setStyle("-fx-font-weight:bold");
//        genderLabel.setStyle("-fx-font-weight:bold");
//        countryLabel.setStyle("-fx-font-weight:bold");
//        checkBoxLabel.setStyle("-fx-font-weight:bold");
//        textAreaLabel.setStyle("-fx-font-weight:bold");
//        gridPane.add(nameLabel,0,1);
//        gridPane.add(nameTextField,1,1);
//        gridPane.add(passwordLabel,0,2);
//        gridPane.add(passwordTextField,1,2);
//        gridPane.add(genderLabel,0,3);
//        gridPane.add(radioButtons,1,3);
//        gridPane.add(checkBoxLabel,0,4);
//        gridPane.add(checkBoxOutline,1,4);
//        gridPane.add(countryLabel,0,5);
//        gridPane.add(countryList,1,5);
//        gridPane.add(btn,1,6);
//        gridPane.add(textAreaLabel,0,7);
//        gridPane.add(textArea,1,7);
//        gridPane.setStyle("-fx-background-color:#065a60");
//        Scene scene = new Scene(gridPane, 320, 240);
//
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//}
package com.example.uicomponents;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #04364A, #0F4C75);");

        VBox card = new VBox(15);
        card.setPadding(new Insets(30));
        card.setAlignment(Pos.CENTER_LEFT);
        card.setStyle(
                "-fx-background-color: white; " +
                        "-fx-background-radius: 15; " +
                        "-fx-padding: 40;" +
                        "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.25), 15, 0.3, 0, 5);"
        );

        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(18);

        Label nameLabel = new Label("Full Name:");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter full name");

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");

        Label genderLabel = new Label("Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);
        HBox genderBox = new HBox(15, male, female);

        Label skillsLabel = new Label("Skills:");
        CheckBox java = new CheckBox("Java");
        CheckBox c = new CheckBox("C");
        CheckBox python = new CheckBox("Python");
        CheckBox javascript = new CheckBox("JavaScript");
        FlowPane skillsPane = new FlowPane(10, 10, java, c, python, javascript);

        Label countryLabel = new Label("Country:");
        ComboBox<String> countryBox = new ComboBox<>();
        countryBox.getItems().addAll("India", "US", "North America", "South America");
        countryBox.setPromptText("Select country");

        Label outputLabel = new Label("Output:");
        TextArea outputArea = new TextArea();
        outputArea.setPrefHeight(150);

        Button submitBtn = new Button("Submit");
        submitBtn.setStyle(
                "-fx-background-color:#1B9C85;" +
                        "-fx-text-fill:white;" +
                        "-fx-font-weight:bold;" +
                        "-fx-background-radius:8;" +
                        "-fx-padding:10 20;"
        );

        submitBtn.setOnAction(e -> {
            String name = nameField.getText();
            String pass = passwordField.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String country = countryBox.getValue();

            StringBuilder skills = new StringBuilder();
            if (java.isSelected()) skills.append(" Java ");
            if (c.isSelected()) skills.append(" C ");
            if (python.isSelected()) skills.append(" Python ");
            if (javascript.isSelected()) skills.append(" JavaScript ");

            outputArea.setText(
                    "Name: " + name +
                            "\nPassword: " + pass +
                            "\nGender: " + gender +
                            "\nCountry: " + country +
                            "\nSkills: " + skills
            );
        });

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(genderLabel, 0, 2);
        grid.add(genderBox, 1, 2);
        grid.add(skillsLabel, 0, 3);
        grid.add(skillsPane, 1, 3);
        grid.add(countryLabel, 0, 4);
        grid.add(countryBox, 1, 4);
        grid.add(submitBtn, 1, 5);
        grid.add(outputLabel, 0, 6);
        grid.add(outputArea, 1, 6);

        card.getChildren().add(grid);
        root.setCenter(card);

        Scene scene = new Scene(root, 650, 650);
        stage.setScene(scene);
        stage.setTitle("Pretty UI Form Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
