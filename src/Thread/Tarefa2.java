package Thread;

public class Tarefa2 implements Runnable{
  private int resposta = -1;
  
    public Tarefa2()
    {
    	if(this.resposta <= 10)
    		this.resposta += 1;
    	
    	System.out.println("Tarefa 2 : "+this.resposta);
    }
  
  public void contador()
  {
	  if(this.resposta <= 10)
  		this.resposta += 1;
	  
	  System.out.println("Tarefa 2 : "+this.resposta);
  }
    
	@Override
	public void run() {
		for(int i = 1;i <=10;i++)
		this.contador();
	}
}
