package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadFilho2 extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgFilho2("/src/recursos/kushina1.png");
    try { //25 anos
      aumentarIdadePara(6); //31 anos
      controlador.mudarImgFilho2("/src/recursos/kushina1.png");

      aumentarIdadePara(15);//40 anos
      controlador.mudarImgFilho2("/src/recursos/kushina2.png");

      aumentarIdadePara(20); //45 anos
      controlador.mudarImgFilho2("/src/recursos/kushina2.png");
      
      controlador.iniciarNeto2();
    
      aumentarIdadePara(30);  //55 anos
      controlador.mudarImgFilho2("/src/recursos/kushina3.png");
    

      aumentarIdadePara(55); //80 anos
      



     
      
    }
    catch (final InterruptedException e) {
     
    }
    controlador.mudarImgFilho2("/src/recursos/caixao.png");
      //filho2 morreu

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeFilho2(idade));
    }
  }
}