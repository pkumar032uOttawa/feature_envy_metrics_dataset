	public static EvictionActionType valueOfIgnoreCase(final String name) {

		for (EvictionActionType evictionActionType : values()) {
			if (evictionActionType.name().equalsIgnoreCase(name)) {
				return evictionActionType;
			}
		}

		return null;
	}