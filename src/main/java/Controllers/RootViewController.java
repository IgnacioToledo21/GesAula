package Controllers;

import dad.gesaula.ui.model.Alumno;
import dad.gesaula.ui.model.Grupo;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootViewController implements Initializable {

    //Model

    private StringProperty nombreFichero = new SimpleStringProperty();
    private ObjectProperty<Grupo> grupo = new SimpleObjectProperty<>();
    private ObjectProperty<Alumno> alumnos = new SimpleObjectProperty<>();


    //View

    @FXML
    private Tab GroupTab;

    @FXML
    private Tab StudentsTab;

    @FXML
    private TextField findButton;

    @FXML
    private Button newButton;

    @FXML
    private BorderPane rootview;

    @FXML
    private Button saveButton;

    @FXML
    private ToolBar toolbar;

    @FXML
    void onNewButton(ActionEvent event) {

    }

    @FXML
    void onSaveButton(ActionEvent event) {

    }

    //Controllers



    public RootViewController() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
        loader.setController(this);
        loader.load();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
