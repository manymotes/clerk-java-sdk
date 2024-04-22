package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdentificationLinkType implements ValuedEnum {
    Oauth_google("oauth_google"),
    Oauth_mock("oauth_mock"),
    Saml("saml");
    public final String value;
    IdentificationLinkType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdentificationLinkType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oauth_google": return Oauth_google;
            case "oauth_mock": return Oauth_mock;
            case "saml": return Saml;
            default: return null;
        }
    }
}
