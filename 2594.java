    @Override
    public FSDataInputStream open(Path f, int bufferSize) throws IOException {
        return localFS.open(toLocalPath(f), bufferSize);
    }