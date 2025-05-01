.class public final Lcom/kwad/components/core/page/c/a/e;
.super Lcom/kwad/components/core/page/c/a/a;
.source "SourceFile"


# instance fields
.field private OC:Landroid/widget/LinearLayout;

.field private OD:Landroid/widget/TextView;

.field private OE:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/e;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/e;->OC:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private pZ()V
    .locals 3

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_tip_bar:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OC:Landroid/widget/LinearLayout;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mPageTitle:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OC:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_tip_bar_textview:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OD:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_tip_close_btn:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OE:Landroid/widget/ImageView;

    .line 6
    new-instance v2, Lcom/kwad/components/core/page/c/a/e$1;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/page/c/a/e$1;-><init>(Lcom/kwad/components/core/page/c/a/e;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bx(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bt(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_1

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/e;->OC:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/e;->OD:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OD:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/e;->OC:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/e;->qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/c/a/b;->a(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)V

    return-void
.end method

.method private qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/c/a/e$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/e$2;-><init>(Lcom/kwad/components/core/page/c/a/e;)V

    return-object v0
.end method


# virtual methods
.method public final aj()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/a/a;->aj()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/e;->pZ()V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method
