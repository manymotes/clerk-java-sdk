package io.github.zzhorizonzz.client.instance.organization_settings;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationSettingsPatchRequestBody implements Parsable {
    /**
     * The admin_delete_enabled property
     */
    private Boolean adminDeleteEnabled;
    /**
     * Specify what the default organization role is for an organization creator.
     */
    private String creatorRoleId;
    /**
     * Specify what the default organization role is for the organization domains.
     */
    private String domainsDefaultRoleId;
    /**
     * The domains_enabled property
     */
    private Boolean domainsEnabled;
    /**
     * Specify which enrollment modes to enable for your Organization Domains.Supported modes are 'automatic_invitation' & 'automatic_suggestion'.
     */
    private java.util.List<String> domainsEnrollmentModes;
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The max_allowed_memberships property
     */
    private Integer maxAllowedMemberships;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationSettingsPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationSettingsPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationSettingsPatchRequestBody();
    }
    /**
     * Gets the admin_delete_enabled property value. The admin_delete_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdminDeleteEnabled() {
        return this.adminDeleteEnabled;
    }
    /**
     * Gets the creator_role_id property value. Specify what the default organization role is for an organization creator.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatorRoleId() {
        return this.creatorRoleId;
    }
    /**
     * Gets the domains_default_role_id property value. Specify what the default organization role is for the organization domains.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainsDefaultRoleId() {
        return this.domainsDefaultRoleId;
    }
    /**
     * Gets the domains_enabled property value. The domains_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDomainsEnabled() {
        return this.domainsEnabled;
    }
    /**
     * Gets the domains_enrollment_modes property value. Specify which enrollment modes to enable for your Organization Domains.Supported modes are 'automatic_invitation' & 'automatic_suggestion'.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainsEnrollmentModes() {
        return this.domainsEnrollmentModes;
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("admin_delete_enabled", (n) -> { this.setAdminDeleteEnabled(n.getBooleanValue()); });
        deserializerMap.put("creator_role_id", (n) -> { this.setCreatorRoleId(n.getStringValue()); });
        deserializerMap.put("domains_default_role_id", (n) -> { this.setDomainsDefaultRoleId(n.getStringValue()); });
        deserializerMap.put("domains_enabled", (n) -> { this.setDomainsEnabled(n.getBooleanValue()); });
        deserializerMap.put("domains_enrollment_modes", (n) -> { this.setDomainsEnrollmentModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("max_allowed_memberships", (n) -> { this.setMaxAllowedMemberships(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_allowed_memberships property value. The max_allowed_memberships property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedMemberships() {
        return this.maxAllowedMemberships;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("admin_delete_enabled", this.getAdminDeleteEnabled());
        writer.writeStringValue("creator_role_id", this.getCreatorRoleId());
        writer.writeStringValue("domains_default_role_id", this.getDomainsDefaultRoleId());
        writer.writeBooleanValue("domains_enabled", this.getDomainsEnabled());
        writer.writeCollectionOfPrimitiveValues("domains_enrollment_modes", this.getDomainsEnrollmentModes());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeIntegerValue("max_allowed_memberships", this.getMaxAllowedMemberships());
    }
    /**
     * Sets the admin_delete_enabled property value. The admin_delete_enabled property
     * @param value Value to set for the admin_delete_enabled property.
     */
    public void setAdminDeleteEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.adminDeleteEnabled = value;
    }
    /**
     * Sets the creator_role_id property value. Specify what the default organization role is for an organization creator.
     * @param value Value to set for the creator_role_id property.
     */
    public void setCreatorRoleId(@jakarta.annotation.Nullable final String value) {
        this.creatorRoleId = value;
    }
    /**
     * Sets the domains_default_role_id property value. Specify what the default organization role is for the organization domains.
     * @param value Value to set for the domains_default_role_id property.
     */
    public void setDomainsDefaultRoleId(@jakarta.annotation.Nullable final String value) {
        this.domainsDefaultRoleId = value;
    }
    /**
     * Sets the domains_enabled property value. The domains_enabled property
     * @param value Value to set for the domains_enabled property.
     */
    public void setDomainsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.domainsEnabled = value;
    }
    /**
     * Sets the domains_enrollment_modes property value. Specify which enrollment modes to enable for your Organization Domains.Supported modes are 'automatic_invitation' & 'automatic_suggestion'.
     * @param value Value to set for the domains_enrollment_modes property.
     */
    public void setDomainsEnrollmentModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.domainsEnrollmentModes = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the max_allowed_memberships property value. The max_allowed_memberships property
     * @param value Value to set for the max_allowed_memberships property.
     */
    public void setMaxAllowedMemberships(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedMemberships = value;
    }
}
