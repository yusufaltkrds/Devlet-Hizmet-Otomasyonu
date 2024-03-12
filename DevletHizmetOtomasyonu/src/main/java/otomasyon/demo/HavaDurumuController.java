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

public class HavaDurumuController implements Initializable {

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
    private Button realty;

    @FXML
    private Button sgk;

    @FXML
    private StackPane stackPane;

    @FXML
    private TableView<HavaDurumu> tableView;

    @FXML
    private TableColumn<HavaDurumu,String> sehir;

    @FXML
    private TableColumn<HavaDurumu,String> p_tesi;

    @FXML
    private TableColumn<HavaDurumu,String> sali;

    @FXML
    private TableColumn<HavaDurumu, String> carsamba;

    @FXML
    private TableColumn<HavaDurumu, String> persembe;

    @FXML
    private TableColumn<HavaDurumu, String> cuma;

    ObservableList<HavaDurumu> list = FXCollections.observableArrayList(
            new HavaDurumu("İstanbul"),
            new HavaDurumu("İzmir"),
            new HavaDurumu("Ankara"),
            new HavaDurumu("Bursa"),
            new HavaDurumu("Gaziantep")
    );


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
        sehir.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("sehir"));
        p_tesi.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("p_tesi"));
        sali.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("sali"));
        carsamba.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("carsamba"));
        persembe.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("persembe"));
        cuma.setCellValueFactory(new PropertyValueFactory<HavaDurumu,String>("cuma"));

        tableView.setItems(list);

    }
}
