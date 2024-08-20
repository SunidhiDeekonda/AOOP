package com.LoggingSystem;

public class LogCommand implements Command{
	private LogHandler handler;
    private LogLevel level;

    public LogCommand(LogHandler handler, LogLevel level) {
        this.handler = handler;
        this.level = level;
    }
	@Override
	public void execute(String message) {
		// TODO Auto-generated method stub
        handler.handleRequest(level, message);

	}

}
