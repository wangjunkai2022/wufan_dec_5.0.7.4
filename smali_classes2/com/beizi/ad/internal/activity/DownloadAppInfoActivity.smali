.class public Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;
.super Landroid/app/Activity;
.source "DownloadAppInfoActivity.java"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:I

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/widget/ScrollView;

.field private r:Landroid/widget/ScrollView;

.field private s:Landroid/widget/ScrollView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Lcom/beizi/ad/internal/download/BeiZiWebView;

.field private x:Lcom/beizi/ad/internal/download/BeiZiWebView;

.field private y:Lcom/beizi/ad/internal/download/BeiZiWebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->l:I

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->m:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->n:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->o:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->p:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 1

    .line 2
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_back:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a:Landroid/widget/ImageView;

    .line 3
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_title:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->b:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_permission_layout:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->c:Landroid/widget/LinearLayout;

    .line 5
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_permission_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->f:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_permission_below_line:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->i:Landroid/view/View;

    .line 7
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_privacy_layout:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->d:Landroid/widget/LinearLayout;

    .line 8
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_privacy_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->g:Landroid/widget/TextView;

    .line 9
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_privacy_below_line:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->j:Landroid/view/View;

    .line 10
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_intro_layout:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->e:Landroid/widget/LinearLayout;

    .line 11
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_intro_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->h:Landroid/widget/TextView;

    .line 12
    sget v0, Lcom/beizi/ad/R$id;->beizi_appinfo_intro_below_line:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->k:Landroid/view/View;

    .line 13
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_persmission_content_scrollview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->q:Landroid/widget/ScrollView;

    .line 14
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_persmission_content_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->t:Landroid/widget/TextView;

    .line 15
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_persmission_content_webview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/download/BeiZiWebView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->w:Lcom/beizi/ad/internal/download/BeiZiWebView;

    .line 16
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_privacy_content_scrollview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->r:Landroid/widget/ScrollView;

    .line 17
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_privacy_content_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->u:Landroid/widget/TextView;

    .line 18
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_privacy_content_webview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/download/BeiZiWebView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->x:Lcom/beizi/ad/internal/download/BeiZiWebView;

    .line 19
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_intro_content_scrollview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->s:Landroid/widget/ScrollView;

    .line 20
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_intro_content_textview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->v:Landroid/widget/TextView;

    .line 21
    sget v0, Lcom/beizi/ad/R$id;->beizi_download_appinfo_intro_content_webview:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/download/BeiZiWebView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->y:Lcom/beizi/ad/internal/download/BeiZiWebView;

    return-void
.end method

.method private a(I)V
    .locals 7

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 22
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->d()V

    .line 23
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->h:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->k:Landroid/view/View;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->o:Ljava/lang/String;

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->v:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->s:Landroid/widget/ScrollView;

    iget-object v6, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->y:Lcom/beizi/ad/internal/download/BeiZiWebView;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a(Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ScrollView;Landroid/webkit/WebView;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 24
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->d()V

    .line 25
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->j:Landroid/view/View;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->u:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->r:Landroid/widget/ScrollView;

    iget-object v6, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->x:Lcom/beizi/ad/internal/download/BeiZiWebView;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a(Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ScrollView;Landroid/webkit/WebView;)V

    goto :goto_0

    .line 26
    :cond_1
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->d()V

    .line 27
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->i:Landroid/view/View;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->m:Ljava/lang/String;

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->t:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->q:Landroid/widget/ScrollView;

    iget-object v6, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->w:Lcom/beizi/ad/internal/download/BeiZiWebView;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a(Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ScrollView;Landroid/webkit/WebView;)V

    :goto_0
    return-void
.end method

.method private a(Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ScrollView;Landroid/webkit/WebView;)V
    .locals 2

    .line 28
    sget v0, Lcom/beizi/ad/R$color;->appinfo_tab_selected_color:I

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 p1, 0x0

    .line 30
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    const-string p2, "http"

    .line 31
    invoke-virtual {p3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const/16 v0, 0x8

    if-eqz p2, :cond_0

    const-string p2, ""

    .line 32
    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-virtual {p5, v0}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 34
    invoke-virtual {p6, p1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 35
    invoke-virtual {p6, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 38
    invoke-virtual {p5, p1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 39
    invoke-virtual {p6, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a(I)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "privacy_content_key"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->n:Ljava/lang/String;

    const-string v1, "title_content_key"

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->p:Ljava/lang/String;

    const-string v1, "permission_content_key"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->m:Ljava/lang/String;

    const-string v1, "intro_content_key"

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->o:Ljava/lang/String;

    const-string v1, "from_position_key"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->l:I

    return-void
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a:Landroid/widget/ImageView;

    new-instance v1, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$1;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$1;-><init>(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->c:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$2;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$2;-><init>(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->d:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$3;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$3;-><init>(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->e:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$4;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$4;-><init>(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/beizi/ad/R$color;->appinfo_tab_unselected_color:I

    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->k:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->f:Landroid/widget/TextView;

    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->g:Landroid/widget/TextView;

    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->j:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->s:Landroid/widget/ScrollView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->y:Lcom/beizi/ad/internal/download/BeiZiWebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->q:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->w:Lcom/beizi/ad/internal/download/BeiZiWebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->r:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->x:Lcom/beizi/ad/internal/download/BeiZiWebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->b()V

    .line 3
    sget p1, Lcom/beizi/ad/R$layout;->beizi_download_appinfo_activity:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 4
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a()V

    .line 5
    iget p1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->l:I

    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->a(I)V

    .line 6
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->c()V

    return-void
.end method
