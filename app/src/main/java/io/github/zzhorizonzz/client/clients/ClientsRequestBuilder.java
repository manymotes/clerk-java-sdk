package io.github.zzhorizonzz.sdk.client.clients;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.clients.item.WithClientItemRequestBuilder;
import io.github.zzhorizonzz.sdk.client.clients.verify.VerifyRequestBuilder;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.Client;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /clients
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientsRequestBuilder extends BaseRequestBuilder {
    /**
     * The verify property
     * @deprecated
     *
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the io.github.zzhorizonzz.client.clients.item collection
     * @param client_id Client ID.
     * @return a WithClientItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithClientItemRequestBuilder byClient_id(@jakarta.annotation.Nonnull final String client_id) {
        Objects.requireNonNull(client_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("client_id", client_id);
        return new WithClientItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ClientsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClientsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/clients{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new ClientsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClientsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/clients{?limit*,offset*}", rawUrl);
    }
    /**
     * Returns a list of all clients. The clients are returned sorted by creation date,with the newest clients appearing first.Warning: the endpoint is being deprecated and will be removed in future versions.
     * @return a java.util.List<Client>
     * @deprecated
     *
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public java.util.List<Client> get() {
        return get(null);
    }
    /**
     * Returns a list of all clients. The clients are returned sorted by creation date,with the newest clients appearing first.Warning: the endpoint is being deprecated and will be removed in future versions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a java.util.List<Client>
     * @deprecated
     *
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public java.util.List<Client> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("410", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, Client::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of all clients. The clients are returned sorted by creation date,with the newest clients appearing first.Warning: the endpoint is being deprecated and will be removed in future versions.
     * @return a RequestInformation
     * @deprecated
     *
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of all clients. The clients are returned sorted by creation date,with the newest clients appearing first.Warning: the endpoint is being deprecated and will be removed in future versions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ClientsRequestBuilder
     * @deprecated
     *
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ClientsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ClientsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of all clients. The clients are returned sorted by creation date,with the newest clients appearing first.Warning: the endpoint is being deprecated and will be removed in future versions.
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
