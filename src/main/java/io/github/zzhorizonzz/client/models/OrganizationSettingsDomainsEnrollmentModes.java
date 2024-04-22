package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationSettingsDomainsEnrollmentModes implements ValuedEnum {
    Manual_invitation("manual_invitation"),
    Automatic_invitation("automatic_invitation"),
    Automatic_suggestion("automatic_suggestion");
    public final String value;
    OrganizationSettingsDomainsEnrollmentModes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationSettingsDomainsEnrollmentModes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual_invitation": return Manual_invitation;
            case "automatic_invitation": return Automatic_invitation;
            case "automatic_suggestion": return Automatic_suggestion;
            default: return null;
        }
    }
}
