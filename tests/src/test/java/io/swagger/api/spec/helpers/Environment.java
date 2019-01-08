package io.swagger.api.spec.helpers;

import io.swagger.api.DefaultApi;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Yannis Ansermoz on 07/01/19.
 */
public class Environment {

    private DefaultApi api = new DefaultApi();

    public Environment() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("environment.properties"));
        String url = properties.getProperty("io.wp2.server.url");
        api.getApiClient().setBasePath(url);

    }

    public DefaultApi getApi() {
        return api;
    }


}
