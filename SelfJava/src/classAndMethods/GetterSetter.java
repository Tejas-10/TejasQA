package classAndMethods;

public class GetterSetter {

		String model;
		String colour;
		int year = 1992;
	
		public void car(){
		System.out.println("getter");
		
		
	}

		public String getColour() {
			System.out.println(colour);
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

}
