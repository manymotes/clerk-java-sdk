package io.github.zzhorizonzz.client.oauth_applications;

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
import io.github.zzhorizonzz.client.models.OAuthApplications;
import io.github.zzhorizonzz.client.models.OAuthApplicationWithSecret;
import io.github.zzhorizonzz.client.oauth_applications.item.WithOauthApplicationItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /oauth_applications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OauthApplicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.oauth_applications.item collection
     * @param oauth_application_id The ID of the OAuth application
     * @return a WithOauthApplicationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOauthApplicationItemRequestBuilder byOauth_application_id(@jakarta.annotation.Nonnull final String oauth_application_id) {
        Objects.requireNonNull(oauth_application_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oauth_application_id", oauth_application_id);
        return new WithOauthApplicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Oauth_applicationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OauthApplicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new Oauth_applicationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OauthApplicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications{?limit*,offset*}", rawUrl);
    }
    /**
     * This request returns the list of OAuth applications for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The OAuth applications are ordered by descending creation date.Most recent OAuth applications will be returned first.
     * @return a OAuthApplications
     */
    @jakarta.annotation.Nullable
    public OAuthApplications get() {
        return get(null);
    }
    /**
     * This request returns the list of OAuth applications for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The OAuth applications are ordered by descending creation date.Most recent OAuth applications will be returned first.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuthApplications
     */
    @jakarta.annotation.Nullable
    public OAuthApplications get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuthApplications::createFromDiscriminatorValue);
    }
    /**
     * Creates a new OAuth application with the given name and callback URL for an instance.The callback URL must be a valid url.All URL schemes are allowed such as `http://`, `https://`, `myapp://`, etc...
     * @param body The request body
     * @return a OAuthApplicationWithSecret
     */
    @jakarta.annotation.Nullable
    public OAuthApplicationWithSecret post(@jakarta.annotation.Nonnull final OauthApplicationsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Creates a new OAuth application with the given name and callback URL for an instance.The callback URL must be a valid url.All URL schemes are allowed such as `http://`, `https://`, `myapp://`, etc...
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuthApplicationWithSecret
     */
    @jakarta.annotation.Nullable
    public OAuthApplicationWithSecret post(@jakarta.annotation.Nonnull final OauthApplicationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuthApplicationWithSecret::createFromDiscriminatorValue);
    }
    /**
     * This request returns the list of OAuth applications for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The OAuth applications are ordered by descending creation date.Most recent OAuth applications will be returned first.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This request returns the list of OAuth applications for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The OAuth applications are ordered by descending creation date.Most recent OAuth applications will be returned first.
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
     * Creates a new OAuth application with the given name and callback URL for an instance.The callback URL must be a valid url.All URL schemes are allowed such as `http://`, `https://`, `myapp://`, etc...
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OauthApplicationsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new OAuth application with the given name and callback URL for an instance.The callback URL must be a valid url.All URL schemes are allowed such as `http://`, `https://`, `myapp://`, etc...
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OauthApplicationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a OauthApplicationsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OauthApplicationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OauthApplicationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This request returns the list of OAuth applications for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The OAuth applications are ordered by descending creation date.Most recent OAuth applications will be returned first.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
