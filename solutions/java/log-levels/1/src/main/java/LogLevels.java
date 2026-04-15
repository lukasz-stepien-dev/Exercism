import java.util.Map;

public class LogLevels {

    private static final Map<String, String> logLevels = Map.of(
            "info", "[INFO]:",
            "warning", "[WARNING]:",
            "error", "[ERROR]:"
    );

    private static String getLogLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf("]")).toLowerCase();
    }

    public static String message(String logLine) {
        String logLevelSignature = logLine.substring(0, logLine.indexOf(" "));
        return logLine.replace(logLevelSignature, "").strip();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = getLogLevel(logLine);
        return message(logLine) + " (" + logLevel + ")";
    }
}
