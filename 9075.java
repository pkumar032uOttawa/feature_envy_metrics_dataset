  @Override
  public boolean contains(@Nullable Object edge) {
    E connectingEdge = getConnectingEdge();
    return (connectingEdge != null && connectingEdge.equals(edge));
  }