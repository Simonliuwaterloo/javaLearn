public class Enum_practice{
	public enum Season{
		spring, summer, fall, winter
	}
	public static class EnumDemo{
		Season thisYear;
		public EnumDemo(Season arg) {
			this.thisYear = arg;
		}
		public void saySeason() {
			switch (thisYear) {
				case spring: System.out.println("It is now spring");
								break;
				case summer: System.out.println("It is now summer");
								break;
				case fall: System.out.println("It is now fall");
								break;
				case winter: System.out.println("It is now winter");
								break;
			}
		}
	}
	public static class Test{
		public static void main(String[] args) {
			EnumDemo spring = new EnumDemo(Season.spring);
			spring.saySeason();
			EnumDemo summer = new EnumDemo(Season.summer);
			summer.saySeason();
			EnumDemo fall = new EnumDemo(Season.fall);
			fall.saySeason();
			EnumDemo winter = new EnumDemo(Season.winter);
			winter.saySeason();
		}
	}

}

