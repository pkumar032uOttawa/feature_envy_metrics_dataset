  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.threads== null) ? 0 : Arrays.deepHashCode(this.threads));
  }