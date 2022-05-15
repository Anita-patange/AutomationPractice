package system;

public class system3 {
	
		public static void main (String [] args) {
			
			System.out.println("system user dir: "+System.getProperty("user.home"));
			System.out.println("current working dir: "+System.getProperty("user.dir"));
			
			//claaring this property
			System.clearProperty("user.home");
			//getting cleared property
			System.out.println("1st updated system user dir: "+ System.getProperty("user.home"));
			 
			//set new path
			System.out.println(System.getProperty("user.home","C:\\Program Files\\Java\\jdk1.8.0_202"));
			//get new path
			System.getProperty("user.home");
			//get string output
			System.out.println(System.setProperty("user.password", "nun of your business"));
			//time in mili sec
			System.out.println(System.currentTimeMillis());
			//time in nano sec
			System.out.println(System.nanoTime());
			// set error
			//System.setErr( "user should be logined");
			
			
			
			
		}

	}



