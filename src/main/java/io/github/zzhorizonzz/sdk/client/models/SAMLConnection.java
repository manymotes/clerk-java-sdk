package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SAMLConnection implements AdditionalDataHolder, Parsable {
    /**
     * The acs_url property
     */
    private String acsUrl;
    /**
     * The active property
     */
    private Boolean active;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The domain property
     */
    private String domain;
    /**
     * The id property
     */
    private String id;
    /**
     * The idp_certificate property
     */
    private String idpCertificate;
    /**
     * The idp_entity_id property
     */
    private String idpEntityId;
    /**
     * The idp_sso_url property
     */
    private String idpSsoUrl;
    /**
     * The name property
     */
    private String name;
    /**
     * The object property
     */
    private SAMLConnectionObject object;
    /**
     * The provider property
     */
    private String provider;
    /**
     * The sp_entity_id property
     */
    private String spEntityId;
    /**
     * The sync_user_attributes property
     */
    private Boolean syncUserAttributes;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The user_count property
     */
    private Integer userCount;
    /**
     * Instantiates a new SAMLConnection and sets the default values.
     */
    public SAMLConnection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SAMLConnection
     */
    @jakarta.annotation.Nonnull
    public static SAMLConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SAMLConnection();
    }
    /**
     * Gets the acs_url property value. The acs_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAcsUrl() {
        return this.acsUrl;
    }
    /**
     * Gets the active property value. The active property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActive() {
        return this.active;
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
     * Gets the created_at property value. Unix timestamp of creation.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the domain property value. The domain property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("acs_url", (n) -> { this.setAcsUrl(n.getStringValue()); });
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("idp_certificate", (n) -> { this.setIdpCertificate(n.getStringValue()); });
        deserializerMap.put("idp_entity_id", (n) -> { this.setIdpEntityId(n.getStringValue()); });
        deserializerMap.put("idp_sso_url", (n) -> { this.setIdpSsoUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(SAMLConnectionObject::forValue)); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("sp_entity_id", (n) -> { this.setSpEntityId(n.getStringValue()); });
        deserializerMap.put("sync_user_attributes", (n) -> { this.setSyncUserAttributes(n.getBooleanValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("user_count", (n) -> { this.setUserCount(n.getIntegerValue()); });
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
     * Gets the idp_certificate property value. The idp_certificate property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpCertificate() {
        return this.idpCertificate;
    }
    /**
     * Gets the idp_entity_id property value. The idp_entity_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpEntityId() {
        return this.idpEntityId;
    }
    /**
     * Gets the idp_sso_url property value. The idp_sso_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpSsoUrl() {
        return this.idpSsoUrl;
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
     * @return a SAMLConnectionObject
     */
    @jakarta.annotation.Nullable
    public SAMLConnectionObject getObject() {
        return this.object;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the sp_entity_id property value. The sp_entity_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSpEntityId() {
        return this.spEntityId;
    }
    /**
     * Gets the sync_user_attributes property value. The sync_user_attributes property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncUserAttributes() {
        return this.syncUserAttributes;
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
     * Gets the user_count property value. The user_count property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("acs_url", this.getAcsUrl());
        writer.writeBooleanValue("active", this.getActive());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("idp_certificate", this.getIdpCertificate());
        writer.writeStringValue("idp_entity_id", this.getIdpEntityId());
        writer.writeStringValue("idp_sso_url", this.getIdpSsoUrl());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("sp_entity_id", this.getSpEntityId());
        writer.writeBooleanValue("sync_user_attributes", this.getSyncUserAttributes());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeIntegerValue("user_count", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acs_url property value. The acs_url property
     * @param value Value to set for the acs_url property.
     */
    public void setAcsUrl(@jakarta.annotation.Nullable final String value) {
        this.acsUrl = value;
    }
    /**
     * Sets the active property value. The active property
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Boolean value) {
        this.active = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the idp_certificate property value. The idp_certificate property
     * @param value Value to set for the idp_certificate property.
     */
    public void setIdpCertificate(@jakarta.annotation.Nullable final String value) {
        this.idpCertificate = value;
    }
    /**
     * Sets the idp_entity_id property value. The idp_entity_id property
     * @param value Value to set for the idp_entity_id property.
     */
    public void setIdpEntityId(@jakarta.annotation.Nullable final String value) {
        this.idpEntityId = value;
    }
    /**
     * Sets the idp_sso_url property value. The idp_sso_url property
     * @param value Value to set for the idp_sso_url property.
     */
    public void setIdpSsoUrl(@jakarta.annotation.Nullable final String value) {
        this.idpSsoUrl = value;
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
    public void setObject(@jakarta.annotation.Nullable final SAMLConnectionObject value) {
        this.object = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the sp_entity_id property value. The sp_entity_id property
     * @param value Value to set for the sp_entity_id property.
     */
    public void setSpEntityId(@jakarta.annotation.Nullable final String value) {
        this.spEntityId = value;
    }
    /**
     * Sets the sync_user_attributes property value. The sync_user_attributes property
     * @param value Value to set for the sync_user_attributes property.
     */
    public void setSyncUserAttributes(@jakarta.annotation.Nullable final Boolean value) {
        this.syncUserAttributes = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
    /**
     * Sets the user_count property value. The user_count property
     * @param value Value to set for the user_count property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}
