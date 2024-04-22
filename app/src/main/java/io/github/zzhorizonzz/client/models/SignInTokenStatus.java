package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignInTokenStatus implements ValuedEnum {
    Pending("pending"),
    Accepted("accepted"),
    Revoked("revoked");
    public final String value;
    SignInTokenStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignInTokenStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "accepted": return Accepted;
            case "revoked": return Revoked;
            default: return null;
        }
    }
}
