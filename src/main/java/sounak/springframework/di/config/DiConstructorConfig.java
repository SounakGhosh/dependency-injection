package sounak.springframework.di.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

/**
 * Created by sounak on 07-07-2024.
 */

@ConfigurationProperties("fakedb")
public class DiConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;

    @ConstructorBinding
    public DiConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
