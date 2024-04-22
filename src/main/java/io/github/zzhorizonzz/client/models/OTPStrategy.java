package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OTPStrategy implements ValuedEnum {
    Phone_code("phone_code"),
    Email_code("email_code");
    public final String value;
    OTPStrategy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OTPStrategy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "phone_code": return Phone_code;
            case "email_code": return Email_code;
            default: return null;
        }
    }
}
