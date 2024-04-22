package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OTPStatus implements ValuedEnum {
    Unverified("unverified"),
    Verified("verified"),
    Failed("failed"),
    Expired("expired");
    public final String value;
    OTPStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OTPStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unverified": return Unverified;
            case "verified": return Verified;
            case "failed": return Failed;
            case "expired": return Expired;
            default: return null;
        }
    }
}
