.class public Lcom/aggmoread/sdk/z/a/s/d;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/s/a$g;
.implements Lcom/aggmoread/sdk/z/a/s/e$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/s/d$j;,
        Lcom/aggmoread/sdk/z/a/s/d$i;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:Lcom/aggmoread/sdk/z/a/s/d$i;

.field private E:Lcom/aggmoread/sdk/z/a/s/e;

.field private F:Lcom/aggmoread/sdk/z/a/s/d$j;

.field private G:F

.field H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field I:Landroid/media/MediaPlayer$OnPreparedListener;

.field private J:Landroid/media/MediaPlayer$OnCompletionListener;

.field private K:Landroid/media/MediaPlayer$OnInfoListener;

.field private L:Landroid/media/MediaPlayer$OnErrorListener;

.field private M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

.field N:Landroid/view/SurfaceHolder$Callback;

.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:I

.field private d:I

.field private e:Landroid/view/SurfaceHolder;

.field private f:Landroid/media/MediaPlayer;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Lcom/aggmoread/sdk/z/a/s/a;

.field private m:Landroid/media/MediaPlayer$OnCompletionListener;

.field private n:Landroid/media/MediaPlayer$OnPreparedListener;

.field private o:I

.field private p:Landroid/media/MediaPlayer$OnErrorListener;

.field private q:Landroid/media/MediaPlayer$OnInfoListener;

.field private r:I

.field private s:I

