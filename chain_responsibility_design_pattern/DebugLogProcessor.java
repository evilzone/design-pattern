package com.software_design.chain_responsibility_design_pattern;

public class DebugLogProcessor extends LogProcessor {

    private LogProcessor logProcessor;
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message) {
        if(loglevel == LogProcessor.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
