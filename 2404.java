    private Optional<WatchRequest> nextResume() {
        EtcdWatcher pendingWatcher = this.pendingWatchers.peek();
        if (pendingWatcher != null) {
            return Optional.of(this.toWatchCreateRequest(pendingWatcher));
        }
        return Optional.empty();
    }