package com.edesarrollos.PublishTest.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by edesarrollos on 28/07/2015.
 */
public final class Contract {

    public static final String DATABASE_NAME = "MyDatabase";
    public static final int DATABASE_VERSION = 1;
    public static final String AUTHORITY = "com.edesarrollos.publishtest.provider";

    // Ads table info
    public static class Ads implements BaseColumns {

        private Ads() {
            // Utility constructor
        }

        public static final String TABLE_NAME = "Ads";

        public static final String CONTENT_URI_PATH = "ads";

        public static final String MIMETYPE_TYPE = "ads";
        public static final String MIMETYPE_NAME = "com.edesarrollos.publishtest.provider.mime";

        public static final int CONTENT_URI_PATTERN_MANY = 1;
        public static final int CONTENT_URI_PATTERN_ONE = 2;

        public static final Uri CONTENT_URI = new Uri.Builder()
                .scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();

        public static final String NAME = "name";
        public static final String IMAGE = "image";
        public static final String LINK = "link";
        public static final String CONTENT = "content";

    }

}