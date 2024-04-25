import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Logger {
	
	private static boolean initialized = false;
	private static BufferedWriter writer;
	
	private Logger() {}
	
	/**
	 * 
	 * @return true if initialized.
	 */
	private static boolean initializeIfNeeded() {
		if (initialized) 
			return true;
		
		initialized = true;
		
		File output = new File("./output.log");
		
		// create the output file.
		if (!output.exists())
			try {
				output.createNewFile();
			} catch (IOException e) {
				System.err.println("Unable to create log file.");
				e.printStackTrace();
				initialized = false;
			}
		
		// create the writer
		try {
			writer = new BufferedWriter(new FileWriter(output, true));
		} catch (IOException e) {
			System.err.println("Unable to create FileWriter.");
			e.printStackTrace();
			initialized = false;
		}
		
		
		log("Logger Initialized.");
		return initialized;
	}
	
	/**
	 * 
	 * @return If the Logger is initialized.
	 */
	public static boolean init() {
		return initializeIfNeeded();
	}
	
	private static String getTimestamp() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.US);
		LocalDateTime now = LocalDateTime.now();
		String timestamp = formatter.format(now);
		return timestamp;
	}
	
	public static void log(String message) {
		if (!initialized) 
			return;
		
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(getTimestamp());
		sb.append("] - ");
		sb.append(message);
		sb.append('\n');
		
		try {
			writer.append(sb.toString());
			writer.flush();
		} catch (IOException e) {
			System.err.println("Failed to log.");
			e.printStackTrace();
		}
	}
	
	
}
