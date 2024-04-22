package io.github.zzhorizonzz.client.sessions;

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
import io.github.zzhorizonzz.client.models.Session;
import io.github.zzhorizonzz.client.sessions.item.WithSessionItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sessions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SessionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.sessions.item collection
     * @param session_id The ID of the session
     * @return a WithSessionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSessionItemRequestBuilder bySession_id(@jakarta.annotation.Nonnull final String session_id) {
        Objects.requireNonNull(session_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("session_id", session_id);
        return new WithSessionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SessionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SessionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions{?client_id*,limit*,offset*,status*,user_id*}", pathParameters);
    }
    /**
     * Instantiates a new SessionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SessionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions{?client_id*,limit*,offset*,status*,user_id*}", rawUrl);
    }
    /**
     * Returns a list of all sessions.The sessions are returned sorted by creation date, with the newest sessions appearing first.**Deprecation Notice (2024-01-01):** All parameters were initially considered optional, howevermoving forward at least one of `client_id` or `user_id` parameters should be provided.
     * @return a java.util.List<Session>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Session> get() {
        return get(null);
    }
    /**
     * Returns a list of all sessions.The sessions are returned sorted by creation date, with the newest sessions appearing first.**Deprecation Notice (2024-01-01):** All parameters were initially considered optional, howevermoving forward at least one of `client_id` or `user_id` parameters should be provided.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a java.util.List<Session>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Session> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, Session::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of all sessions.The sessions are returned sorted by creation date, with the newest sessions appearing first.**Deprecation Notice (2024-01-01):** All parameters were initially considered optional, howevermoving forward at least one of `client_id` or `user_id` parameters should be provided.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of all sessions.The sessions are returned sorted by creation date, with the newest sessions appearing first.**Deprecation Notice (2024-01-01):** All parameters were initially considered optional, howevermoving forward at least one of `client_id` or `user_id` parameters should be provided.
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
     * @return a SessionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SessionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SessionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of all sessions.The sessions are returned sorted by creation date, with the newest sessions appearing first.**Deprecation Notice (2024-01-01):** All parameters were initially considered optional, howevermoving forward at least one of `client_id` or `user_id` parameters should be provided.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * List sessions for the given client
         */
        @jakarta.annotation.Nullable
        public String clientId;
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
         * Filter sessions by the provided status
         */
        @jakarta.annotation.Nullable
        public GetStatusQueryParameterType status;
        /**
         * List sessions for the given user
         */
        @jakarta.annotation.Nullable
        public String userId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("status", status);
            allQueryParams.put("client_id", clientId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("user_id", userId);
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
