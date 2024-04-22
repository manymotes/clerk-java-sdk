package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActorToken implements Parsable {
    /**
     * The actor property
     */
    private ActorTokenActor actor;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The object property
     */
    private ActorTokenObject object;
    /**
     * The status property
     */
    private ActorTokenStatus status;
    /**
     * The token property
     */
    private String token;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The url property
     */
    private String url;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActorToken
     */
    @jakarta.annotation.Nonnull
    public static ActorToken createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActorToken();
    }
    /**
     * Gets the actor property value. The actor property
     * @return a ActorTokenActor
     */
    @jakarta.annotation.Nullable
    public ActorTokenActor getActor() {
        return this.actor;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(ActorTokenActor::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(ActorTokenObject::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ActorTokenStatus::forValue)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the object property value. The object property
     * @return a ActorTokenObject
     */
    @jakarta.annotation.Nullable
    public ActorTokenObject getObject() {
        return this.object;
    }
    /**
     * Gets the status property value. The status property
     * @return a ActorTokenStatus
     */
    @jakarta.annotation.Nullable
    public ActorTokenStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the token property value. The token property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
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
        writer.writeObjectValue("actor", this.getActor());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("token", this.getToken());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final ActorTokenActor value) {
        this.actor = value;
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
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final ActorTokenObject value) {
        this.object = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ActorTokenStatus value) {
        this.status = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
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
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
