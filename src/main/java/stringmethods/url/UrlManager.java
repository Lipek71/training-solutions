package stringmethods.url;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.port = getPortFromUrl(url);
        this.host = getHostFromUrl(url);
        this.path = getPathFromUrl(url);
        this.query = getQueryFromUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        if(key == null || key.isBlank()){
            throw new IllegalArgumentException("Invalid key");
        }
        boolean hasPropertyValue = false;
        if (this.query.length() > 1) {
            hasPropertyValue = query.startsWith(key + "=") || query.contains("&" + key + "=");
        } else {
            hasPropertyValue = false;
        }
        return hasPropertyValue;
    }

    public String getProperty(String key) {
        if(key == null || key.isBlank()){
            throw new IllegalArgumentException("Invalid key");
        }
        String getPropertyValue = "";
        String[] properties = query.split("&");
        for (String str : properties) {
            String[] prop = str.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;    }

    private String getProtocolFromUrl(String url) {
        if (url == null || url.isBlank() || url.length() < 9) {
            throw new IllegalArgumentException("Invalid url");
        } else if (url.toLowerCase().startsWith("https://")) {
            this.protocol = "https";
        } else {
            throw new IllegalArgumentException("Invalid url");
        }
        return protocol.toLowerCase();
    }

    private Integer getPortFromUrl(String url) {
        if (url == null || url.isBlank() || url.length() < 9) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (url.toLowerCase().indexOf(":", 10) == -1) {
            this.port = null;
        }
        if (url.toLowerCase().indexOf("/", 10) == -1 && (url.toLowerCase().indexOf(":", 10) != -1)) {
            this.port = Integer.parseInt(url.substring(url.toLowerCase().indexOf(":", 10) + 1));
        }
        if (url.toLowerCase().indexOf("/", 10) != -1 && (url.toLowerCase().indexOf(":", 10) != -1)) {
            this.port = Integer.parseInt(url.substring(url.toLowerCase().indexOf(":", 10) + 1, url.toLowerCase().indexOf("/", 10)));
        }
        return port;
    }

    private String getHostFromUrl(String url) {
        if (url == null || url.isBlank() || url.length() < 9) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (url.toLowerCase().indexOf(":", 10) == -1 && url.toLowerCase().indexOf("/", 10) == -1) {
            this.host = url.substring(8);
        }
        if (url.toLowerCase().indexOf(":", 10) != -1) {
            this.host = url.substring(8, url.toLowerCase().indexOf(":", 10));
        }
        if (url.toLowerCase().indexOf(":", 10) == -1 && url.toLowerCase().indexOf("/", 10) != -1) {
            this.host = url.substring(8, url.toLowerCase().indexOf("/", 10));
        }
        return host.toLowerCase();
    }

    private String getPathFromUrl(String url) {
        this.path = "";
        if (url == null || url.isBlank() || url.length() < 9) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (url.toLowerCase().indexOf("/", 10) == -1) {
            this.path = "";
        }
        if (url.toLowerCase().indexOf("/", 10) != -1) {
            this.path = url.substring(url.toLowerCase().indexOf("/", 10), url.toLowerCase().indexOf("?", 10));
        }
        return path.toLowerCase();
    }

    private String getQueryFromUrl(String url) {
        String query = "";
        if (url == null || url.isBlank() || url.length() < 9) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (url.indexOf("?") == -1) {
            query = "";
        } else {
            query = url.substring(url.indexOf("?") + 1);
        }
        return query;
    }

    public static void main(String[] args) {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocolFromUrl(url));
        System.out.println(urlManager.getPortFromUrl(url));
        System.out.println(urlManager.getHostFromUrl(url));
        System.out.println(urlManager.getPathFromUrl(url));
        System.out.println(urlManager.getQueryFromUrl(url));
        System.out.println(urlManager.hasProperty("format"));

    }
}
