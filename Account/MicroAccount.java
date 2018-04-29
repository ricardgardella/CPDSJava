package Account;//CPDS Exam January 2013

public class MicroAccount {
	private int i=0;
	private int M;
	
	public MicroAccount(int bound) {
		M=bound;
		
	}
	public void deposit() throws InterruptedException {
	    if(this.i != M)this.i++;
	    else wait();
	}
	public void withdraw() throws InterruptedException {
		if(this.i != 0) this.i--;
		else wait();
	}

    public int getI() {
        return i;
    }
}
	
