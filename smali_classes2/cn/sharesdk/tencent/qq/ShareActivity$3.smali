.class Lcn/sharesdk/tencent/qq/ShareActivity$3;
.super Ljava/lang/Object;
.source "ShareActivity.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/ShareActivity;->advancedShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "[I>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcn/sharesdk/tencent/qq/ShareActivity;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/ShareActivity;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$1100(Lcn/sharesdk/tencent/qq/ShareActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ReceiveActivity;->setUriScheme(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ReceiveActivity;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    aget v0, p1, v1

    const/4 v3, 0x4

    if-ge v0, v3, :cond_1

    aget p1, p1, v2

    const/4 v0, 0x6

    if-ge p1, v0, :cond_1

    .line 4
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->a:Landroid/content/Intent;

    const-string v0, "key_request_code"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    :cond_1
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->a:Landroid/content/Intent;

    iget-object v0, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$1200(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "pkg_name"

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$1300(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->a:Landroid/content/Intent;

    const/16 v3, 0x100

    invoke-virtual {p1, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_2

    .line 8
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, " QQ ShareActivity Build.VERSION.SDK_INT >= 28 activity.finish "

    aput-object v2, v0, v1

    const-string v1, "ShareSDK"

    invoke-virtual {p1, v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 9
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$3;->b:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$1400(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [I

    invoke-virtual {p0, p1}, Lcn/sharesdk/tencent/qq/ShareActivity$3;->a([I)V

    return-void
.end method
