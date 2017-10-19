package semThread;

public class Tarefa1 {
  private int resposta = 0;
  
  public void resposta()
  {
	  for(int i = 1;i <=10;i++) {
		  this.resposta +=1;
	     
	  System.out.println("Sem thread - Tarefa 1: "+ this.resposta);
	  }
  }
  
	
	
}
