package nz.net.osnz.appengine;

/**
 * @author Kefeng Deng (deng@51any.com)
 */
public class App {

    public static String getInfo() {
        return "Version: " + System.getProperty("java.version")
            + " OS: " + System.getProperty("os.name")
            + " User: " + System.getProperty("user.name");
    }

}
