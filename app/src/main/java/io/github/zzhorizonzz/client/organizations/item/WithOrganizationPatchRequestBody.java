package io.github.zzhorizonzz.client.organizations.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrganizationPatchRequestBody implements Parsable {
    /**
     * If true, an admin can delete this organization with the Frontend API.
     */
    private Boolean adminDeleteEnabled;
    /**
     * The maximum number of memberships allowed for this organization
     */
    private Integer maxAllowedMemberships;
    /**
     * The new name of the organization
     */
    private String name;
    /**
     * Metadata saved on the organization that is only visible to your backend.
     */
    private WithOrganizationPatchRequestBodyPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the organization, that is visible to both your frontend and backend.
     */
    private WithOrganizationPatchRequestBodyPublicMetadata publicMetadata;
    /**
     * The new slug of the organization, which needs to be unique in the instance
     */
    private String slug;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithOrganizationPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithOrganizationPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithOrganizationPatchRequestBody();
    }
    /**
     * Gets the admin_delete_enabled property value. If true, an admin can delete this organization with the Frontend API.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdminDeleteEnabled() {
        return this.adminDeleteEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("admin_delete_enabled", (n) -> { this.setAdminDeleteEnabled(n.getBooleanValue()); });
        deserializerMap.put("max_allowed_memberships", (n) -> { this.setMaxAllowedMemberships(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(WithOrganizationPatchRequestBodyPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(WithOrganizationPatchRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_allowed_memberships property value. The maximum number of memberships allowed for this organization
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedMemberships() {
        return this.maxAllowedMemberships;
    }
    /**
     * Gets the name property value. The new name of the organization
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the organization that is only visible to your backend.
     * @return a WithOrganizationPatchRequestBodyPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public WithOrganizationPatchRequestBodyPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the organization, that is visible to both your frontend and backend.
     * @return a WithOrganizationPatchRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public WithOrganizationPatchRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the slug property value. The new slug of the organization, which needs to be unique in the instance
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("admin_delete_enabled", this.getAdminDeleteEnabled());
        writer.writeIntegerValue("max_allowed_memberships", this.getMaxAllowedMemberships());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeStringValue("slug", this.getSlug());
    }
    /**
     * Sets the admin_delete_enabled property value. If true, an admin can delete this organization with the Frontend API.
     * @param value Value to set for the admin_delete_enabled property.
     */
    public void setAdminDeleteEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.adminDeleteEnabled = value;
    }
    /**
     * Sets the max_allowed_memberships property value. The maximum number of memberships allowed for this organization
     * @param value Value to set for the max_allowed_memberships property.
     */
    public void setMaxAllowedMemberships(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedMemberships = value;
    }
    /**
     * Sets the name property value. The new name of the organization
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the organization that is only visible to your backend.
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final WithOrganizationPatchRequestBodyPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the organization, that is visible to both your frontend and backend.
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final WithOrganizationPatchRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the slug property value. The new slug of the organization, which needs to be unique in the instance
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
}
