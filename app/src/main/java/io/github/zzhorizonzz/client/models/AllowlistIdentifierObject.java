package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AllowlistIdentifierObject implements ValuedEnum {
    Allowlist_identifier("allowlist_identifier");
    public final String value;
    AllowlistIdentifierObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AllowlistIdentifierObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowlist_identifier": return Allowlist_identifier;
            default: return null;
        }
    }
}
