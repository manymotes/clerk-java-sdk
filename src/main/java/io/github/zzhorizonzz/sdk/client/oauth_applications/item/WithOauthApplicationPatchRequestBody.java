package io.github.zzhorizonzz.sdk.client.oauth_applications.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOauthApplicationPatchRequestBody implements Parsable {
    /**
     * The new callback URL of the OAuth application
     */
    private String callbackUrl;
    /**
     * The new name of the OAuth application
     */
    private String name;
    /**
     * Define the allowed scopes for the new OAuth applications that dictate the user payload of the OAuth user info endpoint. Available scopes are `profile`, `email`, `public_metadata`, `private_metadata`. Provide the requested scopes as a string, separated by spaces.
     */
    private String scopes;
    /**
     * Instantiates a new WithOauthApplicationPatchRequestBody and sets the default values.
     */
    public WithOauthApplicationPatchRequestBody() {
        this.setScopes("profile email");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithOauthApplicationPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithOauthApplicationPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithOauthApplicationPatchRequestBody();
    }
    /**
     * Gets the callback_url property value. The new callback URL of the OAuth application
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("callback_url", (n) -> { this.setCallbackUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The new name of the OAuth application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
        writer.writeStringValue("scopes", this.getScopes());
    }
    /**
     * Sets the callback_url property value. The new callback URL of the OAuth application
     * @param value Value to set for the callback_url property.
     */
    public void setCallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.callbackUrl = value;
    }
    /**
     * Sets the name property value. The new name of the OAuth application
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scopes property value. Define the allowed scopes for the new OAuth applications that dictate the user payload of the OAuth user info endpoint. Available scopes are `profile`, `email`, `public_metadata`, `private_metadata`. Provide the requested scopes as a string, separated by spaces.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final String value) {
        this.scopes = value;
    }
}
