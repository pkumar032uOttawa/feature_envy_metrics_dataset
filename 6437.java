    @Override
    @Deprecated
    public <T> SubscriptionHandle subscribeToChildren(Entity parent, Sensor<T> sensor, SensorEventListener<? super T> listener) {
        return subscriptions().subscribeToChildren(parent, sensor, listener);
    }