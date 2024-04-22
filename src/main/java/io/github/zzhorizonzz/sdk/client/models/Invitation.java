package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Invitation implements Parsable {
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The email_address property
     */
    private String emailAddress;
    /**
     * The id property
     */
    private String id;
    /**
     * The object property
     */
    private InvitationObject object;
    /**
     * The public_metadata property
     */
    private InvitationPublicMetadata publicMetadata;
    /**
     * The revoked property
     */
    private Boolean revoked;
    /**
     * The status property
     */
    private InvitationStatus status;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The url property
     */
    private String url;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Invitation
     */
    @jakarta.annotation.Nonnull
    public static Invitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invitation();
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
     * Gets the email_address property value. The email_address property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(InvitationObject::forValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(InvitationPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("revoked", (n) -> { this.setRevoked(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(InvitationStatus::forValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the object property value. The object property
     * @return a InvitationObject
     */
    @jakarta.annotation.Nullable
    public InvitationObject getObject() {
        return this.object;
    }
    /**
     * Gets the public_metadata property value. The public_metadata property
     * @return a InvitationPublicMetadata
     */
    @jakarta.annotation.Nullable
    public InvitationPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the revoked property value. The revoked property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRevoked() {
        return this.revoked;
    }
    /**
     * Gets the status property value. The status property
     * @return a InvitationStatus
     */
    @jakarta.annotation.Nullable
    public InvitationStatus getStatus() {
        return this.status;
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
     * Gets the url property value. The url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeBooleanValue("revoked", this.getRevoked());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the email_address property value. The email_address property
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final InvitationObject value) {
        this.object = value;
    }
    /**
     * Sets the public_metadata property value. The public_metadata property
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final InvitationPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the revoked property value. The revoked property
     * @param value Value to set for the revoked property.
     */
    public void setRevoked(@jakarta.annotation.Nullable final Boolean value) {
        this.revoked = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final InvitationStatus value) {
        this.status = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
