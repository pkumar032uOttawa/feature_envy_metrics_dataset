    @Override
    public String getString(int parameterIndex) throws SQLException {
        try {
            return stmt.getString(parameterIndex);
        } catch (Throwable t) {
            throw checkException(t);
        }
    }