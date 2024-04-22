package io.github.zzhorizonzz.client.beta_features.instance_settings;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstanceSettingsPatchResponseObject implements ValuedEnum {
    Instance_settings("instance_settings");
    public final String value;
    InstanceSettingsPatchResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstanceSettingsPatchResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "instance_settings": return Instance_settings;
            default: return null;
        }
    }
}
