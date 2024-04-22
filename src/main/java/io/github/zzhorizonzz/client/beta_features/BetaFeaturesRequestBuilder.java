package io.github.zzhorizonzz.client.beta_features;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.client.beta_features.domain.DomainRequestBuilder;
import io.github.zzhorizonzz.client.beta_features.instance_settings.InstanceSettingsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /beta_features
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BetaFeaturesRequestBuilder extends BaseRequestBuilder {
    /**
     * The domain property
     */
    @jakarta.annotation.Nonnull
    public DomainRequestBuilder domain() {
        return new DomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instance_settings property
     */
    @jakarta.annotation.Nonnull
    public InstanceSettingsRequestBuilder instanceSettings() {
        return new InstanceSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Beta_featuresRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BetaFeaturesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/beta_features", pathParameters);
    }
    /**
     * Instantiates a new Beta_featuresRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BetaFeaturesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/beta_features", rawUrl);
    }
}
