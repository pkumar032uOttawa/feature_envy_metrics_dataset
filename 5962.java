  protected void updateStateAsync() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        updateStateStore();
      }
    }, "Router Heartbeat Async");
    thread.setDaemon(true);
    thread.start();
  }