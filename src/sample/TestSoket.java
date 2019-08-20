package sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSoket {

        InetAddress inet=InetAddress.getByName("www.baidu.com");
        String ip=inet.getHostAddress();

    public TestSoket() throws UnknownHostException {
    }

    public static void main(String[] args) throws UnknownHostException {
        TestSoket t=new TestSoket();
        System.out.println(t.ip);
    }
}
