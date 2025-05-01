.class final Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/q$1;->onAudioBeOccupied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/q$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->Cr:Lcom/kwad/components/ad/splashscreen/d/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/q;->b(Lcom/kwad/components/ad/splashscreen/presenter/q;)Z

    move-result v0

    invoke-virtual {v1, v0, v2}, Lcom/kwad/components/ad/splashscreen/d/a;->setAudioEnabled(ZZ)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_3

    .line 4
    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/q;->b(Lcom/kwad/components/ad/splashscreen/presenter/q;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;->speakerIconUrl:Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;->speakerMuteIconUrl:Ljava/lang/String;

    .line 7
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/q;->a(Lcom/kwad/components/ad/splashscreen/presenter/q;)Landroid/widget/ImageView;

    move-result-object v1

    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v3, v3, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    iget-object v3, v3, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v3, v3, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/q;->a(Lcom/kwad/components/ad/splashscreen/presenter/q;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    .line 10
    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/q;->c(Lcom/kwad/components/ad/splashscreen/presenter/q;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/kwad/sdk/R$drawable;->ksad_splash_sound_selector:I

    .line 11
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    :goto_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$1$1;->Er:Lcom/kwad/components/ad/splashscreen/presenter/q$1;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/q$1;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/q;->a(Lcom/kwad/components/ad/splashscreen/presenter/q;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    :cond_3
    return-void
.end method
