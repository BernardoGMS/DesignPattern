package psn.design.pattern.designPatterns.Proxy;

public interface SocketInterface {

        String readLine();
        void  writeLine(String str);
        void  dispose();
}