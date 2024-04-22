package io.github.zzhorizonzz.client.jwt_templates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JwtTemplatesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * JWT token allowed clock skew
     */
    private Integer allowedClockSkew;
    /**
     * JWT template claims in JSON format
     */
    private JwtTemplatesPostRequestBodyClaims claims;
    /**
     * Whether a custom signing key/algorithm is also provided for this template
     */
    private Boolean customSigningKey;
    /**
     * JWT token lifetime
     */
    private Integer lifetime;
    /**
     * JWT template name
     */
    private String name;
    /**
     * The custom signing algorithm to use when minting JWTs
     */
    private String signingAlgorithm;
    /**
     * The custom signing private key to use when minting JWTs
     */
    private String signingKey;
    /**
     * Instantiates a new JwtTemplatesPostRequestBody and sets the default values.
     */
    public JwtTemplatesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JwtTemplatesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static JwtTemplatesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JwtTemplatesPostRequestBody();
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
     * Gets the allowed_clock_skew property value. JWT token allowed clock skew
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAllowedClockSkew() {
        return this.allowedClockSkew;
    }
    /**
     * Gets the claims property value. JWT template claims in JSON format
     * @return a JwtTemplatesPostRequestBodyClaims
     */
    @jakarta.annotation.Nullable
    public JwtTemplatesPostRequestBodyClaims getClaims() {
        return this.claims;
    }
    /**
     * Gets the custom_signing_key property value. Whether a custom signing key/algorithm is also provided for this template
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("allowed_clock_skew", (n) -> { this.setAllowedClockSkew(n.getIntegerValue()); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getObjectValue(JwtTemplatesPostRequestBodyClaims::createFromDiscriminatorValue)); });
        deserializerMap.put("custom_signing_key", (n) -> { this.setCustomSigningKey(n.getBooleanValue()); });
        deserializerMap.put("lifetime", (n) -> { this.setLifetime(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("signing_algorithm", (n) -> { this.setSigningAlgorithm(n.getStringValue()); });
        deserializerMap.put("signing_key", (n) -> { this.setSigningKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lifetime property value. JWT token lifetime
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLifetime() {
        return this.lifetime;
    }
    /**
     * Gets the name property value. JWT template name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the signing_algorithm property value. The custom signing algorithm to use when minting JWTs
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }
    /**
     * Gets the signing_key property value. The custom signing private key to use when minting JWTs
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSigningKey() {
        return this.signingKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("allowed_clock_skew", this.getAllowedClockSkew());
        writer.writeObjectValue("claims", this.getClaims());
        writer.writeBooleanValue("custom_signing_key", this.getCustomSigningKey());
        writer.writeIntegerValue("lifetime", this.getLifetime());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("signing_algorithm", this.getSigningAlgorithm());
        writer.writeStringValue("signing_key", this.getSigningKey());
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
     * Sets the allowed_clock_skew property value. JWT token allowed clock skew
     * @param value Value to set for the allowed_clock_skew property.
     */
    public void setAllowedClockSkew(@jakarta.annotation.Nullable final Integer value) {
        this.allowedClockSkew = value;
    }
    /**
     * Sets the claims property value. JWT template claims in JSON format
     * @param value Value to set for the claims property.
     */
    public void setClaims(@jakarta.annotation.Nullable final JwtTemplatesPostRequestBodyClaims value) {
        this.claims = value;
    }
    /**
     * Sets the custom_signing_key property value. Whether a custom signing key/algorithm is also provided for this template
     * @param value Value to set for the custom_signing_key property.
     */
    public void setCustomSigningKey(@jakarta.annotation.Nullable final Boolean value) {
        this.customSigningKey = value;
    }
    /**
     * Sets the lifetime property value. JWT token lifetime
     * @param value Value to set for the lifetime property.
     */
    public void setLifetime(@jakarta.annotation.Nullable final Integer value) {
        this.lifetime = value;
    }
    /**
     * Sets the name property value. JWT template name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the signing_algorithm property value. The custom signing algorithm to use when minting JWTs
     * @param value Value to set for the signing_algorithm property.
     */
    public void setSigningAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.signingAlgorithm = value;
    }
    /**
     * Sets the signing_key property value. The custom signing private key to use when minting JWTs
     * @param value Value to set for the signing_key property.
     */
    public void setSigningKey(@jakarta.annotation.Nullable final String value) {
        this.signingKey = value;
    }
}
