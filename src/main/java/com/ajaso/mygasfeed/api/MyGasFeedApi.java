package com.ajaso.mygasfeed.api;


import com.ajaso.android.foreman.api.annotation.ApiMethod;
import com.ajaso.android.foreman.api.annotation.Host;
import com.ajaso.android.foreman.api.annotation.UriParam;
import com.ajaso.android.foreman.api.annotation.http.BodyParam;
import com.ajaso.android.foreman.api.annotation.http.HttpMethod;
import com.ajaso.android.foreman.api.http.HttpRequest;
import com.ajaso.android.foreman.api.serializer.JsonSerializer;
import com.ajaso.mygasfeed.api.response.*;

/**
 * Author: Adam J Jaso Jr
 * Copyright: Adam J Jaso Jr 2014
 */
public interface MyGasFeedApi
{

    @Host
    public String host = BuildConfig.DEBUG ? "devapi.mygasfeed.com" : "api.mygasfeed.com";

    @UriParam
    public String apiKey = BuildConfig.DEBUG ? "rfej9napna" : "dk37p5ccr9";

    @HttpMethod
    @ApiMethod(uri="/locations/pricehistory/:stationId/:apiKey.json", response=History.class, format=JsonSerializer.class)
    public HttpRequest getStationPriceHistory(@UriParam("stationId") int stationId);


    @ApiMethod(uri="/station/details/:stationId/:apiKey.json", response=StationDetails.class, format=JsonSerializer.class)
    public HttpRequest getStation(@UriParam("stationId") int stationId);

    @HttpMethod
    @ApiMethod(uri="/stations/radius/:lat/:lon/:dist/:fuelType/:sortBy/:apiKey.json", response=Nearby.class, format=JsonSerializer.class)
    public HttpRequest getStationsNearby(
        @UriParam("lat") double lat, @UriParam("lon") double lon, @UriParam("dist") double dist,
        @UriParam("fuelType") String fuelType, @UriParam("sortBy") String sortBy);


    @HttpMethod
    @ApiMethod(uri="/stations/brands/:apiKey.json", response=Brands.class, format=JsonSerializer.class)
    public HttpRequest getStationBrands();


    @HttpMethod(method="POST")
    @ApiMethod(uri="/locations/price/:apiKey.json", response=PriceUpdate.class, format=JsonSerializer.class)
    public HttpRequest updateGasPrices(
        @UriParam("apiKey") String apiKey, @BodyParam("price") String price,
        @BodyParam("fueltype") String fueltype, @BodyParam("stationid") String stationid);


    @HttpMethod
    @ApiMethod(uri="/locations/geoaddress/:lat/:lon/:apiKey.json", response=AddressLocation.class, format=JsonSerializer.class)
    public HttpRequest getAddressForLocation(
        @UriParam("lat") double lat, @UriParam("lon") double lon);

    @HttpMethod
    @ApiMethod(uri="/locations/otherclosebystations/:stationId/:limit/:apiKey.json", response=CloseBy.class, format=JsonSerializer.class)
    public HttpRequest getOtherCloseByStations(
        @UriParam("stationId") int stationId, @UriParam("limit") int limit);

}
