.class public final Lcom/kwad/sdk/core/video/videoview/a;
.super Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/kwad/sdk/core/video/videoview/c;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static aCM:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private UA:I

.field private UB:J

.field private UD:Lcom/kwad/sdk/contentalliance/a/a/b;

.field private UN:Lcom/kwad/sdk/core/video/a/c$e;

.field private UO:Lcom/kwad/sdk/core/video/a/c$i;

.field private UP:Lcom/kwad/sdk/core/video/a/c$b;

.field private UQ:Lcom/kwad/sdk/core/video/a/c$c;

.field private UR:Lcom/kwad/sdk/core/video/a/c$d;

.field private US:Lcom/kwad/sdk/core/video/a/c$a;

.field private Uy:I

.field private Uz:Lcom/kwad/sdk/core/video/a/c;

.field private Va:Landroid/graphics/SurfaceTexture;

.field private Vb:Landroid/view/Surface;

.field private aCI:Landroid/media/AudioManager;

.field private aCJ:Lcom/kwad/sdk/core/video/a;

.field private aCK:Lcom/kwad/sdk/core/video/videoview/b;

.field private aCL:Z

.field private aCN:Z

.field private aCO:Z

.field private aCP:Landroid/widget/ImageView;

.field private dd:Lcom/kwad/sdk/contentalliance/a/a/a;

.field private hR:Landroid/widget/FrameLayout;

.field private mContext:Landroid/content/Context;

.field private mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/core/video/videoview/a;->aCM:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/sdk/core/video/videoview/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 4
    iput-boolean p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCL:Z

    .line 5
    iput-boolean p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCN:Z

    .line 6
    iput-boolean p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCO:Z

    .line 7
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$1;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$1;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    .line 8
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$2;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$2;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    .line 9
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$3;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$3;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    .line 10
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$4;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$4;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    .line 11
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$5;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$5;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    .line 12
    new-instance p2, Lcom/kwad/sdk/core/video/videoview/a$6;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/core/video/videoview/a$6;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->US:Lcom/kwad/sdk/core/video/a/c$a;

    .line 13
    iput-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    .line 14
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->init()V

    return-void
.end method

.method private GR()Landroid/widget/ImageView;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private GS()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private GU()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_2

    .line 2
    const-class v0, Lcom/kwad/sdk/core/video/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/video/a/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/f;->yT()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/f;->yU()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 5
    :goto_1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    invoke-static {v0, v2, v3, v1, v2}, Lcom/kwad/sdk/core/video/a/e;->a(Landroid/content/Context;ZZZI)Lcom/kwad/sdk/core/video/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    const/4 v1, 0x3

    .line 6
    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->setAudioStreamType(I)V

    .line 7
    iget-boolean v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCN:Z

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v1}, Lcom/kwad/sdk/core/video/a/c;->setVolume(FF)V

    :cond_2
    return-void
.end method

