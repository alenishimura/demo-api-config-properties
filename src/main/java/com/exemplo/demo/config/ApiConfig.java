
package com.exemplo.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "api")
public class ApiConfig {

    private String url;
    private String chave;
    private int timeout;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "ApiConfig{" +
                "url='" + url + '\'' +
                ", chave='" + chave + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
