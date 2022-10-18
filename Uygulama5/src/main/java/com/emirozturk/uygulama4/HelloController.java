package com.emirozturk.uygulama4;

import com.emirozturk.uygulama4.Model.EQ;
import com.emirozturk.uygulama4.Model.EQListesi;
import com.emirozturk.uygulama4.Model.Koordinat;
import com.emirozturk.uygulama4.Model.Magnitude;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    EQListesi liste;
    @FXML
    public TextField TbSaat;
    @FXML
    public TextField TbBoylam;
    @FXML
    public TextField TbEnlem;
    @FXML
    public TextField TbDerinlik;
    @FXML
    public TextField TbMD;
    @FXML
    public TextField TbML;
    @FXML
    public TextField TbMw;
    @FXML
    public TextField TbYer;
    @FXML
    public TextField TbNitelik;
    @FXML
    public TableView LbListe;
    @FXML
    private TextField TbTarih;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        liste = EQListesi.dosyadanOku("boun.txt");
        listele(liste.getListe());
    }

    void listele(List<EQ> liste){
        LbListe.getItems().clear();
        TableColumn<EQ,String> tarihSaat = new TableColumn<>("Tarih Saat");
        tarihSaat.setCellValueFactory(new PropertyValueFactory<EQ,String>("tarihSaat"));

        TableColumn<EQ,String> koordinat = new TableColumn<>("Koordinat");
        koordinat.setCellValueFactory(new PropertyValueFactory<EQ,String>("koordinat"));

        TableColumn<EQ,String> siddet = new TableColumn<>("Şiddet");
        siddet.setCellValueFactory(new PropertyValueFactory<EQ,String>("siddet"));

        TableColumn<EQ,String> yer = new TableColumn<>("Yer");
        yer.setCellValueFactory(new PropertyValueFactory<EQ,String>("yer"));

        TableColumn<EQ,String> nitelik = new TableColumn<>("Çözüm Niteliği");
        nitelik.setCellValueFactory(new PropertyValueFactory<EQ,String>("cozumNiteligi"));

        LbListe.getColumns().setAll(tarihSaat,koordinat,siddet,yer,nitelik);
        LbListe.getItems().addAll(liste);
    }

    @FXML
    void onBtnEkleClick(){
        var tarihSaat =  LocalDateTime.parse(TbTarih.getText()+" "+TbSaat.getText(),
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        var enlem = Float.parseFloat(TbEnlem.getText());
        var boylam = Float.parseFloat(TbBoylam.getText());
        var derinlik = Float.parseFloat(TbDerinlik.getText());
        var koordinat = new Koordinat(enlem,boylam,derinlik);
        var md = Float.parseFloat(TbMD.getText());
        var ml = Float.parseFloat(TbML.getText());
        var mw = Float.parseFloat(TbMw.getText());
        var mag = new Magnitude(md,ml,mw);
        var yer = TbYer.getText();
        var cozumNiteligi = TbNitelik.getText();
        liste.EQEkle(new EQ(tarihSaat,koordinat,mag,yer,cozumNiteligi));
        listele(liste.getListe());
    }
    @FXML
    void onBtnSilClick(){
        var index = LbListe.getSelectionModel().getSelectedIndex();
        liste.sil(index);
        listele(liste.getListe());
    }
    @FXML
    void onBtnAraClick(){
        if(TbTarih.getText().equals("")){
            listele(liste.getListe());
        }
        else {
            var tarihSaat = LocalDate.parse(TbTarih.getText(),
                    DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            var sonuc = liste.ara(tarihSaat);
            listele(sonuc);
        }
    }
    @FXML
    void onBtnGuncelleClick(){

    }


    /*
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    */
}