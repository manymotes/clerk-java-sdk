package io.github.zzhorizonzz.sdk.client.domains;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Marks the new domain as satellite. Only `true` is accepted at the moment.
     */
    private Boolean isSatellite;
    /**
     * The new domain name. Can contain the port for development instances.
     */
    private String name;
    /**
     * The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. Applicable only to production instances.
     */
    private String proxyUrl;
    /**
     * Instantiates a new DomainsPostRequestBody and sets the default values.
     */
    public DomainsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DomainsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainsPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("is_satellite", (n) -> { this.setIsSatellite(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("proxy_url", (n) -> { this.setProxyUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_satellite property value. Marks the new domain as satellite. Only `true` is accepted at the moment.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSatellite() {
        return this.isSatellite;
    }
    /**
     * Gets the name property value. The new domain name. Can contain the port for development instances.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the proxy_url property value. The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. Applicable only to production instances.
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
        writer.writeBooleanValue("is_satellite", this.getIsSatellite());
        writer.writeStringValue("name", this.getName());
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
     * Sets the is_satellite property value. Marks the new domain as satellite. Only `true` is accepted at the moment.
     * @param value Value to set for the is_satellite property.
     */
    public void setIsSatellite(@jakarta.annotation.Nullable final Boolean value) {
        this.isSatellite = value;
    }
    /**
     * Sets the name property value. The new domain name. Can contain the port for development instances.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the proxy_url property value. The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. Applicable only to production instances.
     * @param value Value to set for the proxy_url property.
     */
    public void setProxyUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyUrl = value;
    }
}
