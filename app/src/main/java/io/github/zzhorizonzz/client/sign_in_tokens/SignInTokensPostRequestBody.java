package io.github.zzhorizonzz.client.sign_in_tokens;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInTokensPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional parameter to specify the life duration of the sign in token in seconds.By default, the duration is 30 days.
     */
    private Integer expiresInSeconds;
    /**
     * The ID of the user that can use the newly created sign in token
     */
    private String userId;
    /**
     * Instantiates a new SignInTokensPostRequestBody and sets the default values.
     */
    public SignInTokensPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignInTokensPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SignInTokensPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInTokensPostRequestBody();
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
     * Gets the expires_in_seconds property value. Optional parameter to specify the life duration of the sign in token in seconds.By default, the duration is 30 days.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expires_in_seconds", (n) -> { this.setExpiresInSeconds(n.getIntegerValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the user_id property value. The ID of the user that can use the newly created sign in token
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
        writer.writeIntegerValue("expires_in_seconds", this.getExpiresInSeconds());
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
     * Sets the expires_in_seconds property value. Optional parameter to specify the life duration of the sign in token in seconds.By default, the duration is 30 days.
     * @param value Value to set for the expires_in_seconds property.
     */
    public void setExpiresInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.expiresInSeconds = value;
    }
    /**
     * Sets the user_id property value. The ID of the user that can use the newly created sign in token
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
