.class public final Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private Fa:F

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->Fa:F

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    .line 4
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->Fa:F

    return-void
.end method

.method private g(Landroid/content/Context;I)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/c/a/a;->h(Landroid/content/Context;I)I

    move-result p1

    int-to-float p1, p1

    .line 2
    iget p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->Fa:F

    mul-float p1, p1, p2

    float-to-int p1, p1

    return p1
.end method


# virtual methods
.method public final lG()Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_title_iconw_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_title_iconh_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v2
.end method

.method public final lH()Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_gift_iconw_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_gift_iconh_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v2
.end method

.method public final lI()Lcom/kwad/sdk/utils/ad;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_app_iconw_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_app_iconh_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v3, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_app_margin_top_land:I

    invoke-direct {p0, v2, v3}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v2

    .line 4
    new-instance v3, Lcom/kwad/sdk/utils/ad;

    invoke-direct {v3, v0, v1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 5
    invoke-virtual {v3, v2}, Lcom/kwad/sdk/utils/ad;->eb(I)V

    return-object v3
.end method

.method public final lJ()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_app_iconw_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3e75c28f    # 0.24f

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    int-to-float v0, v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/c/a/a;->px2dip(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method public final lK()Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_actionbar_iconw_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_actionbar_iconh_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v2
.end method

.method public final lL()Lcom/kwad/sdk/utils/ad;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appname_h_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appname_margin_top_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 4
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/utils/ad;->eb(I)V

    return-object v2
.end method

.method public final lM()Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appver_h_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    new-instance v1, Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v1
.end method

.method public final lN()Lcom/kwad/sdk/utils/ad;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appdesc_h_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appdesc_margin_top_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 4
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/utils/ad;->eb(I)V

    return-object v2
.end method

.method public final lO()Lcom/kwad/sdk/utils/ad;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_close_root_h_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_close_root_margin_top_land:I

    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 4
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/utils/ad;->eb(I)V

    return-object v2
.end method

.method public final lP()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appname_text_sp_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public final lQ()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appver_text_sp_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public final lR()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_appdesc_text_sp_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public final lS()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_ab_title_text_sp_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public final lT()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_endcard_ab_subtitle_text_sp_land:I

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->g(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method
