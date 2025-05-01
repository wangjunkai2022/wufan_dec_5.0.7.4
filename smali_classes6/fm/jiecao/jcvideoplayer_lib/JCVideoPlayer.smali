.class public abstract Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;
.super Landroid/widget/FrameLayout;
.source "JCVideoPlayer.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$b;,
        Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;
    }
.end annotation


# static fields
.field public static final A1:I = 0x1

.field public static final B1:I = 0x2

.field public static final C1:I = 0x3

.field public static final D1:I = 0x4

.field public static final E1:I = 0x5

.field public static final F1:I = 0x6

.field public static final G1:I = 0x7

.field public static H1:I = -0x1

.field protected static I1:Lfm/jiecao/jcvideoplayer_lib/c; = null

.field public static final J:Ljava/lang/String; = "JieCaoVideoPlayer"

.field protected static J1:Ljava/util/Timer; = null

.field public static K:Z = true

.field public static final K1:Ljava/lang/String; = "URL_KEY_DEFAULT"

.field public static L:Z = true

.field public static L1:J = 0x0L

.field public static M:I = 0x4

.field public static M1:Landroid/media/AudioManager$OnAudioFocusChangeListener; = null

.field public static N:I = 0x1

.field public static O:Z = true

.field public static P:Z = false

.field public static final Q:I = 0x8405

.field public static final R:I = 0x8406

.field public static final S:I = 0x50

.field public static final T:I = 0x12c

.field public static U:J = 0x0L

.field public static final V:I = 0x0

.field public static final W:I = 0x1

.field public static final p0:I = 0x2

.field public static final p1:I = 0x3

.field public static final v1:I


# instance fields
.field protected A:Z

.field protected B:I

.field protected C:I

.field protected D:F

.field protected E:I

.field F:Ljava/util/LinkedHashMap;

.field G:I

.field public H:I

.field public I:I

.field protected b:Z

.field public c:I

.field public d:I

