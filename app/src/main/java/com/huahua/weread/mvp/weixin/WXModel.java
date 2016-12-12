package com.huahua.weread.mvp.weixin;

import com.huahua.weread.bean.WeiXinResponse;
import com.huahua.weread.http.HttpManager;

import rx.Subscriber;
import rx.Subscription;

/**
 * 微信精选的   M层
 *
 * 只干了一件事，去拉取数据
 * Created by Administrator on 2016/12/2.
 */
// 妈的 参数传来传去有屁意思
    // presenter要加载数据
        // presenter需要用到model，model需要用到Http的统一入口类去加载数据
        // 参数从presenter传到model传到Http的统一请求类
public class WXModel {

    public Subscription loadWXjingxuan(int pageIndex, Subscriber<WeiXinResponse> subscriber) {
        return HttpManager.getInstance().loadWX(pageIndex, subscriber);
    }
}




















