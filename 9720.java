		@Override
		public void onComplete() {
			if (done) {
				return;
			}
			done = true;

			C b = buffer;

			if (b != null && !b.isEmpty()) {
				actual.onNext(b);
			}
			actual.onComplete();
		}