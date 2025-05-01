.class public final Lcom/kwad/components/ad/reward/n/c;
.super Lcom/kwad/sdk/core/download/a/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/widget/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/n/c$a;,
        Lcom/kwad/components/ad/reward/n/c$b;
    }
.end annotation


# instance fields
.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private ya:Landroid/view/View;

.field private yb:Landroid/view/View;

.field private yc:Landroid/widget/Button;

.field private yd:Landroid/widget/Button;

.field private ye:Landroid/widget/TextView;

.field private yf:Landroid/widget/ImageView;

.field private yg:Landroid/widget/TextView;

.field private yh:Landroid/widget/TextView;

.field private yi:Lcom/kwad/sdk/widget/KSRatingBar;

.field private yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

.field private yk:Lcom/kwad/components/ad/reward/n/c$a;

.field private volatile yl:Z

.field private ym:Lcom/kwad/components/ad/j/a;

.field private yn:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/download/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/n/c;->yl:Z

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/c;->initView()V

    .line 5
    new-instance v0, Lcom/kwad/components/ad/j/a;

    invoke-direct {v0, p1}, Lcom/kwad/components/ad/j/a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/n/c;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/n/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/reward/n/c;->yl:Z

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/n/c;)Lcom/kwad/components/ad/j/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    return-object p0
.end method

.method private c(Landroid/view/View;Z)V
    .locals 1

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 34
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_container:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_action:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_start:I

    if-ne p1, v0, :cond_1

    :cond_0
    const-string p1, "ApkInfoCardViewHelper"

    const-string v0, "onClick install"

    .line 35
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/n/c;->yl:Z

    .line 37
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yk:Lcom/kwad/components/ad/reward/n/c$a;

    if-eqz v0, :cond_1

    .line 38
    invoke-interface {v0, p2, p1}, Lcom/kwad/components/ad/reward/n/c$a;->d(ZI)V

    :cond_1
    return-void
.end method

.method private initView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_action:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yc:Landroid/widget/Button;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_start:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yf:Landroid/widget/ImageView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ye:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_desc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yg:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_score:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSRatingBar;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yi:Lcom/kwad/sdk/widget/KSRatingBar;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_tags:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/widget/KsAppTagsView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/n/c;->c(Landroid/view/View;Z)V

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/n/c$a;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yk:Lcom/kwad/components/ad/reward/n/c$a;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/e/d/c;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/n/c;->c(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V
    .locals 4

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p1}, Lcom/kwad/components/ad/reward/n/c$b;->P(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/n/c$b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yf:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->a(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xc

    invoke-static {v1, v2, p1, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->ye:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->b(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yg:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->c(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yi:Lcom/kwad/sdk/widget/KSRatingBar;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->d(Lcom/kwad/components/ad/reward/n/c$b;)F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/widget/KSRatingBar;->setStar(F)V

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    .line 9
    invoke-static {p1, v1}, Lcom/kwad/sdk/core/response/b/e;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v1, :cond_1

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yi:Lcom/kwad/sdk/widget/KSRatingBar;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    const-string v1, "\u67e5\u770b\u8be6\u60c5"

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yi:Lcom/kwad/sdk/widget/KSRatingBar;

    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yc:Landroid/widget/Button;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/n/c$b;->jS()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yc:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 18
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yc:Landroid/widget/Button;

    invoke-direct {p1, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 19
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-direct {p1, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 20
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    invoke-direct {p1, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 21
    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->e(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_2

    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_2

    .line 23
    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yg:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 24
    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->ya:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_desc_2:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yh:Landroid/widget/TextView;

    .line 25
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 26
    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yh:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/c$b;->c(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_3

    .line 28
    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    invoke-virtual {p2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 29
    :cond_3
    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/widget/KsAppTagsView;->setAppTags(Ljava/util/List;)V

    .line 30
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yn:Ljava/lang/Runnable;

    if-nez p1, :cond_4

    .line 31
    new-instance p1, Lcom/kwad/components/ad/reward/n/c$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/reward/n/c$1;-><init>(Lcom/kwad/components/ad/reward/n/c;)V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yn:Ljava/lang/Runnable;

    .line 32
    :cond_4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    iget-object p2, p0, Lcom/kwad/components/ad/reward/n/c;->yn:Ljava/lang/Runnable;

    const-wide/16 v0, 0x640

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final j(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final jQ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->c(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/j/a;->jQ()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yb:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yn:Ljava/lang/Runnable;

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yn:Ljava/lang/Runnable;

    :cond_2
    return-void
.end method

.method public final jR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/j/a;->mC()V

    return-void
.end method

.method public final onDownloadFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "\u7acb\u5373\u4e0b\u8f7d"

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onDownloadFinished()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ca(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onDownloadStarted()V
    .locals 0

    return-void
.end method

.method public final onIdle()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "\u7acb\u5373\u4e0b\u8f7d"

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInstalled()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ab(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "\u7acb\u5373\u6253\u5f00"

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onPaused(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/download/a/a;->onPaused(I)V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/j/a;->mC()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->dn(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final onProgressUpdate(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->ym:Lcom/kwad/components/ad/j/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/j/a;->mC()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c;->yd:Landroid/widget/Button;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->dm(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
