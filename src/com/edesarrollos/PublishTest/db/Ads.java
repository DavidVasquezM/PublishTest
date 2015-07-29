package com.edesarrollos.PublishTest.db;

/**
 * Created by edesarrollos on 28/07/2015.
 */

import android.provider.BaseColumns;
import com.edesarrollos.PublishTest.provider.Contract;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.tojc.ormlite.android.annotation.AdditionalAnnotation.*;

@DatabaseTable(tableName = Contract.TABLE_NAME)
@DefaultContentUri(authority = Contract.AUTHORITY, path = Contract.CONTENT_URI_PATH)
@DefaultContentMimeTypeVnd(name = Contract.MIMETYPE_NAME, type = Contract.MIMETYPE_TYPE)
public class Ads {

    @DatabaseField(columnName = BaseColumns._ID, generatedId = true)
    @DefaultSortOrder
    private int id;
    @DatabaseField(columnName = Contract.NAME)
    private String name;
    @DatabaseField(columnName = Contract.IMAGE)
    private String image;
    @DatabaseField(columnName = Contract.LINK)
    private String link;
    @DatabaseField(columnName = Contract.CONTENT)
    private String content;

    public Ads() {
        // ORMLite needs a no-arg constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}