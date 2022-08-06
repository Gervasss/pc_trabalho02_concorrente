package src.Controles;




import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import src.threads.*;

public class PrincipalControle implements Initializable{
  //ImageView presentes na arvore
  @FXML ImageView imageViewPai;
  @FXML ImageView imageViewFilho1;
  @FXML ImageView imageViewFilho2;
  @FXML ImageView imageViewFilho3;
  @FXML ImageView imageViewNeto1;
  @FXML ImageView imageViewNeto2;
  @FXML ImageView imageViewBisneto;

  

  //Text que estao em baixo das imagens
  @FXML public Text txtPai;
  @FXML public Text txtFilho1;
  @FXML public Text txtFilho2;
  @FXML public Text txtFilho3;
  @FXML public Text txtNeto1;
  @FXML public Text txtNeto2;
  @FXML public Text txtBisneto;

  //public Text que mostram as idades
  @FXML public Text txtIdadePai;
  @FXML public Text txtIdadeFilho1;
  @FXML public Text txtIdadeFilho2;
  @FXML public Text txtIdadeFilho3;
  @FXML public Text txtIdadeNeto1;
  @FXML public Text txtIdadeNeto2;
  @FXML public Text txtIdadeBisneto; 

  


  //instanciando as threads
  private ThreadPai Pai;
  private ThreadFilho1 Filho1;
  private ThreadFilho2 Filho2;
  private ThreadFilho3 Filho3;
  private ThreadNeto1 Neto1;
  private ThreadNeto2 Neto2;
  private ThreadBisneto Bisneto;



  public PrincipalControle(){
  
    this.Pai = new ThreadPai();
    this.Filho1 = new ThreadFilho1();
    this.Filho2 = new ThreadFilho2();
    this.Filho3 = new ThreadFilho3();
    this.Neto1 = new ThreadNeto1();
    this.Neto2 = new ThreadNeto2();
    this.Bisneto = new ThreadBisneto();
  }

  
 
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    
   
   
    Pai.setControlador(this);
    Filho1.setControlador(this);
    Filho2.setControlador(this);
    Filho3.setControlador(this);
    Neto1.setControlador(this);
    Neto2.setControlador(this);
    Bisneto.setControlador(this);
    Pai.start();
  }
  

 /*@FXML
  public void iniciar(ActionEvent evento){
    Button botao = (Button) evento.getSource();
    botao.setDisable(true);

    
    Pai.start();
  }*/
  
  
  public void mudarImgPai(String local){
    imageViewPai.setImage(new Image(local));
  }

  public void mudarImgFilho1(String local){
    imageViewFilho1.setImage(new Image(local));
  }
  
  public void mudarImgFilho2(String local){
    imageViewFilho2.setImage(new Image(local));
  }

  public void mudarImgFilho3(String local){
    imageViewFilho3.setImage(new Image(local));
  }
  
  public void mudarImgNeto1(String local){
    imageViewNeto1.setImage(new Image(local));
  }
  
  public void  mudarImgNeto2(String local){
    imageViewNeto2.setImage(new Image(local));
  }
  
  public void mudarImgBisneto(String local){
    imageViewBisneto.setImage(new Image(local));
  }



  public void atualizaIdadePai(int idade){
    txtIdadePai.setText(String.valueOf(idade));
  }

  public void atualizaIdadeFilho1(int idade){
    txtIdadeFilho1.setText(String.valueOf(idade));
  }

  public void atualizaIdadeFilho2(int idade){
    txtIdadeFilho2.setText(String.valueOf(idade));
  }

  public void atualizaIdadeFilho3(int idade){
    txtIdadeFilho3.setText(String.valueOf(idade));
  }

  public void atualizaIdadeNeto1(int idade){
    txtIdadeNeto1.setText(String.valueOf(idade));
  }

  public void atualizaIdadeNeto2(int idade){
    txtIdadeNeto2.setText(String.valueOf(idade));
  }

  public void atualizaIdadeBisneto(int idade){
    txtIdadeBisneto.setText(String.valueOf(idade));
  }
  


  public void iniciarFilho1(){
    txtFilho1.setVisible(true);
    Filho1.start();
  }

  public void iniciarFilho2(){
    txtFilho2.setVisible(true);
     Filho2.start();
  }

  public void iniciarFilho3(){
    txtFilho3.setVisible(true);
    Filho3.start();
  }

  public void iniciarNeto1(){
    txtNeto1.setVisible(true);
    Neto1.start();
  }

  public void iniciarNeto2(){
    txtNeto2.setVisible(true);
   Neto2.start();
  }

  public void iniciarBisneto(){
    txtBisneto.setVisible(true);
    Bisneto.start();
  }
}