package io.github.zzhorizonzz.client.domains.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithDomainPatchRequestBody implements Parsable {
    /**
     * The new domain name. For development instances, can contain the port,i.e `myhostname:3000`. For production instances, must be a valid FQDN,i.e `mysite.com`. Cannot contain protocol scheme.
     */
    private String name;
    /**
     * The full URL of the proxy that will forward requests to Clerk's Frontend API.Can only be updated for production instances.
     */
    private String proxyUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithDomainPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithDomainPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithDomainPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("proxy_url", (n) -> { this.setProxyUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The new domain name. For development instances, can contain the port,i.e `myhostname:3000`. For production instances, must be a valid FQDN,i.e `mysite.com`. Cannot contain protocol scheme.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the proxy_url property value. The full URL of the proxy that will forward requests to Clerk's Frontend API.Can only be updated for production instances.
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
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("proxy_url", this.getProxyUrl());
    }
    /**
     * Sets the name property value. The new domain name. For development instances, can contain the port,i.e `myhostname:3000`. For production instances, must be a valid FQDN,i.e `mysite.com`. Cannot contain protocol scheme.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the proxy_url property value. The full URL of the proxy that will forward requests to Clerk's Frontend API.Can only be updated for production instances.
     * @param value Value to set for the proxy_url property.
     */
    public void setProxyUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyUrl = value;
    }
}
