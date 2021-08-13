package jo.secondestep.JPAMySQL;


import javax.persistence.*;


public class Region {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;
	  private String name;
	  
	  
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
