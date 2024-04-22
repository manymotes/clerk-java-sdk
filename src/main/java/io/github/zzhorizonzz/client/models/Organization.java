package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Organization implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The admin_delete_enabled property
     */
    private Boolean adminDeleteEnabled;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The created_by property
     */
    private String createdBy;
    /**
     * The id property
     */
    private String id;
    /**
     * The max_allowed_memberships property
     */
    private Integer maxAllowedMemberships;
    /**
     * The members_count property
     */
    private Integer membersCount;
    /**
     * The name property
     */
    private String name;
    /**
     * The object property
     */
    private OrganizationObject object;
    /**
     * The private_metadata property
     */
    private OrganizationPrivateMetadata privateMetadata;
    /**
     * The public_metadata property
     */
    private OrganizationPublicMetadata publicMetadata;
    /**
     * The slug property
     */
    private String slug;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Instantiates a new Organization and sets the default values.
     */
    public Organization() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Organization
     */
    @jakarta.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
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
     * Gets the admin_delete_enabled property value. The admin_delete_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdminDeleteEnabled() {
        return this.adminDeleteEnabled;
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
     * Gets the created_by property value. The created_by property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("admin_delete_enabled", (n) -> { this.setAdminDeleteEnabled(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("created_by", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("max_allowed_memberships", (n) -> { this.setMaxAllowedMemberships(n.getIntegerValue()); });
        deserializerMap.put("members_count", (n) -> { this.setMembersCount(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(OrganizationObject::forValue)); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(OrganizationPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(OrganizationPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
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
     * Gets the max_allowed_memberships property value. The max_allowed_memberships property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedMemberships() {
        return this.maxAllowedMemberships;
    }
    /**
     * Gets the members_count property value. The members_count property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMembersCount() {
        return this.membersCount;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the object property value. The object property
     * @return a OrganizationObject
     */
    @jakarta.annotation.Nullable
    public OrganizationObject getObject() {
        return this.object;
    }
    /**
     * Gets the private_metadata property value. The private_metadata property
     * @return a OrganizationPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. The public_metadata property
     * @return a OrganizationPublicMetadata
     */
    @jakarta.annotation.Nullable
    public OrganizationPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
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
        writer.writeBooleanValue("admin_delete_enabled", this.getAdminDeleteEnabled());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("created_by", this.getCreatedBy());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("max_allowed_memberships", this.getMaxAllowedMemberships());
        writer.writeIntegerValue("members_count", this.getMembersCount());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeStringValue("slug", this.getSlug());
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
     * Sets the admin_delete_enabled property value. The admin_delete_enabled property
     * @param value Value to set for the admin_delete_enabled property.
     */
    public void setAdminDeleteEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.adminDeleteEnabled = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the created_by property value. The created_by property
     * @param value Value to set for the created_by property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the max_allowed_memberships property value. The max_allowed_memberships property
     * @param value Value to set for the max_allowed_memberships property.
     */
    public void setMaxAllowedMemberships(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedMemberships = value;
    }
    /**
     * Sets the members_count property value. The members_count property
     * @param value Value to set for the members_count property.
     */
    public void setMembersCount(@jakarta.annotation.Nullable final Integer value) {
        this.membersCount = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final OrganizationObject value) {
        this.object = value;
    }
    /**
     * Sets the private_metadata property value. The private_metadata property
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final OrganizationPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. The public_metadata property
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final OrganizationPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
