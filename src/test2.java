import org.restlet.resource.ClientResource;
import org.restlet.resource.ServerResource;

public class test2 extends ServerResource {
    public static void main(String[] args) throws Exception{
        //new ClientResource("/users/:torvalds/repos").get().write(System.out);
        new ClientResource("http://restlet.com").get().write(System.out);
    }


}
