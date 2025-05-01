.class Lcn/sharesdk/framework/a/a$1;
.super Ljava/lang/Object;
.source "EventManager.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Lcn/sharesdk/framework/a/a;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/a/a$1;->b:Lcn/sharesdk/framework/a/a;

    iput-object p2, p0, Lcn/sharesdk/framework/a/a$1;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 9

    const-string v0, "res"

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getNetworkType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "none"

    .line 2
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/32 v1, 0x5265c00

    .line 3
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$1;->b:Lcn/sharesdk/framework/a/a;

    invoke-static {p1}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/a/e;

    move-result-object p1

    invoke-virtual {p1}, Lcn/sharesdk/framework/a/a/e;->j()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v7, 0x5

    .line 7
    invoke-virtual {p1, v7}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 8
    invoke-virtual {p1, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 9
    invoke-virtual {p1, v7}, Ljava/util/Calendar;->get(I)I

    move-result p1

    sub-long/2addr v5, v3

    cmp-long v3, v5, v1

    if-ltz v3, :cond_2

    if-eq v8, p1, :cond_2

    .line 10
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$1;->b:Lcn/sharesdk/framework/a/a;

    invoke-static {p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/c;

    move-result-object p1

    invoke-virtual {p1}, Lcn/sharesdk/framework/a/c;->a()Ljava/util/HashMap;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "true"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 12
    :goto_0
    iget-object v1, p0, Lcn/sharesdk/framework/a/a$1;->b:Lcn/sharesdk/framework/a/a;

    invoke-static {v1}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/a/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/a/a/e;->c(Z)V

    .line 13
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 14
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$1;->b:Lcn/sharesdk/framework/a/a;

    invoke-static {p1}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/a/e;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcn/sharesdk/framework/a/a/e;->b(J)V

    .line 15
    :cond_2
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$1;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 16
    iget-object v0, p0, Lcn/sharesdk/framework/a/a$1;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    .line 17
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method
