
public class Builder {

	public static void main(String[] args) {
				
		IDdBuilder ddb =new DdBuilder();
		
		createDD creater=new createDD(ddb);
		
		creater.buildDD();
		
		DvarDohar dd= creater.getDD();
		
		System.out.println(dd.toString());
		
	}
}
