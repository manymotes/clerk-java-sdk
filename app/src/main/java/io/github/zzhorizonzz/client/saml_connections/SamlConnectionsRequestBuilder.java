package io.github.zzhorizonzz.sdk.client.saml_connections;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.SAMLConnection;
import io.github.zzhorizonzz.sdk.client.models.SAMLConnections;
import io.github.zzhorizonzz.sdk.client.saml_connections.item.WithSamlConnectionItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /saml_connections
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SamlConnectionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.saml_connections.item collection
     * @param saml_connection_id The ID of the SAML Connection
     * @return a WithSamlConnectionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSamlConnectionItemRequestBuilder bySaml_connection_id(@jakarta.annotation.Nonnull final String saml_connection_id) {
        Objects.requireNonNull(saml_connection_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("saml_connection_id", saml_connection_id);
        return new WithSamlConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Saml_connectionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SamlConnectionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/saml_connections{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new Saml_connectionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SamlConnectionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/saml_connections{?limit*,offset*}", rawUrl);
    }
    /**
     * Returns the list of SAML Connections for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The SAML Connections are ordered by descending creation date and the most recent will be returned first. <br/> Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @return a SAMLConnections
     */
    @jakarta.annotation.Nullable
    public SAMLConnections get() {
        return get(null);
    }
    /**
     * Returns the list of SAML Connections for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The SAML Connections are ordered by descending creation date and the most recent will be returned first. <br/> Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SAMLConnections
     */
    @jakarta.annotation.Nullable
    public SAMLConnections get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SAMLConnections::createFromDiscriminatorValue);
    }
    /**
     * Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @param body The request body
     * @return a SAMLConnection
     */
    @jakarta.annotation.Nullable
    public SAMLConnection post(@jakarta.annotation.Nonnull final SamlConnectionsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SAMLConnection
     */
    @jakarta.annotation.Nullable
    public SAMLConnection post(@jakarta.annotation.Nonnull final SamlConnectionsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SAMLConnection::createFromDiscriminatorValue);
    }
    /**
     * Returns the list of SAML Connections for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The SAML Connections are ordered by descending creation date and the most recent will be returned first. <br/> Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the list of SAML Connections for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The SAML Connections are ordered by descending creation date and the most recent will be returned first. <br/> Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
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
     * Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SamlConnectionsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SamlConnectionsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a SamlConnectionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SamlConnectionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SamlConnectionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns the list of SAML Connections for an instance.Results can be paginated using the optional `limit` and `offset` query parameters.The SAML Connections are ordered by descending creation date and the most recent will be returned first. <br/> Refer to <a href="https://clerk.com/docs/authentication/saml-at-clerk#saml-at-clerk-beta">Clerk SAML documentation</a> for more information.
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
