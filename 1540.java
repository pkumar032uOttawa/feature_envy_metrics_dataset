	private static Ciphertext toCiphertext(String ciphertext,
			@Nullable VaultTransitContext context) {
		return context != null ? Ciphertext.of(ciphertext).with(context) : Ciphertext
				.of(ciphertext);
	}