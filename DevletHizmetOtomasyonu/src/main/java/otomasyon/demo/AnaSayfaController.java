package otomasyon.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;


public class AnaSayfaController implements Initializable{

    @FXML
    private BorderPane borderPane;

    @FXML
    private StackPane stackPane;

    @FXML
    private Button to_sign_out;

    @FXML
    private Button cars;

    @FXML
    private Button lawcase;

    @FXML
    private Button realty;

    @FXML
    private Button sgk;

    @FXML
    private Button bills;

    @FXML
    private Button weather;

    public static  Label label;
    @FXML
    private Label welcome_label;



    @FXML
    private void loadLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GirisEkrani/GirisEkrani.fxml"));
        Scene scene = to_sign_out.getScene();
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

    @FXML
    private void loadAraclarim(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Araclarim/Araclarim.fxml"));
        Scene scene = cars.getScene();
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
    @FXML
    private void loadDavaDosyalari(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DavaDosyalari/DavaDosyalari.fxml"));
        Scene scene = lawcase.getScene();
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
    @FXML
    private void loadRealty(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tapubilgilerim/tapubilgilerim.fxml"));
        Scene scene = realty.getScene();
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
    @FXML
    private void loadSGK(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sgk/sgk.fxml"));
        Scene scene = sgk.getScene();
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
    @FXML
    private void loadBills(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("faturalarim/faturalarim.fxml"));
        Scene scene = bills.getScene();
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
    @FXML
    private void loadWeather(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("havadurumu/havadurumu.fxml"));
        Scene scene = weather.getScene();
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

    public static void updateLabelText(String newText) {
        label.setText(newText);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label = welcome_label;
    }
}
