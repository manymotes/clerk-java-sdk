package io.github.zzhorizonzz.sdk.client.email_addresses;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.email_addresses.item.WithEmailAddressItemRequestBuilder;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.EmailAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /email_addresses
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailAddressesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.sdk.client.email_addresses.item collection
     * @param email_address_id The ID of the email address to retrieve
     * @return a WithEmailAddressItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithEmailAddressItemRequestBuilder byEmail_address_id(@jakarta.annotation.Nonnull final String email_address_id) {
        Objects.requireNonNull(email_address_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("email_address_id", email_address_id);
        return new WithEmailAddressItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Email_addressesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailAddressesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_addresses", pathParameters);
    }
    /**
     * Instantiates a new Email_addressesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailAddressesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_addresses", rawUrl);
    }
    /**
     * Create a new email address
     * @param body The request body
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress post(@jakarta.annotation.Nonnull final EmailAddressesPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new email address
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress post(@jakarta.annotation.Nonnull final EmailAddressesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EmailAddress::createFromDiscriminatorValue);
    }
    /**
     * Create a new email address
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EmailAddressesPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new email address
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EmailAddressesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a EmailAddressesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EmailAddressesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmailAddressesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
