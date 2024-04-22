package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hello world
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMembership implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private OrganizationMembershipObject object;
    /**
     * The organization property
     */
    private OrganizationMembershipOrganization organization;
    /**
     * The permissions property
     */
    private java.util.List<String> permissions;
    /**
     * Metadata saved on the organization membership, accessible only from the Backend API
     */
    private OrganizationMembershipPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the organization membership, accessible from both Frontend and Backend APIs
     */
    private OrganizationMembershipPublicMetadata publicMetadata;
    /**
     * The public_user_data property
     */
    private OrganizationMembershipPublicUserData publicUserData;
    /**
     * The role property
     */
    private String role;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Instantiates a new OrganizationMembership and sets the default values.
     */
    public OrganizationMembership() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationMembership
     */
    @jakarta.annotation.Nonnull
    public static OrganizationMembership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationMembership();
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
     * Gets the created_at property value. Unix timestamp of creation.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(OrganizationMembershipObject::forValue)); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(OrganizationMembershipOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(OrganizationMembershipPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(OrganizationMembershipPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_user_data", (n) -> { this.setPublicUserData(n.getObjectValue(OrganizationMembershipPublicUserData::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a OrganizationMembershipObject
     */
    @jakarta.annotation.Nullable
    public OrganizationMembershipObject getObject() {
        return this.object;
    }
    /**
     * Gets the organization property value. The organization property
     * @return a OrganizationMembershipOrganization
     */
    @jakarta.annotation.Nullable
    public OrganizationMembershipOrganization getOrganization() {
        return this.organization;
    }
    /**
     * Gets the permissions property value. The permissions property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the organization membership, accessible only from the Backend API
     * @return a OrganizationMembershipPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationMembershipPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the organization membership, accessible from both Frontend and Backend APIs
     * @return a OrganizationMembershipPublicMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationMembershipPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the public_user_data property value. The public_user_data property
     * @return a OrganizationMembershipPublicUserData
     */
    @jakarta.annotation.Nullable
    public OrganizationMembershipPublicUserData getPublicUserData() {
        return this.publicUserData;
    }
    /**
     * Gets the role property value. The role property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the updated_at property value. Unix timestamp of last update.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeObjectValue("public_user_data", this.getPublicUserData());
        writer.writeStringValue("role", this.getRole());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
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
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final OrganizationMembershipObject value) {
        this.object = value;
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final OrganizationMembershipOrganization value) {
        this.organization = value;
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissions = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the organization membership, accessible only from the Backend API
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final OrganizationMembershipPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the organization membership, accessible from both Frontend and Backend APIs
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final OrganizationMembershipPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the public_user_data property value. The public_user_data property
     * @param value Value to set for the public_user_data property.
     */
    public void setPublicUserData(@jakarta.annotation.Nullable final OrganizationMembershipPublicUserData value) {
        this.publicUserData = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
