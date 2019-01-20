package ch.heig.amt.gamification.spec.helpers;

import ch.heig.amt.gamification.DefaultApi;

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
        String url = properties.getProperty("ch.heig.amt.gamification.url");
        api.getApiClient().setBasePath(url);

    }

    public DefaultApi getApi() {
        return api;
    }


}
