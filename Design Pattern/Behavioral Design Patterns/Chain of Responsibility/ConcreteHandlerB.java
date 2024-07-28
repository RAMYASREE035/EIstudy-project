public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(Request request) {
        if ("TypeB".equals(request.getRequestType())) {
            System.out.println("Handled by ConcreteHandlerB");
        } else {
            super.handleRequest(request);
        }
    }
}
