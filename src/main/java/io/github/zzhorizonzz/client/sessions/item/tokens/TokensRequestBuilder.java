package io.github.zzhorizonzz.client.sessions.item.tokens;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.client.sessions.item.tokens.item.WithTemplateNameItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sessions/{session_id}/tokens
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokensRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.sessions.item.tokens.item collection
     * @param template_name The name of the JWT Template defined in your instance (e.g. `custom_hasura`).
     * @return a WithTemplateNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTemplateNameItemRequestBuilder byTemplate_name(@jakarta.annotation.Nonnull final String template_name) {
        Objects.requireNonNull(template_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("template_name", template_name);
        return new WithTemplateNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TokensRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokensRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions/{session_id}/tokens", pathParameters);
    }
    /**
     * Instantiates a new TokensRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokensRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions/{session_id}/tokens", rawUrl);
    }
}
