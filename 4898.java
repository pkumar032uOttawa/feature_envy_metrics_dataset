  @Override
  public final boolean equals(@Nullable Object object) {
    if (object instanceof HashCode) {
      HashCode that = (HashCode) object;
      return bits() == that.bits() && equalsSameBits(that);
    }
    return false;
  }