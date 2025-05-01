.class Lcn/sharesdk/tencent/qq/utils/a$2;
.super Ljava/lang/Object;
.source "QQHelper.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/utils/a;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Lcn/sharesdk/tencent/qq/utils/a;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/utils/a;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 11

    const/4 v0, 0x1

    :try_start_0
    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    .line 1
    invoke-virtual {p1, v1}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    new-array v3, v0, [I

    aput v0, v3, v2

    .line 2
    invoke-virtual {p1, v3}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    new-array v4, v0, [I

    const/4 v5, 0x2

    aput v5, v4, v2

    .line 3
    invoke-virtual {p1, v4}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    new-array v5, v0, [I

    const/4 v6, 0x3

    aput v6, v5, v2

    .line 4
    invoke-virtual {p1, v5}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    new-array v6, v0, [I

    const/4 v7, 0x4

    aput v7, v6, v2

    .line 5
    invoke-virtual {p1, v6}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "com.tencent.mobileqq"

    if-nez v1, :cond_0

    .line 6
    :try_start_1
    invoke-static {v6, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    const-string v7, "com.tencent.tim"

    if-nez v3, :cond_1

    .line 7
    :try_start_2
    invoke-static {v7, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    const-string v8, "com.tencent.minihd.qq"

    if-nez v4, :cond_2

    .line 8
    :try_start_3
    invoke-static {v8, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    const-string v9, "com.tencent.mobileqqi"

    if-nez v5, :cond_3

    .line 9
    :try_start_4
    invoke-static {v9, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_3
    const-string v10, "com.tencent.qqlite"

    if-nez p1, :cond_4

    .line 10
    :try_start_5
    invoke-static {v10, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    :cond_4
    if-eqz v1, :cond_5

    .line 11
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 12
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    invoke-static {v1, v6}, Lcn/sharesdk/tencent/qq/utils/a;->b(Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_6

    .line 13
    iget-object p1, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 14
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    invoke-static {v1, v7}, Lcn/sharesdk/tencent/qq/utils/a;->b(Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_6
    if-eqz v4, :cond_7

    .line 15
    iget-object p1, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 16
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    invoke-static {v1, v8}, Lcn/sharesdk/tencent/qq/utils/a;->b(Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_7
    if-eqz v5, :cond_8

    .line 17
    iget-object p1, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 18
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    invoke-static {v1, v9}, Lcn/sharesdk/tencent/qq/utils/a;->b(Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_8
    if-eqz p1, :cond_9

    .line 19
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 20
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    invoke-static {v1, v10}, Lcn/sharesdk/tencent/qq/utils/a;->b(Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_9
    const/4 p1, 0x0

    .line 21
    :goto_0
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v1, :cond_b

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catchall_0
    nop

    .line 23
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/utils/a$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_b

    .line 24
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_b
    :goto_2
    return-void
.end method
