class StudentRating extends Student{
	private Integer id;
	private String review;
	private Integer stars;
	Student student;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public StudentRating(Integer id, String name, String department, Integer courseId, String review,
			Integer stars,Integer RatingId) {
		super(id, name, department, courseId);
		this.id=RatingId;
		this.review = review;
		this.stars = stars;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nRating ID:  "+this.id+"\nReview:  "+
				this.review+"\nRating Stars: "+this.stars;
	}
	
    

	
}
