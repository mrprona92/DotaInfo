package com.badr.infodota.base.remote.update;

import android.content.Context;
import android.util.Pair;

import com.badr.infodota.base.api.Constants;
import com.badr.infodota.base.api.Update;
import com.badr.infodota.base.remote.BaseRemoteServiceImpl;

/**
 * Created by Badr on 17.02.2015.
 */
public class UpdateRemoteServiceImpl extends BaseRemoteServiceImpl implements UpdateRemoteService {
    @Override
    public Pair<Update, String> getUpdate(Context context) throws Exception {
        String url = Constants.GITHUB_UPDATE_URL;
        return basicRequestSend(context, url, Update.class);
    }
}
