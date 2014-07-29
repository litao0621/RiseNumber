package com.gitonway.lee.risenumber.lib;

/**
 * Created by lee on 2014/7/29.
 */
public interface RiseNumberBase {
    public void start();
    public RiseNumberTextView withNumber(float number);
    public RiseNumberTextView withNumber(int number);
    public RiseNumberTextView setDuration(long duration);
    public void setOnEnd(RiseNumberTextView.EndListener callback);
}
