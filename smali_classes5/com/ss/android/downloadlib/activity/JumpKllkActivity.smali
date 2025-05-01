.class public Lcom/ss/android/downloadlib/activity/JumpKllkActivity;
.super Lcom/ss/android/downloadlib/activity/TTDelegateActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    return-void
.end method

.method protected vv()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const-string v1, "handleIntent is null"

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    return-void

    :cond_0
    const-string v1, "p"

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "id"

    const-wide/16 v4, 0x0

    .line 6
    invoke-virtual {v0, v1, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v6

    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    cmp-long v1, v6, v4

    if-nez v1, :cond_2

    .line 8
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v1

    const-string v2, "getPackage or id is null"

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    :cond_2
    const-string v1, "dl"

    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    const-string v4, "bk"

    .line 11
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    and-int/2addr v1, v4

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    move-object v2, p0

    move-wide v4, v6

    move-object v6, v0

    move v7, v1

    .line 13
    invoke-static/range {v2 .. v7}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V

    .line 14
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    return-void

    .line 15
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "ab"

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v5, :cond_4

    const/4 v2, 0x1

    .line 17
    :cond_4
    invoke-static {p0, v3, v6, v7, v2}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Ljava/lang/String;JZ)V

    if-eq v0, v5, :cond_5

    .line 18
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    :cond_5
    return-void
.end method
