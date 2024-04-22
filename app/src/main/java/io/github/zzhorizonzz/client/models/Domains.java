package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Domains implements Parsable {
    /**
     * The data property
     */
    private java.util.List<Domain> data;
    /**
     * Total number of domains
     */
    private Long totalCount;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Domains
     */
    @jakarta.annotation.Nonnull
    public static Domains createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Domains();
    }
    /**
     * Gets the data property value. The data property
     * @return a java.util.List<Domain>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Domain> getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("data", (n) -> { this.setData(n.getCollectionOfObjectValues(Domain::createFromDiscriminatorValue)); });
        deserializerMap.put("total_count", (n) -> { this.setTotalCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the total_count property value. Total number of domains
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
        writer.writeCollectionOfObjectValues("data", this.getData());
        writer.writeLongValue("total_count", this.getTotalCount());
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final java.util.List<Domain> value) {
        this.data = value;
    }
    /**
     * Sets the total_count property value. Total number of domains
     * @param value Value to set for the total_count property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Long value) {
        this.totalCount = value;
    }
}
