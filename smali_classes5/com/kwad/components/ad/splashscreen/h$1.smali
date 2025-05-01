.class final Lcom/kwad/components/ad/splashscreen/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/d/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/h;->a(ILandroid/content/Context;IILcom/kwad/components/ad/splashscreen/h$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic CL:I

.field final synthetic CM:Lcom/kwad/components/ad/splashscreen/h$a;

.field final synthetic CN:Lcom/kwad/components/ad/splashscreen/h;

.field final synthetic eK:I


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/h;IILcom/kwad/components/ad/splashscreen/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iput p2, p0, Lcom/kwad/components/ad/splashscreen/h$1;->eK:I

    iput p3, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CL:I

    iput-object p4, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CM:Lcom/kwad/components/ad/splashscreen/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/a;->kU()Lcom/kwad/components/ad/splashscreen/monitor/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/a;->Y(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/h;->b(Lcom/kwad/components/ad/splashscreen/h;)Lcom/kwad/sdk/api/KsSplashScreenAd$SplashScreenAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/h;->b(Lcom/kwad/components/ad/splashscreen/h;)Lcom/kwad/sdk/api/KsSplashScreenAd$SplashScreenAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsSplashScreenAd$SplashScreenAdInteractionListener;->onAdClicked()V

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/a;->kU()Lcom/kwad/components/ad/splashscreen/monitor/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/a;->W(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->Cr:Lcom/kwad/components/ad/splashscreen/d/a;

    if-eqz v1, :cond_1

    const-string v2, "duration"

    .line 7
    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/d/a;->getCurrentPosition()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 9
    :cond_1
    :goto_0
    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/h$1;->eK:I

    .line 10
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 11
    invoke-virtual {v2}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 12
    iget v2, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CL:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const/4 v2, 0x6

    .line 13
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cT(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 14
    :cond_2
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CN:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2, v1, v0}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/h$1;->CM:Lcom/kwad/components/ad/splashscreen/h$a;

    if-eqz v0, :cond_3

    .line 16
    invoke-interface {v0, v1}, Lcom/kwad/components/ad/splashscreen/h$a;->b(Lcom/kwad/sdk/core/adlog/c/b;)V

    :cond_3
    return-void
.end method
