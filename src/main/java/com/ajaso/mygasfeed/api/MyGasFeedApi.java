package com.ajaso.mygasfeed.api;

import com.ajaso.android.http.api.ApiGlobal;
import com.ajaso.android.http.api.ApiMethod;
import com.ajaso.android.http.api.BodyParam;
import com.ajaso.android.http.api.UriParam;
import com.ajaso.android.http.request.HttpRequest;
import com.ajaso.mygasfeed.api.response.*;

/**
 * Author: Adam J Jaso Jr
 * Copyright: Adam J Jaso Jr 2014
 */
@ApiGlobal(host="api.mygasfeed.com", devHost="devapi.mygasfeed.com", debug=true)
public interface MyGasFeedApi
{
    @ApiMethod(uri="/locations/pricehistory/:stationId/:apiKey.json", response=History.class)
    public HttpRequest getStationPriceHistory(@UriParam("stationId") int stationId, @UriParam("apiKey") String apiKey);

    @ApiMethod(uri="/station/details/:stationId/:apiKey.json", response=StationDetails.class)
    public HttpRequest getStation(@UriParam("stationId") int stationId, @UriParam("apiKey") String apiKey);

    @ApiMethod(uri="/stations/radius/:lat/:lon/:dist/:fuelType/:sortBy/:apiKey.json", response=Nearby.class)
    public HttpRequest getStationsNearby(
        @UriParam("lat") double lat, @UriParam("lon") double lon, @UriParam("dist") double dist,
        @UriParam("fuelType") String fuelType, @UriParam("sortBy") String sortBy, @UriParam("apiKey") String apiKey);

    @ApiMethod(uri="/stations/brands/:apiKey.json", response=Brands.class)
    public HttpRequest getStationBrands(@UriParam("apiKey") String apiKey);

    @ApiMethod(method="POST", uri="/locations/price/:apiKey.json", response=PriceUpdate.class)
    public HttpRequest updateGasPrices(
        @UriParam("apiKey") String apiKey, @BodyParam("price") String price,
        @BodyParam("fueltype") String fueltype, @BodyParam("stationid") String stationid);

    @ApiMethod(uri="/locations/geoaddress/:lat/:lon/:apiKey.json", response=AddressLocation.class)
    public HttpRequest getAddressForLocation(
        @UriParam("lat") double lat, @UriParam("lon") double lon, @UriParam("apiKey") String apiKey);

    @ApiMethod(uri="/locations/otherclosebystations/:stationId/:limit/:apiKey.json", response=CloseBy.class)
    public HttpRequest getOtherCloseByStations(
        @UriParam("stationId") int stationId, @UriParam("limit") int limit, @UriParam("apiKey") String apiKey);

}
