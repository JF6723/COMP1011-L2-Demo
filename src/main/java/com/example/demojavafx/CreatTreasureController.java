package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class CreatTreasureController {

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


    public void CreateTreasure(javafx.event.ActionEvent actionEvent) {

        MyTreasure myTreasure = new MyTreasure();
        myTreasure.setName(txtName.getText());
        myTreasure.setLocation(txtLocation.getText());
        myTreasure.setComment(txtComment.getText());
        labelTreasure.setText(myTreasure.toString());

    }
}
