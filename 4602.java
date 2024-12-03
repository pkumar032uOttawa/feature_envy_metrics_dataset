	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			if(isInitialName) 
				setPageComplete(false);
			else 
				setPageComplete(validatePage(true));
			updatePreview();
			textField.setFocus();
		}
		super.setVisible(visible);
	}