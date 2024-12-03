    @Override
    public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(
        InternalEntry<K, V, ?> e, V value) {
      return new WeakValueReferenceImpl<>(queueForValues, value, castForTesting(e));
    }