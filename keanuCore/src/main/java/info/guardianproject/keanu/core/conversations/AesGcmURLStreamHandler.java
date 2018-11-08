package info.guardianproject.keanu.core.conversations;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;


public class AesGcmURLStreamHandler extends URLStreamHandler {

    public static final String PROTOCOL_NAME = "aesgcm";

    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        return new URL("https"+url.toString().substring(url.getProtocol().length())).openConnection();
    }
}