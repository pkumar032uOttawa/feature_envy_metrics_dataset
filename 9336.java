    @Override
    public int compareTo(OffsetDateTime other) {
        int cmp = compareInstant(this, other);
        if (cmp == 0) {
            cmp = toLocalDateTime().compareTo(other.toLocalDateTime());
        }
        return cmp;
    }