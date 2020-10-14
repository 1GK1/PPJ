package ppj.coffee;

public abstract class Coffee {

	protected boolean isOn;

	protected String water;

	protected String beans;

	protected abstract void setWaterLevel(String water);
	
	protected abstract String getWaterLevel();
	
	protected abstract void setBeansLevel(String beans);
	
	protected abstract String getBeansLevel();

}