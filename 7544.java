    boolean isSQLDateAndTimeTimeZoneSameAsNormal() {
        if (cachedSQLDateAndTimeTimeZoneSameAsNormal == null) {
            cachedSQLDateAndTimeTimeZoneSameAsNormal = Boolean.valueOf(
                    getSQLDateAndTimeTimeZone() == null
                            || getSQLDateAndTimeTimeZone().equals(getTimeZone()));
        }
        return cachedSQLDateAndTimeTimeZoneSameAsNormal.booleanValue();
    }