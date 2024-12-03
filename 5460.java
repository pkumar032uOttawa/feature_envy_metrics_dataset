    private void applyAttributes(@NonNull AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.HoverView);
        try {
            createCollapsedDockFromAttrs(a);
        } finally {
            a.recycle();
        }
    }