package otomasyon.demo;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.SimpleTimeZone;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;


public class GirisEkraniController extends AnaSayfaController implements Initializable{

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField tc_no;

    @FXML
    private Button sign_in_button;

    @FXML
    private StackPane stackPane;

    @FXML
    private Hyperlink link;

    @FXML
    private TextField password;

    @FXML
    private Label warning;

    public static int i=-1;

    boolean girisBasarili = false;
    @FXML
    private void loadMain(ActionEvent event) throws IOException {


        try {
            for (Vatandas v : HelloApplication.vatandaslar) {
                if (v.getTc_no().equals(tc_no.getText()) && v.getParola().equals(password.getText())) {
                    i = HelloApplication.vatandaslar.indexOf(v);

                    Parent root = FXMLLoader.load(getClass().getResource("AnaSayfa/AnaSayfa.fxml"));
                    Scene scene = sign_in_button.getScene();
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

                    updateLabelText(v.getAd() + " " + v.getSoyad());

                    girisBasarili = true;
                    break;  // Giriş başarılı olduğunda döngüden çık
                }
            }

            if (!girisBasarili) {
                throw new Exception("Kullanıcı adı veya şifre hatalı");
            }
        } catch (Exception e) {
            tc_no.setText("");
            password.setText("");
            warning.setText("Kullanıcı adı veya şifre hatalı");
            e.printStackTrace();
        }

        }



    @FXML
    private void loadForget(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SifremiUnuttum/SifremiUnuttum.fxml"));
        Scene scene = link.getScene();
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
}
