public class MyPointNew {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistanceFrom(MyPointNew q){
		double distance;
		distance = Math.pow(Math.pow(x-q.getX(),2) + Math.pow(y-q.getY(),2), 0.5);

		return distance;
	}
}


