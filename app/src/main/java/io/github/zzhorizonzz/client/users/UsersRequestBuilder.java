package io.github.zzhorizonzz.client.users;

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
import io.github.zzhorizonzz.client.models.User;
import io.github.zzhorizonzz.client.users.count.CountRequestBuilder;
import io.github.zzhorizonzz.client.users.item.WithUserItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersRequestBuilder extends BaseRequestBuilder {
    /**
     * The count property
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the io.github.zzhorizonzz.client.users.item collection
     * @param user_id The ID of the user to retrieve
     * @return a WithUserItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserItemRequestBuilder byUser_id(@jakarta.annotation.Nonnull final String user_id) {
        Objects.requireNonNull(user_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_id", user_id);
        return new WithUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UsersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users{?email_address*,external_id*,last_active_at_since*,limit*,offset*,order_by*,organization_id*,phone_number*,query*,username*,user_id*,web3_wallet*}", pathParameters);
    }
    /**
     * Instantiates a new UsersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users{?email_address*,external_id*,last_active_at_since*,limit*,offset*,order_by*,organization_id*,phone_number*,query*,username*,user_id*,web3_wallet*}", rawUrl);
    }
    /**
     * Returns a list of all users.The users are returned sorted by creation date, with the newest users appearing first.
     * @return a java.util.List<User>
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> get() {
        return get(null);
    }
    /**
     * Returns a list of all users.The users are returned sorted by creation date, with the newest users appearing first.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a java.util.List<User>
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Creates a new user. Your user management settings determine how you should setup your user model.Any email address and phone number created using this method will be marked as verified.Note: If you are performing a migration, check out our guide on [zero downtime migrations](https://clerk.com/docs/deployments/migrate-overview).A rate limit rule of 20 requests per 10 seconds is applied to this endpoint.
     * @param body The request body
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User post(@jakarta.annotation.Nonnull final UsersPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Creates a new user. Your user management settings determine how you should setup your user model.Any email address and phone number created using this method will be marked as verified.Note: If you are performing a migration, check out our guide on [zero downtime migrations](https://clerk.com/docs/deployments/migrate-overview).A rate limit rule of 20 requests per 10 seconds is applied to this endpoint.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User post(@jakarta.annotation.Nonnull final UsersPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of all users.The users are returned sorted by creation date, with the newest users appearing first.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of all users.The users are returned sorted by creation date, with the newest users appearing first.
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
     * Creates a new user. Your user management settings determine how you should setup your user model.Any email address and phone number created using this method will be marked as verified.Note: If you are performing a migration, check out our guide on [zero downtime migrations](https://clerk.com/docs/deployments/migrate-overview).A rate limit rule of 20 requests per 10 seconds is applied to this endpoint.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UsersPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new user. Your user management settings determine how you should setup your user model.Any email address and phone number created using this method will be marked as verified.Note: If you are performing a migration, check out our guide on [zero downtime migrations](https://clerk.com/docs/deployments/migrate-overview).A rate limit rule of 20 requests per 10 seconds is applied to this endpoint.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UsersPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UsersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UsersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of all users.The users are returned sorted by creation date, with the newest users appearing first.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Returns users with the specified email addresses.Accepts up to 100 email addresses.Any email addresses not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] emailAddress;
        /**
         * Returns users with the specified external ids.For each external id, the `+` and `-` can beprepended to the id, which denote whether therespective external id should be included orexcluded from the result set.Accepts up to 100 external ids.Any external ids not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] externalId;
        /**
         * Returns users that had session activity since the given date, with day precision.Providing a value with higher precision than day will result in an error.Example: use 1700690400000 to retrieve users that had session activity from 2023-11-23 until the current day.
         */
        @jakarta.annotation.Nullable
        public Integer lastActiveAtSince;
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
         * Allows to return users in a particular order.At the moment, you can order the returned users by their `created_at`,`updated_at`,`email_address`,`web3wallet`,`first_name`,`last_name`,`phone_number`,`username`,`last_active_at`,`last_sign_in_at`.In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.For example, if you want users to be returned in descending order according to their `created_at` property, you can use `-created_at`.If you don't use `+` or `-`, then `+` is implied. We only support one `order_by` parameter, and if multiple `order_by` parameters are provided, we will only keep the first one. For example,if you pass `order_by=username&order_by=created_at`, we will consider only the first `order_by` parameter, which is `username`. The `created_at` parameter will be ignored in this case.
         */
        @jakarta.annotation.Nullable
        public String orderBy;
        /**
         * Returns users that have memberships to thegiven organizations.For each organization id, the `+` and `-` can beprepended to the id, which denote whether therespective organization should be included orexcluded from the result set.Accepts up to 100 organization ids.
         */
        @jakarta.annotation.Nullable
        public String[] organizationId;
        /**
         * Returns users with the specified phone numbers.Accepts up to 100 phone numbers.Any phone numbers not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] phoneNumber;
        /**
         * Returns users that match the given query.For possible matches, we check the email addresses, phone numbers, usernames, web3 wallets, user ids, first and last names.The query value doesn't need to match the exact value you are looking for, it is capable of partial matches as well.
         */
        @jakarta.annotation.Nullable
        public String query;
        /**
         * Returns users with the user ids specified.For each user id, the `+` and `-` can beprepended to the id, which denote whether therespective user id should be included orexcluded from the result set.Accepts up to 100 user ids.Any user ids not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] userId;
        /**
         * Returns users with the specified usernames.Accepts up to 100 usernames.Any usernames not found are ignored.
         */
        @jakarta.annotation.Nullable
        public String[] username;
        /**
         * Returns users with the specified web3 wallet addresses.Accepts up to 100 web3 wallet addresses.Any web3 wallet addressed not found are ignored.
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
            allQueryParams.put("last_active_at_since", lastActiveAtSince);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_by", orderBy);
            allQueryParams.put("query", query);
            allQueryParams.put("email_address", emailAddress);
            allQueryParams.put("external_id", externalId);
            allQueryParams.put("organization_id", organizationId);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
