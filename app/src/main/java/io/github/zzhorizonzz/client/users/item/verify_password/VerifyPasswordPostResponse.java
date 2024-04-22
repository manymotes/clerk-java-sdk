package io.github.zzhorizonzz.client.users.item.verify_password;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyPasswordPostResponse implements Parsable {
    /**
     * The verified property
     */
    private Boolean verified;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VerifyPasswordPostResponse
     */
    @jakarta.annotation.Nonnull
    public static VerifyPasswordPostResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifyPasswordPostResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("verified", (n) -> { this.setVerified(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the verified property value. The verified property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVerified() {
        return this.verified;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("verified", this.getVerified());
    }
    /**
     * Sets the verified property value. The verified property
     * @param value Value to set for the verified property.
     */
    public void setVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.verified = value;
    }
}
