  public int peek(int n)
  {
    try {
      return m_map[m_firstFree-(1+n)];
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      throw new EmptyStackException();
    }
  }