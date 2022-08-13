public class Country{

		private String name,countryCode,isdCode;
		
		public Country(String name, String countryCode, String isdCode) {
			super();
			this.name = name;
			this.countryCode = countryCode;
			this.isdCode = isdCode;
		}

		void display() {
			System.out.println("Country Name : "+this.name);
			System.out.println("Country Code : "+this.countryCode);
			System.out.println("ISD Code : "+this.isdCode);
		}
}