package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BlocklistIdentifierObject implements ValuedEnum {
    Blocklist_identifier("blocklist_identifier");
    public final String value;
    BlocklistIdentifierObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BlocklistIdentifierObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blocklist_identifier": return Blocklist_identifier;
            default: return null;
        }
    }
}
