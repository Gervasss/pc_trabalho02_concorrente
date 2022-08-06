package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadNeto1 extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgNeto1("/src/recursos/narutobebe.png");
    try { //38 anos
      aumentarIdadePara(6); //44 anos
      controlador.mudarImgNeto1("/src/recursos/naruto1.png");

      aumentarIdadePara(15);//53 anos
      controlador.mudarImgNeto1("/src/recursos/naruto2.png");

      aumentarIdadePara(30); //68 anos
      controlador.mudarImgNeto1("/src/recursos/naruto4.png");

      controlador.iniciarBisneto();
    

    

      aumentarIdadePara(35); //73 anos
     

      controlador.mudarImgNeto1("/src/recursos/caixao.png");
      //Neto1 morreu

     
      
    }
    catch (final InterruptedException e) {
     
    }
    

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeNeto1(idade));
    }
  }
}