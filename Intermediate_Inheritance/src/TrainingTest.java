class Training {
	
	int id;
	String subject;
	double fees;
	
}

class PublicTraining extends Training {
	int participants;
	public double getOrderValue()
	{
		return (fees*participants);
	}
}

class CorporateTraining extends Training {
	int days;
	public double getOrderValue()
	{
		return (fees*days);
	}
}

public class TrainingTest {

	public static void main(String[] args) {
		
		Training publictraining =new PublicTraining();
		publictraining.id=1;
		publictraining.fees=5000;
		publictraining.subject="Java";
		//publictraining.participants=50;
		
		Training corporatetraining =new CorporateTraining();

	}

}
