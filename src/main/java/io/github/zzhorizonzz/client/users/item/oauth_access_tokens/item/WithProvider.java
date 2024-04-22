package io.github.zzhorizonzz.client.users.item.oauth_access_tokens.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProvider implements Parsable {
    /**
     * The label property
     */
    private String label;
    /**
     * The object property
     */
    private String object;
    /**
     * The ID of the provider
     */
    private String provider;
    /**
     * The public_metadata property
     */
    private WithProviderPublicMetadata publicMetadata;
    /**
     * The list of scopes that the token is valid for.Only present for OAuth 2.0 tokens.
     */
    private java.util.List<String> scopes;
    /**
     * The access token
     */
    private String token;
    /**
     * The token secret. Only present for OAuth 1.0 tokens.
     */
    private String tokenSecret;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithProvider
     */
    @jakarta.annotation.Nonnull
    public static WithProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithProvider();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(WithProviderPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("token_secret", (n) -> { this.setTokenSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The label property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the object property value. The object property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObject() {
        return this.object;
    }
    /**
     * Gets the provider property value. The ID of the provider
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the public_metadata property value. The public_metadata property
     * @return a WithProviderPublicMetadata
     */
    @jakarta.annotation.Nullable
    public WithProviderPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the scopes property value. The list of scopes that the token is valid for.Only present for OAuth 2.0 tokens.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Gets the token property value. The access token
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Gets the token_secret property value. The token secret. Only present for OAuth 1.0 tokens.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenSecret() {
        return this.tokenSecret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("object", this.getObject());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeCollectionOfPrimitiveValues("scopes", this.getScopes());
        writer.writeStringValue("token", this.getToken());
        writer.writeStringValue("token_secret", this.getTokenSecret());
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final String value) {
        this.object = value;
    }
    /**
     * Sets the provider property value. The ID of the provider
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the public_metadata property value. The public_metadata property
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final WithProviderPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the scopes property value. The list of scopes that the token is valid for.Only present for OAuth 2.0 tokens.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.scopes = value;
    }
    /**
     * Sets the token property value. The access token
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
    /**
     * Sets the token_secret property value. The token secret. Only present for OAuth 1.0 tokens.
     * @param value Value to set for the token_secret property.
     */
    public void setTokenSecret(@jakarta.annotation.Nullable final String value) {
        this.tokenSecret = value;
    }
}
