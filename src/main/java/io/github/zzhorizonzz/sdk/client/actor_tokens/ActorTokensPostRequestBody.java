package io.github.zzhorizonzz.sdk.client.actor_tokens;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActorTokensPostRequestBody implements Parsable {
    /**
     * The actor payload. It needs to include a sub property which should contain the ID of the actor.This whole payload will be also included in the JWT session token.
     */
    private ActorTokensPostRequestBodyActor actor;
    /**
     * Optional parameter to specify the life duration of the actor token in seconds.By default, the duration is 1 hour.
     */
    private Integer expiresInSeconds;
    /**
     * The maximum duration that the session which will be created by the generated actor token should last.By default, the duration of a session created via an actor token, lasts 30 minutes.
     */
    private Integer sessionMaxDurationInSeconds;
    /**
     * The ID of the user that can use the newly created sign in token.
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActorTokensPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ActorTokensPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActorTokensPostRequestBody();
    }
    /**
     * Gets the actor property value. The actor payload. It needs to include a sub property which should contain the ID of the actor.This whole payload will be also included in the JWT session token.
     * @return a ActorTokensPostRequestBodyActor
     */
    @jakarta.annotation.Nullable
    public ActorTokensPostRequestBodyActor getActor() {
        return this.actor;
    }
    /**
     * Gets the expires_in_seconds property value. Optional parameter to specify the life duration of the actor token in seconds.By default, the duration is 1 hour.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(ActorTokensPostRequestBodyActor::createFromDiscriminatorValue)); });
        deserializerMap.put("expires_in_seconds", (n) -> { this.setExpiresInSeconds(n.getIntegerValue()); });
        deserializerMap.put("session_max_duration_in_seconds", (n) -> { this.setSessionMaxDurationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the session_max_duration_in_seconds property value. The maximum duration that the session which will be created by the generated actor token should last.By default, the duration of a session created via an actor token, lasts 30 minutes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSessionMaxDurationInSeconds() {
        return this.sessionMaxDurationInSeconds;
    }
    /**
     * Gets the user_id property value. The ID of the user that can use the newly created sign in token.
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
        writer.writeIntegerValue("expires_in_seconds", this.getExpiresInSeconds());
        writer.writeIntegerValue("session_max_duration_in_seconds", this.getSessionMaxDurationInSeconds());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the actor property value. The actor payload. It needs to include a sub property which should contain the ID of the actor.This whole payload will be also included in the JWT session token.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final ActorTokensPostRequestBodyActor value) {
        this.actor = value;
    }
    /**
     * Sets the expires_in_seconds property value. Optional parameter to specify the life duration of the actor token in seconds.By default, the duration is 1 hour.
     * @param value Value to set for the expires_in_seconds property.
     */
    public void setExpiresInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.expiresInSeconds = value;
    }
    /**
     * Sets the session_max_duration_in_seconds property value. The maximum duration that the session which will be created by the generated actor token should last.By default, the duration of a session created via an actor token, lasts 30 minutes.
     * @param value Value to set for the session_max_duration_in_seconds property.
     */
    public void setSessionMaxDurationInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.sessionMaxDurationInSeconds = value;
    }
    /**
     * Sets the user_id property value. The ID of the user that can use the newly created sign in token.
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
