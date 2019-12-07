package controller;

/**
 * Sample Skeleton for 'GUIView.fxml' Controller Class
 */

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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

    @FXML // fx:id="stutext"
    private TextField stutext; // Value injected by FXMLLoader

    @FXML // fx:id="teatext"
    private TextField teatext; // Value injected by FXMLLoader

    @FXML // fx:id="coutext"
    private TextField coutext; // Value injected by FXMLLoader

    @FXML // fx:id="schtext"
    private TextField schtext; // Value injected by FXMLLoader

    @FXML // fx:id="eletext"
    private TextField eletext; // Value injected by FXMLLoader

    @FXML // fx:id="writebutton1"
    private Button writebutton1; // Value injected by FXMLLoader

    @FXML // fx:id="writebutton11"
    private Button writebutton11; // Value injected by FXMLLoader

    @FXML // fx:id="writebutton12"
    private Button writebutton12; // Value injected by FXMLLoader

    @FXML // fx:id="writebutton13"
    private Button writebutton13; // Value injected by FXMLLoader


    final ObservableList<TableContent> data = FXCollections.observableArrayList();//表格数据
    int markR = 0;
//    int markW = 0;

    public GUIController() throws IOException {
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert col1 != null : "fx:id=\"col1\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert col2 != null : "fx:id=\"col2\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert col3 != null : "fx:id=\"col3\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert writebutton != null : "fx:id=\"writebutton\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert readbutton != null : "fx:id=\"readbutton\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert submit != null : "fx:id=\"submit\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert textfield != null : "fx:id=\"textfield\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert stutext != null : "fx:id=\"stutext\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert teatext != null : "fx:id=\"teatext\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert coutext != null : "fx:id=\"coutext\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert schtext != null : "fx:id=\"schtext\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert eletext != null : "fx:id=\"eletext\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert writebutton1 != null : "fx:id=\"writebutton1\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert writebutton11 != null : "fx:id=\"writebutton11\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert writebutton12 != null : "fx:id=\"writebutton12\" was not injected: check your FXML file 'GUIView.fxml'.";
        assert writebutton13 != null : "fx:id=\"writebutton13\" was not injected: check your FXML file 'GUIView.fxml'.";

        col1.setCellValueFactory(cellData -> cellData.getValue().CourseNameProperty());
        col2.setCellValueFactory(cellData -> cellData.getValue().TeacherNameProperty());
        col3.setCellValueFactory(cellData -> cellData.getValue().ClassroomProperty());
        table.setItems(data);
    }
    public void ReadButtonClick() throws Exception {
//        model.CLIMain program = new model.CLIMain();
//        program.write5Files(false);
//        program.read5Files(true);
//        if(markW == 0) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setHeaderText(null);
//            alert.setContentText("Files should be written first.");
//            alert.show();
//            return;
//        }
        read5Files(true);
        markR = 1;
    }
//    public void WriteButtonClick() throws Exception {
//        model.CLIMain program = new model.CLIMain();
//        program.write5Files(true);
//        write5Files(true,0);
//        markW = 1;
//    }
    public void SubmitButtonClick() {
//        if(markW == 0) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setHeaderText(null);
//            alert.setContentText("Files should be written first.");
//            alert.show();
//            return;
//        }
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
    @FXML
    void WriteStuButtonClick(ActionEvent event) throws IOException {
        String guidata = stutext.getText();
        write5Files(true,1, guidata);
    }

    @FXML
    void WriteTeaButtonClick(ActionEvent event) throws IOException {
        String guidata = teatext.getText();
        write5Files(true,2, guidata);
    }

    @FXML
    void WriteCouButtonClick(ActionEvent event) throws IOException {
        String guidata = coutext.getText();
        write5Files(true,3, guidata);
    }

    @FXML
    void WriteSchButtonClick(ActionEvent event) throws IOException {
        String guidata = schtext.getText();
        write5Files(true,4, guidata);
    }

    @FXML
    void WriteEleButtonClick(ActionEvent event) throws IOException {
        String guidata = eletext.getText();
        write5Files(true,5, guidata);
    }

}
