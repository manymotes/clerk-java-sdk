package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OAuthApplicationObject implements ValuedEnum {
    Oauth_application("oauth_application");
    public final String value;
    OAuthApplicationObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OAuthApplicationObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oauth_application": return Oauth_application;
            default: return null;
        }
    }
}
