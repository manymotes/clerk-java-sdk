package io.github.zzhorizonzz.sdk.client.saml_connections.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSamlConnectionPatchRequestBody implements Parsable {
    /**
     * Activate or de-activate the SAML Connection
     */
    private Boolean active;
    /**
     * The domain to use for the new SAML Connection
     */
    private String domain;
    /**
     * The x509 certificated as provided by the IdP
     */
    private String idpCertificate;
    /**
     * The entity id as provided by the IdP
     */
    private String idpEntityId;
    /**
     * The SSO url as provided by the IdP
     */
    private String idpSsoUrl;
    /**
     * The name of the new SAML Connection
     */
    private String name;
    /**
     * Controls whether to update the user's attributes in each sign-in
     */
    private Boolean syncUserAttributes;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithSamlConnectionPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithSamlConnectionPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithSamlConnectionPatchRequestBody();
    }
    /**
     * Gets the active property value. Activate or de-activate the SAML Connection
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActive() {
        return this.active;
    }
    /**
     * Gets the domain property value. The domain to use for the new SAML Connection
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("idp_certificate", (n) -> { this.setIdpCertificate(n.getStringValue()); });
        deserializerMap.put("idp_entity_id", (n) -> { this.setIdpEntityId(n.getStringValue()); });
        deserializerMap.put("idp_sso_url", (n) -> { this.setIdpSsoUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("sync_user_attributes", (n) -> { this.setSyncUserAttributes(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idp_certificate property value. The x509 certificated as provided by the IdP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpCertificate() {
        return this.idpCertificate;
    }
    /**
     * Gets the idp_entity_id property value. The entity id as provided by the IdP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpEntityId() {
        return this.idpEntityId;
    }
    /**
     * Gets the idp_sso_url property value. The SSO url as provided by the IdP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdpSsoUrl() {
        return this.idpSsoUrl;
    }
    /**
     * Gets the name property value. The name of the new SAML Connection
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the sync_user_attributes property value. Controls whether to update the user's attributes in each sign-in
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncUserAttributes() {
        return this.syncUserAttributes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("active", this.getActive());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("idp_certificate", this.getIdpCertificate());
        writer.writeStringValue("idp_entity_id", this.getIdpEntityId());
        writer.writeStringValue("idp_sso_url", this.getIdpSsoUrl());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("sync_user_attributes", this.getSyncUserAttributes());
    }
    /**
     * Sets the active property value. Activate or de-activate the SAML Connection
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Boolean value) {
        this.active = value;
    }
    /**
     * Sets the domain property value. The domain to use for the new SAML Connection
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the idp_certificate property value. The x509 certificated as provided by the IdP
     * @param value Value to set for the idp_certificate property.
     */
    public void setIdpCertificate(@jakarta.annotation.Nullable final String value) {
        this.idpCertificate = value;
    }
    /**
     * Sets the idp_entity_id property value. The entity id as provided by the IdP
     * @param value Value to set for the idp_entity_id property.
     */
    public void setIdpEntityId(@jakarta.annotation.Nullable final String value) {
        this.idpEntityId = value;
    }
    /**
     * Sets the idp_sso_url property value. The SSO url as provided by the IdP
     * @param value Value to set for the idp_sso_url property.
     */
    public void setIdpSsoUrl(@jakarta.annotation.Nullable final String value) {
        this.idpSsoUrl = value;
    }
    /**
     * Sets the name property value. The name of the new SAML Connection
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the sync_user_attributes property value. Controls whether to update the user's attributes in each sign-in
     * @param value Value to set for the sync_user_attributes property.
     */
    public void setSyncUserAttributes(@jakarta.annotation.Nullable final Boolean value) {
        this.syncUserAttributes = value;
    }
}
