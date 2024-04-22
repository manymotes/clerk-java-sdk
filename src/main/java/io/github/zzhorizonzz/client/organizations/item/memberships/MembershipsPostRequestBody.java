package io.github.zzhorizonzz.client.organizations.item.memberships;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The role that the new member will have in the organization.
     */
    private String role;
    /**
     * The ID of the user that will be added as a member in the organization.The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     */
    private String userId;
    /**
     * Instantiates a new MembershipsPostRequestBody and sets the default values.
     */
    public MembershipsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MembershipsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MembershipsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipsPostRequestBody();
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
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role that the new member will have in the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the user_id property value. The ID of the user that will be added as a member in the organization.The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("role", this.getRole());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the role property value. The role that the new member will have in the organization.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the user_id property value. The ID of the user that will be added as a member in the organization.The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
