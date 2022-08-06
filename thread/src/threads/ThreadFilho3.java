package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadFilho3 extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgFilho3("/src/recursos/nagato1.png");
    try { //32 anos
      aumentarIdadePara(6); //38 anos
      controlador.mudarImgFilho3("/src/recursos/nagato2.png");

      aumentarIdadePara(15); //47 anos
      controlador.mudarImgFilho3("/src/recursos/nagato3.png"); 
 
    
      aumentarIdadePara(55); //87 anos
    


      controlador.mudarImgFilho3("/src/recursos/caixao.png");
       //filho3 morreu

     
      
    }
    catch (final InterruptedException e) {
     
    }

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeFilho3(idade));
    }
  }
}