    public Decorator getDecorator(HttpServletRequest req, Page page) {
        if ("none".equals(req.getAttribute("decorator"))) {
            return null;
        }

        return super.getDecorator(req, page);
    }