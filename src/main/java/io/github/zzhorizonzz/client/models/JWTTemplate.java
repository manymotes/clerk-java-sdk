package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JWTTemplate implements Parsable {
    /**
     * The allowed_clock_skew property
     */
    private Integer allowedClockSkew;
    /**
     * The claims property
     */
    private JWTTemplateClaims claims;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The custom_signing_key property
     */
    private Boolean customSigningKey;
    /**
     * The id property
     */
    private String id;
    /**
     * The lifetime property
     */
    private Integer lifetime;
    /**
     * The name property
     */
    private String name;
    /**
     * The object property
     */
    private JWTTemplateObject object;
    /**
     * The signing_algorithm property
     */
    private String signingAlgorithm;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JWTTemplate
     */
    @jakarta.annotation.Nonnull
    public static JWTTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JWTTemplate();
    }
    /**
     * Gets the allowed_clock_skew property value. The allowed_clock_skew property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAllowedClockSkew() {
        return this.allowedClockSkew;
    }
    /**
     * Gets the claims property value. The claims property
     * @return a JWTTemplateClaims
     */
    @jakarta.annotation.Nullable
    public JWTTemplateClaims getClaims() {
        return this.claims;
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
     * Gets the custom_signing_key property value. The custom_signing_key property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCustomSigningKey() {
        return this.customSigningKey;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("allowed_clock_skew", (n) -> { this.setAllowedClockSkew(n.getIntegerValue()); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getObjectValue(JWTTemplateClaims::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("custom_signing_key", (n) -> { this.setCustomSigningKey(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lifetime", (n) -> { this.setLifetime(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(JWTTemplateObject::forValue)); });
        deserializerMap.put("signing_algorithm", (n) -> { this.setSigningAlgorithm(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
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
     * Gets the lifetime property value. The lifetime property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLifetime() {
        return this.lifetime;
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
     * @return a JWTTemplateObject
     */
    @jakarta.annotation.Nullable
    public JWTTemplateObject getObject() {
        return this.object;
    }
    /**
     * Gets the signing_algorithm property value. The signing_algorithm property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("allowed_clock_skew", this.getAllowedClockSkew());
        writer.writeObjectValue("claims", this.getClaims());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("custom_signing_key", this.getCustomSigningKey());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("lifetime", this.getLifetime());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("signing_algorithm", this.getSigningAlgorithm());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the allowed_clock_skew property value. The allowed_clock_skew property
     * @param value Value to set for the allowed_clock_skew property.
     */
    public void setAllowedClockSkew(@jakarta.annotation.Nullable final Integer value) {
        this.allowedClockSkew = value;
    }
    /**
     * Sets the claims property value. The claims property
     * @param value Value to set for the claims property.
     */
    public void setClaims(@jakarta.annotation.Nullable final JWTTemplateClaims value) {
        this.claims = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the custom_signing_key property value. The custom_signing_key property
     * @param value Value to set for the custom_signing_key property.
     */
    public void setCustomSigningKey(@jakarta.annotation.Nullable final Boolean value) {
        this.customSigningKey = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lifetime property value. The lifetime property
     * @param value Value to set for the lifetime property.
     */
    public void setLifetime(@jakarta.annotation.Nullable final Integer value) {
        this.lifetime = value;
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
    public void setObject(@jakarta.annotation.Nullable final JWTTemplateObject value) {
        this.object = value;
    }
    /**
     * Sets the signing_algorithm property value. The signing_algorithm property
     * @param value Value to set for the signing_algorithm property.
     */
    public void setSigningAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.signingAlgorithm = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