.method private GV()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/16 v2, 0x11

    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private GW()V
    .locals 4

    const-string v0, "KSVideoPlayerViewView"

    .line 1
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setKeepScreenOn(Z)V

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->b(Lcom/kwad/sdk/core/video/a/c$e;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$i;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$b;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$c;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->c(Lcom/kwad/sdk/core/video/a/c$d;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->US:Lcom/kwad/sdk/core/video/a/c$a;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$a;)V

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    if-eqz v1, :cond_0

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->dd:Lcom/kwad/sdk/contentalliance/a/a/a;

    if-eqz v3, :cond_0

    .line 9
    iput-object v3, v1, Lcom/kwad/sdk/contentalliance/a/a/b;->apW:Lcom/kwad/sdk/contentalliance/a/a/a;

    .line 10
    :cond_0
    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v3, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/contentalliance/a/a/b;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Vb:Landroid/view/Surface;

    if-nez v1, :cond_1

    .line 12
    new-instance v1, Landroid/view/Surface;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->Va:Landroid/graphics/SurfaceTexture;

    invoke-direct {v1, v3}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Vb:Landroid/view/Surface;

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/video/videoview/a;->Vb:Landroid/view/Surface;

    invoke-interface {v1, v3}, Lcom/kwad/sdk/core/video/a/c;->setSurface(Landroid/view/Surface;)V

    .line 14
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v1}, Lcom/kwad/sdk/core/video/a/c;->prepareAsync()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 15
    iput v2, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 16
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/video/videoview/b;->onPlayStateChanged(I)V

    const-string v1, "STATE_PREPARING"

    .line 17
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception v1

    .line 18
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v2, "\u6253\u5f00\u64ad\u653e\u5668\u53d1\u751f\u9519\u8bef"

    .line 19
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private GX()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCI:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 3
    iput-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCI:Landroid/media/AudioManager;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->release()V

    .line 6
    iput-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    const-string v0, "videoFinishPlay"

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    .line 8
    :cond_1
    new-instance v0, Lcom/kwad/sdk/core/video/videoview/a$7;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/video/videoview/a$7;-><init>(Lcom/kwad/sdk/core/video/videoview/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Vb:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 11
    iput-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Vb:Landroid/view/Surface;

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Va:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_3

    .line 13
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 14
    iput-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Va:Landroid/graphics/SurfaceTexture;

    :cond_3
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    return-void
.end method

.method static synthetic b(Lcom/kwad/sdk/core/video/videoview/a;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    return p1
.end method

.method static synthetic c(Lcom/kwad/sdk/core/video/videoview/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    return p0
.end method

.method static synthetic c(Lcom/kwad/sdk/core/video/videoview/a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->UA:I

    return p1
.end method

.method static synthetic d(Lcom/kwad/sdk/core/video/videoview/a;)Lcom/kwad/sdk/core/video/videoview/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/sdk/core/video/videoview/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCL:Z

    return p0
.end method

.method private ej(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/i;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/i;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCP:Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dW(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lcom/kwad/sdk/service/a/i;->load(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/kwad/sdk/core/video/videoview/a;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/sdk/core/video/videoview/a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->mUrl:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/sdk/core/video/videoview/a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->UB:J

    return-wide v0
.end method

.method static synthetic i(Lcom/kwad/sdk/core/video/videoview/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCO:Z

    return p0
.end method

.method private init()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GR()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCP:Landroid/widget/ImageView;

    .line 2
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    .line 3
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic j(Lcom/kwad/sdk/core/video/videoview/a;)Lcom/kwad/sdk/core/video/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/sdk/core/video/videoview/a;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method private sd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/video/a;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/core/video/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    .line 3
    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :cond_0
    return-void
.end method

.method private setPlayType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/kwad/sdk/contentalliance/a/a/b;->videoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    if-eqz v0, :cond_0

    .line 2
    iput p1, v0, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final GT()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lcom/kwad/sdk/contentalliance/a/a/b;Ljava/util/Map;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/contentalliance/a/a/b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    .line 2
    iget-object p2, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->videoUrl:Ljava/lang/String;

    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->mUrl:Ljava/lang/String;

    const/4 p2, 0x0

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->mHeaders:Ljava/util/Map;

    .line 4
    iget-object p1, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/video/videoview/a;->ej(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final getBufferPercentage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->UA:I

    return v0
.end method

.method public final getController()Lcom/kwad/sdk/core/video/videoview/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    return-object v0
.end method

.method public final getCurrentPosition()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getCurrentPosition()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getDuration()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getMaxVolume()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCI:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    .line 2
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getVideoController()Lcom/kwad/sdk/core/video/videoview/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    return-object v0
.end method

.method public final getVolume()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCI:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    .line 2
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isCompleted()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isIdle()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isPaused()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isPlaying()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/kwad/sdk/core/video/videoview/a;->Va:Landroid/graphics/SurfaceTexture;

    if-nez p2, :cond_0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Va:Landroid/graphics/SurfaceTexture;

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GW()V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCJ:Lcom/kwad/sdk/core/video/a;

    invoke-virtual {p1, p2}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public final pause()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const/4 v2, 0x4

    const-string v3, "KSVideoPlayerViewView"

    const-string v4, "videoPausePlay"

    if-ne v1, v2, :cond_1

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 4
    invoke-static {v4}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 5
    iput v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/video/videoview/b;->onPlayStateChanged(I)V

    const-string v0, "STATE_PAUSED"

    .line 7
    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    .line 8
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 9
    invoke-static {v4}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x7

    .line 10
    iput v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 11
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/video/videoview/b;->onPlayStateChanged(I)V

    const-string v0, "STATE_BUFFERING_PAUSED"

    .line 12
    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final release()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCL:Z

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GS()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GT()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->isPaused()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mUrl:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/y;->e(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->mUrl:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->getCurrentPosition()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/y;->e(Landroid/content/Context;Ljava/lang/String;J)V

    .line 6
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GX()V

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/kwad/sdk/core/video/videoview/b;->reset()V

    :cond_3
    return-void
.end method

.method public final restart()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    const-string v1, "videoResumePlay"

    const-string v2, "KSVideoPlayerViewView"

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/video/videoview/b;->onPlayStateChanged(I)V

    const/4 v0, 0x2

    .line 6
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setPlayType(I)V

    const-string v0, "STATE_PLAYING"

    .line 7
    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v3, 0x7

    if-ne v0, v3, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x6

    .line 10
    iput v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    .line 11
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/video/videoview/b;->onPlayStateChanged(I)V

    const-string v0, "STATE_BUFFERING_PLAYING"

    .line 12
    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/16 v1, 0x9

    if-eq v0, v1, :cond_3

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 13
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KSVideoPlayer\u5728\u72b6\u6001\u4e3a "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \u65f6\u4e0d\u80fd\u8c03\u7528restart()\u65b9\u6cd5."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->reset()V

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GW()V

    const/4 v0, 0x3

    .line 16
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setPlayType(I)V

    return-void
.end method

.method public final seekTo(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    int-to-long v1, p1

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/core/video/a/c;->seekTo(J)V

    :cond_0
    return-void
.end method

.method public final setController(Lcom/kwad/sdk/core/video/videoview/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    .line 3
    invoke-virtual {p1}, Lcom/kwad/sdk/core/video/videoview/b;->reset()V

    .line 4
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->hR:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCK:Lcom/kwad/sdk/core/video/videoview/b;

    invoke-virtual {v0, v1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setKsPlayLogParam(Lcom/kwad/sdk/contentalliance/a/a/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->dd:Lcom/kwad/sdk/contentalliance/a/a/a;

    return-void
.end method

.method public final setLooping(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c;->setLooping(Z)V

    :cond_0
    return-void
.end method

.method public final setPortraitFullscreen(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCO:Z

    return-void
.end method

.method public final setVideoSoundEnable(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCN:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    invoke-interface {v0, p1, p1}, Lcom/kwad/sdk/core/video/a/c;->setVolume(FF)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-interface {v0, p1, p1}, Lcom/kwad/sdk/core/video/a/c;->setVolume(FF)V

    :cond_1
    return-void
.end method

.method public final setVolume(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->aCI:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    :cond_0
    return-void
.end method

.method public final start()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->Uy:I

    if-nez v0, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GU()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->sd()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/video/videoview/a;->GV()V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/a;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/contentalliance/a/a/b;->videoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    if-eqz v0, :cond_1

    .line 6
    iget v0, v0, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setPlayType(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 8
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setPlayType(I)V

    :cond_1
    :goto_0
    const-string v0, "videoStartPlay"

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v0, "KSVideoPlayerViewView"

    const-string v1, "KSVideoPlayer\u53ea\u6709\u5728\u72b6\u6001\u4e3aSTATE_IDLE\u65f6\u624d\u80fd\u8c03\u7528start\u65b9\u6cd5."

    .line 10
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
