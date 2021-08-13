package jo.secondestep.JPAMySQL;


import javax.persistence.*;


public class Country {

	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
      private int id;
	  private String name;
	//  private int regionId;
	  //private Region region;
	  
	  
   /*public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}*/
	public void setId(int id) {
		this.id = id;
	}
 
	 public Integer getId() {
		    return id;
		  }

	public void setId(Integer id) {
		    this.id = id;
		  }
	 
		  
	 public String getName() {
		return name;
	}
	  
	 public void setName(String name) {
	 	this.name = name;
	}
}
