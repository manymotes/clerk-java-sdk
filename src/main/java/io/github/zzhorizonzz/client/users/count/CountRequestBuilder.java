package io.github.zzhorizonzz.client.users.count;

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
import io.github.zzhorizonzz.client.models.TotalCount;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/count
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CountRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new CountRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/count{?email_address*,external_id*,phone_number*,query*,username*,user_id*,web3_wallet*}", pathParameters);
    }
    /**
     * Instantiates a new CountRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/count{?email_address*,external_id*,phone_number*,query*,username*,user_id*,web3_wallet*}", rawUrl);
    }
    /**
     * Returns a total count of all users that match the given filtering criteria.
     * @return a TotalCount
     */
    @jakarta.annotation.Nullable
    public TotalCount get() {
        return get(null);
    }
    /**
     * Returns a total count of all users that match the given filtering criteria.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TotalCount
     */
    @jakarta.annotation.Nullable
    public TotalCount get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TotalCount::createFromDiscriminatorValue);
    }
    /**
     * Returns a total count of all users that match the given filtering criteria.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a total count of all users that match the given filtering criteria.
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
     * @return a CountRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CountRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a total count of all users that match the given filtering criteria.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Counts users with the specified email addresses.Accepts up to 100 email addresses.Any email addresses not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] emailAddress;
        /**
         * Counts users with the specified external ids.Accepts up to 100 external ids.Any external ids not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] externalId;
        /**
         * Counts users with the specified phone numbers.Accepts up to 100 phone numbers.Any phone numbers not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] phoneNumber;
        /**
         * Counts users that match the given query.For possible matches, we check the email addresses, phone numbers, usernames, web3 wallets, user ids, first and last names.The query value doesn't need to match the exact value you are looking for, it is capable of partial matches as well.
         */
        @jakarta.annotation.Nullable
        public String query;
        /**
         * Counts users with the user ids specified.Accepts up to 100 user ids.Any user ids not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] userId;
        /**
         * Counts users with the specified usernames.Accepts up to 100 usernames.Any usernames not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] username;
        /**
         * Counts users with the specified web3 wallet addresses.Accepts up to 100 web3 wallet addresses.Any web3 wallet addressed not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] web3Wallet;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("query", query);
            allQueryParams.put("email_address", emailAddress);
            allQueryParams.put("external_id", externalId);
            allQueryParams.put("phone_number", phoneNumber);
            allQueryParams.put("user_id", userId);
            allQueryParams.put("username", username);
            allQueryParams.put("web3_wallet", web3Wallet);
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
