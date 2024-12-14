package com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class AccountantFinancialReportingController {

    @FXML
    private Label archiveStatusLabel;

    @FXML
    private TableView<?> dataTableView;

    @FXML
    private TableColumn<?, ?> dateTC;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private TableColumn<?, ?> expenditureAmountTC;

    @FXML
    private ComboBox<?> formatComboBox;

    @FXML
    private TableColumn<?, ?> programNameTC;

    @FXML
    private TextArea reportTextArea;

    @FXML
    private ComboBox<?> reportTypeComboBox;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private CheckBox validateYesCheckBox;

    @FXML
    private CheckBox validatenoCheckBox;

    @FXML
    void archiveButton(ActionEvent event) {

    }

    @FXML
    void downloadReportButton(ActionEvent event) {

    }

    @FXML
    void fetchDataButton(ActionEvent event) {

    }

    @FXML
    void generateReportButton(ActionEvent event) {

    }

}

