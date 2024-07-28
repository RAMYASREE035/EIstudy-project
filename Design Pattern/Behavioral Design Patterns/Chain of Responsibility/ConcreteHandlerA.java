public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(Request request) {
        if ("TypeA".equals(request.getRequestType())) {
            System.out.println("Handled by ConcreteHandlerA");
        } else {
            super.handleRequest(request);
        }
    }
}
