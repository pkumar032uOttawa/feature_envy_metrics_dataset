  public void setBreakpoints(@NonNull final Breakpoint[] breakpoints) {
    if (breakpoints == null) {
      throw new IllegalArgumentException("Property must not be null: breakpoints");
    }
    this.breakpoints = breakpoints;
  }