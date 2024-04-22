package io.github.zzhorizonzz.client.sessions.item.tokens.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTemplateNamePostResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The jwt property
     */
    private String jwt;
    /**
     * The object property
     */
    private WithTemplateNamePostResponseObject object;
    /**
     * Instantiates a new WithTemplateNamePostResponse and sets the default values.
     */
    public WithTemplateNamePostResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithTemplateNamePostResponse
     */
    @jakarta.annotation.Nonnull
    public static WithTemplateNamePostResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithTemplateNamePostResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("jwt", (n) -> { this.setJwt(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(WithTemplateNamePostResponseObject::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jwt property value. The jwt property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJwt() {
        return this.jwt;
    }
    /**
     * Gets the object property value. The object property
     * @return a WithTemplateNamePostResponseObject
     */
    @jakarta.annotation.Nullable
    public WithTemplateNamePostResponseObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("jwt", this.getJwt());
        writer.writeEnumValue("object", this.getObject());
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
     * Sets the jwt property value. The jwt property
     * @param value Value to set for the jwt property.
     */
    public void setJwt(@jakarta.annotation.Nullable final String value) {
        this.jwt = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final WithTemplateNamePostResponseObject value) {
        this.object = value;
    }
}
