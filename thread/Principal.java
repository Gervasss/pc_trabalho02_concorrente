/* ***************************************************************
* Autor: Gervásio Gabriel Gonçalves Cardoso de Brito
* Matricula: 201912286
* Inicio: 21/02/2022
* Ultima alteracao: 03/02/2022
* Nome: Principal.java
* Funcao: árvore genealógica
*************************************************************** */


import src.Controles.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import src.Controles.PrincipalControle;

public class Principal extends Application{
  public static void main(String args){
    launch(args);
  }

  @Override
  public void start(Stage stagePrimario) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/Principal.fxml"));

    
    PrincipalControle controle = new PrincipalControle();
    loader.setController(controle);

    Parent root = loader.load();

    Scene scene = new Scene(root);
    
    stagePrimario.setTitle("Arvore Genealogica do Naruto");
    stagePrimario.getIcons().add(new Image("/src/recursos/arvoresView.png"));
    
    stagePrimario.setScene(scene);
    stagePrimario.show();
  }

}