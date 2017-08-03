import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class test1 extends ServerResource{
    public static void main(String[] args) throws Exception {
        // Create the HTTP server and listen on port 8182
        new Server(Protocol.HTTP, 8182, test1.class).start();
    }

    @Get("txt")
    public String toString() {
        return "hello, world";
    }

}
