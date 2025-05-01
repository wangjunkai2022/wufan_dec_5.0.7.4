.class Lcn/sharesdk/wechat/moments/WechatMoments$2;
.super Ljava/lang/Object;
.source "WechatMoments.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/wechat/moments/WechatMoments;->doShare(Lcn/sharesdk/framework/Platform$ShareParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Lcn/sharesdk/wechat/moments/WechatMoments;


# direct methods
.method constructor <init>(Lcn/sharesdk/wechat/moments/WechatMoments;Lcn/sharesdk/framework/Platform$ShareParams;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->b:Lcn/sharesdk/wechat/moments/WechatMoments;

    iput-object p2, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->b:Lcn/sharesdk/wechat/moments/WechatMoments;

    invoke-static {p1}, Lcn/sharesdk/wechat/moments/WechatMoments;->e(Lcn/sharesdk/wechat/moments/WechatMoments;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 3
    iget-object v0, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    const-string v1, "ShareParams"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->b:Lcn/sharesdk/wechat/moments/WechatMoments;

    invoke-static {v0}, Lcn/sharesdk/wechat/moments/WechatMoments;->f(Lcn/sharesdk/wechat/moments/WechatMoments;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->b:Lcn/sharesdk/wechat/moments/WechatMoments;

    invoke-static {v0}, Lcn/sharesdk/wechat/moments/WechatMoments;->g(Lcn/sharesdk/wechat/moments/WechatMoments;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/wechat/moments/WechatMoments$2;->b:Lcn/sharesdk/wechat/moments/WechatMoments;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    :cond_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/moments/WechatMoments$2;->a(Ljava/lang/Boolean;)V

    return-void
.end method
