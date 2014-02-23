package com.ajaso.mygasfeed.api.response;

import com.ajaso.mygasfeed.api.model.HistoryEntry;
import com.ajaso.mygasfeed.api.model.Station;

import java.util.List;

/**
 * Author: Adam J Jaso Jr
 * Adam J Jaso Jr 2014
 */
public class PriceUpdate extends BaseResponse
{
    public Station.Detail details;
    public HistoryEntry[] previousPrices;
}
