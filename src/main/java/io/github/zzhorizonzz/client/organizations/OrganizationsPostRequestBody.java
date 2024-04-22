package io.github.zzhorizonzz.client.organizations;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the User who will become the administrator for the new organization
     */
    private String createdBy;
    /**
     * The maximum number of memberships allowed for this organization
     */
    private Integer maxAllowedMemberships;
    /**
     * The name of the new organization
     */
    private String name;
    /**
     * Metadata saved on the organization, accessible only from the Backend API
     */
    private OrganizationsPostRequestBodyPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     */
    private OrganizationsPostRequestBodyPublicMetadata publicMetadata;
    /**
     * A slug for the new organization.Can contain only lowercase alphanumeric characters and the dash "-".Must be unique for the instance.
     */
    private String slug;
    /**
     * Instantiates a new OrganizationsPostRequestBody and sets the default values.
     */
    public OrganizationsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationsPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the created_by property value. The ID of the User who will become the administrator for the new organization
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("created_by", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("max_allowed_memberships", (n) -> { this.setMaxAllowedMemberships(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(OrganizationsPostRequestBodyPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(OrganizationsPostRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
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
     * Gets the name property value. The name of the new organization
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the organization, accessible only from the Backend API
     * @return a OrganizationsPostRequestBodyPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationsPostRequestBodyPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     * @return a OrganizationsPostRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationsPostRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the slug property value. A slug for the new organization.Can contain only lowercase alphanumeric characters and the dash "-".Must be unique for the instance.
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
        writer.writeStringValue("created_by", this.getCreatedBy());
        writer.writeIntegerValue("max_allowed_memberships", this.getMaxAllowedMemberships());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the created_by property value. The ID of the User who will become the administrator for the new organization
     * @param value Value to set for the created_by property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the max_allowed_memberships property value. The maximum number of memberships allowed for this organization
     * @param value Value to set for the max_allowed_memberships property.
     */
    public void setMaxAllowedMemberships(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedMemberships = value;
    }
    /**
     * Sets the name property value. The name of the new organization
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the organization, accessible only from the Backend API
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final OrganizationsPostRequestBodyPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final OrganizationsPostRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the slug property value. A slug for the new organization.Can contain only lowercase alphanumeric characters and the dash "-".Must be unique for the instance.
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
}
