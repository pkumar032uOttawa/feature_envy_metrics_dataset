	public static void main(String[] args) throws Exception {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
			context.getBean(NettyContext.class).onClose().block();
		}
	}