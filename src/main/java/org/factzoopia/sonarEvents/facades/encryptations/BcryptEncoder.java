package org.factzoopia.sonarEvents.facades.encryptations;


import org.factzoopia.sonarEvents.implementations.IEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoder implements IEncoder {

    BCryptPasswordEncoder encoder;

    public BcryptEncoder(BCryptPasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Override
    public String encode(String data) {
        String dataEncoded = encoder.encode(data);
        return dataEncoded;
    }

}