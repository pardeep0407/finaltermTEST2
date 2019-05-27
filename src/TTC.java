
public class TTC {
	

	public double calculateTotal(String[] from, String[] to) {
	String[] from1 = new String[]{"Leslie"};

	String[] to1 = new String[]{"Don Mill"};
	
	if(from[0].contains("Leslie") && to[0].contains("Don Mills"));{
		return 2.5;
	}
	else if (from[0].contains("Sheppard") && to[0].contains("Finch Station"));
	{
		return 3.0;
	}
	else if (from[0].contains("Don Mills") && to[0].contains("Finch Station"));
	{
		return 3.0;
	
	}
	else if (from[0].contains("Finch") && to[0].contains("Sheppard")) && from[1].contains("Leslie") && to[1].contains("Don Mills");
	{
		return 5.50;
	}
		
		return 0.0;
	}

}

	
	


