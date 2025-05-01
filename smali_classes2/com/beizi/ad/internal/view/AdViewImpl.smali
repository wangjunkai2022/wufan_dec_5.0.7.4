.class public abstract Lcom/beizi/ad/internal/view/AdViewImpl;
.super Landroid/widget/FrameLayout;
.source "AdViewImpl.java"

# interfaces
.implements Lcom/beizi/ad/AdLifeControl;
.implements Lcom/beizi/ad/internal/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/AdViewImpl$a;,
        Lcom/beizi/ad/internal/view/AdViewImpl$b;,
        Lcom/beizi/ad/internal/view/AdViewImpl$c;
    }
.end annotation


# static fields
.field private static T:Landroid/widget/FrameLayout;

.field private static U:Lcom/beizi/ad/internal/view/f;

.field private static V:Lcom/beizi/ad/internal/view/AdWebView$b;


# instance fields
.field private A:Landroidx/appcompat/widget/AppCompatTextView;

.field private B:Landroid/widget/ImageView;

.field private C:Landroid/os/CountDownTimer;

.field private D:Landroidx/appcompat/widget/AppCompatImageView;

.field private E:J

.field private F:Landroid/view/GestureDetector;

.field private G:F

.field private H:F

.field private I:F

.field private J:F

.field private K:Landroid/widget/FrameLayout;

.field private L:Landroid/widget/FrameLayout;

.field private M:Ljava/lang/String;

.field private N:Ljava/lang/String;

.field private O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field private Q:Ljava/lang/String;

.field private R:Lcom/beizi/ad/internal/view/AdWebView;

.field private S:Z

.field protected a:Landroid/view/ViewGroup;

.field protected b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

.field public bottomPadding:I

.field protected c:Lcom/beizi/ad/internal/view/c;

.field public clickCount:I

.field protected d:Z

.field protected e:Z

.field protected f:Z

.field protected g:Z

.field protected h:Lcom/beizi/ad/internal/d;

.field protected i:Lcom/beizi/ad/internal/network/a$a;

.field protected j:Z

.field protected k:Z

.field l:I

.field public leftPadding:I

.field public loadCount:I

.field private m:Landroid/view/View;

.field public mAdFetcher:Lcom/beizi/ad/internal/c;

.field private n:I

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Lcom/beizi/ad/AdListener;

.field private r:Lcom/beizi/ad/RewardedVideoAdListener;

.field public rightPadding:I

.field private s:Lcom/beizi/ad/AppEventListener;

.field public serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

.field private t:Lcom/beizi/ad/internal/view/AdViewImpl$c;

.field public topPadding:I

.field private final u:Landroid/os/Handler;

