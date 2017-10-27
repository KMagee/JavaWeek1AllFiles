package demo.inheritance;

import java.io.PrintStream;

public interface Loggable {
	PrintStream OUTPUT_STREAM = System.out;;
	void logBrief();
	void logVerbose();
}
