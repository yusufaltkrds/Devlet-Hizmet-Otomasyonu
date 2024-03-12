package otomasyon.demo;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import java.util.Random;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SifremiUnuttumController  {

    @FXML
    private StackPane stackPane;

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField kod;

    @FXML
    private Button sign_right_button;

    @FXML
    private TextField tel_no;

    @FXML
    private Button code;

    @FXML
    private Label hata;
    public static int i=-1;
    boolean kodBasarili = false;

    Random random = new Random();
    int rand;
    @FXML
    private void sendCode(ActionEvent event) throws IOException {



            for (Vatandas v : HelloApplication.vatandaslar) {
                if (v.getTelefon().equals(tel_no.getText())) {
                    i = HelloApplication.vatandaslar.indexOf(v);
                    rand=random.nextInt(99999,1000000);
                    System.out.println(rand);
                    kodBasarili = true;
                    hata.setText("Kod gönderildi.");
                    break;  // Giriş başarılı olduğunda döngüden çık
                }
            }

            if (!kodBasarili) {

                hata.setText("Telefon numarası hatalı");
        }

    }




    @FXML
    private void loadChange(ActionEvent event) throws IOException {


            if(kod.getText().equals(String.valueOf(rand))) {
                Parent root = FXMLLoader.load(getClass().getResource("SifreDegisme/SifreDegisme.fxml"));
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

            }
            else{
                hata.setText("Kod hatalı");
            }
        }
}
