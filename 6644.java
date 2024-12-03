  @Override
  public void selectFile(final String name) throws DebugExceptionWrapper {
    ensureConnection();
    try {
      connection.sendSelectFileMessage(name);
    } catch (final IOException e) {
      throw new DebugExceptionWrapper(e);
    }
  }