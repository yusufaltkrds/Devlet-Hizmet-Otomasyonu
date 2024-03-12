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
import java.net.URL;
import java.util.ResourceBundle;

public class FaturalarimController implements Initializable {

    @FXML
    private Button weather;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button cars;

    @FXML
    private Button lawCase;

    @FXML
    private Button main_button;

    @FXML
    private Button realty;

    @FXML
    private Button sgk;

    @FXML
    private StackPane stackPane;

    @FXML
    private TableView<Faturalarim> tableView;

    @FXML
    private TableColumn<Faturalarim,String> fatura_turu;

    @FXML
    private TableColumn<Faturalarim,String> abone_no;

    @FXML
    private TableColumn<Faturalarim,String> ad;

    @FXML
    private TableColumn<Faturalarim, String> soyad;

    @FXML
    private TableColumn<Faturalarim,String> kesim_tarihi;

    @FXML
    private TableColumn<Faturalarim, String> tutar;

    ObservableList<Faturalarim> list = FXCollections.observableArrayList(HelloApplication.vatandaslar.get(GirisEkraniController.i).getFaturalarim());


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
    private void loadRealty(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("tapubilgilerim/tapubilgilerim.fxml"));
        Scene scene = realty.getScene();
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
        fatura_turu.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("fatura_turu"));
        abone_no.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("abone_no"));
        ad.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("ad"));
        soyad.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("soyad"));
        kesim_tarihi.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("kesim_tarihi"));
        tutar.setCellValueFactory(new PropertyValueFactory<Faturalarim,String>("tutar"));


        tableView.setItems(list);
    }
}
