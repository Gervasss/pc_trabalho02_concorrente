package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadPai extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgPai("/src/recursos/jirayabebe.png");
    try {
      aumentarIdadePara(6);
      controlador.mudarImgPai("/src/recursos/jiraya1.png");

      aumentarIdadePara(15);
      controlador.mudarImgPai("/src/recursos/jiraya2.png");

      aumentarIdadePara(22);

      
      controlador.iniciarFilho1();
    
      aumentarIdadePara(25); 

      
      controlador.iniciarFilho2();

      aumentarIdadePara(30);
      controlador.mudarImgPai("/src/recursos/jiraya3.png");

      aumentarIdadePara(32);

     
      controlador.iniciarFilho3();

      aumentarIdadePara(60);
      

      aumentarIdadePara(90);
    }
    catch (final InterruptedException e) {
     
    }

    
    controlador.mudarImgPai("/src/recursos/caixao.png");

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadePai(idade));
    }
  }
}