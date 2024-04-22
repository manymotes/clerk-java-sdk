package io.github.zzhorizonzz.sdk.client.sessions.item.tokens.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WithTemplateNamePostResponseObject implements ValuedEnum {
    Token("token");
    public final String value;
    WithTemplateNamePostResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WithTemplateNamePostResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "token": return Token;
            default: return null;
        }
    }
}
