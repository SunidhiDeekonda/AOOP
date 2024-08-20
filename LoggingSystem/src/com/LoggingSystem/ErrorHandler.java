package com.LoggingSystem;

public class ErrorHandler extends LogHandler {

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.ERROR;
	}

	@Override
	protected void logMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + message);
	}

}
