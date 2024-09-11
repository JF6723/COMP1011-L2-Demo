package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.*;

public class CreatTreasureController implements Initializable {

    @FXML
    private Button btnSubmit;

    @FXML
    private Label labelTreasure;

    @FXML
    private TextField txtComment;

    @FXML
    private TextArea txtLocation;

    @FXML
    private TextField txtName;

    @FXML
    private ComboBox<String> comLocations;


    public void CreateTreasure(javafx.event.ActionEvent actionEvent) {

        MyTreasure myTreasure = new MyTreasure();
        myTreasure.setName(txtName.getText());
        myTreasure.setLocation(txtLocation.getText());
        myTreasure.setComment(txtComment.getText());
        labelTreasure.setText(myTreasure.toString());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //labelTreasure.setVisible(false);
        List<String> locations = Arrays.asList("Garage", "Shed", "Basement");
        comLocations.getItems().addAll(locations );
    }
}
