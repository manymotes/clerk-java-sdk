package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SessionObject implements ValuedEnum {
    Session("session");
    public final String value;
    SessionObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SessionObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "session": return Session;
            default: return null;
        }
    }
}
