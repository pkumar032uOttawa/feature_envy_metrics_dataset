	public void streamStarted(LogEvent event) {
	  for (Object listener1 : listeners) {
		LogListener listener = (LogListener) listener1;
		listener.streamStarted(event);
	  }
	}