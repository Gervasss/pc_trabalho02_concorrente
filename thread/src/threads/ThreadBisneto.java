package src.threads;


import src.Controles.*;
import javafx.application.Platform;

public class ThreadBisneto extends Thread{
  private PrincipalControle controlador;
  private int idade = 0;


  public void setControlador(  PrincipalControle controlador){
    this.controlador=controlador;
  }

  @Override
  public void run(){
    controlador.mudarImgBisneto("/src/recursos/boruto1.png");
    try { //68 anos
      aumentarIdadePara(6); //74 anos
      controlador.mudarImgBisneto("/src/recursos/boruto1.png");

      aumentarIdadePara(10);//84 anos
      controlador.mudarImgBisneto("/src/recursos/boruto2.png");
 
    
      aumentarIdadePara(12); 
    


      controlador.mudarImgBisneto("/src/recursos/caixao.png");
       //Bisneto morreu

     
      
    }
    catch (final InterruptedException e) {
     
    }

    

  }
  public void aumentarIdadePara(final int novaIdade) throws InterruptedException{
    while(idade != novaIdade){
      Thread.sleep(1000);
      idade++;
      Platform.runLater( () ->controlador.atualizaIdadeBisneto(idade));
    }
  }
}