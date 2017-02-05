
public class Triangle {

	private int width;

	public Triangle(int aWidth) {
		width = aWidth;
	}

	public int getArea() {
		if (width == 1) {
			return 1;
		}
		Triangle smallerTriange = new Triangle(width - 1);
		int smallerArea = smallerTriange.getArea();
		System.out.println("smallerarea: " + smallerArea + " width:" + width);
		return smallerArea + width;
				
	}

}
