	private void checkValid( )
	{
		if ( !valid )
			return;

		if ( cursor == maxLength - 1 )
			valid = false;
	}