public class MyDate extends Object {
	private int day, month, year;
	public MyDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	@Override
	public String toString() {
		String mNum = Integer.toString(this.month);
		String mString;

		switch (mNum){
			case "1":
				mString = "January";
				break;
			case "2":
				mString = "February";
				break;
			case "3":
				mString = "March";
				break;
			case "4":
				mString = "April";
				break;
			case "5":
				mString = "May";
				break;
			case "6":
				mString = "June";
				break;
			case "7":
				mString = "July";
				break;
			case "8":
				mString = "August";
				break;
			case "9":
				mString = "September";
				break;
			case "10":
				mString = "October";
				break;
			case "11":
				mString = "November";
				break;
			case "12":
				mString = "December";
				break;
			default:
				mString = "?";
		}
				
		return mString+" "+this.day+" "+this.year;
	}

	public boolean equals(MyDate d) {
		if(d.day == this.day && d.month == this.month & d.year == this.year){
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		MyDate d1 = new MyDate(7, 7, 2023);
		MyDate d2 = new MyDate(7, 7, 2023);
		MyDate d3 = new MyDate(7, 12, 2023);

		System.out.println(d1 + ", " + d2 + ", " + d3);
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
	}
}
