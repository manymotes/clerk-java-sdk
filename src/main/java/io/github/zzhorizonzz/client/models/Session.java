package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Session implements Parsable {
    /**
     * The abandon_at property
     */
    private Integer abandonAt;
    /**
     * The actor property
     */
    private SessionActor actor;
    /**
     * The client_id property
     */
    private String clientId;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The expire_at property
     */
    private Integer expireAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The last_active_at property
     */
    private Integer lastActiveAt;
    /**
     * The last_active_organization_id property
     */
    private String lastActiveOrganizationId;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private SessionObject object;
    /**
     * The status property
     */
    private SessionStatus status;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Session
     */
    @jakarta.annotation.Nonnull
    public static Session createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Session();
    }
    /**
     * Gets the abandon_at property value. The abandon_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAbandonAt() {
        return this.abandonAt;
    }
    /**
     * Gets the actor property value. The actor property
     * @return a SessionActor
     */
    @jakarta.annotation.Nullable
    public SessionActor getActor() {
        return this.actor;
    }
    /**
     * Gets the client_id property value. The client_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
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
     * Gets the expire_at property value. The expire_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpireAt() {
        return this.expireAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("abandon_at", (n) -> { this.setAbandonAt(n.getIntegerValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(SessionActor::createFromDiscriminatorValue)); });
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("expire_at", (n) -> { this.setExpireAt(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_active_at", (n) -> { this.setLastActiveAt(n.getIntegerValue()); });
        deserializerMap.put("last_active_organization_id", (n) -> { this.setLastActiveOrganizationId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(SessionObject::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SessionStatus::forValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the last_active_at property value. The last_active_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLastActiveAt() {
        return this.lastActiveAt;
    }
    /**
     * Gets the last_active_organization_id property value. The last_active_organization_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActiveOrganizationId() {
        return this.lastActiveOrganizationId;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a SessionObject
     */
    @jakarta.annotation.Nullable
    public SessionObject getObject() {
        return this.object;
    }
    /**
     * Gets the status property value. The status property
     * @return a SessionStatus
     */
    @jakarta.annotation.Nullable
    public SessionStatus getStatus() {
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
     * Gets the user_id property value. The user_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("abandon_at", this.getAbandonAt());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeIntegerValue("expire_at", this.getExpireAt());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("last_active_at", this.getLastActiveAt());
        writer.writeStringValue("last_active_organization_id", this.getLastActiveOrganizationId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the abandon_at property value. The abandon_at property
     * @param value Value to set for the abandon_at property.
     */
    public void setAbandonAt(@jakarta.annotation.Nullable final Integer value) {
        this.abandonAt = value;
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final SessionActor value) {
        this.actor = value;
    }
    /**
     * Sets the client_id property value. The client_id property
     * @param value Value to set for the client_id property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the expire_at property value. The expire_at property
     * @param value Value to set for the expire_at property.
     */
    public void setExpireAt(@jakarta.annotation.Nullable final Integer value) {
        this.expireAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_active_at property value. The last_active_at property
     * @param value Value to set for the last_active_at property.
     */
    public void setLastActiveAt(@jakarta.annotation.Nullable final Integer value) {
        this.lastActiveAt = value;
    }
    /**
     * Sets the last_active_organization_id property value. The last_active_organization_id property
     * @param value Value to set for the last_active_organization_id property.
     */
    public void setLastActiveOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.lastActiveOrganizationId = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final SessionObject value) {
        this.object = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SessionStatus value) {
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
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
