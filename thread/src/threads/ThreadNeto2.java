package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadNeto2 extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgNeto2("/src/recursos/narutobebe.png");
    try {  //45 anos
      aumentarIdadePara(6); //51 anos
      controlador.mudarImgNeto2("/src/recursos/naruto2.png");

      aumentarIdadePara(15); //60 anos
      controlador.mudarImgNeto2("/src/recursos/naruto3.png"); 
 
    
      aumentarIdadePara(33); 
    


      controlador.mudarImgNeto2("/src/recursos/caixao.png");
       //Neto2 morreu

     
      
    }
    catch (final InterruptedException e) {
     
    }

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeNeto2(idade));
    }
  }
}