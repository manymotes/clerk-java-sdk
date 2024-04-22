package io.github.zzhorizonzz.sdk.client.templates;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.sdk.client.templates.item.WithTemplateTypeItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /templates
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemplatesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.templates.item collection
     * @param template_type The type of templates to list (email or SMS)
     * @return a WithTemplateTypeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTemplateTypeItemRequestBuilder byTemplate_type(@jakarta.annotation.Nonnull final String template_type) {
        Objects.requireNonNull(template_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("template_type", template_type);
        return new WithTemplateTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TemplatesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TemplatesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/templates", pathParameters);
    }
    /**
     * Instantiates a new TemplatesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TemplatesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/templates", rawUrl);
    }
}
