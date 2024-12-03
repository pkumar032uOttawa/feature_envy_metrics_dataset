  synchronized void remoteOperationDone(MasterProcedureEnv env, Throwable error) {
    if (this.isFinished()) {
      LOG.info("This procedure {} is already finished, skip the rest processes", this.getProcId());
      return;
    }
    if (event == null) {
      LOG.warn("procedure event for {} is null, maybe the procedure is created when recovery",
          getProcId());
      return;
    }
    complete(env, error);
    event.wake(env.getProcedureScheduler());
    event = null;
  }