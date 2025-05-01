.class Lcom/join/mgps/activity/SplashActivity$g;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SplashActivity;->L(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$g;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$g;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->AdRenerSdk_No:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$g;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SplashActivity;->o(Lcom/join/mgps/activity/SplashActivity;)V

    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/splash/AMSplashAd;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$g;->a:Lcom/join/mgps/activity/SplashActivity;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    iput-object p1, v0, Lcom/join/mgps/activity/SplashActivity;->W:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    :cond_0
    return-void
.end method
