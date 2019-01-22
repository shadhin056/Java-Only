package ObjectFirst;
public class ONe {
	
	private int aNumber = 12;
	static private Car objCar=new Car();
	static private Car ourAnotherCar=new Car();

	public static void main(String[] args) {
		String name =objCar.manufacturerName;
		ourAnotherCar=new Car("Toyota", "model", "12345", 12, 30);
		objCar.presentAmountOfFuel();
		System.out.println(ourAnotherCar.manufacturerName);
		System.out.println(ourAnotherCar.getMode());
		System.out.println(ourAnotherCar.matchpassword("hhhh"));
	}
}
//................................................
 class Car {
		public String manufacturerName;
		private String modelName;
		public int enginCC;
		public float carWeight;
		public float fuelAmount;
		private  String Carkeyvalue;
		
		public Car(String manu,String model,String key,int enginCC,float fuel)
		{
			manufacturerName=manu;
			modelName=model;
			this.enginCC=enginCC;
			fuelAmount=fuel;
			Carkeyvalue=key;
			/*my name is she
			 * 
			 * 
			 * 
			 */
		}
		public Car ()
		{
			manufacturerName=new String();
			modelName=new String();
			enginCC=0;
			carWeight=0;
			fuelAmount=0;
		}
		public Car (String carName)
		{
			manufacturerName=new String(carName);
			enginCC=0;
			modelName = new String();
			carWeight=0;
			fuelAmount=0;
			
		}
		public float presentAmountOfFuel()
		{
			return fuelAmount;
		}
		public String getManufactureName()
		{
			return manufacturerName;
		}
		public boolean matchpassword(String userinput)
		{
			return userinput.equals(Carkeyvalue);
		}
		public String getMode()
		{
			return modelName;
		}
		
		
}

