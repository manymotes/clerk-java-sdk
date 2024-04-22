package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SessionStatus implements ValuedEnum {
    Active("active"),
    Revoked("revoked"),
    Ended("ended"),
    Expired("expired"),
    Removed("removed"),
    Abandoned("abandoned"),
    Replaced("replaced");
    public final String value;
    SessionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SessionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "revoked": return Revoked;
            case "ended": return Ended;
            case "expired": return Expired;
            case "removed": return Removed;
            case "abandoned": return Abandoned;
            case "replaced": return Replaced;
            default: return null;
        }
    }
}
