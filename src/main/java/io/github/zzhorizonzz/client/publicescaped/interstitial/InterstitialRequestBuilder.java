package io.github.zzhorizonzz.client.publicescaped.interstitial;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /public/interstitial
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InterstitialRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new InterstitialRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InterstitialRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public/interstitial{?frontendApi*,publishable_key*}", pathParameters);
    }
    /**
     * Instantiates a new InterstitialRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InterstitialRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public/interstitial{?frontendApi*,publishable_key*}", rawUrl);
    }
    /**
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @return a InputStream
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InputStream
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a InterstitialRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InterstitialRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InterstitialRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The Frontend API key of your instance
         */
        @jakarta.annotation.Nullable
        public String frontendApi;
        /**
         * The publishable key of your instance
         */
        @jakarta.annotation.Nullable
        public String publishableKey;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("frontendApi", frontendApi);
            allQueryParams.put("publishable_key", publishableKey);
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
