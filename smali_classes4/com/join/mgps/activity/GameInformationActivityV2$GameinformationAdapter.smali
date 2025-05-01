.class public Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "GameInformationActivityV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GameInformationActivityV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GameinformationAdapter"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameInformationActivityV2;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 6
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->getItemViewType(I)I

    move-result v0

    .line 2
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->webview:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/webkit/WebView;->getHeight()I

    return-void

    .line 5
    :cond_0
    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$o;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$o;->a:Landroid/webkit/WebView;

    iput-object p1, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    .line 6
    invoke-virtual {p1}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    new-instance v0, Landroid/webkit/WebChromeClient;

    invoke-direct {v0}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    const-string v1, "papa"

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->l0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/GameInformationBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getContent()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const-string v1, "about:blank"

    const-string v3, "text/html"

    const-string v4, "utf-8"

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->C3(Landroid/webkit/WebView;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$b;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    goto/16 :goto_0

    .line 15
    :cond_1
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->TITLE:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;

    invoke-virtual {v0, p2, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->z0(ILcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;)V

    goto/16 :goto_0

    .line 17
    :cond_2
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->commentTitle:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 18
    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$l;

    .line 19
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$l;->a:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v1}, Lcom/join/mgps/activity/GameInformationActivityV2;->m0(Lcom/join/mgps/activity/GameInformationActivityV2;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6761"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$l;->b:Landroid/widget/TextView;

    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 21
    :cond_3
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->card:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 22
    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;

    .line 23
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->j:Landroid/widget/Button;

    iput-object v0, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    .line 24
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->n0(Lcom/join/mgps/activity/GameInformationActivityV2;)V

    .line 25
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->c:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getGame_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getIco_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 27
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p2

    iget-object v0, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->h:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 28
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$d;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->i:Landroid/widget/TextView;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$e;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$f;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->f:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v1}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getDown_count()I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u70ed\u5ea6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p2, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->e:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v1}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getSize()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "M"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$k;->g:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/DetailResultBean;->getInfo()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 34
    :cond_4
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->COMMENT:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 35
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;

    invoke-virtual {v0, p2, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->A0(ILcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)V

    goto/16 :goto_0

    .line 36
    :cond_5
    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v1}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;

    invoke-static {v0, p2, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->o0(Lcom/join/mgps/activity/GameInformationActivityV2;ILcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;)V

    goto/16 :goto_0

    .line 38
    :cond_6
    sget-object p2, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->webtitle:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result p2

    if-ne v0, p2, :cond_7

    .line 39
    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;

    .line 40
    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;->a(Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->l0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/GameInformationBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInformationBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;->b(Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4f5c\u8005:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v1}, Lcom/join/mgps/activity/GameInformationActivityV2;->l0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/GameInformationBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getAuthor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;->c(Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->l0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/GameInformationBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GameInformationBean;->getRelease_time()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 43
    :cond_7
    sget-object p2, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->sendcomment:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result p2

    if-ne v0, p2, :cond_9

    .line 44
    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;

    .line 45
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;->a(Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v0

    iput-object v0, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 46
    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;->a(Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object p2

    const v0, 0x7f080f33

    invoke-virtual {p2, v0}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageResource(I)V

    .line 47
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->i0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 48
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->i0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;->a(Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->s3(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 49
    :cond_8
    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;->b(Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$g;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$g;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->webview:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_0

    .line 2
    new-instance p2, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4
    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    new-instance p1, Lcom/join/mgps/activity/GameInformationActivityV2$o;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p1, v0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$o;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p1

    .line 6
    :cond_0
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->TITLE:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 7
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0317

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 8
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 9
    :cond_1
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->commentTitle:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_2

    .line 10
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c02bf

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 11
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$l;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$l;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 12
    :cond_2
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->card:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_3

    .line 13
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0316

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 14
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$k;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$k;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 15
    :cond_3
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->COMMENT:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_4

    .line 16
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0318

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 17
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 18
    :cond_4
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_5

    .line 19
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0607

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 20
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 21
    :cond_5
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->webtitle:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_6

    .line 22
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c031a

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 23
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    .line 24
    :cond_6
    sget-object v0, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->sendcomment:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v0

    if-ne p2, v0, :cond_7

    .line 25
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c02c0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 26
    new-instance p2, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Landroid/view/View;)V

    return-object p2

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method
