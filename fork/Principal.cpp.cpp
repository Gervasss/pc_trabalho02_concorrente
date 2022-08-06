/* ***************************************************************
* Autor: Gervásio Gabriel Gonçalves Cardoso de Brito
* Matricula: 201912286
* Inicio: 20/02/2022
* Ultima alteracao: 03/02/2022
* Nome: Principal.java
* Funcao: árvore genalógica
*************************************************************** */



#include <unistd.h>
#include <iostream>
#include <time.h>

using namespace std;

int main (void) {
  pid_t idProcesso;
  cout << "Inicio do processo\n\n";
  idProcesso = fork();
  
  
  if(idProcesso==-1)
    exit(1);
  
  if(idProcesso==0){
    sleep(22);
    cout << "Nasce o primeiro filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
    idProcesso = fork();
    
   
    
    
    if(idProcesso==-1)
      exit(1);
  
    
    if(idProcesso == 0){
      sleep(16);
      cout << "Nasce o primeiro neto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
      idProcesso = fork();
      
      
      
   
      if(idProcesso==-1)
        exit(1);
  
     
      if(idProcesso == 0){
        sleep(30);
        cout << "Nasce o bisneto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        
      
        
        sleep(12);
        cout << "Morre o bisneto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        _exit(0);
        
      }
      else{
        sleep(35);
        cout << "Morre o primeiro neto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        
        sleep(10);  
        _exit(0);
      }
      
      
    }
    
   
    else{
      sleep(61);
      cout << "Morre o primeiro filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
      _exit(0);
    }
  }
  
  
  else{
    cout << "Nasce o pai, id = " << getpid() << "\n";
    sleep(25);
    idProcesso = fork();
    
    
    
  
    if(idProcesso==-1)
      exit(1);
    
    
    if(idProcesso == 0){
      cout << "Nasce o segundo filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
      sleep(20);
      idProcesso = fork();
      
     
      
      
      if(idProcesso==-1)
        exit(1);
  
     
      if(idProcesso == 0){
        cout << "Nasce o segundo neto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        sleep(33);
        cout << "Morre o segundo neto, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        _exit(0);
        
       
        
      }
      
     
      else{
        sleep(35);
        cout << "Morre o segundo filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        _exit(0);
        
     
      }
    
   
    else{
      sleep(7);
      idProcesso = fork();
      
      
      
    
      if(idProcesso==-1)
        exit(1);
  
     
      if(idProcesso == 0){
        cout << "Nasce o terceiro filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        sleep(55);
        cout << "Morre o terceiro filho, id pai = " << getppid() << " id filho = " << getpid() << "\n";
        _exit(0);      
      }
      

      else{
        sleep(58);
        cout << "Morre o pai, id = " << getpid() << "\n";
        
       
        
      }
  }
  return 0;
}