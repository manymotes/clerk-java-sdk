package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationSettings implements Parsable {
    /**
     * The default for whether an admin can delete an organization with the Frontend API.
     */
    private Boolean adminDeleteEnabled;
    /**
     * The role key that a user will be assigned after creating an organization.
     */
    private String creatorRole;
    /**
     * The role key that it will be used in order to create an organization invitation or suggestion.
     */
    private String domainsDefaultRole;
    /**
     * The domains_enabled property
     */
    private Boolean domainsEnabled;
    /**
     * The domains_enrollment_modes property
     */
    private java.util.List<OrganizationSettingsDomainsEnrollmentModes> domainsEnrollmentModes;
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The max_allowed_memberships property
     */
    private Integer maxAllowedMemberships;
    /**
     * The max_allowed_permissions property
     */
    private Integer maxAllowedPermissions;
    /**
     * The max_allowed_roles property
     */
    private Integer maxAllowedRoles;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private OrganizationSettingsObject object;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationSettings
     */
    @jakarta.annotation.Nonnull
    public static OrganizationSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationSettings();
    }
    /**
     * Gets the admin_delete_enabled property value. The default for whether an admin can delete an organization with the Frontend API.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdminDeleteEnabled() {
        return this.adminDeleteEnabled;
    }
    /**
     * Gets the creator_role property value. The role key that a user will be assigned after creating an organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatorRole() {
        return this.creatorRole;
    }
    /**
     * Gets the domains_default_role property value. The role key that it will be used in order to create an organization invitation or suggestion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainsDefaultRole() {
        return this.domainsDefaultRole;
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
     * Gets the domains_enrollment_modes property value. The domains_enrollment_modes property
     * @return a java.util.List<OrganizationSettingsDomainsEnrollmentModes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationSettingsDomainsEnrollmentModes> getDomainsEnrollmentModes() {
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("admin_delete_enabled", (n) -> { this.setAdminDeleteEnabled(n.getBooleanValue()); });
        deserializerMap.put("creator_role", (n) -> { this.setCreatorRole(n.getStringValue()); });
        deserializerMap.put("domains_default_role", (n) -> { this.setDomainsDefaultRole(n.getStringValue()); });
        deserializerMap.put("domains_enabled", (n) -> { this.setDomainsEnabled(n.getBooleanValue()); });
        deserializerMap.put("domains_enrollment_modes", (n) -> { this.setDomainsEnrollmentModes(n.getCollectionOfEnumValues(OrganizationSettingsDomainsEnrollmentModes::forValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("max_allowed_memberships", (n) -> { this.setMaxAllowedMemberships(n.getIntegerValue()); });
        deserializerMap.put("max_allowed_permissions", (n) -> { this.setMaxAllowedPermissions(n.getIntegerValue()); });
        deserializerMap.put("max_allowed_roles", (n) -> { this.setMaxAllowedRoles(n.getIntegerValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(OrganizationSettingsObject::forValue)); });
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
     * Gets the max_allowed_permissions property value. The max_allowed_permissions property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedPermissions() {
        return this.maxAllowedPermissions;
    }
    /**
     * Gets the max_allowed_roles property value. The max_allowed_roles property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedRoles() {
        return this.maxAllowedRoles;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a OrganizationSettingsObject
     */
    @jakarta.annotation.Nullable
    public OrganizationSettingsObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("admin_delete_enabled", this.getAdminDeleteEnabled());
        writer.writeStringValue("creator_role", this.getCreatorRole());
        writer.writeStringValue("domains_default_role", this.getDomainsDefaultRole());
        writer.writeBooleanValue("domains_enabled", this.getDomainsEnabled());
        writer.writeCollectionOfEnumValues("domains_enrollment_modes", this.getDomainsEnrollmentModes());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeIntegerValue("max_allowed_memberships", this.getMaxAllowedMemberships());
        writer.writeIntegerValue("max_allowed_permissions", this.getMaxAllowedPermissions());
        writer.writeIntegerValue("max_allowed_roles", this.getMaxAllowedRoles());
        writer.writeEnumValue("object", this.getObject());
    }
    /**
     * Sets the admin_delete_enabled property value. The default for whether an admin can delete an organization with the Frontend API.
     * @param value Value to set for the admin_delete_enabled property.
     */
    public void setAdminDeleteEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.adminDeleteEnabled = value;
    }
    /**
     * Sets the creator_role property value. The role key that a user will be assigned after creating an organization.
     * @param value Value to set for the creator_role property.
     */
    public void setCreatorRole(@jakarta.annotation.Nullable final String value) {
        this.creatorRole = value;
    }
    /**
     * Sets the domains_default_role property value. The role key that it will be used in order to create an organization invitation or suggestion.
     * @param value Value to set for the domains_default_role property.
     */
    public void setDomainsDefaultRole(@jakarta.annotation.Nullable final String value) {
        this.domainsDefaultRole = value;
    }
    /**
     * Sets the domains_enabled property value. The domains_enabled property
     * @param value Value to set for the domains_enabled property.
     */
    public void setDomainsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.domainsEnabled = value;
    }
    /**
     * Sets the domains_enrollment_modes property value. The domains_enrollment_modes property
     * @param value Value to set for the domains_enrollment_modes property.
     */
    public void setDomainsEnrollmentModes(@jakarta.annotation.Nullable final java.util.List<OrganizationSettingsDomainsEnrollmentModes> value) {
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
    /**
     * Sets the max_allowed_permissions property value. The max_allowed_permissions property
     * @param value Value to set for the max_allowed_permissions property.
     */
    public void setMaxAllowedPermissions(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedPermissions = value;
    }
    /**
     * Sets the max_allowed_roles property value. The max_allowed_roles property
     * @param value Value to set for the max_allowed_roles property.
     */
    public void setMaxAllowedRoles(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedRoles = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final OrganizationSettingsObject value) {
        this.object = value;
    }
}
