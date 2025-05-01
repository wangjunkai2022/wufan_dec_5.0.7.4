.class Lcn/sharesdk/tencent/qq/ShareActivity$2;
.super Ljava/lang/Object;
.source "ShareActivity.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/ShareActivity;->openMiniProgram(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcn/sharesdk/tencent/qq/ShareActivity;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/ShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 7

    const-string v0, "ShareSDK"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    new-array v3, v2, [I

    .line 1
    invoke-virtual {p1, v3}, Lcom/mob/tools/utils/DH$DHResponse;->getAInfoForPkg([I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    const-string v3, "ainfo null"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v3, v4}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    return-void

    .line 3
    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "mqqapi://connect_miniapp/launch?app_type=%1$s&mini_app_id=%2$s&version=1&src_type=app&app_name=%3$s&app_id=%4$s&src_id=%5$s&mini_app_path=%6$s&mini_app_type=%7$s&open_id=%8$s"

    const/16 v5, 0x8

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "mini_program_or_game"

    aput-object v6, v5, v2

    .line 4
    iget-object v6, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->a:Ljava/lang/String;

    aput-object v6, v5, v1

    const/4 v6, 0x2

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->encodeToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v5, v6

    const/4 p1, 0x3

    iget-object v6, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    .line 6
    invoke-static {v6}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$700(Lcn/sharesdk/tencent/qq/ShareActivity;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcn/sharesdk/tencent/qq/ShareActivity;->encodeToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, p1

    const/4 p1, 0x4

    const-string v6, "21"

    aput-object v6, v5, p1

    const/4 p1, 0x5

    iget-object v6, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->b:Ljava/lang/String;

    invoke-static {v6}, Lcn/sharesdk/tencent/qq/ShareActivity;->encodeToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, p1

    const/4 p1, 0x6

    iget-object v6, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->c:Ljava/lang/String;

    invoke-static {v6}, Lcn/sharesdk/tencent/qq/ShareActivity;->encodeToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, p1

    const/4 p1, 0x7

    const-string v6, ""

    .line 7
    invoke-static {v6}, Lcn/sharesdk/tencent/qq/ShareActivity;->encodeToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, p1

    .line 8
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 9
    invoke-virtual {v3, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p1, "pkg_name"

    .line 10
    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$800(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 12
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt p1, v3, :cond_2

    .line 13
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, " QQ ShareActivity Build.VERSION.SDK_INT >= 28 activity.finish "

    aput-object v4, v3, v2

    invoke-virtual {p1, v0, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 14
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$900(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 15
    iget-object v3, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v3}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 16
    iget-object v3, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v3}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v3

    iget-object v4, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v4}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v4

    const/16 v5, 0x9

    invoke-interface {v3, v4, v5, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    .line 17
    :cond_1
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " QQ openMiniProgram catch "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {v3, v0, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 18
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$2;->d:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$1000(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_2
    :goto_0
    return-void
.end method
