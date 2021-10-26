import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.security.auth.LdapPrincipal;

import javax.naming.InvalidNameException;
import java.util.HashMap;

public class MainTest {
    public static void main(String[] args) throws InvalidNameException {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1", 2);
        System.out.println(map);
    }
}
