  @Override
  public byte[] getByteArrayValue(final String name) {
    Object _value = this.getValue(name);
    return ((byte[]) _value);
  }