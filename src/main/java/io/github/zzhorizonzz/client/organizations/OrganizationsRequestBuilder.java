package io.github.zzhorizonzz.client.organizations;

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
import io.github.zzhorizonzz.client.models.Organization;
import io.github.zzhorizonzz.client.models.Organizations;
import io.github.zzhorizonzz.client.organizations.item.WithOrganizationItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.organizations.item collection
     * @param organization_id The ID or slug of the organization
     * @return a WithOrganizationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOrganizationItemRequestBuilder byOrganization_id(@jakarta.annotation.Nonnull final String organization_id) {
        Objects.requireNonNull(organization_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organization_id", organization_id);
        return new WithOrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new OrganizationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations{?include_members_count*,limit*,offset*,order_by*,query*}", pathParameters);
    }
    /**
     * Instantiates a new OrganizationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations{?include_members_count*,limit*,offset*,order_by*,query*}", rawUrl);
    }
    /**
     * This request returns the list of organizations for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The organizations are ordered by descending creation date.Most recent organizations will be returned first.
     * @return a Organizations
     */
    @jakarta.annotation.Nullable
    public Organizations get() {
        return get(null);
    }
    /**
     * This request returns the list of organizations for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The organizations are ordered by descending creation date.Most recent organizations will be returned first.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organizations
     */
    @jakarta.annotation.Nullable
    public Organizations get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organizations::createFromDiscriminatorValue);
    }
    /**
     * Creates a new organization with the given name for an instance.In order to successfully create an organization you need to provide the ID of the User who will become the organization administrator.You can specify an optional slug for the new organization.If provided, the organization slug can contain only lowercase alphanumeric characters (letters and digits) and the dash "-".Organization slugs must be unique for the instance.You can provide additional metadata for the organization and set any custom attribute you want.Organizations support private and public metadata.Private metadata can only be accessed from the Backend API.Public metadata can be accessed from the Backend API, and are read-only from the Frontend API.
     * @param body The request body
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization post(@jakarta.annotation.Nonnull final OrganizationsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Creates a new organization with the given name for an instance.In order to successfully create an organization you need to provide the ID of the User who will become the organization administrator.You can specify an optional slug for the new organization.If provided, the organization slug can contain only lowercase alphanumeric characters (letters and digits) and the dash "-".Organization slugs must be unique for the instance.You can provide additional metadata for the organization and set any custom attribute you want.Organizations support private and public metadata.Private metadata can only be accessed from the Backend API.Public metadata can be accessed from the Backend API, and are read-only from the Frontend API.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization post(@jakarta.annotation.Nonnull final OrganizationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * This request returns the list of organizations for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The organizations are ordered by descending creation date.Most recent organizations will be returned first.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This request returns the list of organizations for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The organizations are ordered by descending creation date.Most recent organizations will be returned first.
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
     * Creates a new organization with the given name for an instance.In order to successfully create an organization you need to provide the ID of the User who will become the organization administrator.You can specify an optional slug for the new organization.If provided, the organization slug can contain only lowercase alphanumeric characters (letters and digits) and the dash "-".Organization slugs must be unique for the instance.You can provide additional metadata for the organization and set any custom attribute you want.Organizations support private and public metadata.Private metadata can only be accessed from the Backend API.Public metadata can be accessed from the Backend API, and are read-only from the Frontend API.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new organization with the given name for an instance.In order to successfully create an organization you need to provide the ID of the User who will become the organization administrator.You can specify an optional slug for the new organization.If provided, the organization slug can contain only lowercase alphanumeric characters (letters and digits) and the dash "-".Organization slugs must be unique for the instance.You can provide additional metadata for the organization and set any custom attribute you want.Organizations support private and public metadata.Private metadata can only be accessed from the Backend API.Public metadata can be accessed from the Backend API, and are read-only from the Frontend API.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a OrganizationsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OrganizationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrganizationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This request returns the list of organizations for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The organizations are ordered by descending creation date.Most recent organizations will be returned first.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Flag to denote whether the member counts of each organization should be included in the response or not.
         */
        @jakarta.annotation.Nullable
        public Boolean includeMembersCount;
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
         * Allows to return organizations in a particular order.At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.If you don't use `+` or `-`, then `+` is implied.Defaults to `-created_at`.
         */
        @jakarta.annotation.Nullable
        public String orderBy;
        /**
         * Returns organizations with ID, name, or slug that match the given query.Uses exact match for organization ID and partial match for name and slug.
         */
        @jakarta.annotation.Nullable
        public String query;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("include_members_count", includeMembersCount);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_by", orderBy);
            allQueryParams.put("query", query);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
