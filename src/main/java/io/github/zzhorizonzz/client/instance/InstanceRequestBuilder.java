package io.github.zzhorizonzz.client.instance;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.instance.change_domain.ChangeDomainRequestBuilder;
import io.github.zzhorizonzz.client.instance.organization_settings.OrganizationSettingsRequestBuilder;
import io.github.zzhorizonzz.client.instance.restrictions.RestrictionsRequestBuilder;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceRequestBuilder extends BaseRequestBuilder {
    /**
     * The change_domain property
     */
    @jakarta.annotation.Nonnull
    public ChangeDomainRequestBuilder changeDomain() {
        return new ChangeDomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organization_settings property
     */
    @jakarta.annotation.Nonnull
    public OrganizationSettingsRequestBuilder organizationSettings() {
        return new OrganizationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The restrictions property
     */
    @jakarta.annotation.Nonnull
    public RestrictionsRequestBuilder restrictions() {
        return new RestrictionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance", pathParameters);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance", rawUrl);
    }
    /**
     * Updates the settings of an instance
     * @param body The request body
     */
    public void patch(@jakarta.annotation.Nonnull final InstancePatchRequestBody body) {
        patch(body, null);
    }
    /**
     * Updates the settings of an instance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void patch(@jakarta.annotation.Nonnull final InstancePatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Updates the settings of an instance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InstancePatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Updates the settings of an instance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InstancePatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a InstanceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InstanceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
