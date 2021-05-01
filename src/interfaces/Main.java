package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger [] loggers= {new SmsLogger(), new EmailLogger(),new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager= new CustomerManager (loggers);
		Customer yasemin= new Customer(1,"yasemin","Arslan");
		customerManager.add(yasemin);
		

	}

}
