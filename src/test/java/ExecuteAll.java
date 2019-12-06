import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class ExecuteAll {
	
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(A.class,B.class);
		int f = rs.getFailureCount();
		int i = rs.getIgnoreCount();
		int r = rs.getRunCount();
		long run = rs.getRunTime();
		List<Failure> failures = rs.getFailures();
		
		
		System.out.println("Failure count: "+f);
		System.out.println("Ignore count: "+i);
		System.out.println("Run count: "+r);
		System.out.println("Run Time: "+run);
		
		
		for (Failure ff : failures) {
			System.out.println(ff);
			
		}
		
	}

}
