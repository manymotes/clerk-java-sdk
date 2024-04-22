package io.github.zzhorizonzz.client.organizations.item.memberships.item.metadata;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.OrganizationMembership;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}/memberships/{user_id}/metadata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetadataRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MetadataRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MetadataRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/memberships/{user_id}/metadata", pathParameters);
    }
    /**
     * Instantiates a new MetadataRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MetadataRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/memberships/{user_id}/metadata", rawUrl);
    }
    /**
     * Update an organization membership's metadata attributes by merging existing values with the provided parameters.Metadata values will be updated via a deep merge. Deep means that any nested JSON objects will be merged as well.You can remove metadata keys at any level by setting their value to `null`.
     * @param body The request body
     * @return a OrganizationMembership
     */
    @jakarta.annotation.Nullable
    public OrganizationMembership patch(@jakarta.annotation.Nonnull final MetadataPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update an organization membership's metadata attributes by merging existing values with the provided parameters.Metadata values will be updated via a deep merge. Deep means that any nested JSON objects will be merged as well.You can remove metadata keys at any level by setting their value to `null`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationMembership
     */
    @jakarta.annotation.Nullable
    public OrganizationMembership patch(@jakarta.annotation.Nonnull final MetadataPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationMembership::createFromDiscriminatorValue);
    }
    /**
     * Update an organization membership's metadata attributes by merging existing values with the provided parameters.Metadata values will be updated via a deep merge. Deep means that any nested JSON objects will be merged as well.You can remove metadata keys at any level by setting their value to `null`.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MetadataPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update an organization membership's metadata attributes by merging existing values with the provided parameters.Metadata values will be updated via a deep merge. Deep means that any nested JSON objects will be merged as well.You can remove metadata keys at any level by setting their value to `null`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MetadataPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a MetadataRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MetadataRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MetadataRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
