package com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AccountantBudgetManagementController {

    @FXML
    private TableColumn<?, ?> approvedBudgetTC;

    @FXML
    private TableColumn<?, ?> departmentNameTC;

    @FXML
    private Label distributionStatusLabe;

    @FXML
    private TableColumn<?, ?> requestedBudgetTC;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Label totalAvailableBudgetTextField;

    @FXML
    private Label totalBudgetTextField;

    @FXML
    private Label updateBudgetAllocationAndDistributionLabel;

    @FXML
    private Label validationLabel;

    @FXML
    void distributeButton(ActionEvent event) {

    }

    @FXML
    void showDistributionButton(ActionEvent event) {

    }

    @FXML
    void validateButton(ActionEvent event) {

    }

}


