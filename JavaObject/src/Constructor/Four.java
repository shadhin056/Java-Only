package Constructor;

 class MultipleConstructor {
			private int hour;
			private int min;
			private int sec;
			
			public  MultipleConstructor()
			{
				this (0,0,0);
				System.out.println("with out parameter"+hour+min+sec);
			}
			public  MultipleConstructor(int h)
			{
				this (h,0,0);
				System.out.println("1 parameter"+h+min+sec);
			}
			public  MultipleConstructor(int h,int m)
			{
				this (h,m,0);
				System.out.println("2 parameter"+h+m+sec);
			}
			public MultipleConstructor(int h,int m,int s)
			{
				seTime(h,m,s);
				System.out.println("3 parameter"+h+m+s);
			}
			public void seTime(int h,int m,int s)
			{
//				setHour(h);
//				setMinute(m);
//				setSecond(s);
//				h=1;
//				m=2;
//				s=3;
				System.out.println(""+h+m+s);
			}
}
public class Four {
	public static void main(String[] args) {
		MultipleConstructor obj =new MultipleConstructor(1,2,3);
	}
}