.field public e:Z

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:[Ljava/lang/Object;

.field public h:I

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/SeekBar;

.field public k:Landroid/widget/ImageView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/view/ViewGroup;

.field public o:Landroid/view/ViewGroup;

.field public p:Landroid/view/ViewGroup;

.field protected q:I

.field protected r:I

.field protected s:Landroid/media/AudioManager;

.field protected t:Landroid/os/Handler;

.field protected u:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;

.field protected v:Z

.field protected w:F

.field protected x:F

.field protected y:Z

.field protected z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$a;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$a;-><init>()V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M1:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->b:Z

    const/4 v1, -0x1

    .line 3
    iput v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 4
    iput v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    .line 5
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    .line 7
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    .line 8
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 9
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H:I

    .line 10
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I:I

    .line 11
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->b:Z

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 15
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    .line 16
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e:Z

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    .line 18
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    .line 19
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 20
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H:I

    .line 21
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I:I

    .line 22
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m(Landroid/content/Context;)V

    return-void
.end method

.method public static H()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 2
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->a()V

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/b;->d()V

    :cond_0
    return-void
.end method

.method public static M(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->K:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setShowHideAnimationEnabled(Z)V

    .line 4
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->show()V

    .line 5
    :cond_0
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->L:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x400

    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_1
    return-void
.end method

.method public static varargs P(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "URL_KEY_DEFAULT"

    .line 2
    invoke-virtual {v0, v1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x0

    .line 3
    invoke-static {p0, p1, v0, p2, p3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->Q(Landroid/content/Context;Ljava/lang/Class;Ljava/util/LinkedHashMap;I[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs Q(Landroid/content/Context;Ljava/lang/Class;Ljava/util/LinkedHashMap;I[Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 3
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    .line 4
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x8405

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v2, 0x1

    :try_start_0
    new-array v3, v2, [Ljava/lang/Class;

    .line 7
    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    .line 8
    invoke-virtual {p1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    .line 9
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 10
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p1, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 11
    invoke-virtual {v0, p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x2

    .line 12
    invoke-virtual {p0, p2, p3, p1, p4}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUp(Ljava/util/LinkedHashMap;II[Ljava/lang/Object;)V

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sput-wide p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    .line 14
    iget-object p0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->i:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/ImageView;->performClick()Z
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/InstantiationException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static d()Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    sub-long/2addr v0, v2

    const/4 v2, 0x0

    const-wide/16 v3, 0x12c

    cmp-long v5, v0, v3

    if-gez v5, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    .line 4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    .line 5
    iget v2, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    if-ne v2, v3, :cond_1

    const/16 v2, 0x8

    goto :goto_0

    :cond_1
    const/16 v2, 0xa

    :goto_0
    invoke-virtual {v0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 6
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F()V

    return v1

    .line 7
    :cond_2
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 8
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    if-eq v0, v3, :cond_3

    .line 9
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    .line 10
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    .line 11
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->b()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iput v2, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 12
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->f()V

    .line 13
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/b;->d()V

    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/f;->e(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    return v1

    :cond_4
    return v2
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static l(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->K:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setShowHideAnimationEnabled(Z)V

    .line 4
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->hide()V

    .line 5
    :cond_0
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->L:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x400

    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_1
    return-void
.end method

.method public static setJcUserAction(Lfm/jiecao/jcvideoplayer_lib/c;)V
    .locals 0

    .line 1
    sput-object p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I1:Lfm/jiecao/jcvideoplayer_lib/c;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStatePlaying  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    return-void
.end method

.method public B()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStatePreparing  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->J()V

    return-void
.end method

.method public C(II)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 2
    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 3
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    .line 4
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    invoke-static {p2, p1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lfm/jiecao/jcvideoplayer_lib/b;->l:Ljava/lang/String;

    .line 5
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e:Z

    sput-boolean p1, Lfm/jiecao/jcvideoplayer_lib/b;->m:Z

    .line 6
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->f:Ljava/util/Map;

    sput-object p1, Lfm/jiecao/jcvideoplayer_lib/b;->n:Ljava/util/Map;

    .line 7
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object p1

    invoke-virtual {p1}, Lfm/jiecao/jcvideoplayer_lib/b;->c()V

    return-void
.end method

.method public D()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onVideoRendingStart  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->b:Z

    .line 3
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-eq v1, v0, :cond_0

    const/4 v0, 0x2

    if-eq v1, v0, :cond_0

    const/4 v0, 0x4

    if-eq v1, v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->h:I

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v1, v2}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v1

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    .line 10
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A()V

    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onVideoSizeChanged  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v1

    invoke-virtual {v1}, Lfm/jiecao/jcvideoplayer_lib/b;->a()Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;->setVideoSize(Landroid/graphics/Point;)V

    :cond_0
    return-void
.end method

.method public F()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "playOnThisJcvd  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->f()V

    .line 5
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    .line 6
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->a()V

    return-void
.end method

.method public G()V
    .locals 5

    .line 1
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/b;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->d()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "release ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H()V

    :cond_2
    :goto_0
    return-void
.end method

.method public I()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->k:Landroid/graphics/SurfaceTexture;

    .line 2
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 2
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setSecondaryProgress(I)V

    .line 3
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l:Landroid/widget/TextView;

    invoke-static {v1}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m:Landroid/widget/TextView;

    invoke-static {v1}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public K(I)V
    .locals 0

    return-void
.end method

.method public L(FLjava/lang/String;ILjava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public N(FI)V
    .locals 0

    return-void
.end method

.method public O(I)V
    .locals 0

    return-void
.end method

.method public R()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 2
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->J1:Ljava/util/Timer;

    .line 3
    new-instance v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;

    invoke-direct {v2, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    iput-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->u:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;

    .line 4
    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->J1:Ljava/util/Timer;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x12c

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public S()V
    .locals 4

    .line 1
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->a()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startVideo ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n()V

    .line 4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->a()V

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 6
    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M1:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 8
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->l:Ljava/lang/String;

    .line 9
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e:Z

    sput-boolean v0, Lfm/jiecao/jcvideoplayer_lib/b;->m:Z

    .line 10
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->f:Ljava/util/Map;

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->n:Ljava/util/Map;

    .line 11
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->B()V

    .line 12
    invoke-static {p0}, Lfm/jiecao/jcvideoplayer_lib/f;->e(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    return-void
.end method

.method public T()V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startWindowFullscreen  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l(Landroid/content/Context;)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x8405

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 8
    :cond_0
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    sget-object v3, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    .line 11
    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 12
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    const/4 v3, 0x2

    iget-object v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    invoke-virtual {v2, v0, v1, v3, v4}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUp(Ljava/util/LinkedHashMap;II[Ljava/lang/Object;)V

    .line 15
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    invoke-virtual {v2, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    .line 16
    invoke-virtual {v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->a()V

    .line 17
    invoke-static {v2}, Lfm/jiecao/jcvideoplayer_lib/f;->f(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    .line 18
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x()V

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->U:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public U()V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startWindowTiny  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x9

    .line 2
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 3
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-eqz v0, :cond_2

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x8406

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 8
    :cond_1
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    sget-object v3, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    .line 11
    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 12
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x190

    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x55

    .line 13
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    const/4 v3, 0x3

    iget-object v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    invoke-virtual {v2, v0, v1, v3, v4}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUp(Ljava/util/LinkedHashMap;II[Ljava/lang/Object;)V

    .line 16
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    invoke-virtual {v2, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    .line 17
    invoke-virtual {v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->a()V

    .line 18
    invoke-static {v2}, Lfm/jiecao/jcvideoplayer_lib/f;->f(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    .line 19
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x()V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public a()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addTextureView ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/16 v2, 0x11

    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 3
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    sget-object v2, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :goto_0
    const/4 p1, 0x7

    .line 4
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 5
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->T()V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->L1:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 2
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->L1:J

    .line 4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d()Z

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->J1:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 3
    :cond_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->u:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$c;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    :cond_1
    return-void
.end method

.method public f()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->N:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->b()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    .line 4
    iget-object v1, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    sget-object v2, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    const v2, 0x1020002

    .line 6
    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 7
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/f;->f(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    .line 2
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x8405

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x8406

    .line 4
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M(Landroid/content/Context;)V

    return-void
.end method

.method public getCurrentPositionWhenPlaying()I
    .locals 3

    .line 1
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    .line 3
    :cond_1
    :try_start_0
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return v1

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    return v1
.end method

.method public getDuration()I
    .locals 2

    .line 1
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    return v1
.end method

.method public abstract getLayoutId()I
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public m(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getLayoutId()I

    move-result v0

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->start:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->i:Landroid/widget/ImageView;

    .line 3
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->fullscreen:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->k:Landroid/widget/ImageView;

    .line 4
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->bottom_seek_progress:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    .line 5
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->current:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l:Landroid/widget/TextView;

    .line 6
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->total:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m:Landroid/widget/TextView;

    .line 7
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->layout_bottom:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->p:Landroid/view/ViewGroup;

    .line 8
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->surface_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    .line 9
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->layout_top:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o:Landroid/view/ViewGroup;

    .line 10
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 13
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->p:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 16
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->q:I

    .line 17
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->r:I

    .line 18
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s:Landroid/media/AudioManager;

    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->t:Landroid/os/Handler;

    .line 20
    :try_start_0
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    check-cast p1, Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    sput p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->N:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I()V

    .line 2
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;-><init>(Landroid/content/Context;)V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->b()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->b()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 2
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->start:I

    const/4 v1, 0x2

    const/4 v2, 0x6

    const/4 v3, 0x7

    const-string v4, "] "

    if-ne p1, v0, :cond_7

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onClick start ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {p1, v0}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lfm/jiecao/jcvideoplayer_lib/R$string;->no_url:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 6
    :cond_0
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-eqz p1, :cond_4

    if-ne p1, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 7
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "pauseVideo ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->pause()V

    .line 10
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y()V

    goto/16 :goto_2

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    const/4 p1, 0x4

    .line 11
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 12
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 13
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A()V

    goto/16 :goto_2

    :cond_3
    if-ne p1, v2, :cond_b

    .line 14
    invoke-virtual {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 15
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->S()V

    goto/16 :goto_2

    .line 16
    :cond_4
    :goto_0
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {p1, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "file"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 17
    invoke-static {p1, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 18
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lfm/jiecao/jcvideoplayer_lib/e;->h(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_5

    sget-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->P:Z

    if-nez p1, :cond_5

    .line 19
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->O(I)V

    return-void

    .line 20
    :cond_5
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->S()V

    .line 21
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-eq p1, v3, :cond_6

    goto :goto_1

    :cond_6
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    goto :goto_2

    .line 22
    :cond_7
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->fullscreen:I

    if-ne p1, v0, :cond_a

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onClick fullscreen ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-ne p1, v2, :cond_8

    return-void

    .line 25
    :cond_8
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    if-ne p1, v1, :cond_9

    .line 26
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d()Z

    goto :goto_2

    .line 27
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "toFullscreenActivity ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {p0, v3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 29
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->T()V

    goto :goto_2

    .line 30
    :cond_a
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->surface_container:I

    if-ne p1, v0, :cond_b

    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-ne p1, v3, :cond_b

    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onClick surfaceContainer State=Error ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->S()V

    :cond_b
    :goto_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H:I

    if-eqz v0, :cond_1

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I:I

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p2, p1

    .line 4
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I:I

    int-to-float v0, v0

    mul-float p2, p2, v0

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 7
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :goto_0
    return-void

    .line 10
    :cond_2
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bottomProgress onStartTrackingTouch ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-interface {p1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 5
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bottomProgress onStopTrackingTouch ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_0

    const/4 v3, 0x0

    .line 5
    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 6
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_0
    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    if-eq v2, v0, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result p1

    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getDuration()I

    move-result v0

    mul-int p1, p1, v0

    div-int/lit8 p1, p1, 0x64

    .line 9
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "seekTo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 4
    sget v3, Lfm/jiecao/jcvideoplayer_lib/R$id;->surface_container:I

    const/4 v7, 0x0

    if-ne v2, v3, :cond_10

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const-string v3, "] "

    const/4 v4, 0x1

    if-eqz v2, :cond_f

    if-eq v2, v4, :cond_b

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    .line 6
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onTouch surfaceContainer actionMove ["

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->w:F

    sub-float v2, v0, v2

    .line 8
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x:F

    sub-float v8, v1, v0

    .line 9
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 10
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 11
    iget v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/high16 v11, 0x437f0000    # 255.0f

    if-ne v3, v5, :cond_5

    .line 12
    iget-boolean v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z:Z

    if-nez v3, :cond_5

    iget-boolean v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y:Z

    if-nez v3, :cond_5

    iget-boolean v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A:Z

    if-nez v3, :cond_5

    const/high16 v3, 0x42a00000    # 80.0f

    cmpl-float v5, v0, v3

    if-gtz v5, :cond_1

    cmpl-float v1, v1, v3

    if-lez v1, :cond_5

    .line 13
    :cond_1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_2

    .line 14
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_5

    .line 15
    iput-boolean v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z:Z

    .line 16
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getCurrentPositionWhenPlaying()I

    move-result v0

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->B:I

    goto :goto_0

    .line 17
    :cond_2
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->w:F

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->q:I

    int-to-float v1, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v1, v1, v3

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 18
    iput-boolean v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A:Z

    .line 19
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 20
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    cmpg-float v1, v0, v9

    if-gez v1, :cond_3

    .line 21
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "current system brightness: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Landroid/provider/Settings$SettingNotFoundException;->printStackTrace()V

    goto :goto_0

    :cond_3
    mul-float v0, v0, v11

    .line 24
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "current activity brightness: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 26
    :cond_4
    iput-boolean v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y:Z

    .line 27
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s:Landroid/media/AudioManager;

    invoke-virtual {v0, v10}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->C:I

    .line 28
    :cond_5
    :goto_0
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z:Z

    if-eqz v0, :cond_7

    .line 29
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getDuration()I

    move-result v6

    .line 30
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->B:I

    int-to-float v0, v0

    int-to-float v1, v6

    mul-float v1, v1, v2

    iget v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->q:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    if-le v0, v6, :cond_6

    .line 31
    iput v6, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    .line 32
    :cond_6
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object v3

    .line 33
    invoke-static {v6}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object v5

    .line 34
    iget v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->L(FLjava/lang/String;ILjava/lang/String;I)V

    .line 35
    :cond_7
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y:Z

    const/high16 v1, 0x42c80000    # 100.0f

    const/high16 v2, 0x40400000    # 3.0f

    if-eqz v0, :cond_8

    neg-float v8, v8

    .line 36
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s:Landroid/media/AudioManager;

    invoke-virtual {v0, v10}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    int-to-float v3, v0

    mul-float v3, v3, v8

    mul-float v3, v3, v2

    .line 37
    iget v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->r:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    float-to-int v3, v3

    .line 38
    iget-object v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s:Landroid/media/AudioManager;

    iget v5, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->C:I

    add-int/2addr v5, v3

    invoke-virtual {v4, v10, v5, v7}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 39
    iget v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->C:I

    mul-int/lit8 v3, v3, 0x64

    div-int/2addr v3, v0

    int-to-float v0, v3

    mul-float v3, v8, v2

    mul-float v3, v3, v1

    iget v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->r:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    add-float/2addr v0, v3

    float-to-int v0, v0

    neg-float v3, v8

    .line 40
    invoke-virtual {p0, v3, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->N(FI)V

    .line 41
    :cond_8
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A:Z

    if-eqz v0, :cond_10

    neg-float v0, v8

    mul-float v3, v0, v11

    mul-float v3, v3, v2

    .line 42
    iget v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->r:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    float-to-int v3, v3

    .line 43
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    .line 44
    iget v5, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    int-to-float v3, v3

    add-float v6, v5, v3

    div-float/2addr v6, v11

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v6, v6, v8

    if-ltz v6, :cond_9

    .line 45
    iput v8, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    goto :goto_1

    :cond_9
    add-float v6, v5, v3

    div-float/2addr v6, v11

    cmpg-float v6, v6, v9

    if-gtz v6, :cond_a

    const v3, 0x3c23d70a    # 0.01f

    .line 46
    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    goto :goto_1

    :cond_a
    add-float/2addr v5, v3

    div-float/2addr v5, v11

    .line 47
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 48
    :goto_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 49
    iget v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D:F

    mul-float v3, v3, v1

    div-float/2addr v3, v11

    mul-float v0, v0, v2

    mul-float v0, v0, v1

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->r:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    add-float/2addr v3, v0

    float-to-int v0, v3

    .line 50
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->K(I)V

    goto :goto_3

    .line 51
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTouch surfaceContainer actionUp ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    iput-boolean v7, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->v:Z

    .line 53
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j()V

    .line 54
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->k()V

    .line 55
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->i()V

    .line 56
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z:Z

    if-eqz v0, :cond_d

    const/16 v0, 0xc

    .line 57
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 58
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/b;->b:Landroid/media/MediaPlayer;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 59
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getDuration()I

    move-result v0

    .line 60
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->E:I

    mul-int/lit8 v1, v1, 0x64

    if-nez v0, :cond_c

    goto :goto_2

    :cond_c
    move v4, v0

    :goto_2
    div-int/2addr v1, v4

    .line 61
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 62
    :cond_d
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y:Z

    if-eqz v0, :cond_e

    const/16 v0, 0xb

    .line 63
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 64
    :cond_e
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    goto :goto_3

    .line 65
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onTouch surfaceContainer actionDown ["

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    iput-boolean v4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->v:Z

    .line 67
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->w:F

    .line 68
    iput v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x:F

    .line 69
    iput-boolean v7, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y:Z

    .line 70
    iput-boolean v7, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z:Z

    .line 71
    iput-boolean v7, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A:Z

    :cond_10
    :goto_3
    return v7
.end method

.method public p()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->gc()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAutoCompletion  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x6

    .line 3
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->s(I)V

    .line 4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->k()V

    .line 5
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j()V

    .line 6
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->i()V

    .line 7
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 8
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->v()V

    .line 9
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 10
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d()Z

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v1, v2}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lfm/jiecao/jcvideoplayer_lib/e;->i(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public q()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCompletion  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getCurrentPositionWhenPlaying()I

    move-result v0

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v2, v3}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lfm/jiecao/jcvideoplayer_lib/e;->i(Landroid/content/Context;Ljava/lang/String;I)V

    .line 5
    :cond_1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 6
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x()V

    .line 7
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->n:Landroid/view/ViewGroup;

    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 8
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lfm/jiecao/jcvideoplayer_lib/b;->c:I

    .line 9
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    iput v1, v0, Lfm/jiecao/jcvideoplayer_lib/b;->d:I

    .line 10
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "audio"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 11
    sget-object v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->M1:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 12
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->j(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v2, 0x80

    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 13
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g()V

    .line 14
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/e;->c(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->N:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    const/4 v0, 0x0

    .line 15
    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->j:Lfm/jiecao/jcvideoplayer_lib/JCResizeTextureView;

    .line 16
    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/b;->k:Landroid/graphics/SurfaceTexture;

    .line 17
    iput-boolean v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->b:Z

    return-void
.end method

.method public r(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x26

    if-eq p1, v0, :cond_0

    const/16 v0, -0x26

    if-eq p1, v0, :cond_0

    if-eq p2, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->w()V

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object p1

    invoke-virtual {p1}, Lfm/jiecao/jcvideoplayer_lib/b;->d()V

    :cond_0
    return-void
.end method

.method public s(I)V
    .locals 4

    .line 1
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I1:Lfm/jiecao/jcvideoplayer_lib/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->I1:Lfm/jiecao/jcvideoplayer_lib/c;

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {v0, v2}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    iget-object v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    invoke-interface {v1, p1, v0, v2, v3}, Lfm/jiecao/jcvideoplayer_lib/c;->a(ILjava/lang/String;I[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setBufferProgress(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setSecondaryProgress(I)V

    :cond_0
    return-void
.end method

.method public setProgressAndText(III)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->v:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_0
    if-eqz p2, :cond_1

    .line 3
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l:Landroid/widget/TextView;

    invoke-static {p2}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m:Landroid/widget/TextView;

    invoke-static {p3}, Lfm/jiecao/jcvideoplayer_lib/e;->k(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setState(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(III)V

    return-void
.end method

.method public setState(III)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->w()V

    goto :goto_0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->v()V

    goto :goto_0

    .line 4
    :pswitch_2
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->y()V

    goto :goto_0

    .line 5
    :pswitch_3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z()V

    goto :goto_0

    .line 6
    :pswitch_4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->A()V

    goto :goto_0

    .line 7
    :pswitch_5
    invoke-virtual {p0, p2, p3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->C(II)V

    goto :goto_0

    .line 8
    :pswitch_6
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->B()V

    goto :goto_0

    .line 9
    :pswitch_7
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public varargs setUp(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "URL_KEY_DEFAULT"

    .line 2
    invoke-virtual {v0, v1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUp(Ljava/util/LinkedHashMap;II[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs setUp(Ljava/util/LinkedHashMap;II[Ljava/lang/Object;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_0

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {p1, v0}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 5
    invoke-static {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    invoke-static {p1, v1}, Lfm/jiecao/jcvideoplayer_lib/e;->d(Ljava/util/LinkedHashMap;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->F:Ljava/util/LinkedHashMap;

    .line 7
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->G:I

    .line 8
    iput p3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d:I

    .line 9
    iput-object p4, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->g:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->f:Ljava/util/Map;

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->b:Z

    .line 12
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->x()V

    return-void
.end method

.method public t(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onInfo what - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " extra - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 p2, 0x4

    const/16 v0, 0x2bd

    if-ne p1, v0, :cond_1

    .line 2
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-ne p1, p2, :cond_0

    return-void

    .line 3
    :cond_0
    sput p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H1:I

    .line 4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->z()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x2be

    if-ne p1, v0, :cond_3

    .line 5
    sget p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H1:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_4

    .line 6
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    if-ne v1, p2, :cond_2

    .line 7
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    .line 8
    :cond_2
    sput v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H1:I

    goto :goto_0

    :cond_3
    const/4 p2, 0x3

    if-ne p1, p2, :cond_4

    .line 9
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->D()V

    :cond_4
    :goto_0
    return-void
.end method

.method public u()V
    .locals 0

    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateAutoComplete  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 4
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->j:Landroid/widget/SeekBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 5
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public w()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateError  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x7

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateNormal  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->e()V

    .line 4
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/b;->b()Lfm/jiecao/jcvideoplayer_lib/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/b;->d()V

    :cond_0
    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStatePause  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStatePlaybackBufferingStart  ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    .line 3
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->R()V

    return-void
.end method
