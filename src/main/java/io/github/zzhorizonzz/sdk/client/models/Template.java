package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Template implements Parsable {
    /**
     * list of variables that are available for use in the template body
     */
    private java.util.List<String> availableVariables;
    /**
     * the template body before variable interpolation
     */
    private String body;
    /**
     * whether this template can be deleted
     */
    private Boolean canDelete;
    /**
     * whether this template can be reverted to the corresponding system default
     */
    private Boolean canRevert;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * The delivered_by_clerk property
     */
    private Boolean deliveredByClerk;
    /**
     * The from_email_name property
     */
    private String fromEmailName;
    /**
     * The id property
     */
    private String id;
    /**
     * the id of the instance the template belongs to
     */
    private String instanceId;
    /**
     * the editor markup used to generate the body of the template
     */
    private String markup;
    /**
     * user-friendly name of the template
     */
    private String name;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private TemplateObject object;
    /**
     * position with the listing of templates
     */
    private Integer position;
    /**
     * list of variables that must be contained in the template body
     */
    private java.util.List<String> requiredVariables;
    /**
     * whether this is a system (default) or user overridden) template
     */
    private String resourceType;
    /**
     * machine-friendly name of the template
     */
    private String slug;
    /**
     * email subject
     */
    private String subject;
    /**
     * whether this is an email or SMS template
     */
    private String templateType;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Template
     */
    @jakarta.annotation.Nonnull
    public static Template createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Template();
    }
    /**
     * Gets the available_variables property value. list of variables that are available for use in the template body
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableVariables() {
        return this.availableVariables;
    }
    /**
     * Gets the body property value. the template body before variable interpolation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * Gets the can_delete property value. whether this template can be deleted
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanDelete() {
        return this.canDelete;
    }
    /**
     * Gets the can_revert property value. whether this template can be reverted to the corresponding system default
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanRevert() {
        return this.canRevert;
    }
    /**
     * Gets the created_at property value. Unix timestamp of creation.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCreatedAt() {
        return this.createdAt;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("available_variables", (n) -> { this.setAvailableVariables(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("can_delete", (n) -> { this.setCanDelete(n.getBooleanValue()); });
        deserializerMap.put("can_revert", (n) -> { this.setCanRevert(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("delivered_by_clerk", (n) -> { this.setDeliveredByClerk(n.getBooleanValue()); });
        deserializerMap.put("from_email_name", (n) -> { this.setFromEmailName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("instance_id", (n) -> { this.setInstanceId(n.getStringValue()); });
        deserializerMap.put("markup", (n) -> { this.setMarkup(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(TemplateObject::forValue)); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getIntegerValue()); });
        deserializerMap.put("required_variables", (n) -> { this.setRequiredVariables(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("template_type", (n) -> { this.setTemplateType(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
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
     * Gets the instance_id property value. the id of the instance the template belongs to
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Gets the markup property value. the editor markup used to generate the body of the template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMarkup() {
        return this.markup;
    }
    /**
     * Gets the name property value. user-friendly name of the template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a TemplateObject
     */
    @jakarta.annotation.Nullable
    public TemplateObject getObject() {
        return this.object;
    }
    /**
     * Gets the position property value. position with the listing of templates
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPosition() {
        return this.position;
    }
    /**
     * Gets the required_variables property value. list of variables that must be contained in the template body
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRequiredVariables() {
        return this.requiredVariables;
    }
    /**
     * Gets the resource_type property value. whether this is a system (default) or user overridden) template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the slug property value. machine-friendly name of the template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the subject property value. email subject
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the template_type property value. whether this is an email or SMS template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateType() {
        return this.templateType;
    }
    /**
     * Gets the updated_at property value. Unix timestamp of last update.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("available_variables", this.getAvailableVariables());
        writer.writeStringValue("body", this.getBody());
        writer.writeBooleanValue("can_delete", this.getCanDelete());
        writer.writeBooleanValue("can_revert", this.getCanRevert());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("delivered_by_clerk", this.getDeliveredByClerk());
        writer.writeStringValue("from_email_name", this.getFromEmailName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("instance_id", this.getInstanceId());
        writer.writeStringValue("markup", this.getMarkup());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeIntegerValue("position", this.getPosition());
        writer.writeCollectionOfPrimitiveValues("required_variables", this.getRequiredVariables());
        writer.writeStringValue("resource_type", this.getResourceType());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("template_type", this.getTemplateType());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the available_variables property value. list of variables that are available for use in the template body
     * @param value Value to set for the available_variables property.
     */
    public void setAvailableVariables(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableVariables = value;
    }
    /**
     * Sets the body property value. the template body before variable interpolation
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the can_delete property value. whether this template can be deleted
     * @param value Value to set for the can_delete property.
     */
    public void setCanDelete(@jakarta.annotation.Nullable final Boolean value) {
        this.canDelete = value;
    }
    /**
     * Sets the can_revert property value. whether this template can be reverted to the corresponding system default
     * @param value Value to set for the can_revert property.
     */
    public void setCanRevert(@jakarta.annotation.Nullable final Boolean value) {
        this.canRevert = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the delivered_by_clerk property value. The delivered_by_clerk property
     * @param value Value to set for the delivered_by_clerk property.
     */
    public void setDeliveredByClerk(@jakarta.annotation.Nullable final Boolean value) {
        this.deliveredByClerk = value;
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
     * Sets the instance_id property value. the id of the instance the template belongs to
     * @param value Value to set for the instance_id property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final String value) {
        this.instanceId = value;
    }
    /**
     * Sets the markup property value. the editor markup used to generate the body of the template
     * @param value Value to set for the markup property.
     */
    public void setMarkup(@jakarta.annotation.Nullable final String value) {
        this.markup = value;
    }
    /**
     * Sets the name property value. user-friendly name of the template
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final TemplateObject value) {
        this.object = value;
    }
    /**
     * Sets the position property value. position with the listing of templates
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final Integer value) {
        this.position = value;
    }
    /**
     * Sets the required_variables property value. list of variables that must be contained in the template body
     * @param value Value to set for the required_variables property.
     */
    public void setRequiredVariables(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.requiredVariables = value;
    }
    /**
     * Sets the resource_type property value. whether this is a system (default) or user overridden) template
     * @param value Value to set for the resource_type property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
    /**
     * Sets the slug property value. machine-friendly name of the template
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the subject property value. email subject
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the template_type property value. whether this is an email or SMS template
     * @param value Value to set for the template_type property.
     */
    public void setTemplateType(@jakarta.annotation.Nullable final String value) {
        this.templateType = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
