
public class Marks3 implements java.io.Serializable {
	 private int Module;
		

		
		public Marks3(int Module){
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
