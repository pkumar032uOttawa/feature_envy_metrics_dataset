    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(_syncType)
                .append(_nuageVspCmsId)
                .append(_success)
                .toHashCode();
    }