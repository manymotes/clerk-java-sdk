package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Client implements Parsable {
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * String representing the identifier of the session.
     */
    private String id;
    /**
     * Last active session_id.
     */
    private String lastActiveSessionId;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private ClientObject object;
    /**
     * The session_ids property
     */
    private java.util.List<String> sessionIds;
    /**
     * The sessions property
     */
    private java.util.List<Session> sessions;
    /**
     * The sign_in_id property
     */
    private String signInId;
    /**
     * The sign_up_id property
     */
    private String signUpId;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Client
     */
    @jakarta.annotation.Nonnull
    public static Client createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Client();
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
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_active_session_id", (n) -> { this.setLastActiveSessionId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(ClientObject::forValue)); });
        deserializerMap.put("session_ids", (n) -> { this.setSessionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(Session::createFromDiscriminatorValue)); });
        deserializerMap.put("sign_in_id", (n) -> { this.setSignInId(n.getStringValue()); });
        deserializerMap.put("sign_up_id", (n) -> { this.setSignUpId(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. String representing the identifier of the session.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the last_active_session_id property value. Last active session_id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActiveSessionId() {
        return this.lastActiveSessionId;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a ClientObject
     */
    @jakarta.annotation.Nullable
    public ClientObject getObject() {
        return this.object;
    }
    /**
     * Gets the session_ids property value. The session_ids property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }
    /**
     * Gets the sessions property value. The sessions property
     * @return a java.util.List<Session>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Session> getSessions() {
        return this.sessions;
    }
    /**
     * Gets the sign_in_id property value. The sign_in_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignInId() {
        return this.signInId;
    }
    /**
     * Gets the sign_up_id property value. The sign_up_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignUpId() {
        return this.signUpId;
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
        writer.writeStringValue("last_active_session_id", this.getLastActiveSessionId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeCollectionOfPrimitiveValues("session_ids", this.getSessionIds());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
        writer.writeStringValue("sign_in_id", this.getSignInId());
        writer.writeStringValue("sign_up_id", this.getSignUpId());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. String representing the identifier of the session.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_active_session_id property value. Last active session_id.
     * @param value Value to set for the last_active_session_id property.
     */
    public void setLastActiveSessionId(@jakarta.annotation.Nullable final String value) {
        this.lastActiveSessionId = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final ClientObject value) {
        this.object = value;
    }
    /**
     * Sets the session_ids property value. The session_ids property
     * @param value Value to set for the session_ids property.
     */
    public void setSessionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sessionIds = value;
    }
    /**
     * Sets the sessions property value. The sessions property
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<Session> value) {
        this.sessions = value;
    }
    /**
     * Sets the sign_in_id property value. The sign_in_id property
     * @param value Value to set for the sign_in_id property.
     */
    public void setSignInId(@jakarta.annotation.Nullable final String value) {
        this.signInId = value;
    }
    /**
     * Sets the sign_up_id property value. The sign_up_id property
     * @param value Value to set for the sign_up_id property.
     */
    public void setSignUpId(@jakarta.annotation.Nullable final String value) {
        this.signUpId = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
