package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadFilho1 extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgFilho1("/src/recursos/minatobebe.png");
    try { //22 anos
      aumentarIdadePara(6);
      controlador.mudarImgFilho1("/src/recursos/minato1.png");

      aumentarIdadePara(15);
      controlador.mudarImgFilho1("/src/recursos/minato2.png");

      aumentarIdadePara(16); //38 anos

      controlador.mudarImgFilho1("/src/recursos/minato2.png");

      controlador.iniciarNeto1();
    
      aumentarIdadePara(30); //52 anos

    

      aumentarIdadePara(60); //82 anos
      controlador.mudarImgFilho1("/src/recursos/minato3.png");

      aumentarIdadePara(61);//filho1 morreu


      controlador.mudarImgFilho1("/src/recursos/caixao.png");


     
      
    }
    catch (final InterruptedException e) {
     
    }

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeFilho1(idade));
    }
  }
}