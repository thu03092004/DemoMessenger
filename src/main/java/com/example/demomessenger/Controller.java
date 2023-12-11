package com.example.demomessenger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label user_name;
    @FXML
    private Label active_status;
    @FXML
    protected void onHelloButtonClick() {

    }
    boolean status = true;
    @FXML
    public void setActive_status() {
        if(status) {
            active_status.setText("Online");
        } else {
            active_status.setText("Offline");
        }
    }
}