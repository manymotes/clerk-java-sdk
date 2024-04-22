package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SAMLAccountObject implements ValuedEnum {
    Saml_account("saml_account");
    public final String value;
    SAMLAccountObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SAMLAccountObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "saml_account": return Saml_account;
            default: return null;
        }
    }
}
