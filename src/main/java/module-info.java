module com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board to javafx.fxml;
    exports com.example.simulating_operations_of_an_education_board_such_as_dhaka_education_board;
}