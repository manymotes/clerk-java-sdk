package io.github.zzhorizonzz.client.proxy_checks;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProxyChecksPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the domain that will be updated.
     */
    private String domainId;
    /**
     * The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. e.g. https://example.com/__clerk
     */
    private String proxyUrl;
    /**
     * Instantiates a new ProxyChecksPostRequestBody and sets the default values.
     */
    public ProxyChecksPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProxyChecksPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProxyChecksPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProxyChecksPostRequestBody();
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
     * Gets the domain_id property value. The ID of the domain that will be updated.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainId() {
        return this.domainId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("domain_id", (n) -> { this.setDomainId(n.getStringValue()); });
        deserializerMap.put("proxy_url", (n) -> { this.setProxyUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proxy_url property value. The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. e.g. https://example.com/__clerk
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyUrl() {
        return this.proxyUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("domain_id", this.getDomainId());
        writer.writeStringValue("proxy_url", this.getProxyUrl());
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
     * Sets the domain_id property value. The ID of the domain that will be updated.
     * @param value Value to set for the domain_id property.
     */
    public void setDomainId(@jakarta.annotation.Nullable final String value) {
        this.domainId = value;
    }
    /**
     * Sets the proxy_url property value. The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. e.g. https://example.com/__clerk
     * @param value Value to set for the proxy_url property.
     */
    public void setProxyUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyUrl = value;
    }
}
