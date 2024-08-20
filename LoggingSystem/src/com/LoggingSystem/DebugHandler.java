package com.LoggingSystem;

public class DebugHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		 return level == LogLevel.DEBUG;
	}

	@Override
	protected void logMessage(String message) {
		// TODO Auto-generated method stub
		 System.out.println("DEBUG: " + message);
	}

}