.field private t:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Landroid/content/Context;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/aggmoread/sdk/z/a/s/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "ApiVideoViewTAG"

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->a:Ljava/lang/String;

    const/4 p2, 0x0

    iput p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    iput p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    const/4 p3, 0x0

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/s/d;->e:Landroid/view/SurfaceHolder;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->z:Z

    iput-boolean p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->A:Z

    iput p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->B:I

    iput p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->C:I

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/s/d;->D:Lcom/aggmoread/sdk/z/a/s/d$i;

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->G:F

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$a;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$b;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$b;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$c;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$c;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->J:Landroid/media/MediaPlayer$OnCompletionListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$d;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$d;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->K:Landroid/media/MediaPlayer$OnInfoListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$e;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$e;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->L:Landroid/media/MediaPlayer$OnErrorListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$f;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$f;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    new-instance p2, Lcom/aggmoread/sdk/z/a/s/d$g;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/s/d$g;-><init>(Lcom/aggmoread/sdk/z/a/s/d;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->N:Landroid/view/SurfaceHolder$Callback;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->y:Landroid/content/Context;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->m()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    return p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/d;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->e:Landroid/view/SurfaceHolder;

    return-object p1
.end method

.method private a(II)V
    .locals 5

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    invoke-static {v0, p1}, Landroid/view/SurfaceView;->getDefaultSize(II)I

    move-result v0

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    invoke-static {v1, p2}, Landroid/view/SurfaceView;->getDefaultSize(II)I

    move-result v1

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    if-lez v2, :cond_8

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    if-lez v2, :cond_8

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_1

    if-ne v1, v2, :cond_1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    mul-int v1, v0, p2

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    mul-int v3, p1, v2

    if-ge v1, v3, :cond_0

    div-int v0, v1, v2

    :goto_0
    move v1, p2

    goto :goto_4

    :cond_0
    if-le v1, v3, :cond_4

    div-int v1, v3, v0

    goto :goto_1

    :cond_1
    const/high16 v3, -0x80000000

    if-ne v0, v2, :cond_3

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    mul-int v0, v0, p1

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    div-int/2addr v0, v2

    if-ne v1, v3, :cond_2

    if-le v0, p2, :cond_2

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_1
    move v0, p1

    goto :goto_4

    :cond_3
    if-ne v1, v2, :cond_6

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    mul-int v1, v1, p2

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    div-int/2addr v1, v2

    if-ne v0, v3, :cond_5

    if-le v1, p1, :cond_5

    :cond_4
    :goto_2
    move v0, p1

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    iget v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    if-ne v1, v3, :cond_7

    if-le v4, p2, :cond_7

    mul-int v1, p2, v2

    div-int/2addr v1, v4

    goto :goto_3

    :cond_7
    move v1, v2

    move p2, v4

    :goto_3
    if-ne v0, v3, :cond_5

    if-le v1, p1, :cond_5

    mul-int v4, v4, p1

    div-int v1, v4, v2

    goto :goto_1

    :cond_8
    :goto_4
    invoke-virtual {p0, v0, v1}, Landroid/view/SurfaceView;->setMeasuredDimension(II)V

    return-void
.end method

.method private a(IILcom/aggmoread/sdk/z/a/s/d$i;)V
    .locals 6

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    invoke-static {v0, p1}, Landroid/view/SurfaceView;->getDefaultSize(II)I

    move-result v2

    invoke-static {v1, p2}, Landroid/view/SurfaceView;->getDefaultSize(II)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onMeasureFitXY before width "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", height = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-lez v0, :cond_4

    if-lez v1, :cond_4

    sget-object v4, Lcom/aggmoread/sdk/z/a/s/d$h;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v4, p3

    packed-switch p3, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    mul-int p1, v0, v3

    mul-int p2, v1, v2

    if-le p1, p2, :cond_0

    goto :goto_2

    :cond_0
    if-ge p1, p2, :cond_4

    goto :goto_0

    :pswitch_1
    mul-int v0, v0, v3

    div-int/2addr v0, v1

    goto :goto_4

    :pswitch_2
    mul-int/lit8 p1, v2, 0x3

    mul-int/lit8 p2, v3, 0x4

    if-ge p1, p2, :cond_1

    div-int/lit8 v1, p1, 0x4

    goto :goto_1

    :cond_1
    if-le p1, p2, :cond_4

    div-int/lit8 v0, p2, 0x3

    goto :goto_4

    :pswitch_3
    mul-int/lit8 p1, v2, 0x9

    mul-int/lit8 p2, v3, 0x10

    if-ge p1, p2, :cond_2

    div-int/lit8 v1, p1, 0x10

    goto :goto_1

    :cond_2
    if-le p1, p2, :cond_4

    div-int/lit8 v0, p2, 0x9

    goto :goto_4

    :pswitch_4
    mul-int p1, v0, v3

    mul-int p2, v1, v2

    if-le p1, p2, :cond_3

    :goto_0
    div-int v1, p2, v0

    :goto_1
    move v0, v2

    goto :goto_5

    :cond_3
    if-ge p1, p2, :cond_4

    :goto_2
    div-int v0, p1, v1

    goto :goto_4

    :pswitch_5
    mul-int p2, p2, v0

    mul-int p1, p1, v1

    if-le p2, p1, :cond_4

    mul-int p1, v0, v3

    mul-int v1, v1, v2

    if-le p1, v1, :cond_4

    div-int/2addr v1, v0

    goto :goto_1

    :cond_4
    :goto_3
    move v0, v2

    :goto_4
    move v1, v3

    :goto_5
    :pswitch_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onMeasureFitXY final  width "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Landroid/view/SurfaceView;->setMeasuredDimension(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->b(Z)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    return p0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    return p1
.end method

.method private b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    if-eqz p1, :cond_0

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->u:Z

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/s/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->v:Z

    return p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->o:I

    return p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnPreparedListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->n:Landroid/media/MediaPlayer$OnPreparedListener;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/s/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->w:Z

    return p1
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->j:I

    return p1
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/s/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->x:Z

    return p1
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->r:I

    return p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->k:I

    return p1
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->s:I

    return p1
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/a/s/d;)Z
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->l()Z

    move-result p0

    return p0
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    return p0
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/a/s/d;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    return p1
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a;->a(Lcom/aggmoread/sdk/z/a/s/a$g;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->setEnabled(Z)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnCompletionListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->m:Landroid/media/MediaPlayer$OnCompletionListener;

    return-object p0
.end method

.method private i()V
    .locals 4

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->D:Lcom/aggmoread/sdk/z/a/s/d$i;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "videoWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", videoHeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    return-void
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/d$j;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    return-object p0
.end method

.method private j()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->E:Lcom/aggmoread/sdk/z/a/s/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/e;->b()V

    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnInfoListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->q:Landroid/media/MediaPlayer$OnInfoListener;

    return-object p0
.end method

.method private k()V
    .locals 2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->E:Lcom/aggmoread/sdk/z/a/s/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/s/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->E:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/s/e;->a(Lcom/aggmoread/sdk/z/a/s/e$c;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->E:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/e;->c()V

    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/media/MediaPlayer$OnErrorListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->p:Landroid/media/MediaPlayer$OnErrorListener;

    return-object p0
.end method

.method private l()Z
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->j:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->k:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/a/s/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->a:Ljava/lang/String;

    return-object p0
.end method

.method private m()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->h:I

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->i:I

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->N:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/SurfaceView;->setFocusable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/SurfaceView;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->requestFocus()Z

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    return-void
.end method

.method static synthetic n(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->s:I

    return p0
.end method

.method private n()Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    if-eqz v0, :cond_0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method static synthetic o(Lcom/aggmoread/sdk/z/a/s/d;)Landroid/view/SurfaceHolder;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->e:Landroid/view/SurfaceHolder;

    return-object p0
.end method

.method private o()V
    .locals 6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->b:Landroid/net/Uri;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->e:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->y:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/s/d;->b(Z)V

    :try_start_0
    new-instance v1, Landroid/media/MediaPlayer;

    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->g:I

    if-eqz v4, :cond_1

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setAudioSessionId(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v1

    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->g:I

    :goto_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->J:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->L:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->K:Landroid/media/MediaPlayer$OnInfoListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->o:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->G:F

    invoke-virtual {v1, v4, v4}, Landroid/media/MediaPlayer;->setVolume(FF)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->y:Landroid/content/Context;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/d;->b:Landroid/net/Uri;

    invoke-virtual {v1, v4, v5}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/d;->e:Landroid/view/SurfaceHolder;

    invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v3}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepareAsync()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-interface {v1, v2}, Lcom/aggmoread/sdk/z/a/s/d$j;->d(Landroid/media/MediaPlayer;)V

    :cond_2
    iput v3, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->h()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to open content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->b:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v1, -0x1

    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->L:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-interface {v1, v2, v3, v0}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic p(Lcom/aggmoread/sdk/z/a/s/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->o()V

    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->c()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/s/a$i;->d:Lcom/aggmoread/sdk/z/a/s/a$i;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/aggmoread/sdk/z/a/s/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->k()V

    return-void
.end method

.method static synthetic r(Lcom/aggmoread/sdk/z/a/s/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->j()V

    return-void
.end method

.method static synthetic s(Lcom/aggmoread/sdk/z/a/s/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->i()V

    return-void
.end method

.method static synthetic t(Lcom/aggmoread/sdk/z/a/s/d;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    return p0
.end method

.method static synthetic u(Lcom/aggmoread/sdk/z/a/s/d;)Lcom/aggmoread/sdk/z/a/s/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    int-to-long v1, p1

    const/4 p1, 0x3

    invoke-virtual {v0, v1, v2, p1}, Landroid/media/MediaPlayer;->seekTo(JI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    :goto_0
    const/4 p1, 0x0

    :cond_1
    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->r:I

    return-void
.end method

.method public a(ILcom/aggmoread/sdk/z/a/s/e$b;)V
    .locals 2

    iget-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->A:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->b:Lcom/aggmoread/sdk/z/a/s/e$b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, p1, :cond_1

    invoke-virtual {p0, v1, v0}, Lcom/aggmoread/sdk/z/a/s/d;->a(ZI)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->c:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p2, p1, :cond_2

    const/4 p1, 0x7

    invoke-virtual {p0, v1, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(ZI)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->d:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p2, p1, :cond_3

    invoke-virtual {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/d;->a(ZI)V

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->e:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p2, p1, :cond_4

    const/16 p1, 0x8

    invoke-virtual {p0, v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(ZI)V

    :cond_4
    :goto_0
    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->m:Landroid/media/MediaPlayer$OnCompletionListener;

    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnErrorListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->p:Landroid/media/MediaPlayer$OnErrorListener;

    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnPreparedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->n:Landroid/media/MediaPlayer$OnPreparedListener;

    return-void
.end method

.method public a(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/d;->a(Landroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->a:Ljava/lang/String;

    const-string v0, "setVideoURI "

    invoke-static {p2, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->b:Landroid/net/Uri;

    const/4 p1, 0x0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->r:I

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->s:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->o()V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->requestLayout()V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->invalidate()V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :cond_0
    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->h()V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/s/d$j;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Landroid/net/Uri;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    xor-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/d;->a(ZI)V

    return-void
.end method

.method public a(ZI)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->y:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const/16 v1, 0x400

    if-eqz p1, :cond_1

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->B:I

    if-nez v2, :cond_0

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->C:I

    if-nez v2, :cond_0

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v3, p0, Lcom/aggmoread/sdk/z/a/s/d;->B:I

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->C:I

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, p0, Lcom/aggmoread/sdk/z/a/s/d;->B:I

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v3, p0, Lcom/aggmoread/sdk/z/a/s/d;->C:I

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v2}, Landroid/view/SurfaceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    invoke-virtual {v0, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Z)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Lcom/aggmoread/sdk/z/a/s/d$j;->a(Z)V

    :cond_2
    return-void
.end method

.method public a()Z
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->a:Ljava/lang/String;

    const-string v1, "pause"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-interface {v0, v2}, Lcom/aggmoread/sdk/z/a/s/d$j;->f(Landroid/media/MediaPlayer;)V

    :cond_0
    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->A:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->u:Z

    return v0
.end method

.method public d()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->o()V

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->c()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    sget-object v2, Lcom/aggmoread/sdk/z/a/s/a$i;->c:Lcom/aggmoread/sdk/z/a/s/a$i;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->F:Lcom/aggmoread/sdk/z/a/s/d$j;

    if-eqz v0, :cond_3

    iget v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-interface {v0, v2}, Lcom/aggmoread/sdk/z/a/s/d$j;->e(Landroid/media/MediaPlayer;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-interface {v0, v2}, Lcom/aggmoread/sdk/z/a/s/d$j;->a(Landroid/media/MediaPlayer;)V

    :cond_3
    :goto_0
    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    :cond_4
    iput v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    return-void
.end method

.method public e()I
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public f()I
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->o:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Lcom/aggmoread/sdk/z/a/s/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const-class v0, Lcom/aggmoread/sdk/z/a/s/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    const/16 v1, 0x18

    if-eq p1, v1, :cond_0

    const/16 v1, 0x19

    if-eq p1, v1, :cond_0

    const/16 v1, 0xa4

    if-eq p1, v1, :cond_0

    const/16 v1, 0x52

    if-eq p1, v1, :cond_0

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    const/4 v1, 0x6

    if-eq p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz v1, :cond_9

    const/16 v1, 0x4f

    if-eq p1, v1, :cond_7

    const/16 v1, 0x55

    if-ne p1, v1, :cond_1

    goto :goto_2

    :cond_1
    const/16 v1, 0x7e

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/d;->d()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :cond_2
    return v0

    :cond_3
    const/16 v1, 0x56

    if-eq p1, v1, :cond_5

    const/16 v1, 0x7f

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->q()V

    goto :goto_4

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/d;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    :cond_6
    return v0

    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/d;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/d;->d()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :goto_3
    return v0

    :cond_9
    :goto_4
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onMeasure(II)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->z:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/d$i;->h:Lcom/aggmoread/sdk/z/a/s/d$i;

    invoke-direct {p0, p1, p2, v0}, Lcom/aggmoread/sdk/z/a/s/d;->a(IILcom/aggmoread/sdk/z/a/s/d$i;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/s/d;->a(II)V

    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->q()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->n()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/d;->l:Lcom/aggmoread/sdk/z/a/s/a;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/d;->q()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->f:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->c:I

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/d;->d:I

    :cond_0
    return-void
.end method
