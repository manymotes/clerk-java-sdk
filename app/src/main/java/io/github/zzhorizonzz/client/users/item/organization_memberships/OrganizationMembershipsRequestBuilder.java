package io.github.zzhorizonzz.client.users.item.organization_memberships;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.OrganizationMemberships;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user_id}/organization_memberships
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMembershipsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Organization_membershipsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationMembershipsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/organization_memberships{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new Organization_membershipsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationMembershipsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/organization_memberships{?limit*,offset*}", rawUrl);
    }
    /**
     * Retrieve a paginated list of the user's organization memberships
     * @return a OrganizationMemberships
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberships get() {
        return get(null);
    }
    /**
     * Retrieve a paginated list of the user's organization memberships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationMemberships
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberships get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationMemberships::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a paginated list of the user's organization memberships
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a paginated list of the user's organization memberships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a OrganizationMembershipsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OrganizationMembershipsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrganizationMembershipsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a paginated list of the user's organization memberships
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Applies a limit to the number of results returned.Can be used for paginating the results together with `offset`.Must be an integer greater than zero and less than 500.By default, if not supplied, a limit of 10 is used.
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Skip the first `offset` results when paginating.Needs to be an integer greater or equal to zero.To be used in conjunction with `limit`.
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
