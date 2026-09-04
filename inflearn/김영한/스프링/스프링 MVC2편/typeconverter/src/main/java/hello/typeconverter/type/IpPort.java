package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * ip(Stribng), port(int)
 */
@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
