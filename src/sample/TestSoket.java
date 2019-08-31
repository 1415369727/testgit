package sample;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 *功能描述
 * @author wangxu
 * @date 2019/8/25
 */
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
