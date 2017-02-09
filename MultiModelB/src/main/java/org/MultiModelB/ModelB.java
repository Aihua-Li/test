package MultiModel.Multi;

public class ModelB {
	public String AppName;//="MultiModelA";

	public void setAppName(String appname){
		this.AppName = appname;
	}
	public String getAppname(){
		return this.AppName;
	}
    public static void main( String[] args )
    {
    	a = new TestModelA();
    	a.setAppName("MultiModelB");
    
        System.out.println( "Hello World!" );
        
}
