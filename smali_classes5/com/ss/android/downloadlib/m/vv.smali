.class public Lcom/ss/android/downloadlib/m/vv;
.super Ljava/lang/Object;


# direct methods
.method public static m(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 7

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v2, "app_link_opt"

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->u()Ljava/lang/String;

    move-result-object v0

    .line 3
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v1, p0}, Lcom/ss/android/downloadlib/n/u;->vv(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "applink_source"

    const-string v4, "dialog_click_by_sdk"

    .line 4
    invoke-static {v1, v3, v4}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v3

    const-string v4, "applink_click"

    invoke-virtual {v3, v4, v1, p0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 6
    invoke-static {v0, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v4

    const/4 v5, 0x2

    const-string v6, "dialog_by_url"

    if-ne v4, v5, :cond_3

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    invoke-static {v6, v3, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 10
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v3

    .line 11
    :cond_3
    invoke-virtual {v3}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v0

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    const-string v4, "dialog_by_package"

    if-eq v0, v2, :cond_5

    const/4 v2, 0x4

    if-eq v0, v2, :cond_4

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p0

    const-string v0, "AppLinkClickDialog default"

    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_4
    invoke-static {v4, v3, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 14
    :cond_5
    invoke-static {v4, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 15
    :cond_6
    invoke-static {v6, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method public static m(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
    .locals 1
    .param p1    # Lcom/ss/android/downloadlib/addownload/m/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/ss/android/downloadad/api/vv/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "applink_source"

    .line 26
    invoke-static {p2, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/m/n;->vv()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "error_code"

    invoke-static {p2, p1, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    invoke-interface {p3}, Lcom/ss/android/downloadad/api/vv/vv;->x()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "download_scene"

    invoke-static {p2, p1, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p0

    const-string p1, "deeplink_url_open_fail"

    invoke-virtual {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method public static m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/downloadad/api/vv/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "applink_source"

    .line 16
    invoke-static {p1, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "download_scene"

    invoke-static {p1, v1, v0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    const-string v1, "deeplink_url_open"

    invoke-virtual {v0, v1, p1, p2}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "dialog_by_url"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "notify_by_url"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "by_url"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "auto_by_url"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 20
    :pswitch_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "check_applink_mode"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    and-int/2addr p0, v1

    if-eqz p0, :cond_4

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "check_applink_result_by_sdk"

    invoke-static {p1, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/m/o;->vv()Lcom/ss/android/downloadlib/m/o;

    move-result-object p0

    new-instance v0, Lcom/ss/android/downloadlib/m/vv$2;

    invoke-direct {v0, p1, p2}, Lcom/ss/android/downloadlib/m/vv$2;-><init>(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;)V

    return-void

    .line 23
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->m()Lcom/ss/android/download/api/config/p;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    .line 24
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->y()Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->ya()Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->v()Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 25
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->o()Ljava/lang/String;

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66a1d5e9 -> :sswitch_3
        -0x51ef0279 -> :sswitch_2
        -0x7b8b0c3 -> :sswitch_1
        0x3174fc5e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static vv(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->u()Ljava/lang/String;

    move-result-object v0

    .line 26
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v1, p0}, Lcom/ss/android/downloadlib/n/u;->vv(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "applink_source"

    const-string v3, "notify_click_by_sdk"

    .line 27
    invoke-static {v1, v2, v3}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v2

    const-string v3, "applink_click"

    invoke-virtual {v2, v3, v1, p0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 29
    invoke-static {v0, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v3

    const-string v4, "notify_by_url"

    const/4 v5, 0x2

    if-ne v3, v5, :cond_1

    .line 31
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    invoke-static {v4, v2, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 33
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v2

    .line 34
    :cond_1
    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_4

    const/4 v3, 0x3

    const-string v4, "notify_by_package"

    if-eq v0, v3, :cond_3

    const/4 v3, 0x4

    if-eq v0, v3, :cond_2

    .line 35
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p0

    const-string v0, "AppLinkClickNotification default"

    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    return-void

    .line 36
    :cond_2
    invoke-static {v4, v2, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 37
    :cond_3
    invoke-static {v4, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 38
    :cond_4
    invoke-static {v4, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method public static vv(Lcom/ss/android/downloadlib/addownload/m/n;Lcom/ss/android/downloadlib/addownload/m/o;Z)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 94
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/m/n;->m()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "open_market"

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->vv([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "ttdownloader_type"

    const-string v3, "backup"

    .line 96
    invoke-static {v1, v2, v3}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v2

    const/4 v3, 0x5

    if-eq v2, v3, :cond_1

    const/4 p2, 0x6

    if-eq v2, p2, :cond_0

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/m/n;->vv()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p2, "error_code"

    invoke-static {v1, p2, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/m/o;->x()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p2, "download_scene"

    invoke-static {v1, p2, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p0

    const-string p2, "market_open_failed"

    invoke-virtual {p0, p2, v1, p1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    :goto_0
    return-void

    .line 101
    :cond_1
    invoke-static {v0, v1, p1, p2}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadlib/addownload/m/o;Z)V

    return-void
.end method

.method public static vv(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
    .locals 1
    .param p1    # Lcom/ss/android/downloadlib/addownload/m/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/ss/android/downloadad/api/vv/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "applink_source"

    .line 64
    invoke-static {p2, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/m/n;->vv()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "error_code"

    invoke-static {p2, p1, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    invoke-interface {p3}, Lcom/ss/android/downloadad/api/vv/vv;->x()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "download_scene"

    invoke-static {p2, p1, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p0

    const-string p1, "deeplink_app_open_fail"

    invoke-virtual {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method public static vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/downloadad/api/vv/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "applink_source"

    .line 54
    invoke-static {p1, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "download_scene"

    invoke-static {p1, v1, v0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    const-string v1, "deeplink_app_open"

    invoke-virtual {v0, v1, p1, p2}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 57
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "dialog_by_package"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "by_package"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "auto_by_package"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "notify_by_package"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 58
    :pswitch_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "check_applink_mode"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    and-int/2addr p0, v1

    if-eqz p0, :cond_4

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "check_applink_result_by_sdk"

    invoke-static {p1, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    invoke-static {}, Lcom/ss/android/downloadlib/m/o;->vv()Lcom/ss/android/downloadlib/m/o;

    move-result-object p0

    new-instance v0, Lcom/ss/android/downloadlib/m/vv$1;

    invoke-direct {v0, p1, p2}, Lcom/ss/android/downloadlib/m/vv$1;-><init>(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;)V

    return-void

    .line 61
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->m()Lcom/ss/android/download/api/config/p;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    .line 62
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->y()Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->ya()Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->v()Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 63
    invoke-interface {p2}, Lcom/ss/android/downloadad/api/vv/vv;->o()Ljava/lang/String;

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4c6ad8ec -> :sswitch_3
        -0x1a50fb12 -> :sswitch_2
        -0xb155fa2 -> :sswitch_1
        0x15f55bb5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadlib/addownload/m/o;Z)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    const-string v0, "applink_source"

    .line 80
    invoke-static {p1, v0, p0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "download_scene"

    .line 81
    invoke-virtual {p2}, Lcom/ss/android/downloadlib/addownload/m/o;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p3, :cond_1

    .line 82
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p3

    const-string v0, "market_open_success"

    invoke-virtual {p3, v0, p1, p2}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 83
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object p3

    const-string v0, "check_applink_mode"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x4

    and-int/2addr p3, v0

    if-eqz p3, :cond_2

    .line 84
    invoke-static {}, Lcom/ss/android/downloadlib/m/o;->vv()Lcom/ss/android/downloadlib/m/o;

    move-result-object p3

    new-instance v1, Lcom/ss/android/downloadlib/m/vv$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/ss/android/downloadlib/m/vv$3;-><init>(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;)V

    invoke-virtual {p3, v1}, Lcom/ss/android/downloadlib/m/o;->m(Lcom/ss/android/downloadlib/m/i;)V

    goto :goto_1

    .line 85
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->m()Lcom/ss/android/download/api/config/p;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    iget-object p0, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 86
    invoke-interface {p0}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    .line 87
    :goto_1
    new-instance p0, Lcom/ss/android/downloadad/api/vv/m;

    iget-object p1, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object p3, p2, Lcom/ss/android/downloadlib/addownload/m/o;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-direct {p0, p1, p3, p2}, Lcom/ss/android/downloadad/api/vv/m;-><init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    const/4 p1, 0x2

    .line 88
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadad/api/vv/m;->o(I)V

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lcom/ss/android/downloadad/api/vv/m;->u(J)V

    .line 90
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadad/api/vv/m;->qv(I)V

    .line 91
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadad/api/vv/m;->wv(I)V

    .line 92
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 93
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    const-string p2, "onMarketSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static vv(J)Z
    .locals 1

    .line 102
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/downloadlib/addownload/m/u;->i(J)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static vv(Lcom/ss/android/downloadlib/addownload/m/o;)Z
    .locals 10
    .param p0    # Lcom/ss/android/downloadlib/addownload/m/o;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DeepLink;->getOpenUrl()Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v1, p0}, Lcom/ss/android/downloadlib/n/u;->vv(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "applink_source"

    const-string v3, "click_by_sdk"

    .line 4
    invoke-static {v1, v2, v3}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v2

    const-string v3, "applink_click"

    invoke-virtual {v2, v3, v1, p0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 6
    invoke-static {v0, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v3

    const-string v4, "by_url"

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    invoke-static {v4, v2, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 10
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p0}, Lcom/ss/android/downloadlib/n/wv;->vv(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v2

    .line 11
    :cond_2
    iget-wide v6, p0, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    invoke-static {v6, v7}, Lcom/ss/android/downloadlib/m/vv;->vv(J)Z

    move-result v0

    const/4 v3, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v8, "link_ad_click_event"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v7, :cond_4

    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    instance-of v8, v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v8, :cond_3

    .line 13
    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 14
    invoke-virtual {v0, v3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFunnelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 15
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-wide v8, p0, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    invoke-virtual {v0, v8, v9, v6}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 16
    :goto_1
    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v8

    if-eq v8, v7, :cond_7

    const/4 v4, 0x3

    const-string v9, "by_package"

    if-eq v8, v4, :cond_6

    if-eq v8, v3, :cond_5

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v1

    const-string v2, "AppLinkClick default"

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    goto :goto_3

    .line 18
    :cond_5
    invoke-static {v9, v2, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    goto :goto_3

    .line 19
    :cond_6
    invoke-static {v9, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    goto :goto_2

    .line 20
    :cond_7
    invoke-static {v4, v1, p0}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz v6, :cond_a

    if-nez v0, :cond_a

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i/p;->m()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i/p;->m(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 23
    :cond_8
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i/p;->p()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 24
    :cond_9
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    invoke-virtual {v0, v1, v2, v5}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    :cond_a
    return v6
.end method

.method public static vv(Lcom/ss/android/downloadlib/addownload/m/o;I)Z
    .locals 8
    .param p0    # Lcom/ss/android/downloadlib/addownload/m/o;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 68
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 69
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/m/o;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "download_scene"

    invoke-static {v0, v2, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    const-string v3, "market_click_open"

    invoke-virtual {v1, v3, v0, p0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 71
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, p0, v3}, Lcom/ss/android/downloadlib/n/wv;->vv(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/o;Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 72
    invoke-virtual {v1}, Lcom/ss/android/downloadlib/addownload/m/n;->m()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "open_market"

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-static {v3}, Lcom/ss/android/downloadlib/n/jh;->vv([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 73
    invoke-virtual {v1}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v4

    const/4 v7, 0x5

    if-eq v4, v7, :cond_1

    const/4 v3, 0x6

    if-eq v4, v3, :cond_0

    const/4 v0, 0x7

    if-eq v4, v0, :cond_2

    return v5

    .line 74
    :cond_0
    invoke-virtual {v1}, Lcom/ss/android/downloadlib/addownload/m/n;->vv()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "error_code"

    invoke-static {v0, v1, p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/m/o;->x()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    const-string v1, "market_open_failed"

    invoke-virtual {p1, v1, v0, p0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return v5

    .line 77
    :cond_1
    invoke-static {v3, v0, p0, v6}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadlib/addownload/m/o;Z)V

    .line 78
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    return v6
.end method

.method public static vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/m;)Z
    .locals 6
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->ky()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/wv;->m(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    .line 41
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object p0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/notification/m;->u(I)V

    .line 42
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 43
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/n/u;->vv(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)Lorg/json/JSONObject;

    const-string v0, "applink_source"

    const-string v2, "auto_click"

    .line 44
    invoke-static {p0, v0, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    const-string v2, "applink_click"

    invoke-virtual {v0, v2, p1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 46
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->u()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v2

    .line 48
    invoke-static {p1, v0, v2}, Lcom/ss/android/downloadlib/n/wv;->vv(Lcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/n;->getType()I

    move-result v2

    const-string v3, "auto_by_url"

    const/4 v4, 0x1

    if-eq v2, v4, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_4

    const/4 v3, 0x3

    const-string v5, "auto_by_package"

    if-eq v2, v3, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    return v1

    .line 50
    :cond_2
    invoke-static {v5, v0, p0, p1}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return v1

    .line 51
    :cond_3
    invoke-static {v5, p0, p1}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return v4

    .line 52
    :cond_4
    invoke-static {v3, v0, p0, p1}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/n;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return v1

    .line 53
    :cond_5
    invoke-static {v3, p0, p1}, Lcom/ss/android/downloadlib/m/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return v4
.end method
