package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CNameTarget implements Parsable {
    /**
     * The host property
     */
    private String host;
    /**
     * Denotes whether this CNAME target is required to be set in order for the domain to be considered deployed.
     */
    private Boolean required;
    /**
     * The value property
     */
    private String value;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CNameTarget
     */
    @jakarta.annotation.Nonnull
    public static CNameTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CNameTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. The host property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the required property value. Denotes whether this CNAME target is required to be set in order for the domain to be considered deployed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Gets the value property value. The value property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("host", this.getHost());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the required property value. Denotes whether this CNAME target is required to be set in order for the domain to be considered deployed.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.required = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
