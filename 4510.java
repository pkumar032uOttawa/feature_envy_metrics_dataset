    @Override
    public Object convertValue(final ActionFields e, final String value) {
        if (STATUS.equals(e)) {
            return convertStatusValue(value);
        }
        return value;
    }