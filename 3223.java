    @Override
    public int hashCode() {
        return isPresent ? Double.hashCode(value) : 0;
    }