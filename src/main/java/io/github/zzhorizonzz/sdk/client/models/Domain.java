package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Domain implements AdditionalDataHolder, Parsable {
    /**
     * Null for satellite domains.
     */
    private String accountsPortalUrl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cname_targets property
     */
    private java.util.List<CNameTarget> cnameTargets;
    /**
     * The development_origin property
     */
    private String developmentOrigin;
    /**
     * The frontend_api_url property
     */
    private String frontendApiUrl;
    /**
     * The id property
     */
    private String id;
    /**
     * The is_satellite property
     */
    private Boolean isSatellite;
    /**
     * The name property
     */
    private String name;
    /**
     * The object property
     */
    private DomainObject object;
    /**
     * The proxy_url property
     */
    private String proxyUrl;
    /**
     * Instantiates a new Domain and sets the default values.
     */
    public Domain() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Domain
     */
    @jakarta.annotation.Nonnull
    public static Domain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Domain();
    }
    /**
     * Gets the accounts_portal_url property value. Null for satellite domains.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountsPortalUrl() {
        return this.accountsPortalUrl;
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
     * Gets the cname_targets property value. The cname_targets property
     * @return a java.util.List<CNameTarget>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CNameTarget> getCnameTargets() {
        return this.cnameTargets;
    }
    /**
     * Gets the development_origin property value. The development_origin property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDevelopmentOrigin() {
        return this.developmentOrigin;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("accounts_portal_url", (n) -> { this.setAccountsPortalUrl(n.getStringValue()); });
        deserializerMap.put("cname_targets", (n) -> { this.setCnameTargets(n.getCollectionOfObjectValues(CNameTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("development_origin", (n) -> { this.setDevelopmentOrigin(n.getStringValue()); });
        deserializerMap.put("frontend_api_url", (n) -> { this.setFrontendApiUrl(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("is_satellite", (n) -> { this.setIsSatellite(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(DomainObject::forValue)); });
        deserializerMap.put("proxy_url", (n) -> { this.setProxyUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frontend_api_url property value. The frontend_api_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFrontendApiUrl() {
        return this.frontendApiUrl;
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
     * Gets the is_satellite property value. The is_satellite property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSatellite() {
        return this.isSatellite;
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
     * @return a DomainObject
     */
    @jakarta.annotation.Nullable
    public DomainObject getObject() {
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accounts_portal_url", this.getAccountsPortalUrl());
        writer.writeCollectionOfObjectValues("cname_targets", this.getCnameTargets());
        writer.writeStringValue("development_origin", this.getDevelopmentOrigin());
        writer.writeStringValue("frontend_api_url", this.getFrontendApiUrl());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("is_satellite", this.getIsSatellite());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("proxy_url", this.getProxyUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accounts_portal_url property value. Null for satellite domains.
     * @param value Value to set for the accounts_portal_url property.
     */
    public void setAccountsPortalUrl(@jakarta.annotation.Nullable final String value) {
        this.accountsPortalUrl = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cname_targets property value. The cname_targets property
     * @param value Value to set for the cname_targets property.
     */
    public void setCnameTargets(@jakarta.annotation.Nullable final java.util.List<CNameTarget> value) {
        this.cnameTargets = value;
    }
    /**
     * Sets the development_origin property value. The development_origin property
     * @param value Value to set for the development_origin property.
     */
    public void setDevelopmentOrigin(@jakarta.annotation.Nullable final String value) {
        this.developmentOrigin = value;
    }
    /**
     * Sets the frontend_api_url property value. The frontend_api_url property
     * @param value Value to set for the frontend_api_url property.
     */
    public void setFrontendApiUrl(@jakarta.annotation.Nullable final String value) {
        this.frontendApiUrl = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the is_satellite property value. The is_satellite property
     * @param value Value to set for the is_satellite property.
     */
    public void setIsSatellite(@jakarta.annotation.Nullable final Boolean value) {
        this.isSatellite = value;
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
    public void setObject(@jakarta.annotation.Nullable final DomainObject value) {
        this.object = value;
    }
    /**
     * Sets the proxy_url property value. The proxy_url property
     * @param value Value to set for the proxy_url property.
     */
    public void setProxyUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyUrl = value;
    }
}
