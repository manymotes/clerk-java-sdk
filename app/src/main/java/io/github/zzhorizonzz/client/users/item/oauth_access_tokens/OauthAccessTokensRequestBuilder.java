package io.github.zzhorizonzz.sdk.client.users.item.oauth_access_tokens;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.sdk.client.users.item.oauth_access_tokens.item.WithProviderItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user_id}/oauth_access_tokens
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OauthAccessTokensRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.users.item.oauth_access_tokens.item collection
     * @param provider The ID of the OAuth provider (e.g. `oauth_google`)
     * @return a WithProviderItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProviderItemRequestBuilder byProvider(@jakarta.annotation.Nonnull final String provider) {
        Objects.requireNonNull(provider);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("provider", provider);
        return new WithProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Oauth_access_tokensRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OauthAccessTokensRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/oauth_access_tokens", pathParameters);
    }
    /**
     * Instantiates a new Oauth_access_tokensRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OauthAccessTokensRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/oauth_access_tokens", rawUrl);
    }
}
