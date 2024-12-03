	private void save(ObjectOutputStream out) throws IOException {
		out.writeInt(maxSize);
		out.writeInt(size());
		for (Entry entry : history) {
			out.writeObject(entry);
		}
	}