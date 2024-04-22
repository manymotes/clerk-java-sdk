package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProxyCheck implements Parsable {
    /**
     * The created_at property
     */
    private Integer createdAt;
    /**
     * The domain_id property
     */
    private String domainId;
    /**
     * The id property
     */
    private String id;
    /**
     * The last_run_at property
     */
    private Integer lastRunAt;
    /**
     * The object property
     */
    private ProxyCheckObject object;
    /**
     * The proxy_url property
     */
    private String proxyUrl;
    /**
     * The successful property
     */
    private Boolean successful;
    /**
     * The updated_at property
     */
    private Integer updatedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProxyCheck
     */
    @jakarta.annotation.Nonnull
    public static ProxyCheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProxyCheck();
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the domain_id property value. The domain_id property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("domain_id", (n) -> { this.setDomainId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_run_at", (n) -> { this.setLastRunAt(n.getIntegerValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(ProxyCheckObject::forValue)); });
        deserializerMap.put("proxy_url", (n) -> { this.setProxyUrl(n.getStringValue()); });
        deserializerMap.put("successful", (n) -> { this.setSuccessful(n.getBooleanValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getIntegerValue()); });
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
     * Gets the last_run_at property value. The last_run_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLastRunAt() {
        return this.lastRunAt;
    }
    /**
     * Gets the object property value. The object property
     * @return a ProxyCheckObject
     */
    @jakarta.annotation.Nullable
    public ProxyCheckObject getObject() {
        return this.object;
    }
    /**
     * Gets the proxy_url property value. The proxy_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyUrl() {
        return this.proxyUrl;
    }
    /**
     * Gets the successful property value. The successful property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccessful() {
        return this.successful;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeStringValue("domain_id", this.getDomainId());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("last_run_at", this.getLastRunAt());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("proxy_url", this.getProxyUrl());
        writer.writeBooleanValue("successful", this.getSuccessful());
        writer.writeIntegerValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the domain_id property value. The domain_id property
     * @param value Value to set for the domain_id property.
     */
    public void setDomainId(@jakarta.annotation.Nullable final String value) {
        this.domainId = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_run_at property value. The last_run_at property
     * @param value Value to set for the last_run_at property.
     */
    public void setLastRunAt(@jakarta.annotation.Nullable final Integer value) {
        this.lastRunAt = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final ProxyCheckObject value) {
        this.object = value;
    }
    /**
     * Sets the proxy_url property value. The proxy_url property
     * @param value Value to set for the proxy_url property.
     */
    public void setProxyUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyUrl = value;
    }
    /**
     * Sets the successful property value. The successful property
     * @param value Value to set for the successful property.
     */
    public void setSuccessful(@jakarta.annotation.Nullable final Boolean value) {
        this.successful = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.updatedAt = value;
    }
}
