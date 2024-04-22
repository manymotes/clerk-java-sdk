package io.github.zzhorizonzz.client.oauth_applications;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OauthApplicationsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The callback URL of the new OAuth application
     */
    private String callbackUrl;
    /**
     * The name of the new OAuth application
     */
    private String name;
    /**
     * If true, this client is public and cannot securely store a client secret.Only the authorization code flow with proof key for code exchange (PKCE) may be used.Public clients cannot be updated to be confidential clients, and vice versa.
     */
    private Boolean publicEscaped;
    /**
     * Define the allowed scopes for the new OAuth applications that dictate the user payload of the OAuth user info endpoint. Available scopes are `profile`, `email`, `public_metadata`, `private_metadata`. Provide the requested scopes as a string, separated by spaces.
     */
    private String scopes;
    /**
     * Instantiates a new OauthApplicationsPostRequestBody and sets the default values.
     */
    public OauthApplicationsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
        this.setScopes("profile email");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OauthApplicationsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OauthApplicationsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OauthApplicationsPostRequestBody();
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
     * Gets the callback_url property value. The callback URL of the new OAuth application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("callback_url", (n) -> { this.setCallbackUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("public", (n) -> { this.setPublic(n.getBooleanValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the new OAuth application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the public property value. If true, this client is public and cannot securely store a client secret.Only the authorization code flow with proof key for code exchange (PKCE) may be used.Public clients cannot be updated to be confidential clients, and vice versa.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPublic() {
        return this.publicEscaped;
    }
    /**
     * Gets the scopes property value. Define the allowed scopes for the new OAuth applications that dictate the user payload of the OAuth user info endpoint. Available scopes are `profile`, `email`, `public_metadata`, `private_metadata`. Provide the requested scopes as a string, separated by spaces.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopes() {
        return this.scopes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callback_url", this.getCallbackUrl());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("public", this.getPublic());
        writer.writeStringValue("scopes", this.getScopes());
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
     * Sets the callback_url property value. The callback URL of the new OAuth application
     * @param value Value to set for the callback_url property.
     */
    public void setCallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.callbackUrl = value;
    }
    /**
     * Sets the name property value. The name of the new OAuth application
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the public property value. If true, this client is public and cannot securely store a client secret.Only the authorization code flow with proof key for code exchange (PKCE) may be used.Public clients cannot be updated to be confidential clients, and vice versa.
     * @param value Value to set for the public property.
     */
    public void setPublic(@jakarta.annotation.Nullable final Boolean value) {
        this.publicEscaped = value;
    }
    /**
     * Sets the scopes property value. Define the allowed scopes for the new OAuth applications that dictate the user payload of the OAuth user info endpoint. Available scopes are `profile`, `email`, `public_metadata`, `private_metadata`. Provide the requested scopes as a string, separated by spaces.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final String value) {
        this.scopes = value;
    }
}
