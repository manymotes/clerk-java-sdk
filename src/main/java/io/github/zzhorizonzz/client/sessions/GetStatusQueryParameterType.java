package io.github.zzhorizonzz.client.sessions;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetStatusQueryParameterType implements ValuedEnum {
    Abandoned("abandoned"),
    Active("active"),
    Ended("ended"),
    Expired("expired"),
    Removed("removed"),
    Replaced("replaced"),
    Revoked("revoked");
    public final String value;
    GetStatusQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetStatusQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "abandoned": return Abandoned;
            case "active": return Active;
            case "ended": return Ended;
            case "expired": return Expired;
            case "removed": return Removed;
            case "replaced": return Replaced;
            case "revoked": return Revoked;
            default: return null;
        }
    }
}
