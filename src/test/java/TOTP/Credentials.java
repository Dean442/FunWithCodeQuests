package TOTP;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Credentials {
    EMAIL(""),
    PASSWORD(""),
    SECRET("");

    private final String value;

}
