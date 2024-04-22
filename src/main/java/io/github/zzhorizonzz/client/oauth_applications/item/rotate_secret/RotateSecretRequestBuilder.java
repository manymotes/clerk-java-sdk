package io.github.zzhorizonzz.client.oauth_applications.item.rotate_secret;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.OAuthApplicationWithSecret;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /oauth_applications/{oauth_application_id}/rotate_secret
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RotateSecretRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Rotate_secretRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RotateSecretRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications/{oauth_application_id}/rotate_secret", pathParameters);
    }
    /**
     * Instantiates a new Rotate_secretRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RotateSecretRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications/{oauth_application_id}/rotate_secret", rawUrl);
    }
    /**
     * Rotates the OAuth application's client secret.When the client secret is rotated, make sure to update it in authorized OAuth clients.
     * @return a OAuthApplicationWithSecret
     */
    @jakarta.annotation.Nullable
    public OAuthApplicationWithSecret post() {
        return post(null);
    }
    /**
     * Rotates the OAuth application's client secret.When the client secret is rotated, make sure to update it in authorized OAuth clients.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuthApplicationWithSecret
     */
    @jakarta.annotation.Nullable
    public OAuthApplicationWithSecret post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuthApplicationWithSecret::createFromDiscriminatorValue);
    }
    /**
     * Rotates the OAuth application's client secret.When the client secret is rotated, make sure to update it in authorized OAuth clients.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Rotates the OAuth application's client secret.When the client secret is rotated, make sure to update it in authorized OAuth clients.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a RotateSecretRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RotateSecretRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RotateSecretRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
