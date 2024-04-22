package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TotalCount implements Parsable {
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private TotalCountObject object;
    /**
     * The total_count property
     */
    private Long totalCount;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TotalCount
     */
    @jakarta.annotation.Nonnull
    public static TotalCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TotalCount();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(TotalCountObject::forValue)); });
        deserializerMap.put("total_count", (n) -> { this.setTotalCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a TotalCountObject
     */
    @jakarta.annotation.Nullable
    public TotalCountObject getObject() {
        return this.object;
    }
    /**
     * Gets the total_count property value. The total_count property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalCount() {
        return this.totalCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("object", this.getObject());
        writer.writeLongValue("total_count", this.getTotalCount());
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final TotalCountObject value) {
        this.object = value;
    }
    /**
     * Sets the total_count property value. The total_count property
     * @param value Value to set for the total_count property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Long value) {
        this.totalCount = value;
    }
}
