package controller;

/**
 * Sample Skeleton for 'GUI.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import model.CLIMain;
import model.TableContent;

public class GUIController extends CLIMain {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="table"
    private TableView<TableContent> table; // Value injected by FXMLLoader

    @FXML // fx:id="col1"
    private TableColumn<TableContent, String> col1; // Value injected by FXMLLoader

    @FXML // fx:id="col2"
    private TableColumn<TableContent, String> col2; // Value injected by FXMLLoader

    @FXML // fx:id="col3"
    private TableColumn<TableContent, String> col3; // Value injected by FXMLLoader

    @FXML // fx:id="writebutton"
    private Button writebutton; // Value injected by FXMLLoader

    @FXML // fx:id="readbutton"
    private Button readbutton; // Value injected by FXMLLoader

    @FXML // fx:id="submit"
    private Button submit; // Value injected by FXMLLoader

    @FXML // fx:id="textfield"
    private TextField textfield; // Value injected by FXMLLoader

    @FXML // fx:id="text"
    private Text text; // Value injected by FXMLLoader

    final ObservableList<TableContent> data = FXCollections.observableArrayList();//表格数据
    int markR = 0;
    int markW = 0;

    public GUIController() throws IOException {
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'GUI.fxml'.";
        assert col1 != null : "fx:id=\"col1\" was not injected: check your FXML file 'GUI.fxml'.";
        assert col2 != null : "fx:id=\"col2\" was not injected: check your FXML file 'GUI.fxml'.";
        assert col3 != null : "fx:id=\"col3\" was not injected: check your FXML file 'GUI.fxml'.";
        assert writebutton != null : "fx:id=\"writebutton\" was not injected: check your FXML file 'GUI.fxml'.";
        assert readbutton != null : "fx:id=\"readbutton\" was not injected: check your FXML file 'GUI.fxml'.";
        assert submit != null : "fx:id=\"submit\" was not injected: check your FXML file 'GUI.fxml'.";
        assert textfield != null : "fx:id=\"textfield\" was not injected: check your FXML file 'GUI.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'GUI.fxml'.";

        col1.setCellValueFactory(cellData -> cellData.getValue().CourseNameProperty());
        col2.setCellValueFactory(cellData -> cellData.getValue().TeacherNameProperty());
        col3.setCellValueFactory(cellData -> cellData.getValue().ClassroomProperty());
        table.setItems(data);
    }
    public void ReadButtonClick() throws Exception {
//        model.CLIMain program = new model.CLIMain();
//        program.write5Files(false);
//        program.read5Files(true);
        if(markW == 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Files should be written first.");
            alert.show();
            return;
        }
        read5Files(true);
        markR = 1;
    }
    public void WriteButtonClick() throws Exception {
//        model.CLIMain program = new model.CLIMain();
//        program.write5Files(true);
        write5Files(true);
        markW = 1;
    }
    public void SubmitButtonClick() throws Exception {
        if(markW == 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Files should be written first.");
            alert.show();
            return;
        }
        if(markR == 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Files should be read first.");
            alert.show();
            return;
        }

        table.getItems().clear();
        String text = textfield.getText();//获取文本框输入的内容
//        model.CLIMain program = new model.CLIMain();
//        program.write5Files(false);
//        program.read5Files(false);
//        program.SearchInfoBySid(text,true, data);
        SearchInfoBySid(text, true, data);
    }
}
