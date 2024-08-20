package com.LoggingSystem;

public class Client {
	public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
        logger.addCommand(new LogCommand(debugHandler, LogLevel.DEBUG));
        logger.addCommand(new LogCommand(errorHandler, LogLevel.ERROR));

        logger.processCommands();
    }
}
