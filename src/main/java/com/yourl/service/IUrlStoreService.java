package com.yourl.service;

/**
 * Created by david on 2015-06-02.
 */
public interface IUrlStoreService {
    String findUrlById(String id);

    void storeUrl(String id, String url);
}
