
class Exhibition extends Event{
      
        private Integer noOfStalls;

		public Integer getNoOfStalls() {
			return noOfStalls;
		}

		public void setNoOfStalls(Integer noOfStalls) {
			this.noOfStalls = noOfStalls;
		}

		public Exhibition(String name, String detail, String ownerName, Integer noOfStalls) {
			super(name, detail, ownerName);
			this.noOfStalls = noOfStalls;
		}

		@Override
		public Double projectedRevenue() {
			// TODO Auto-generated method stub
			return this.noOfStalls*10000.0;
		}
        
}