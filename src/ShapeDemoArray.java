
public class ShapeDemoArray {
	public static void main(String[] args) {
		
		Shape[] shape=new Shape[3];
		
		shape[0] =new Circle();
		shape[1] =new Polygon();
		shape[2] =new Rectangle();
		
		for(int i=0;i<3;i++)
			shape[i].draw();
	}
}

