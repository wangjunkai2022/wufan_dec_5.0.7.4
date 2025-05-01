.class public final Lcom/kwad/components/ad/interstitial/e/g;
.super Lcom/kwad/components/ad/interstitial/e/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/interstitial/e/g$b;,
        Lcom/kwad/components/ad/interstitial/e/g$a;
    }
.end annotation


# static fields
.field private static kS:I = 0x4


# instance fields
.field private jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

.field private kR:Lcom/kwad/components/ad/interstitial/e/g$b;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/g$a;

    invoke-direct {v0}, Lcom/kwad/components/ad/interstitial/e/g$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-direct {v0}, Lcom/kwad/components/ad/interstitial/e/g$b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    return-void
.end method

.method private a(Lcom/kwad/components/ad/interstitial/e/g$a;Lcom/kwad/components/ad/interstitial/e/g$b;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->a(Lcom/kwad/components/ad/interstitial/e/g$a;)Landroid/widget/ImageView;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->getAppIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    invoke-static {p3}, Lcom/kwad/sdk/core/response/b/a;->ca(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 5
    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->getAppIconUrl()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, Lcom/kwad/sdk/R$drawable;->ksad_default_app_icon:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, p4, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadCircleIcon(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 6
    :cond_0
    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_default_app_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->getAppIconUrl()Ljava/lang/String;

    move-result-object v1

    sget v4, Lcom/kwad/components/ad/interstitial/e/g;->kS:I

    invoke-static {v0, v1, p4, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadWithRadius(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    :goto_0
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->b(Lcom/kwad/components/ad/interstitial/e/g$a;)Landroid/widget/TextView;

    move-result-object p4

    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->dy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cL()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 11
    invoke-static {p3}, Lcom/kwad/sdk/core/response/b/a;->ca(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p3

    const/4 p4, 0x3

    if-ne p3, p4, :cond_2

    .line 12
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->c(Lcom/kwad/components/ad/interstitial/e/g$a;)Lcom/kwad/components/ad/widget/KsPriceView;

    move-result-object p3

    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->getPrice()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->dA()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p3, p4, v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 13
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->c(Lcom/kwad/components/ad/interstitial/e/g$a;)Lcom/kwad/components/ad/widget/KsPriceView;

    move-result-object p3

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->d(Lcom/kwad/components/ad/interstitial/e/g$a;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/g;->dx()V

    goto :goto_1

    .line 16
    :cond_2
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/g$a;->d(Lcom/kwad/components/ad/interstitial/e/g$a;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->dz()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :goto_1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/e/g$b;->dB()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v3}, Lcom/kwad/components/ad/interstitial/g/d;->f(Ljava/lang/String;I)V

    return-void
.end method

.method private d(Lcom/kwad/sdk/core/response/model/AdInfo;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->ca(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cJ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->r(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cf(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    .line 4
    sget v0, Lcom/kwad/components/core/widget/e;->adc:I

    .line 5
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/response/b/a;->b(Lcom/kwad/sdk/core/response/model/AdInfo;I)Landroid/text/SpannableString;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cI(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/interstitial/e/g$b;->a(Ljava/lang/CharSequence;)V

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cF(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/interstitial/e/g$b;->v(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->aa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/interstitial/e/g$b;->v(Ljava/lang/String;)V

    return-void

    .line 12
    :cond_2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cL()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->ca(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cQ(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdProductInfo;

    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdProductInfo;->icon:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->r(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdProductInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdProductInfo;->originPrice:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->t(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdProductInfo;->price:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/g$b;->u(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/interstitial/e/g$b;->v(Ljava/lang/String;)V

    return-void

    .line 20
    :cond_3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->r(Ljava/lang/String;)V

    .line 22
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->au(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->au(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    goto :goto_0

    .line 24
    :cond_4
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;->adAuthorText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 25
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;->adAuthorText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    goto :goto_0

    .line 26
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$string;->ksad_ad_default_username_normal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    .line 27
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->a(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/g$b;->v(Ljava/lang/String;)V

    return-void

    .line 29
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->r(Ljava/lang/String;)V

    .line 30
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aw(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 31
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aw(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    goto :goto_1

    .line 32
    :cond_7
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;->adAuthorText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 33
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;->adAuthorText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    goto :goto_1

    .line 34
    :cond_8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$string;->ksad_ad_default_username_normal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->s(Ljava/lang/String;)V

    .line 35
    :goto_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$b;->a(Ljava/lang/CharSequence;)V

    .line 36
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/g$b;->v(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private dx()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_ad_desc_layout:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_space:I

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    const v3, 0x402b851f    # 2.68f

    .line 4
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 5
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v0, 0x8

    .line 6
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/e/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    .line 3
    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_app_icon:I

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$a;->a(Lcom/kwad/components/ad/interstitial/e/g$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_app_title:I

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$a;->a(Lcom/kwad/components/ad/interstitial/e/g$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_app_desc:I

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$a;->b(Lcom/kwad/components/ad/interstitial/e/g$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_product_price:I

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/widget/KsPriceView;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/g$a;->a(Lcom/kwad/components/ad/interstitial/e/g$a;Lcom/kwad/components/ad/widget/KsPriceView;)Lcom/kwad/components/ad/widget/KsPriceView;

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/interstitial/e/g;->d(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/g;->kQ:Lcom/kwad/components/ad/interstitial/e/g$a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/g;->kR:Lcom/kwad/components/ad/interstitial/e/g$b;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/g;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/e/g;->a(Lcom/kwad/components/ad/interstitial/e/g$a;Lcom/kwad/components/ad/interstitial/e/g$b;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    return-void
.end method
