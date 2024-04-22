package io.github.zzhorizonzz.sdk.client.blocklist_identifiers;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlocklistIdentifiersPostRequestBody implements Parsable {
    /**
     * The identifier to be added in the block-list.This can be an email address, a phone number or a web3 wallet.
     */
    private String identifier;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlocklistIdentifiersPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BlocklistIdentifiersPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlocklistIdentifiersPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier to be added in the block-list.This can be an email address, a phone number or a web3 wallet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the identifier property value. The identifier to be added in the block-list.This can be an email address, a phone number or a web3 wallet.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identifier = value;
    }
}
