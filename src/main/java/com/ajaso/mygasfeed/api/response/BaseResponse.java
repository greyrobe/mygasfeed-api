package com.ajaso.mygasfeed.api.response;

import com.ajaso.android.foreman.Result;
import com.ajaso.mygasfeed.api.model.Status;
import com.google.gson.Gson;

/**
 * Author: Adam J Jaso Jr
 * Adam J Jaso Jr 2014
 */
public class BaseResponse implements Result
{
    public Status status;

    public boolean hasError()
    {
        return !"NO".equalsIgnoreCase(status.error);
    }

    public int errorCode()
    {
        return status.errorCode;
    }

    public String message()
    {
        return status.message;
    }

    public Object data()
    {
        return this;
    }

    public String toString()
    {
        return new Gson().toJson(this);
    }
}
