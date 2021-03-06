package com.ajaso.mygasfeed.api.response;

import com.ajaso.mygasfeed.api.model.GeoLocation;
import com.ajaso.mygasfeed.api.model.Station;

import java.util.List;

/**
 * Author: Adam J Jaso Jr
 * Adam J Jaso Jr 2014
 */
public class Nearby extends BaseResponse
{
    public GeoLocation geoLocation;
    public Station[] stations;
}
