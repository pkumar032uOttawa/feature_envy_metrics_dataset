    public synchronized Enumeration<V> elements() {
        return this.<V>getEnumeration(VALUES);
    }