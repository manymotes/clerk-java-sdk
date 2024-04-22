package io.github.zzhorizonzz.client.users.item.oauth_access_tokens.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user_id}/oauth_access_tokens/{provider}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProviderItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithProviderItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProviderItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/oauth_access_tokens/{provider}", pathParameters);
    }
    /**
     * Instantiates a new WithProviderItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProviderItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/oauth_access_tokens/{provider}", rawUrl);
    }
    /**
     * Fetch the corresponding OAuth access token for a user that has previously authenticated with a particular OAuth provider.For OAuth 2.0, if the access token has expired and we have a corresponding refresh token, the access token will be refreshed transparently the new one will be returned.
     * @return a java.util.List<WithProvider>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WithProvider> get() {
        return get(null);
    }
    /**
     * Fetch the corresponding OAuth access token for a user that has previously authenticated with a particular OAuth provider.For OAuth 2.0, if the access token has expired and we have a corresponding refresh token, the access token will be refreshed transparently the new one will be returned.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a java.util.List<WithProvider>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WithProvider> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, WithProvider::createFromDiscriminatorValue);
    }
    /**
     * Fetch the corresponding OAuth access token for a user that has previously authenticated with a particular OAuth provider.For OAuth 2.0, if the access token has expired and we have a corresponding refresh token, the access token will be refreshed transparently the new one will be returned.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Fetch the corresponding OAuth access token for a user that has previously authenticated with a particular OAuth provider.For OAuth 2.0, if the access token has expired and we have a corresponding refresh token, the access token will be refreshed transparently the new one will be returned.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithProviderItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProviderItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithProviderItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
