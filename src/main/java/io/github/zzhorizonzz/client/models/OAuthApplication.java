package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OAuthApplication implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authorize_url property
     */
    private String authorizeUrl;
    /**
     * The callback_url property
     */
    private String callbackUrl;
    /**
     * The client_id property
     */
    private String clientId;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The instance_id property
     */
    private String instanceId;
    /**
     * The name property
     */
    private String name;
    /**
     * The object property
     */
    private OAuthApplicationObject object;
    /**
     * The public property
     */
    private Boolean publicEscaped;
    /**
     * The scopes property
     */
    private String scopes;
    /**
     * The token_fetch_url property
     */
    private String tokenFetchUrl;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The user_info_url property
     */
    private String userInfoUrl;
    /**
     * Instantiates a new OAuthApplication and sets the default values.
     */
    public OAuthApplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OAuthApplication
     */
    @jakarta.annotation.Nonnull
    public static OAuthApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OAuthApplication();
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
     * Gets the authorize_url property value. The authorize_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthorizeUrl() {
        return this.authorizeUrl;
    }
    /**
     * Gets the callback_url property value. The callback_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallbackUrl() {
        return this.callbackUrl;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("authorize_url", (n) -> { this.setAuthorizeUrl(n.getStringValue()); });
        deserializerMap.put("callback_url", (n) -> { this.setCallbackUrl(n.getStringValue()); });
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("instance_id", (n) -> { this.setInstanceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(OAuthApplicationObject::forValue)); });
        deserializerMap.put("public", (n) -> { this.setPublic(n.getBooleanValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getStringValue()); });
        deserializerMap.put("token_fetch_url", (n) -> { this.setTokenFetchUrl(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("user_info_url", (n) -> { this.setUserInfoUrl(n.getStringValue()); });
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
     * Gets the instance_id property value. The instance_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstanceId() {
        return this.instanceId;
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
     * @return a OAuthApplicationObject
     */
    @jakarta.annotation.Nullable
    public OAuthApplicationObject getObject() {
        return this.object;
    }
    /**
     * Gets the public property value. The public property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPublic() {
        return this.publicEscaped;
    }
    /**
     * Gets the scopes property value. The scopes property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopes() {
        return this.scopes;
    }
    /**
     * Gets the token_fetch_url property value. The token_fetch_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenFetchUrl() {
        return this.tokenFetchUrl;
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
     * Gets the user_info_url property value. The user_info_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserInfoUrl() {
        return this.userInfoUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authorize_url", this.getAuthorizeUrl());
        writer.writeStringValue("callback_url", this.getCallbackUrl());
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("instance_id", this.getInstanceId());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeBooleanValue("public", this.getPublic());
        writer.writeStringValue("scopes", this.getScopes());
        writer.writeStringValue("token_fetch_url", this.getTokenFetchUrl());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("user_info_url", this.getUserInfoUrl());
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
     * Sets the authorize_url property value. The authorize_url property
     * @param value Value to set for the authorize_url property.
     */
    public void setAuthorizeUrl(@jakarta.annotation.Nullable final String value) {
        this.authorizeUrl = value;
    }
    /**
     * Sets the callback_url property value. The callback_url property
     * @param value Value to set for the callback_url property.
     */
    public void setCallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.callbackUrl = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the instance_id property value. The instance_id property
     * @param value Value to set for the instance_id property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final String value) {
        this.instanceId = value;
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
    public void setObject(@jakarta.annotation.Nullable final OAuthApplicationObject value) {
        this.object = value;
    }
    /**
     * Sets the public property value. The public property
     * @param value Value to set for the public property.
     */
    public void setPublic(@jakarta.annotation.Nullable final Boolean value) {
        this.publicEscaped = value;
    }
    /**
     * Sets the scopes property value. The scopes property
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final String value) {
        this.scopes = value;
    }
    /**
     * Sets the token_fetch_url property value. The token_fetch_url property
     * @param value Value to set for the token_fetch_url property.
     */
    public void setTokenFetchUrl(@jakarta.annotation.Nullable final String value) {
        this.tokenFetchUrl = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
    /**
     * Sets the user_info_url property value. The user_info_url property
     * @param value Value to set for the user_info_url property.
     */
    public void setUserInfoUrl(@jakarta.annotation.Nullable final String value) {
        this.userInfoUrl = value;
    }
}
