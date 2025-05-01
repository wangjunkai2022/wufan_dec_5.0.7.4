.class public Lcom/join/mgps/dialog/o2;
.super Landroid/app/Dialog;
.source "UserPermissDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dialog/o2$h;,
        Lcom/join/mgps/dialog/o2$g;
    }
.end annotation


# instance fields
.field b:Landroid/app/Activity;

.field c:Landroid/widget/TextView;

.field d:Landroid/webkit/WebView;

.field e:Ljava/lang/String;

.field f:I

.field g:Lcom/join/mgps/dialog/o2$g;

.field h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/Activity;ILjava/lang/String;Lcom/join/mgps/dialog/o2$g;)V
    .locals 1

    const v0, 0x7f110191

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/o2$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/o2$e;-><init>(Lcom/join/mgps/dialog/o2;)V

    iput-object v0, p0, Lcom/join/mgps/dialog/o2;->h:Landroid/os/Handler;

    .line 3
    iput-object p1, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    .line 4
    iput-object p3, p0, Lcom/join/mgps/dialog/o2;->e:Ljava/lang/String;

    .line 5
    iput p2, p0, Lcom/join/mgps/dialog/o2;->f:I

    .line 6
    iput-object p4, p0, Lcom/join/mgps/dialog/o2;->g:Lcom/join/mgps/dialog/o2$g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/o2$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/o2$f;-><init>(Lcom/join/mgps/dialog/o2;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Lcom/join/mgps/dialog/o2;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/dialogxieyi1.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/dialogxieyi2.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/o2;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget p1, p0, Lcom/join/mgps/dialog/o2;->f:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->showPrivacyProtocol:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->showDisagreePrivacyProtocol:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 5
    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 p1, -0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01da

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-static {v2}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    iget-object v4, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-virtual {v2, v4}, Lcom/join/android/app/common/utils/n;->B(Landroid/app/Activity;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setMinimumWidth(I)V

    const v2, 0x7f09086a

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    iput-object v2, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    const v2, 0x7f09145c

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v2, 0x7f09041e

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v4, 0x7f090425

    .line 14
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f09041c

    .line 15
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ScrollView;

    .line 16
    invoke-virtual {v5}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 17
    iget v7, p0, Lcom/join/mgps/dialog/o2;->f:I

    if-ne v7, v0, :cond_1

    .line 18
    iget-object v7, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f071420

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    goto :goto_1

    .line 19
    :cond_1
    iget-object v7, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0712bc

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 20
    :goto_1
    invoke-virtual {v5, v6}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5, p1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 22
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    new-instance v6, Lcom/join/mgps/dialog/o2$h;

    iget-object v7, p0, Lcom/join/mgps/dialog/o2;->b:Landroid/app/Activity;

    invoke-direct {v6, p0, v7}, Lcom/join/mgps/dialog/o2$h;-><init>(Lcom/join/mgps/dialog/o2;Landroid/content/Context;)V

    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 23
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 24
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 25
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, p1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 26
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5, p1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 27
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5, p1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 28
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5, p1, v3}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 29
    iget-object v5, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v5}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    .line 30
    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 31
    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 32
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v6, v7, :cond_2

    .line 33
    invoke-virtual {v5, p1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_2
    const/16 v5, 0x13

    if-lt v6, v5, :cond_3

    :try_start_0
    const-string v5, "android.webkit.WebView"

    .line 34
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "setWebContentsDebuggingEnabled"

    new-array v7, v0, [Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, p1

    .line 35
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 36
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v6, v0, [Ljava/lang/Object;

    .line 37
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v7, v6, p1

    invoke-virtual {v5, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    .line 38
    :cond_3
    :goto_2
    iget-object v3, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 39
    iget-object v3, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setDrawingCacheEnabled(Z)V

    .line 40
    iget-object v3, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    invoke-virtual {v3, p1}, Landroid/webkit/WebView;->setScrollBarStyle(I)V

    .line 41
    iget-object p1, p0, Lcom/join/mgps/dialog/o2;->d:Landroid/webkit/WebView;

    new-instance v3, Lcom/join/mgps/dialog/o2$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/dialog/o2$a;-><init>(Lcom/join/mgps/dialog/o2;)V

    invoke-virtual {p1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 42
    iget p1, p0, Lcom/join/mgps/dialog/o2;->f:I

    if-ne p1, v0, :cond_4

    const-string p1, "\u4e0d\u540c\u610f"

    .line 43
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p1, "\u540c\u610f"

    .line 44
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_4
    const-string p1, "\u9000\u51fa\u5e94\u7528"

    .line 45
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p1, "\u6211\u518d\u60f3\u60f3"

    .line 46
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :goto_3
    new-instance p1, Lcom/join/mgps/dialog/o2$b;

    invoke-direct {p1, p0}, Lcom/join/mgps/dialog/o2$b;-><init>(Lcom/join/mgps/dialog/o2;)V

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    new-instance p1, Lcom/join/mgps/dialog/o2$c;

    invoke-direct {p1, p0}, Lcom/join/mgps/dialog/o2$c;-><init>(Lcom/join/mgps/dialog/o2;)V

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    new-instance p1, Lcom/join/mgps/dialog/o2$d;

    invoke-direct {p1, p0}, Lcom/join/mgps/dialog/o2$d;-><init>(Lcom/join/mgps/dialog/o2;)V

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 50
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public show()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dialog/o2;->a()V

    return-void
.end method
