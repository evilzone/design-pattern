package com.software_design.chain_responsibility_design_pattern;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    private LogProcessor logProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }
    public void log(int logLevel, String message) {
        if(logProcessor != null) {
            logProcessor.log(logLevel, message);
        }
    }
}
