    private PhysicalFont findDeferredFont(String name, int style) {
        PhysicalFont physicalFont = findJREDeferredFont(name, style);
        if (physicalFont != null) {
            return physicalFont;
        } else {
            return findOtherDeferredFont(name, style);
        }
    }