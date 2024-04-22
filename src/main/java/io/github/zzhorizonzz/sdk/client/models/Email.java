package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Email implements Parsable {
    /**
     * The body property
     */
    private String body;
    /**
     * The body_plain property
     */
    private String bodyPlain;
    /**
     * The data property
     */
    private EmailData data;
    /**
     * The delivered_by_clerk property
     */
    private Boolean deliveredByClerk;
    /**
     * The email_address_id property
     */
    private String emailAddressId;
    /**
     * The from_email_name property
     */
    private String fromEmailName;
    /**
     * The id property
     */
    private String id;
    /**
     * The object property
     */
    private EmailObject object;
    /**
     * The slug property
     */
    private String slug;
    /**
     * The status property
     */
    private String status;
    /**
     * The subject property
     */
    private String subject;
    /**
     * The to_email_address property
     */
    private String toEmailAddress;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Email
     */
    @jakarta.annotation.Nonnull
    public static Email createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Email();
    }
    /**
     * Gets the body property value. The body property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * Gets the body_plain property value. The body_plain property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBodyPlain() {
        return this.bodyPlain;
    }
    /**
     * Gets the data property value. The data property
     * @return a EmailData
     */
    @jakarta.annotation.Nullable
    public EmailData getData() {
        return this.data;
    }
    /**
     * Gets the delivered_by_clerk property value. The delivered_by_clerk property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeliveredByClerk() {
        return this.deliveredByClerk;
    }
    /**
     * Gets the email_address_id property value. The email_address_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddressId() {
        return this.emailAddressId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("body_plain", (n) -> { this.setBodyPlain(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(EmailData::createFromDiscriminatorValue)); });
        deserializerMap.put("delivered_by_clerk", (n) -> { this.setDeliveredByClerk(n.getBooleanValue()); });
        deserializerMap.put("email_address_id", (n) -> { this.setEmailAddressId(n.getStringValue()); });
        deserializerMap.put("from_email_name", (n) -> { this.setFromEmailName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(EmailObject::forValue)); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("to_email_address", (n) -> { this.setToEmailAddress(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_email_name property value. The from_email_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmailName() {
        return this.fromEmailName;
    }
    /**
     * Gets the id property value. The id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the object property value. The object property
     * @return a EmailObject
     */
    @jakarta.annotation.Nullable
    public EmailObject getObject() {
        return this.object;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the status property value. The status property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the to_email_address property value. The to_email_address property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToEmailAddress() {
        return this.toEmailAddress;
    }
    /**
     * Gets the user_id property value. The user_id property
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
        writer.writeStringValue("body", this.getBody());
        writer.writeStringValue("body_plain", this.getBodyPlain());
        writer.writeObjectValue("data", this.getData());
        writer.writeBooleanValue("delivered_by_clerk", this.getDeliveredByClerk());
        writer.writeStringValue("email_address_id", this.getEmailAddressId());
        writer.writeStringValue("from_email_name", this.getFromEmailName());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("to_email_address", this.getToEmailAddress());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the body_plain property value. The body_plain property
     * @param value Value to set for the body_plain property.
     */
    public void setBodyPlain(@jakarta.annotation.Nullable final String value) {
        this.bodyPlain = value;
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final EmailData value) {
        this.data = value;
    }
    /**
     * Sets the delivered_by_clerk property value. The delivered_by_clerk property
     * @param value Value to set for the delivered_by_clerk property.
     */
    public void setDeliveredByClerk(@jakarta.annotation.Nullable final Boolean value) {
        this.deliveredByClerk = value;
    }
    /**
     * Sets the email_address_id property value. The email_address_id property
     * @param value Value to set for the email_address_id property.
     */
    public void setEmailAddressId(@jakarta.annotation.Nullable final String value) {
        this.emailAddressId = value;
    }
    /**
     * Sets the from_email_name property value. The from_email_name property
     * @param value Value to set for the from_email_name property.
     */
    public void setFromEmailName(@jakarta.annotation.Nullable final String value) {
        this.fromEmailName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final EmailObject value) {
        this.object = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the to_email_address property value. The to_email_address property
     * @param value Value to set for the to_email_address property.
     */
    public void setToEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.toEmailAddress = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
