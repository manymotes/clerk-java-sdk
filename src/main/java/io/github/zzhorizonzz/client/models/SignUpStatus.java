package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignUpStatus implements ValuedEnum {
    Missing_requirements("missing_requirements"),
    Complete("complete"),
    Abandoned("abandoned");
    public final String value;
    SignUpStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignUpStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "missing_requirements": return Missing_requirements;
            case "complete": return Complete;
            case "abandoned": return Abandoned;
            default: return null;
        }
    }
}
