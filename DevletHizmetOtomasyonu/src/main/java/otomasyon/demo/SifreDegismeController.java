package otomasyon.demo;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;

public class SifreDegismeController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label hata;

    @FXML
    private TextField pass_1;

    @FXML
    private TextField pass_2;

    @FXML
    private Button sign_right_button;

    @FXML
    private StackPane stackPane;

    public static int i=-1;
    boolean kodBasarili = false;

    @FXML
    private void loadLogin(ActionEvent event) throws IOException {


        if(pass_1.getText().equals(pass_2.getText())) {
            HelloApplication.vatandaslar.get(SifremiUnuttumController.i).setParola(pass_1.getText());
            Parent root = FXMLLoader.load(getClass().getResource("GirisEkrani/GirisEkrani.fxml"));
            Scene scene = sign_right_button.getScene();
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
            hata.setText("Şifreniz başarıyla değiştirildi.");

        }
        else{
            hata.setText("Şifreler aynı değil");
        }
    }

}
