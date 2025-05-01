.class public Lcom/beizi/ad/internal/view/f;
.super Ljava/lang/Object;
.source "MRAIDImplementation.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/f$a;,
        Lcom/beizi/ad/internal/view/f$b;
    }
.end annotation


# static fields
.field protected static final a:[Ljava/lang/String;


# instance fields
.field protected final b:Lcom/beizi/ad/internal/view/AdWebView;

.field c:Z

.field d:Z

.field e:I

.field f:I

.field g:I

.field h:Z

.field i:Z

.field j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:Landroid/app/Activity;

.field private o:Landroid/view/ViewGroup;

.field private p:[I

.field private q:I

.field private r:Z

.field private s:Lcom/beizi/ad/internal/view/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "default"

    const-string v1, "expanded"

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/beizi/ad/internal/view/f;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->k:Z

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->c:Z

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->d:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->h:Z

    .line 6
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->i:Z

    const/4 v1, 0x4

    new-array v1, v1, [I

    .line 7
    iput-object v1, p0, Lcom/beizi/ad/internal/view/f;->p:[I

    .line 8
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->r:Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/beizi/ad/internal/view/f;->s:Lcom/beizi/ad/internal/view/g;

    .line 10
    iput-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/beizi/ad/AdActivity$b;
    .locals 2

    .line 123
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->c:Lcom/beizi/ad/AdActivity$b;

    const-string v1, "landscape"

    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 125
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->b:Lcom/beizi/ad/AdActivity$b;

    goto :goto_0

    :cond_0
    const-string v1, "portrait"

    .line 126
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 127
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->a:Lcom/beizi/ad/AdActivity$b;

    :cond_1
    :goto_0
    return-object v0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/f;)Lcom/beizi/ad/internal/view/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/f;->s:Lcom/beizi/ad/internal/view/g;

    return-object p0
.end method

.method private a(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-string v0, "android.intent.action.EDIT"

    .line 24
    new-instance v1, Landroid/content/Intent;

    const-string v2, "sms:5555555555"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/view/f;->a(Landroid/content/Intent;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const-string v1, "sms"

    .line 25
    invoke-direct {p0, p1, v1, v2}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V

    .line 26
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v4, "tel:5555555555"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/view/f;->a(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "tel"

    .line 27
    invoke-direct {p0, p1, v1, v2}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V

    .line 28
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v1, v3, :cond_3

    :try_start_0
    const-string v1, "Y29udGVudDovL2NvbS5hbmRyb2lkLmNhbGVuZGFyL2V2ZW50cw=="

    .line 29
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/view/f;->a(Landroid/content/Intent;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "calendar"

    if-eqz v1, :cond_2

    .line 30
    :try_start_1
    invoke-direct {p0, p1, v3, v2}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V

    .line 31
    iput-boolean v2, p0, Lcom/beizi/ad/internal/view/f;->i:Z

    goto :goto_0

    .line 32
    :cond_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "vnd.android.cursor.item/event"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/f;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 33
    invoke-direct {p0, p1, v3, v2}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V

    .line 34
    iput-boolean v2, p0, Lcom/beizi/ad/internal/view/f;->i:Z

    .line 35
    sput-boolean v2, Lcom/beizi/ad/internal/utilities/W3CEvent;->useMIME:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    const-string v0, "inlineVideo"

    .line 37
    invoke-direct {p0, p1, v0, v2}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V

    return-void
.end method

.method private a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;Z)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 23
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, v0, p3

    const-string p2, "javascript:window.mraid.util.setSupports(\'%s\', %s)"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "uri"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/view/AdWebView;->b(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->c()V

    :cond_2
    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "uri"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 4
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_2
    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->getTopContext(Landroid/view/View;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 7
    sget v1, Lcom/beizi/ad/R$string;->store_picture_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 8
    sget v1, Lcom/beizi/ad/R$string;->store_picture_message:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 9
    sget v1, Lcom/beizi/ad/R$string;->store_picture_accept:I

    new-instance v2, Lcom/beizi/ad/internal/view/f$2;

    invoke-direct {v2, p0, p1}, Lcom/beizi/ad/internal/view/f$2;-><init>(Lcom/beizi/ad/internal/view/f;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 10
    sget p1, Lcom/beizi/ad/R$string;->store_picture_decline:I

    new-instance v1, Lcom/beizi/ad/internal/view/f$3;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/f$3;-><init>(Lcom/beizi/ad/internal/view/f;)V

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 11
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private e()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 2
    iget-object v3, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v3, v2}, Landroid/webkit/WebView;->getLocationOnScreen([I)V

    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    const v4, 0x1020002

    invoke-virtual {v3, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    const/4 v4, 0x1

    .line 4
    aget v5, v2, v4

    sub-int/2addr v5, v3

    aput v5, v2, v4

    .line 5
    iget-object v3, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v5}, Landroid/webkit/WebView;->measure(II)V

    .line 6
    iget-object v3, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getMeasuredWidth()I

    move-result v3

    .line 7
    iget-object v6, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v6}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result v6

    new-array v7, v1, [I

    aput v3, v7, v5

    aput v6, v7, v4

    .line 8
    invoke-static {v0, v7}, Lcom/beizi/ad/internal/utilities/ViewUtil;->convertFromPixelsToDP(Landroid/app/Activity;[I)V

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    aget v6, v2, v5

    .line 10
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    aget v2, v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v4

    aget v2, v7, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v1

    aget v1, v7, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const-string v1, "javascript:window.mraid.util.setDefaultPosition(%d, %d, %d, %d)"

    .line 11
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 13
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "uri"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 15
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->play_vide_no_uri:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 16
    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    .line 17
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :try_start_0
    const-string v1, "UTF-8"

    .line 18
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "video/mp4"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    :try_start_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    .line 21
    :catch_1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->unsupported_encoding:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 5

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 10
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->getScreenSizeAsPixels(Landroid/app/Activity;)[I

    move-result-object v1

    const/4 v2, 0x0

    .line 11
    aget v2, v1, v2

    const/4 v3, 0x1

    .line 12
    aget v1, v1, v3

    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    const v4, 0x1020002

    invoke-virtual {v3, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v1, v3

    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float v1, v1

    div-float/2addr v1, v0

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v2, v2

    div-float/2addr v2, v0

    add-float/2addr v2, v3

    float-to-int v0, v2

    .line 15
    iget-object v2, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:window.mraid.util.setMaxSize("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private f(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/W3CEvent;->createFromJSON(Ljava/lang/String;)Lcom/beizi/ad/internal/utilities/W3CEvent;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-void

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    :try_start_1
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/W3CEvent;->getInsertIntent()Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->c()V

    .line 7
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->create_calendar_event:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method private g()V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->getScreenSizeAsDP(Landroid/app/Activity;)[I

    move-result-object v0

    const/4 v1, 0x0

    .line 15
    aget v1, v0, v1

    iput v1, p0, Lcom/beizi/ad/internal/view/f;->l:I

    const/4 v1, 0x1

    .line 16
    aget v0, v0, v1

    iput v0, p0, Lcom/beizi/ad/internal/view/f;->m:I

    .line 17
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:window.mraid.util.setScreenSize("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/ad/internal/view/f;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/ad/internal/view/f;->m:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private g(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->c:Lcom/beizi/ad/AdActivity$b;

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 3
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v5, "allow_orientation_change"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 4
    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    .line 5
    :cond_1
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v5, "force_orientation"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    iget-object v0, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/f;->a(Ljava/lang/String;)Lcom/beizi/ad/AdActivity$b;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_2
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/f;->c:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-boolean v3, p1, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    if-eqz v3, :cond_4

    .line 9
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->getTopContext(Landroid/view/View;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :goto_1
    if-eqz v2, :cond_5

    .line 10
    invoke-static {p1}, Lcom/beizi/ad/AdActivity;->b(Landroid/app/Activity;)V

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    .line 11
    sget-object v3, Lcom/beizi/ad/internal/view/f$4;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x2

    if-eq v0, v1, :cond_6

    if-eq v0, v3, :cond_7

    const/4 v1, 0x0

    goto :goto_2

    :cond_6
    const/4 v1, 0x2

    .line 12
    :cond_7
    :goto_2
    invoke-static {p1, v1}, Lcom/beizi/ad/AdActivity;->a(Landroid/app/Activity;I)V

    :cond_8
    :goto_3
    return-void
.end method

.method private h(Ljava/util/ArrayList;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-string v3, "top-right"

    move-object v9, v3

    const/4 v3, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    .line 2
    :try_start_0
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "w"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 3
    iget-object v2, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 4
    :cond_1
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "h"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 5
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_0

    .line 6
    :cond_2
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "offset_x"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 7
    iget-object v1, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_0

    .line 8
    :cond_3
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "offset_y"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 9
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    move v11, v4

    goto :goto_0

    .line 10
    :cond_4
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "custom_close_position"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 11
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    move-object v9, v4

    goto :goto_0

    .line 12
    :cond_5
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "allow_offscreen"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 13
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v12
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 14
    :catch_0
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->number_format:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_6
    iget p1, p0, Lcom/beizi/ad/internal/view/f;->l:I

    if-le v2, p1, :cond_7

    iget p1, p0, Lcom/beizi/ad/internal/view/f;->m:I

    if-le v3, p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const-string v0, "javascript:mraid.util.errorEvent(\'Resize called with resizeProperties larger than the screen.\', \'mraid.resize()\')"

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    return-void

    .line 17
    :cond_7
    sget-object p1, Lcom/beizi/ad/internal/view/f$a;->b:Lcom/beizi/ad/internal/view/f$a;

    const/16 v4, 0x2d

    const/16 v5, 0x5f

    .line 18
    :try_start_1
    invoke-virtual {v9, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/beizi/ad/internal/view/f$a;->valueOf(Ljava/lang/String;)Lcom/beizi/ad/internal/view/f$a;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 19
    :catch_1
    sget-object v13, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->resize:I

    move v5, v2

    move v6, v3

    move v7, v1

    move v8, v11

    move v10, v12

    invoke-static/range {v4 .. v10}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IIIIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v4, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    move-object v9, p1

    invoke-virtual/range {v4 .. v10}, Lcom/beizi/ad/internal/view/AdWebView;->resize(IIIILcom/beizi/ad/internal/view/f$a;Z)V

    .line 21
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->c()V

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const-string v1, "javascript:window.mraid.util.stateChangeEvent(\'resized\');"

    .line 23
    invoke-virtual {p1, v1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 24
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 61
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->c:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->d:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->r:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 64
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_6

    .line 65
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_6

    .line 66
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->d()V

    goto :goto_2

    .line 68
    :cond_2
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    .line 69
    invoke-virtual {v1}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    iget v1, p0, Lcom/beizi/ad/internal/view/f;->f:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 71
    iget v1, p0, Lcom/beizi/ad/internal/view/f;->e:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 72
    iget-object v1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v1, v1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v1

    sget-object v2, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 73
    iget v1, p0, Lcom/beizi/ad/internal/view/f;->g:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_1

    :cond_3
    const/16 v1, 0x11

    .line 74
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 75
    :goto_1
    iget-object v1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->e()V

    .line 77
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const-string v1, "javascript:window.mraid.util.stateChangeEvent(\'default\');"

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->r:Z

    if-nez v0, :cond_4

    .line 79
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 80
    :cond_4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_5

    const/4 v1, -0x1

    .line 81
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_5
    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->c:Z

    .line 83
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->d:Z

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/beizi/ad/internal/view/f;->s:Lcom/beizi/ad/internal/view/g;

    :cond_6
    :goto_2
    return-void
.end method

.method a(I)V
    .locals 1

    .line 128
    iget v0, p0, Lcom/beizi/ad/internal/view/f;->q:I

    if-eq v0, p1, :cond_0

    .line 129
    iput p1, p0, Lcom/beizi/ad/internal/view/f;->q:I

    .line 130
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/f;->f()V

    .line 131
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/f;->g()V

    :cond_0
    return-void
.end method

.method a(IIII)V
    .locals 7

    .line 43
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->p:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne v2, p1, :cond_0

    aget v2, v0, v5

    if-ne v2, p2, :cond_0

    aget v2, v0, v4

    if-ne v2, p3, :cond_0

    aget v2, v0, v3

    if-ne v2, p4, :cond_0

    return-void

    .line 44
    :cond_0
    aput p1, v0, v1

    .line 45
    aput p2, v0, v5

    .line 46
    aput p3, v0, v4

    .line 47
    aput p4, v0, v3

    .line 48
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 49
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    const v6, 0x1020002

    invoke-virtual {v2, v6}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr p2, v2

    const/4 v2, 0x4

    new-array v6, v2, [I

    aput p1, v6, v1

    aput p2, v6, v5

    aput p3, v6, v4

    aput p4, v6, v3

    .line 50
    invoke-static {v0, v6}, Lcom/beizi/ad/internal/utilities/ViewUtil;->convertFromPixelsToDP(Landroid/app/Activity;[I)V

    .line 51
    aget p1, v6, v1

    .line 52
    aget p2, v6, v5

    .line 53
    aget p3, v6, v4

    .line 54
    aget p4, v6, v3

    .line 55
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    new-array v2, v2, [Ljava/lang/Object;

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    const-string p1, "javascript:window.mraid.util.setCurrentPosition(%d, %d, %d, %d)"

    .line 57
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 58
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    new-array p2, v4, [Ljava/lang/Object;

    .line 59
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v5

    const-string p3, "javascript:window.mraid.util.sizeChangeEvent(%d, %d)"

    .line 60
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/beizi/ad/internal/view/f;->n:Landroid/app/Activity;

    return-void
.end method

.method a(Landroid/view/ViewGroup;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/beizi/ad/internal/view/f;->o:Landroid/view/ViewGroup;

    return-void
.end method

.method a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->k:Z

    if-nez v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "inline"

    goto :goto_0

    :cond_0
    const-string v0, "interstitial"

    .line 4
    :goto_0
    sget-object v1, Lcom/beizi/ad/internal/view/f;->a:[Ljava/lang/String;

    sget-object v2, Lcom/beizi/ad/internal/view/f$b;->b:Lcom/beizi/ad/internal/view/f$b;

    .line 5
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    .line 6
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/f;->r:Z

    .line 7
    iget-object v2, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iput-boolean v1, v2, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:window.mraid.util.setPlacementType(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 9
    iget-boolean v1, p0, Lcom/beizi/ad/internal/view/f;->r:Z

    if-nez v1, :cond_1

    .line 10
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;)V

    .line 11
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/f;->g()V

    .line 12
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/f;->f()V

    .line 13
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/f;->e()V

    .line 14
    :cond_1
    iget-object v1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdWebView;->f()V

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:window.mraid.util.stateChangeEvent(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    const-string p2, "javascript:window.mraid.util.readyEvent();"

    .line 16
    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p1, p0, Lcom/beizi/ad/internal/view/f;->e:I

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput p1, p0, Lcom/beizi/ad/internal/view/f;->f:I

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {p1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object p1

    sget-object p2, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    iget p1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iput p1, p0, Lcom/beizi/ad/internal/view/f;->g:I

    :cond_2
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/f;->k:Z

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->g()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/view/f;->a(Z)V

    :cond_3
    return-void
.end method

.method a(Ljava/lang/String;Z)V
    .locals 10

    const-string v0, "mraid://"

    const-string v1, ""

    .line 86
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\?"

    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 88
    aget-object v3, v0, v2

    const-string v4, "/"

    invoke-virtual {v3, v4, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 89
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 90
    array-length v0, v0

    const/4 v4, 0x1

    if-le v0, v4, :cond_3

    const-string v0, "?"

    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v5, "&"

    .line 92
    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v0, v6

    const-string v8, "="

    .line 93
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 94
    array-length v8, v7

    const/4 v9, 0x2

    if-ge v8, v9, :cond_0

    goto :goto_1

    .line 95
    :cond_0
    aget-object v8, v7, v4

    invoke-static {v8}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    aget-object v8, v7, v4

    const-string v9, "undefined"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    .line 96
    :cond_1
    new-instance v8, Landroid/util/Pair;

    aget-object v9, v7, v2

    aget-object v7, v7, v4

    invoke-direct {v8, v9, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    const-string v0, "expand"

    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p2, :cond_4

    .line 98
    invoke-virtual {p0, v3}, Lcom/beizi/ad/internal/view/f;->b(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 99
    :cond_4
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    const-string v0, "close"

    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 101
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/f;->a()V

    goto/16 :goto_2

    :cond_6
    const-string v0, "resize"

    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p2, :cond_7

    .line 103
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->h(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 104
    :cond_7
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_8
    const-string v0, "setOrientationProperties"

    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 106
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->g(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 107
    :cond_9
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->i:Z

    if-eqz v0, :cond_b

    const-string v0, "createCalendarEvent"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz p2, :cond_a

    .line 108
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->f(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 109
    :cond_a
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_b
    const-string v0, "playVideo"

    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz p2, :cond_c

    .line 111
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->e(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 112
    :cond_c
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 113
    :cond_d
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->h:Z

    if-eqz v0, :cond_f

    const-string v0, "storePicture"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    if-eqz p2, :cond_e

    .line 114
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->d(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 115
    :cond_e
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_f
    const-string v0, "open"

    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz p2, :cond_10

    .line 117
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/view/f;->c(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 118
    :cond_10
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->no_user_interaction:I

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_11
    const-string p1, "setUseCustomClose"

    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 120
    invoke-virtual {p0, v3}, Lcom/beizi/ad/internal/view/f;->a(Ljava/util/ArrayList;)V

    goto :goto_2

    :cond_12
    const-string p1, "enable"

    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    return-void

    .line 122
    :cond_13
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->unsupported_mraid:I

    invoke-static {p2, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->setMRAIDUseCustomClose(Z)V

    return-void
.end method

.method a(Z)V
    .locals 3

    .line 40
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/f;->k:Z

    if-nez v0, :cond_0

    return-void

    .line 41
    :cond_0
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/f;->j:Z

    .line 42
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:window.mraid.util.setIsViewable("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    return-void
.end method

.method a(Landroid/content/Intent;)Z
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method b()V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->g()Z

    move-result v0

    .line 26
    iget-boolean v1, p0, Lcom/beizi/ad/internal/view/f;->j:Z

    if-eq v1, v0, :cond_0

    .line 27
    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/f;->a(Z)V

    :cond_0
    return-void
.end method

.method b(Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->c:Lcom/beizi/ad/AdActivity$b;

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v11, v0

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v10, 0x1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 3
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "w"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    :try_start_0
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move v6, v0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 5
    :cond_1
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "h"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    :try_start_1
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move v7, v0

    goto :goto_0

    .line 7
    :cond_2
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "useCustomClose"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 8
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    move v8, v0

    goto :goto_0

    .line 9
    :cond_3
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "url"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 10
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 11
    :cond_4
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "allow_orientation_change"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 12
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v10

    goto :goto_0

    .line 13
    :cond_5
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "force_orientation"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/f;->a(Ljava/lang/String;)Lcom/beizi/ad/AdActivity$b;

    move-result-object v0

    move-object v11, v0

    goto/16 :goto_0

    .line 15
    :cond_6
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 16
    :try_start_2
    new-instance p1, Lcom/beizi/ad/internal/view/g;

    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-direct {p1, v0, p0}, Lcom/beizi/ad/internal/view/g;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/f;)V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/f;->s:Lcom/beizi/ad/internal/view/g;

    .line 17
    invoke-virtual {p1, v4}, Lcom/beizi/ad/internal/view/AdWebView;->a(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->s:Lcom/beizi/ad/internal/view/g;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getMRAIDImplementation()Lcom/beizi/ad/internal/view/f;

    move-result-object v0

    new-instance v2, Lcom/beizi/ad/internal/view/f$1;

    invoke-direct {v2, p0, v10, v11}, Lcom/beizi/ad/internal/view/f$1;-><init>(Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V

    invoke-virtual {p1, v0, v8, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/internal/view/AdWebView$b;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 19
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception initializing the redirect webview: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 20
    :cond_7
    iget-object v5, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    move-object v9, p0

    invoke-virtual/range {v5 .. v11}, Lcom/beizi/ad/internal/view/AdWebView;->a(IIZLcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V

    .line 21
    :goto_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const-string v0, "javascript:window.mraid.util.stateChangeEvent(\'expanded\');"

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/view/AdWebView;->c(Ljava/lang/String;)V

    .line 22
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/f;->c:Z

    .line 23
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result p1

    if-nez p1, :cond_8

    .line 24
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/b;->c()V

    :cond_8
    return-void
.end method

.method c()Landroid/app/Activity;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->n:Landroid/app/Activity;

    return-object v0
.end method

.method d()Landroid/view/ViewGroup;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f;->o:Landroid/view/ViewGroup;

    return-object v0
.end method
