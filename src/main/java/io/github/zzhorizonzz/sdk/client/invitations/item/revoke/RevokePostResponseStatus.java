package io.github.zzhorizonzz.sdk.client.invitations.item.revoke;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RevokePostResponseStatus implements ValuedEnum {
    Revoked("revoked");
    public final String value;
    RevokePostResponseStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RevokePostResponseStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "revoked": return Revoked;
            default: return null;
        }
    }
}