.field private v:Lcom/beizi/ad/internal/view/AdViewImpl$b;

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, v0}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 26
    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    .line 27
    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->m:Landroid/view/View;

    const-string v0, ""

    .line 28
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->p:Ljava/lang/String;

    .line 29
    new-instance v0, Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-direct {v0}, Lcom/beizi/ad/internal/view/AdViewImpl$a;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    .line 30
    new-instance v0, Lcom/beizi/ad/internal/view/AdViewImpl$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl$1;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->u:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    .line 32
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->e:Z

    .line 33
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->f:Z

    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    .line 35
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->w:Z

    .line 36
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->x:Z

    .line 37
    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 38
    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    .line 39
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->y:Z

    .line 40
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    .line 41
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->k:Z

    .line 42
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    .line 43
    iput v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    .line 44
    invoke-virtual {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->m:Landroid/view/View;

    const-string v2, ""

    .line 5
    iput-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->p:Ljava/lang/String;

    .line 6
    new-instance v2, Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-direct {v2}, Lcom/beizi/ad/internal/view/AdViewImpl$a;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    .line 7
    new-instance v2, Lcom/beizi/ad/internal/view/AdViewImpl$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/beizi/ad/internal/view/AdViewImpl$1;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->u:Landroid/os/Handler;

    .line 8
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    .line 9
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->e:Z

    .line 10
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->f:Z

    const/4 v2, 0x1

    .line 11
    iput-boolean v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    .line 12
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->w:Z

    .line 13
    iput-boolean v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->x:Z

    .line 14
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 15
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    .line 16
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->y:Z

    .line 17
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    .line 18
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->k:Z

    .line 19
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    .line 20
    iput v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    .line 21
    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    .line 22
    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->m:Landroid/view/View;

    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdViewImpl;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->G:F

    return p1
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdViewImpl;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->E:J

    return-wide p1
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/internal/view/AdWebView;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    return-object p0
.end method

.method private a(II)V
    .locals 2

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    .line 46
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 47
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v0, :cond_0

    .line 48
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 49
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v0, :cond_1

    .line 50
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 51
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->w:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_3

    .line 52
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v1, :cond_2

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 56
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez p1, :cond_3

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_3
    return-void
.end method

.method private a(Landroid/webkit/WebView;Landroid/content/Context;)V
    .locals 3

    .line 22
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object v0

    .line 23
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    .line 24
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v0, "ACTIVITY_TYPE"

    const-string v2, "BROWSER"

    .line 25
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    sget-object v0, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 27
    :try_start_0
    invoke-virtual {p2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 28
    :catch_0
    sget-object p1, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdViewImpl;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    return p1
.end method

.method static synthetic b(Lcom/beizi/ad/internal/view/AdViewImpl;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->H:F

    return p1
.end method

.method static synthetic b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    return-object p0
.end method

.method static synthetic c(Lcom/beizi/ad/internal/view/AdViewImpl;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->I:F

    return p1
.end method

.method static synthetic c(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->g()V

    return-void
.end method

.method static synthetic d(Lcom/beizi/ad/internal/view/AdViewImpl;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->J:F

    return p1
.end method

.method static synthetic d(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->D:Landroidx/appcompat/widget/AppCompatImageView;

    return-object p0
.end method

.method static synthetic e(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    return-object p0
.end method

.method static synthetic f(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    return-object p0
.end method

.method static synthetic g(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    return-object p0
.end method

.method private g()V
    .locals 4

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Landroid/webkit/WebView;

    new-instance v2, Landroid/content/MutableContextWrapper;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->setWebViewSettings(Landroid/webkit/WebView;)V

    const-string v2, "aHR0cDovL3Nka2RvYy5iZWl6aS5iaXovIy96aC1jbi9ndWlkZS9Vc2VQcml2YWN5"

    .line 5
    invoke-static {v2}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 7
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 8
    :cond_1
    invoke-direct {p0, v1, v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/webkit/WebView;Landroid/content/Context;)V

    return-void
.end method

.method public static getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->T:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public static getMRAIDFullscreenImplementation()Lcom/beizi/ad/internal/view/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->U:Lcom/beizi/ad/internal/view/f;

    return-object v0
.end method

.method public static getMRAIDFullscreenListener()Lcom/beizi/ad/internal/view/AdWebView$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->V:Lcom/beizi/ad/internal/view/AdWebView$b;

    return-object v0
.end method

.method private h()V
    .locals 5

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/beizi/ad/internal/network/ServerResponse;->isVideo()Z

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/network/ServerResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/network/ServerResponse;->getVideoUrl()Ljava/lang/String;

    move-result-object v1

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x3

    if-nez v0, :cond_4

    .line 6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0, v3}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    :cond_1
    return-void

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    .line 11
    invoke-virtual {v0}, Lcom/beizi/ad/AdListener;->onAdLoaded()V

    :cond_3
    return-void

    .line 12
    :cond_4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {v0, v3}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    :cond_5
    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->with()Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lcom/beizi/ad/internal/view/AdViewImpl$13;

    invoke-direct {v3, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$13;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->getCacheVideo(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method static synthetic h(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->h()V

    return-void
.end method

.method static synthetic i(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/RewardedVideoAdListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->r:Lcom/beizi/ad/RewardedVideoAdListener;

    return-object p0
.end method

.method static synthetic j(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AppEventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->s:Lcom/beizi/ad/AppEventListener;

    return-object p0
.end method

.method public static setMRAIDFullscreenContainer(Landroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/beizi/ad/internal/view/AdViewImpl;->T:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static setMRAIDFullscreenImplementation(Lcom/beizi/ad/internal/view/f;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/beizi/ad/internal/view/AdViewImpl;->U:Lcom/beizi/ad/internal/view/f;

    return-void
.end method

.method public static setMRAIDFullscreenListener(Lcom/beizi/ad/internal/view/AdWebView$b;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/beizi/ad/internal/view/AdViewImpl;->V:Lcom/beizi/ad/internal/view/AdWebView$b;

    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)Landroid/content/Context;
    .locals 1

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/content/MutableContextWrapper;

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/content/MutableContextWrapper;

    invoke-virtual {p1}, Landroid/content/MutableContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    return-object p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method a(IIIILcom/beizi/ad/internal/view/f$a;ZLcom/beizi/ad/internal/view/f;)V
    .locals 1

    .line 90
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(II)V

    .line 91
    iget-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p3}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 92
    iget p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    if-gtz p3, :cond_0

    .line 93
    iget-object p3, p7, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42480000    # 50.0f

    mul-float p3, p3, p4

    float-to-int p3, p3

    .line 94
    iput p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    .line 95
    :cond_0
    new-instance p3, Lcom/beizi/ad/internal/view/AdViewImpl$10;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p0, p4, p7}, Lcom/beizi/ad/internal/view/AdViewImpl$10;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Landroid/content/Context;Lcom/beizi/ad/internal/view/f;)V

    iput-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 96
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    iget p4, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    const/16 p6, 0x11

    invoke-direct {p3, p4, p4, p6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    const/4 p4, 0x2

    .line 97
    div-int/2addr p2, p4

    iget p6, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->l:I

    div-int/lit8 v0, p6, 0x2

    sub-int/2addr p2, v0

    .line 98
    div-int/2addr p1, p4

    div-int/2addr p6, p4

    sub-int/2addr p1, p6

    .line 99
    sget-object p6, Lcom/beizi/ad/internal/view/AdViewImpl$14;->a:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p5, p6, p5

    const/4 p6, 0x1

    if-eq p5, p6, :cond_6

    if-eq p5, p4, :cond_5

    const/4 p4, 0x3

    if-eq p5, p4, :cond_4

    const/4 p4, 0x5

    if-eq p5, p4, :cond_3

    const/4 p4, 0x6

    if-eq p5, p4, :cond_2

    const/4 p4, 0x7

    if-eq p5, p4, :cond_1

    goto :goto_0

    .line 100
    :cond_1
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 101
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 102
    :cond_2
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 103
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 104
    :cond_3
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 105
    :cond_4
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 106
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_0

    .line 107
    :cond_5
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 108
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_0

    .line 109
    :cond_6
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 110
    :goto_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 112
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance p2, Lcom/beizi/ad/internal/view/AdViewImpl$11;

    invoke-direct {p2, p0, p7}, Lcom/beizi/ad/internal/view/AdViewImpl$11;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/f;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iget-object p1, p7, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 114
    iget-object p1, p7, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_7
    return-void
.end method

.method protected a(IILcom/beizi/ad/internal/view/f;)V
    .locals 4

    .line 29
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 31
    iget-object v1, p3, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-boolean v2, v1, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 32
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 33
    invoke-virtual {p3}, Lcom/beizi/ad/internal/view/f;->d()Landroid/view/ViewGroup;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 34
    invoke-virtual {p3}, Lcom/beizi/ad/internal/view/f;->d()Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p3, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 35
    :cond_0
    invoke-virtual {p3}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 36
    invoke-virtual {p3}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 37
    :cond_1
    invoke-interface {p0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v1

    sget-object v2, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p3, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_2

    .line 38
    iget-object p3, p3, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p3

    check-cast p3, Landroid/content/MutableContextWrapper;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 39
    :cond_2
    sput-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->T:Landroid/widget/FrameLayout;

    .line 40
    sput-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->U:Lcom/beizi/ad/internal/view/f;

    .line 41
    sput-object v0, Lcom/beizi/ad/internal/view/AdViewImpl;->V:Lcom/beizi/ad/internal/view/AdWebView$b;

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(II)V

    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->f:Z

    .line 44
    iput-boolean v3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->e:Z

    return-void
.end method

.method a(IIZLcom/beizi/ad/internal/view/f;Lcom/beizi/ad/internal/view/AdWebView$b;)V
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(II)V

    .line 78
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCloseButton(Landroid/content/Context;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 80
    iget-object p2, p4, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-boolean p2, p2, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 81
    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v0

    .line 83
    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    sub-int/2addr v0, p2

    div-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 84
    :cond_0
    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance p2, Lcom/beizi/ad/internal/view/AdViewImpl$9;

    invoke-direct {p2, p0, p4}, Lcom/beizi/ad/internal/view/AdViewImpl$9;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/f;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    iget-object p1, p4, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-boolean p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    if-eqz p1, :cond_1

    .line 87
    invoke-virtual {p0, p4, p3, p5}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/internal/view/AdWebView$b;)V

    goto :goto_0

    .line 88
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :goto_0
    const/4 p1, 0x1

    .line 89
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->e:Z

    return-void
.end method

.method a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 6
    new-instance v1, Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->u:Landroid/os/Handler;

    invoke-direct {v1, p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl$b;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->v:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    .line 7
    new-instance v1, Lcom/beizi/ad/internal/d;

    invoke-static {}, Lcom/beizi/ad/internal/utilities/StringUtil;->createRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/beizi/ad/internal/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 8
    new-instance v1, Landroid/view/GestureDetector;

    new-instance v2, Lcom/beizi/ad/internal/view/AdViewImpl$12;

    invoke-direct {v2, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$12;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-direct {v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->F:Landroid/view/GestureDetector;

    .line 9
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->setErrorContext(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    :goto_0
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->appid:I

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/ad/internal/g;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 13
    new-instance v0, Lcom/beizi/ad/internal/c;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/c;-><init>(Lcom/beizi/ad/internal/a;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    :cond_0
    :try_start_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object p1

    const-string p2, "urlTemplate"

    const-string v0, "aHR0cHM6Ly9hcGkuaHRwLmFkLXNjb3BlLmNvbS5jbi9tYi9zZGsvZXZlbnQvdjE/ZXh0SW5mbz13QkxRZVA4Ym1xNkF1SjVEYVp5YzV4UVFVXzkyT1drU1VkeV82VjRuMlJBM01iZ2VodzZKNjdaZndjRFFDbWozdVR5aENrclQ4bk1Bc1EmcmVxdWVzdFV1aWQ9X19SRVFVRVNUVVVJRF9fJmV2ZW50VHlwZT1fX0VWRU5UVFlQRV9fJmFwcElEPV9fQVBQSURfXyZzcGFjZUlEPV9fU1BBQ0VJRF9fJmNoYW5uZWxJRD1fX0NIQU5ORUxJRF9fJmNoYW5uZWxBcHBJRD1fX0NIQU5ORUxBUFBJRF9fJmNoYW5uZWxTcGFjZUlEPV9fQ0hBTk5FTFNQQUNFSURfXyZ0cz1fX1RTX18maXA9X19JUF9fJm5ldFR5cGU9X19ORVRUWVBFX18mY2Fycmllcj1fX0NBUlJJRVJfXyZlcnJJbmZvPV9fRVJSSU5GT19fJnNka0V4dEluZm89X19TREtFWFRJTkZPX18maW1laT1fX0lNRUlfXyZhbmRyb2lkSUQ9X19BTkRST0lESURfXyZpZGZhPV9fSURGQV9fJmlkZnY9X19JREZWX18mbWFjPV9fTUFDX18mdWlkPV9fVUlEX18mc2RrVmVyc2lvbj1fX1NES1ZFUlNJT05fXyZhcHBWZXJpc29uPV9fQVBQVkVSU0lPTl9f"

    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/beizi/ad/internal/utilities/SPUtils;->get(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->P:Ljava/lang/String;

    .line 16
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object p1

    const-string p2, "eventsList"

    const-string v0, "[1, 2, 3, 4, 5, 6]"

    invoke-static {p1, p2, v0}, Lcom/beizi/ad/internal/utilities/SPUtils;->get(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->Q:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method protected abstract a(Lcom/beizi/ad/internal/a/e;)V
.end method

.method protected abstract a(Lcom/beizi/ad/internal/view/c;)V
.end method

.method protected a(Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/internal/view/AdWebView$b;)V
    .locals 2

    .line 58
    iget-object p2, p1, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/f;->a(Landroid/view/ViewGroup;)V

    .line 59
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 60
    iget-object v0, p1, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 61
    iget-object v0, p1, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 62
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCloseButton(Landroid/content/Context;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    new-instance v1, Lcom/beizi/ad/internal/view/AdViewImpl$8;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl$8;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/f;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 66
    sput-object p2, Lcom/beizi/ad/internal/view/AdViewImpl;->T:Landroid/widget/FrameLayout;

    .line 67
    sput-object p1, Lcom/beizi/ad/internal/view/AdViewImpl;->U:Lcom/beizi/ad/internal/view/f;

    .line 68
    sput-object p3, Lcom/beizi/ad/internal/view/AdViewImpl;->V:Lcom/beizi/ad/internal/view/AdWebView$b;

    .line 69
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object p1

    .line 70
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "ACTIVITY_TYPE"

    const-string v0, "MRAID"

    .line 71
    invoke-virtual {p2, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 73
    :catch_0
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget p3, Lcom/beizi/ad/R$string;->adactivity_missing:I

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 74
    sput-object p1, Lcom/beizi/ad/internal/view/AdViewImpl;->T:Landroid/widget/FrameLayout;

    .line 75
    sput-object p1, Lcom/beizi/ad/internal/view/AdViewImpl;->U:Lcom/beizi/ad/internal/view/f;

    .line 76
    sput-object p1, Lcom/beizi/ad/internal/view/AdViewImpl;->V:Lcom/beizi/ad/internal/view/AdWebView$b;

    :goto_0
    return-void
.end method

.method a()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->e:Z

    return v0
.end method

.method public abstract activityOnDestroy()V
.end method

.method public abstract activityOnPause()V
.end method

.method public abstract activityOnResume()V
.end method

.method public addBannerCloseBtn()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->B:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createImageCloseButton(Landroid/content/Context;)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->B:Landroid/widget/ImageView;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->B:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->B:Landroid/widget/ImageView;

    new-instance v1, Lcom/beizi/ad/internal/view/AdViewImpl$21;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$21;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public addCloseButton(IIILandroid/view/View;Z)V
    .locals 12

    move-object v9, p0

    move v6, p1

    move v7, p2

    move v8, p3

    .line 1
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->leftPadding:I

    iget v2, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->topPadding:I

    iget v3, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->rightPadding:I

    iget v4, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->bottomPadding:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCloseButton(Landroid/content/Context;IIII)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v10, 0x0

    const/4 v11, -0x1

    if-eq v8, v11, :cond_3

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v2, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->leftPadding:I

    iget v3, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->topPadding:I

    iget v4, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->rightPadding:I

    iget v5, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->bottomPadding:I

    move v1, p3

    invoke-static/range {v0 .. v5}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCountDown(Landroid/content/Context;IIIII)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    if-lez v7, :cond_1

    sub-int v0, v8, v7

    .line 7
    iget-object v1, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setEnabled(Z)V

    move v6, v0

    goto :goto_0

    :cond_1
    if-ne v7, v11, :cond_2

    .line 8
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    const/4 v6, 0x0

    .line 9
    :goto_0
    new-instance v10, Lcom/beizi/ad/internal/view/AdViewImpl$4;

    mul-int/lit16 v0, v8, 0x3e8

    int-to-long v2, v0

    const-wide/16 v4, 0x32

    move-object v0, v10

    move-object v1, p0

    move/from16 v7, p5

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v8}, Lcom/beizi/ad/internal/view/AdViewImpl$4;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJIZLandroid/view/View;)V

    iput-object v10, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 10
    invoke-virtual {v10}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    goto :goto_1

    :cond_3
    if-eq v7, v11, :cond_7

    if-eq v6, v11, :cond_7

    .line 11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v2, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->leftPadding:I

    iget v3, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->topPadding:I

    iget v4, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->rightPadding:I

    iget v5, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->bottomPadding:I

    move v1, p1

    invoke-static/range {v0 .. v5}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCountDown(Landroid/content/Context;IIIII)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    if-lez v7, :cond_4

    .line 12
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setEnabled(Z)V

    sub-int v0, v6, v7

    move v10, v0

    .line 13
    :cond_4
    new-instance v7, Lcom/beizi/ad/internal/view/AdViewImpl$5;

    mul-int/lit16 v0, v6, 0x3e8

    int-to-long v2, v0

    const-wide/16 v4, 0x32

    move-object v0, v7

    move-object v1, p0

    move v6, v10

    invoke-direct/range {v0 .. v6}, Lcom/beizi/ad/internal/view/AdViewImpl$5;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJI)V

    iput-object v7, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 14
    invoke-virtual {v7}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 15
    :goto_1
    iget-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v1, Lcom/beizi/ad/internal/view/AdViewImpl$7;

    move-object/from16 v7, p4

    move/from16 v2, p5

    invoke-direct {v1, p0, v2, v7}, Lcom/beizi/ad/internal/view/AdViewImpl$7;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;ZLandroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 17
    :goto_2
    instance-of v1, v0, Landroid/widget/FrameLayout;

    if-eqz v1, :cond_6

    .line 18
    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v1, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 19
    iget-object v1, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_6
    return-void

    :cond_7
    move-object/from16 v7, p4

    if-eq v6, v11, :cond_9

    .line 20
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v2, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->leftPadding:I

    iget v3, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->topPadding:I

    iget v4, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->rightPadding:I

    iget v5, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->bottomPadding:I

    move v1, p1

    invoke-static/range {v0 .. v5}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createCountDown(Landroid/content/Context;IIIII)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 21
    new-instance v8, Lcom/beizi/ad/internal/view/AdViewImpl$6;

    mul-int/lit16 v0, v6, 0x3e8

    int-to-long v2, v0

    const-wide/16 v4, 0x32

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/internal/view/AdViewImpl$6;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJ)V

    iput-object v8, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 22
    invoke-virtual {v8}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 23
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 24
    :goto_3
    instance-of v1, v0, Landroid/widget/FrameLayout;

    if-eqz v1, :cond_9

    .line 25
    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v1, v9, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_9
    return-void
.end method

.method public addDownloadTextView(Landroid/view/View;)V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getInteractType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x5

    if-ne v0, v2, :cond_4

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getApkName()Ljava/lang/String;

    move-result-object v4

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppDeveloper()Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppPermissionsUrl()Ljava/lang/String;

    move-result-object v3

    .line 7
    iget-object v5, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v5}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppPermissionsDesc()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    move-object v6, v3

    goto :goto_0

    :cond_2
    move-object v6, v5

    .line 9
    :goto_0
    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppPrivacyUrl()Ljava/lang/String;

    move-result-object v5

    .line 10
    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/network/ServerResponse;->getAppintro()Ljava/lang/String;

    move-result-object v7

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u5e94\u7528\u540d\u79f0\uff1a"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " | \u5f00\u53d1\u8005\uff1a"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " | \u5e94\u7528\u7248\u672c\uff1a"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " | <u>\u6743\u9650\u8be6\u60c5</u> | <u>\u9690\u79c1\u534f\u8bae</u> | <u>\u529f\u80fd\u4ecb\u7ecd</u>"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 13
    new-instance v8, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v8, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 14
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, 0x40c00000    # 6.0f

    .line 15
    invoke-virtual {v8, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    const-string v0, "#999999"

    .line 16
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v0, "#333333"

    .line 17
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v8, v2, v2, v2, v0}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    const/16 v0, 0xa

    .line 18
    invoke-virtual {v8, v0, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 19
    new-instance v0, Lcom/beizi/ad/internal/view/AdViewImpl$17;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/beizi/ad/internal/view/AdViewImpl$17;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/lance/a/p;->g(Landroid/content/Context;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    .line 21
    instance-of v1, p1, Landroid/widget/FrameLayout;

    if-eqz v1, :cond_4

    .line 22
    check-cast p1, Landroid/widget/FrameLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    const/16 v3, 0x53

    invoke-direct {v1, v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v8, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method public addInterstitialCloseButton(IILandroid/view/View;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createInterstitialCountDown(Landroid/content/Context;I)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x0

    if-lez p1, :cond_0

    sub-int v0, p2, p1

    move v7, v0

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 3
    :goto_0
    new-instance p1, Lcom/beizi/ad/internal/view/AdViewImpl$19;

    mul-int/lit16 p2, p2, 0x3e8

    int-to-long v3, p2

    const-wide/16 v5, 0x32

    move-object v1, p1

    move-object v2, p0

    move v8, p4

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Lcom/beizi/ad/internal/view/AdViewImpl$19;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJIZLandroid/view/View;)V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 4
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    goto :goto_1

    :cond_1
    if-eq p1, v0, :cond_3

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createInterstitialCountDown(Landroid/content/Context;I)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    new-instance p2, Lcom/beizi/ad/internal/view/AdViewImpl$20;

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v2, p1

    const-wide/16 v4, 0x32

    move-object v0, p2

    move-object v1, p0

    move v6, p4

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/beizi/ad/internal/view/AdViewImpl$20;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJZLandroid/view/View;)V

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 7
    invoke-virtual {p2}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 8
    :goto_1
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 9
    :goto_2
    instance-of p2, p1, Landroid/widget/FrameLayout;

    if-eqz p2, :cond_3

    .line 10
    check-cast p1, Landroid/widget/FrameLayout;

    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public addMuteButton(Lcom/beizi/ad/internal/video/AdVideoView;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->D:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createMuteButton(Landroid/content/Context;Z)Landroidx/appcompat/widget/AppCompatImageView;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    new-instance v0, Lcom/beizi/ad/internal/view/AdViewImpl$18;

    invoke-direct {v0, p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl$18;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/video/AdVideoView;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 5
    :goto_0
    instance-of p2, p1, Landroid/widget/FrameLayout;

    if-eqz p2, :cond_1

    .line 6
    check-cast p1, Landroid/widget/FrameLayout;

    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->D:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public addSkipView(ILandroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->A:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->z:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    if-gtz p1, :cond_1

    const/4 p1, 0x5

    .line 5
    :cond_1
    new-instance v6, Lcom/beizi/ad/internal/view/AdViewImpl$2;

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v2, p1

    const-wide/16 v4, 0x32

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/internal/view/AdViewImpl$2;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJ)V

    iput-object v6, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    .line 6
    invoke-virtual {v6}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    new-instance p1, Lcom/beizi/ad/internal/view/AdViewImpl$3;

    invoke-direct {p1, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$3;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method b()V
    .locals 0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    return-void
.end method

.method protected abstract b(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end method

.method c()V
    .locals 0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    return-void
.end method

.method public clearAdRequest()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    return-void
.end method

.method public closeAd()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->C:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public createAdLogo(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Landroid/content/MutableContextWrapper;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createAdImageView(Landroid/content/Context;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)Landroid/widget/FrameLayout;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Landroid/content/MutableContextWrapper;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createLogoImageView(Landroid/content/Context;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)Landroid/widget/FrameLayout;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    :cond_1
    return-void
.end method

.method abstract d()Z
.end method

.method public destroy()V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "called destroy() on AdView"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->F:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method abstract e()Z
.end method

.method abstract f()V
.end method

.method protected finalize()V
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    :cond_0
    return-void
.end method

.method public getAdDispatcher()Lcom/beizi/ad/internal/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->v:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    return-object v0
.end method

.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->O:Ljava/lang/String;

    return-object v0
.end method

.method public getAdListener()Lcom/beizi/ad/AdListener;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_ad_listener:I

    .line 2
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    return-object v0
.end method

.method public getAdParameters()Lcom/beizi/ad/internal/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    return-object v0
.end method

.method public getAdRequest()Lcom/beizi/ad/internal/network/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    return-object v0
.end method

.method public getAdSize()Lcom/beizi/ad/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/beizi/ad/a;

    iget v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->n:I

    iget v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->o:I

    invoke-direct {v0, v1, v2}, Lcom/beizi/ad/a;-><init>(II)V

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_placement_id:I

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 2
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppEventListener()Lcom/beizi/ad/AppEventListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->s:Lcom/beizi/ad/AppEventListener;

    return-object v0
.end method

.method getBrowserStyle()Lcom/beizi/ad/internal/view/AdViewImpl$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->t:Lcom/beizi/ad/internal/view/AdViewImpl$c;

    return-object v0
.end method

.method getContainerHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->g()I

    move-result v0

    return v0
.end method

.method getContainerWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->f()I

    move-result v0

    return v0
.end method

.method public getCreativeHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->o:I

    return v0
.end method

.method public getCreativeWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->n:I

    return v0
.end method

.method public getLandingPageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->N:Ljava/lang/String;

    return-object v0
.end method

.method public getLoadsInBackground()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    return v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMyHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->u:Landroid/os/Handler;

    return-object v0
.end method

.method public getOpensNativeBrowser()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_opens_native_browser:I

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 2
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->h()Z

    move-result v2

    .line 3
    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->h()Z

    move-result v0

    return v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->M:Ljava/lang/String;

    return-object v0
.end method

.method public getRewaredVideoAdListener()Lcom/beizi/ad/RewardedVideoAdListener;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_rewarded_video_ad_listener:I

    .line 2
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->r:Lcom/beizi/ad/RewardedVideoAdListener;

    return-object v0
.end method

.method public getShowLoadingIndicator()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->x:Z

    return v0
.end method

.method public getSplashParent()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public isCloseMarketDialog()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->l()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public isLoadToShow(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    invoke-virtual {p1}, Lcom/beizi/ad/AdListener;->onAdLoaded()V

    :cond_0
    return-void
.end method

.method public isLoaded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->S:Z

    return v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->y:Z

    return v0
.end method

.method public isReadyToStart()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->already_expanded:I

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isRewardedVideo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    return v0
.end method

.method public loadAd(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    .line 2
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isReadyToStart()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    if-eqz p1, :cond_0

    const/4 v1, 0x4

    .line 4
    invoke-virtual {p1, v1}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    :cond_0
    return v0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWindowVisibility()I

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->a()V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->c()V

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->b()V

    .line 9
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->y:Z

    .line 10
    iput v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->loadCount:I

    .line 11
    iput v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->clickCount:I

    return v1

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_3

    .line 13
    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->a()V

    .line 14
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->c()V

    .line 15
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->b()V

    .line 16
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->y:Z

    .line 17
    iput v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->loadCount:I

    .line 18
    iput v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->clickCount:I

    :cond_3
    return v0
.end method

.method public onCreateLifeCycle()V
    .locals 0

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 0

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    sget-object v1, Lcom/beizi/ad/internal/view/AdViewImpl$a$a;->d:Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->a(Lcom/beizi/ad/internal/view/AdViewImpl$a$a;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->c()Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    move-result-object v0

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    :cond_0
    return-void
.end method

.method public onStartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    sget-object v1, Lcom/beizi/ad/internal/view/AdViewImpl$a$a;->c:Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->a(Lcom/beizi/ad/internal/view/AdViewImpl$a$a;)V

    return-void
.end method

.method public openAdInNativeBrowser(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setOpensNativeBrowser(Z)V

    return-void
.end method

.method public pingClick(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p1}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public pingConvert(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p1}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method setAdExtInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->p:Ljava/lang/String;

    return-void
.end method

.method public setAdId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->O:Ljava/lang/String;

    return-void
.end method

.method public setAdListener(Lcom/beizi/ad/AdListener;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    if-eqz v0, :cond_0

    .line 2
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    const-string v0, "setAdListener() called on RewardedVideoAd"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_ad_listener:I

    .line 4
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->q:Lcom/beizi/ad/AdListener;

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_placement_id:I

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public setAppEventListener(Lcom/beizi/ad/AppEventListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->s:Lcom/beizi/ad/AppEventListener;

    return-void
.end method

.method protected setBrowserStyle(Lcom/beizi/ad/internal/view/AdViewImpl$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->t:Lcom/beizi/ad/internal/view/AdViewImpl$c;

    return-void
.end method

.method public setCloseButtonPadding(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->leftPadding:I

    .line 2
    iput p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->topPadding:I

    .line 3
    iput p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->rightPadding:I

    .line 4
    iput p4, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->bottomPadding:I

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->c(Z)V

    :cond_0
    return-void
.end method

.method setCreativeHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->o:I

    return-void
.end method

.method setCreativeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->n:I

    return-void
.end method

.method public setLandingPageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->N:Ljava/lang/String;

    return-void
.end method

.method public setLoadsInBackground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    return-void
.end method

.method public setOpensNativeBrowser(Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_opens_native_browser:I

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->b(Z)V

    return-void
.end method

.method public setPrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->M:Ljava/lang/String;

    return-void
.end method

.method public setRewardedVideoAdListener(Lcom/beizi/ad/RewardedVideoAdListener;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    const-string v0, "setRewardedVideoAdListener() called on non-RewardedVideoAd"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_rewarded_video_ad_listener:I

    .line 4
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->r:Lcom/beizi/ad/RewardedVideoAdListener;

    return-void
.end method

.method protected setShouldResizeParent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->w:Z

    return-void
.end method

.method public setShowLoadingIndicator(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->x:Z

    return-void
.end method

.method public showAd()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v1, v0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, v1, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    sget-object v2, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->m:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getAutoCloseTime()I

    move-result v0

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->m:Landroid/view/View;

    invoke-virtual {p0, v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->addSkipView(ILandroid/view/View;)V

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    .line 7
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getShowCloseBtnTime()I

    move-result v3

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getAutoCloseTime()I

    move-result v4

    iget-object v5, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v5, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$a;->b:Lcom/beizi/ad/c/e$a;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_0
    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/beizi/ad/internal/view/AdViewImpl;->addCloseButton(IIILandroid/view/View;Z)V

    .line 8
    :goto_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->R:Lcom/beizi/ad/internal/view/AdWebView;

    new-instance v1, Lcom/beizi/ad/internal/view/AdViewImpl$15;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$15;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method public showAdLogo(Landroid/view/View;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    .line 4
    :goto_0
    instance-of v0, p1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    .line 5
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    const/4 v3, -0x2

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 8
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->L:Landroid/widget/FrameLayout;

    new-instance v5, Lcom/beizi/ad/internal/view/AdViewImpl$16;

    invoke-direct {v5, p0}, Lcom/beizi/ad/internal/view/AdViewImpl$16;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {v1, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    :cond_1
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_2

    .line 12
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 14
    :cond_2
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, 0x5

    .line 15
    invoke-virtual {v1, v5, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 16
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 17
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->K:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    check-cast p1, Landroid/widget/FrameLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x55

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v1

    .line 21
    invoke-virtual {p1, v4, v4, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 22
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method

.method public showBannerCloseBtn(Landroid/view/View;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->B:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
