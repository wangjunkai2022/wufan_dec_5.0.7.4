.class public Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final m:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;

.field private vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;->m:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;

    .line 3
    sget-object p1, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;->m:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    invoke-interface {p3}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;->onSplashClickEyeClose()V

    goto :goto_0

    .line 3
    :pswitch_1
    invoke-interface {p3}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;->onSplashClickEyeClick()V

    goto :goto_0

    .line 4
    :pswitch_2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/p/vv/vv/m;

    const/4 p3, 0x0

    const-class v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {p2, p3, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/p/vv/vv/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 5
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;->m:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;->onSplashClickEyeReadyToShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1b9cd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/m/vv/vv/vv/p;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
