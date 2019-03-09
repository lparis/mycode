

public class PetAdviceClass {
	
	int resType;
	int hrsHome;
	static int recPet;
	static String recPetString;
	
	public String getRecPet()
	{
		if((resType == 1) && (hrsHome == 1))
		{
			recPet = 1;
			recPetString = "Pot-bellied pig";
		}
		else if((resType == 1) && (hrsHome == 2) || (hrsHome == 3))
			recPet = 2;
			recPetString = "Dog";
		return recPetString;
	}		
}
	
	/**
	
	public int getResType()
	{
		return resType;
	}
	public int getHrsHome()
	{
		return hrsHome;
	}
	public int getRecPet()
	{
		return recPet;
	}
	public void setResType(int resType)
	{
		this.resType = resType; // This to qualify right side
	}
	public void setHrsHome(int hrsHome)
	{
		this.hrsHome = hrsHome; // This 
	}
	public void setRecPet(int recPet)
	{
		recPet = PetAdviceClass.recPet; // Class to qualify right side
	}
	
	if((resType == 1) && (hrsHome == 1))
	{
		recPet = 1;
		recPetString = "Pot-bellied pig";
	}
}

}
**/