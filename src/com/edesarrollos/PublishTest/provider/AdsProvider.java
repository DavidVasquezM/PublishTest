package com.edesarrollos.PublishTest.provider;

import com.edesarrollos.PublishTest.db.Ads;
import com.tojc.ormlite.android.OrmLiteSimpleContentProvider;
import com.tojc.ormlite.android.framework.MatcherController;
import com.tojc.ormlite.android.framework.MimeTypeVnd.*;

/**
 * Created by edesarrollos on 28/07/2015.
 */
public class AdsProvider extends OrmLiteSimpleContentProvider<Manager> {

    @Override
    protected Class<Manager> getHelperClass() {
        return Manager.class;
    }

    @Override
    public boolean onCreate() {
        setMatcherController(new MatcherController()
                .add(Ads.class, SubType.DIRECTORY, "", Contract.Ads.CONTENT_URI_PATTERN_MANY)
                .add(Ads.class, SubType.ITEM, "#", Contract.Ads.CONTENT_URI_PATTERN_ONE));
        return true;
    }

}
