.class Lcn/sharesdk/tencent/qzone/utils/b$4;
.super Ljava/lang/Object;
.source "QZoneHelper.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/utils/b;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Lcn/sharesdk/tencent/qzone/utils/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/utils/b;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/b$4;->b:Lcn/sharesdk/tencent/qzone/utils/b;

    iput-object p2, p0, Lcn/sharesdk/tencent/qzone/utils/b$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 6

    const/4 v0, 0x1

    :try_start_0
    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    .line 1
    invoke-virtual {p1, v1}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "com.tencent.mobileqq"

    .line 2
    invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    :cond_0
    new-array v3, v0, [I

    aput v0, v3, v2

    .line 3
    invoke-virtual {p1, v3}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "com.tencent.tim"

    .line 4
    invoke-static {v3, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    :cond_1
    new-array v4, v0, [I

    const/4 v5, 0x2

    aput v5, v4, v2

    .line 5
    invoke-virtual {p1, v4}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "com.tencent.minihd.qq"

    .line 6
    invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 7
    :cond_2
    iget-object v4, p0, Lcn/sharesdk/tencent/qzone/utils/b$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v4, :cond_5

    if-nez v1, :cond_4

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 8
    :cond_4
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v4, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    nop

    .line 9
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/b$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_5

    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_5
    :goto_1
    return-void
.end method
