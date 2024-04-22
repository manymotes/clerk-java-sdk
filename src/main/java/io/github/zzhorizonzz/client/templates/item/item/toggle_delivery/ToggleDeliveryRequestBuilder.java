package io.github.zzhorizonzz.client.templates.item.item.toggle_delivery;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.Template;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /templates/{template_type}/{slug}/toggle_delivery
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ToggleDeliveryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Toggle_deliveryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToggleDeliveryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/templates/{template_type}/{slug}/toggle_delivery", pathParameters);
    }
    /**
     * Instantiates a new Toggle_deliveryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToggleDeliveryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/templates/{template_type}/{slug}/toggle_delivery", rawUrl);
    }
    /**
     * Toggles the delivery by Clerk for a template of a given type and slug.If disabled, Clerk will not deliver the resulting email or SMS.The app developer will need to listen to the `email.created` or `sms.created` webhooks in order to handle delivery themselves.
     * @param body The request body
     * @return a Template
     */
    @jakarta.annotation.Nullable
    public Template post(@jakarta.annotation.Nonnull final ToggleDeliveryPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Toggles the delivery by Clerk for a template of a given type and slug.If disabled, Clerk will not deliver the resulting email or SMS.The app developer will need to listen to the `email.created` or `sms.created` webhooks in order to handle delivery themselves.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Template
     */
    @jakarta.annotation.Nullable
    public Template post(@jakarta.annotation.Nonnull final ToggleDeliveryPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Template::createFromDiscriminatorValue);
    }
    /**
     * Toggles the delivery by Clerk for a template of a given type and slug.If disabled, Clerk will not deliver the resulting email or SMS.The app developer will need to listen to the `email.created` or `sms.created` webhooks in order to handle delivery themselves.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ToggleDeliveryPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Toggles the delivery by Clerk for a template of a given type and slug.If disabled, Clerk will not deliver the resulting email or SMS.The app developer will need to listen to the `email.created` or `sms.created` webhooks in order to handle delivery themselves.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ToggleDeliveryPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ToggleDeliveryRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ToggleDeliveryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ToggleDeliveryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
