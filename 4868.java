    public void setExtendedKeyUsage(Set<String> keyPurposeSet) throws IOException {
        if ((keyPurposeSet == null) || keyPurposeSet.isEmpty()) {
            this.keyPurposeSet = null;
            keyPurposeOIDSet = null;
        } else {
            this.keyPurposeSet =
                Collections.unmodifiableSet(new HashSet<String>(keyPurposeSet));
            keyPurposeOIDSet = new HashSet<ObjectIdentifier>();
            for (String s : this.keyPurposeSet) {
                keyPurposeOIDSet.add(new ObjectIdentifier(s));
            }
        }
    }