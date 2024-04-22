package io.github.zzhorizonzz.sdk.client.users.item.verify_totp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerifyTotpPostResponseCodeType implements ValuedEnum {
    Totp("totp"),
    Backup_code("backup_code");
    public final String value;
    VerifyTotpPostResponseCodeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerifyTotpPostResponseCodeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "totp": return Totp;
            case "backup_code": return Backup_code;
            default: return null;
        }
    }
}
