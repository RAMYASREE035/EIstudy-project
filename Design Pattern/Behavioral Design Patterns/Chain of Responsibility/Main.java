public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        Request request1 = new Request("TypeA");
        Request request2 = new Request("TypeB");
        Request request3 = new Request("TypeC");

        handlerA.handleRequest(request1);
        handlerA.handleRequest(request2);
        handlerA.handleRequest(request3);
    }
}
