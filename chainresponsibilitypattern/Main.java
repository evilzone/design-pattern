public class Main {
  public static void main(String[] args) {
    LogProcessor processor =
            new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    processor.log(LogProcessor.ERROR, "exception happens");
    processor.log(LogProcessor.DEBUG, "need to debug this");
    processor.log(LogProcessor.INFO, "info happens");
  }
}
