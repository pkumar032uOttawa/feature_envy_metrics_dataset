    public Shape createTransformedShape(Shape pSrc) {
        if (pSrc == null) {
            return null;
        }
        return new Path2D.Double(pSrc, this);
    }