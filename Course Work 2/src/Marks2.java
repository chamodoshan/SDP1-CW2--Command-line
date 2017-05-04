
public class Marks2 implements java.io.Serializable {
    private int Module;
	

	
	public Marks2(int Module){
		this.Module=Module;

    }



	@Override
	public String toString() {
		return "Average = " + Module ;
	}



	public int getModule() {
		return Module;
	}

}
