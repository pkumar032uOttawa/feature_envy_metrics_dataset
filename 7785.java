    public boolean matches(Exchange exchange) {
        if (predicate == null) {
            predicate = createPredicate(exchange);
        }
        return predicate.matches(exchange);
    }