package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClerkErrors extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The errors property
     */
    private java.util.List<ClerkError> errors;
    /**
     * The meta property
     */
    private ClerkErrorsMeta meta;
    /**
     * Instantiates a new ClerkErrors and sets the default values.
     */
    public ClerkErrors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClerkErrors
     */
    @jakarta.annotation.Nonnull
    public static ClerkErrors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClerkErrors();
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
     * Gets the errors property value. The errors property
     * @return a java.util.List<ClerkError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClerkError> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ClerkError::createFromDiscriminatorValue)); });
        deserializerMap.put("meta", (n) -> { this.setMeta(n.getObjectValue(ClerkErrorsMeta::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * The primary error message.
     * @return a String
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Gets the meta property value. The meta property
     * @return a ClerkErrorsMeta
     */
    @jakarta.annotation.Nullable
    public ClerkErrorsMeta getMeta() {
        return this.meta;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeObjectValue("meta", this.getMeta());
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
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ClerkError> value) {
        this.errors = value;
    }
    /**
     * Sets the meta property value. The meta property
     * @param value Value to set for the meta property.
     */
    public void setMeta(@jakarta.annotation.Nullable final ClerkErrorsMeta value) {
        this.meta = value;
    }
}
