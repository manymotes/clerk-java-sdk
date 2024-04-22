package io.github.zzhorizonzz.client.instance.restrictions;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestrictionsPatchRequestBody implements Parsable {
    /**
     * The allowlist property
     */
    private Boolean allowlist;
    /**
     * The block_disposable_email_domains property
     */
    private Boolean blockDisposableEmailDomains;
    /**
     * The block_email_subaddresses property
     */
    private Boolean blockEmailSubaddresses;
    /**
     * The blocklist property
     */
    private Boolean blocklist;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RestrictionsPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RestrictionsPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestrictionsPatchRequestBody();
    }
    /**
     * Gets the allowlist property value. The allowlist property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowlist() {
        return this.allowlist;
    }
    /**
     * Gets the block_disposable_email_domains property value. The block_disposable_email_domains property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDisposableEmailDomains() {
        return this.blockDisposableEmailDomains;
    }
    /**
     * Gets the block_email_subaddresses property value. The block_email_subaddresses property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockEmailSubaddresses() {
        return this.blockEmailSubaddresses;
    }
    /**
     * Gets the blocklist property value. The blocklist property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlocklist() {
        return this.blocklist;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowlist", (n) -> { this.setAllowlist(n.getBooleanValue()); });
        deserializerMap.put("block_disposable_email_domains", (n) -> { this.setBlockDisposableEmailDomains(n.getBooleanValue()); });
        deserializerMap.put("block_email_subaddresses", (n) -> { this.setBlockEmailSubaddresses(n.getBooleanValue()); });
        deserializerMap.put("blocklist", (n) -> { this.setBlocklist(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowlist", this.getAllowlist());
        writer.writeBooleanValue("block_disposable_email_domains", this.getBlockDisposableEmailDomains());
        writer.writeBooleanValue("block_email_subaddresses", this.getBlockEmailSubaddresses());
        writer.writeBooleanValue("blocklist", this.getBlocklist());
    }
    /**
     * Sets the allowlist property value. The allowlist property
     * @param value Value to set for the allowlist property.
     */
    public void setAllowlist(@jakarta.annotation.Nullable final Boolean value) {
        this.allowlist = value;
    }
    /**
     * Sets the block_disposable_email_domains property value. The block_disposable_email_domains property
     * @param value Value to set for the block_disposable_email_domains property.
     */
    public void setBlockDisposableEmailDomains(@jakarta.annotation.Nullable final Boolean value) {
        this.blockDisposableEmailDomains = value;
    }
    /**
     * Sets the block_email_subaddresses property value. The block_email_subaddresses property
     * @param value Value to set for the block_email_subaddresses property.
     */
    public void setBlockEmailSubaddresses(@jakarta.annotation.Nullable final Boolean value) {
        this.blockEmailSubaddresses = value;
    }
    /**
     * Sets the blocklist property value. The blocklist property
     * @param value Value to set for the blocklist property.
     */
    public void setBlocklist(@jakarta.annotation.Nullable final Boolean value) {
        this.blocklist = value;
    }
}
