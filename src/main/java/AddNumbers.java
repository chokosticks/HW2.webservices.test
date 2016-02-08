/**
 * Created by antondahlin on 2016-02-07.
 */
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;

@WebService(targetNamespace="my.unique.keso")
public class AddNumbers{
    @WebMethod
    public int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args ){
        Endpoint.publish("http://0.0.0.0:12345/AddNumbers", new AddNumbers());
    }
}