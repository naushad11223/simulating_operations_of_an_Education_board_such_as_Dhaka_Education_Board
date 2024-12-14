package com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class AccountantAuditController {

    @FXML
    private TableColumn<?, ?> amountTC;

    @FXML
    private ListView<?> auditorListView;

    @FXML
    private TableColumn<?, ?> dateTC;

    @FXML
    private TableColumn<?, ?> descriptionTC;

    @FXML
    private TableView<?> queriesTableView;

    @FXML
    private TableColumn<?, ?> queryIDTC;

    @FXML
    private TableColumn<?, ?> recordIDTC;

    @FXML
    private TextArea reportTextArea;

    @FXML
    private TextArea responseTextArea;

    @FXML
    private TableView<?> validateTableView;

    @FXML
    void generateButton(ActionEvent event) {

    }

    @FXML
    void shareButton(ActionEvent event) {

    }

    @FXML
    void submitButton(ActionEvent event) {

    }

}
