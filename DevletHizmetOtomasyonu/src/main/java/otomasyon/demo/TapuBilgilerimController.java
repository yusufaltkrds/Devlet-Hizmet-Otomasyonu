package otomasyon.demo;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TapuBilgilerimController implements Initializable {

    @FXML
    private Button bill;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button cars;

    @FXML
    private Button lawCase;

    @FXML
    private Button main_button;

    @FXML
    private Button weather;

    @FXML
    private Button sgk;

    @FXML
    private StackPane stackPane;

    @FXML
    private TableView<Tapularim> tableView;

    @FXML
    private TableColumn<Tapularim,String> il;

    @FXML
    private TableColumn<Tapularim,String> ilce;

    @FXML
    private TableColumn<Tapularim,String> mahalle;

    @FXML
    private TableColumn<Tapularim, String> tasinmaz_tipi;

    @FXML
    private TableColumn<Tapularim,String> adres;

    @FXML
    private TableColumn<Tapularim, String> nitelik;



    ObservableList<Tapularim> list = FXCollections.observableArrayList(HelloApplication.vatandaslar.get(GirisEkraniController.i).getTapularim());


    @FXML
    private void loadBill(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Faturalarim/Faturalarim.fxml"));
        Scene scene = bill.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.DISCRETE);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();

    }

    @FXML
    private void loadCars(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("araclarim/araclarim.fxml"));
        Scene scene = cars.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.DISCRETE);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();
    }

    @FXML
    private void loadLawCase(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("davadosyalari/davadosyalari.fxml"));
        Scene scene = lawCase.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.DISCRETE);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();
    }

    @FXML
    private void loadWeather(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("havadurumu/havadurumu.fxml"));
        Scene scene = weather.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.DISCRETE);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();
    }

    @FXML
    private void loadSGK(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("sgk/sgk.fxml"));
        Scene scene = sgk.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.DISCRETE);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();
    }

    @FXML
    private void loadMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AnaSayfa/AnaSayfa.fxml"));
        Scene scene = main_button.getScene();
        root.translateYProperty().set(scene.getHeight());

        stackPane.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            stackPane.getChildren().remove(borderPane);
        });
        timeline.play();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        il.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("il"));
        ilce.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("ilce"));
        mahalle.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("mahalle"));
        adres.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("adres"));
        tasinmaz_tipi.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("tasinmaz_tipi"));
        nitelik.setCellValueFactory(new PropertyValueFactory<Tapularim,String>("nitelik"));


        tableView.setItems(list);

    }
}
