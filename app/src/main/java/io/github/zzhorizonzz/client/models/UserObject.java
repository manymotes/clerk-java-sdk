package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserObject implements ValuedEnum {
    User("user");
    public final String value;
    UserObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            default: return null;
        }
    }
}
