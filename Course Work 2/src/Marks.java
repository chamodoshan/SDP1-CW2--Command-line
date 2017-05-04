
public class Marks implements java.io.Serializable{
	private int Module;
	

	
	public Marks(int Module){
		this.Module=Module;

    }



	@Override
	public String toString() {
		return "Average = " + Module ;
	}



	public int getModule1() {
		return Module;
	}
}	