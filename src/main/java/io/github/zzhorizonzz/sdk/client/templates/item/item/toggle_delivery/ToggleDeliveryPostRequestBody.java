package io.github.zzhorizonzz.sdk.client.templates.item.item.toggle_delivery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ToggleDeliveryPostRequestBody implements Parsable {
    /**
     * Whether Clerk should deliver emails or SMS messages based on the current template
     */
    private Boolean deliveredByClerk;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ToggleDeliveryPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ToggleDeliveryPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ToggleDeliveryPostRequestBody();
    }
    /**
     * Gets the delivered_by_clerk property value. Whether Clerk should deliver emails or SMS messages based on the current template
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeliveredByClerk() {
        return this.deliveredByClerk;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("delivered_by_clerk", (n) -> { this.setDeliveredByClerk(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("delivered_by_clerk", this.getDeliveredByClerk());
    }
    /**
     * Sets the delivered_by_clerk property value. Whether Clerk should deliver emails or SMS messages based on the current template
     * @param value Value to set for the delivered_by_clerk property.
     */
    public void setDeliveredByClerk(@jakarta.annotation.Nullable final Boolean value) {
        this.deliveredByClerk = value;
    }
}
