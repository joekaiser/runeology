package mod.runeology;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logging {
	private static Logger logger;

	static {
		logger = LogManager.getLogger("@runeology");
	}

	private static void log(Level level, String format, Object... data) {
		logger.log(level, format, data);
	}

	public static void error(String format, Object... data) {
		log(Level.ERROR, format, data);
	}

	public static void warning(String format, Object... data) {
		log(Level.WARN, format, data);
	}

	public static void info(String format, Object... data) {
		log(Level.INFO, format, data);
	}

	public static void devLog(String format, Object... data) {
		//if (ConfigMan.isDebug) {
			log(Level.INFO, format, data);
		//}
	}

}