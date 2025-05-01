.class public Lcom/join/mgps/adapter/o3;
.super Landroid/widget/BaseAdapter;
.source "PapaMainAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/o3$l1;,
        Lcom/join/mgps/adapter/o3$n2;,
        Lcom/join/mgps/adapter/o3$i2;,
        Lcom/join/mgps/adapter/o3$f2;,
        Lcom/join/mgps/adapter/o3$u1;,
        Lcom/join/mgps/adapter/o3$p1;,
        Lcom/join/mgps/adapter/o3$l2;,
        Lcom/join/mgps/adapter/o3$z1;,
        Lcom/join/mgps/adapter/o3$t1;,
        Lcom/join/mgps/adapter/o3$s1;,
        Lcom/join/mgps/adapter/o3$r1;,
        Lcom/join/mgps/adapter/o3$t2;,
        Lcom/join/mgps/adapter/o3$c2;,
        Lcom/join/mgps/adapter/o3$b2;,
        Lcom/join/mgps/adapter/o3$v1;,
        Lcom/join/mgps/adapter/o3$g2;,
        Lcom/join/mgps/adapter/o3$j2;,
        Lcom/join/mgps/adapter/o3$e2;,
        Lcom/join/mgps/adapter/o3$d2;,
        Lcom/join/mgps/adapter/o3$m2;,
        Lcom/join/mgps/adapter/o3$q1;,
        Lcom/join/mgps/adapter/o3$m1;,
        Lcom/join/mgps/adapter/o3$n1;,
        Lcom/join/mgps/adapter/o3$o1;,
        Lcom/join/mgps/adapter/o3$w1;,
        Lcom/join/mgps/adapter/o3$x1;,
        Lcom/join/mgps/adapter/o3$o2;,
        Lcom/join/mgps/adapter/o3$p2;,
        Lcom/join/mgps/adapter/o3$q2;,
        Lcom/join/mgps/adapter/o3$k2;,
        Lcom/join/mgps/adapter/o3$r2;,
        Lcom/join/mgps/adapter/o3$s2;,
        Lcom/join/mgps/adapter/o3$y1;,
        Lcom/join/mgps/adapter/o3$h2;,
        Lcom/join/mgps/adapter/o3$a2;,
        Lcom/join/mgps/adapter/o3$u2;,
        Lcom/join/mgps/adapter/o3$v2;,
        Lcom/join/mgps/adapter/o3$k1;
    }
.end annotation


# static fields
.field public static final A:I = 0xc

.field public static final B:I = 0xd

.field public static final C:I = 0xe

.field public static final D:I = 0xf

.field public static final E:I = 0x10

.field public static final F:I = 0x12

.field public static final G:I = 0x13

.field public static final H:I = 0x14

.field public static final I:I = 0x15

.field public static final J:I = 0x16

.field public static final K:I = 0x17

.field public static final L:I = 0x18

.field public static final M:I = 0x19

.field public static final N:I = 0x1a

.field public static final O:I = 0x1b

.field public static final P:I = 0x1c

.field public static final Q:I = 0x1d

.field public static final R:I = 0x1e

.field public static final S:I = 0x1f

.field public static final T:I = 0x20

.field public static final U:I = 0x21

.field public static final V:I = 0x22

.field public static final W:I = 0x23

.field public static final X:I = 0x24

.field public static final Y:I = 0x25

.field public static final Z:I = 0x26

.field public static final o:I = 0x0

.field public static final p:I = 0x1

.field public static final p0:I = 0x27

.field private static p1:Lcom/join/mgps/adapter/o3$u2; = null

.field public static final q:I = 0x2

.field public static final r:I = 0x3

.field public static final s:I = 0x4

.field public static final t:I = 0x5

.field public static final u:I = 0x6

.field public static final v:I = 0x7

.field public static final w:I = 0x8

.field public static final x:I = 0x9

.field public static final y:I = 0xa

.field public static final z:I = 0xb


# instance fields
.field private final b:Landroid/view/LayoutInflater;

.field private c:Landroid/content/Context;

.field d:Landroidx/fragment/app/Fragment;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/join/mgps/adapter/o3$y1;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroid/os/CountDownTimer;

.field private h:Landroid/os/CountDownTimer;

.field private i:Lc2/f;

.field public j:I

.field private k:Landroid/os/Handler;

.field l:Lcom/join/android/app/component/video/c;

.field m:Lcom/join/mgps/customview/NavigationAdapter;

.field private n:Lcom/join/mgps/adapter/o3$l1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;Ljava/util/List;Lcom/join/android/app/component/video/c;Lc2/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;",
            "Lcom/join/android/app/component/video/c;",
            "Lc2/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/o3$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/o3$k;-><init>(Lcom/join/mgps/adapter/o3;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/o3;->k:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    .line 4
    iput-object p1, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcom/join/mgps/adapter/o3;->d:Landroidx/fragment/app/Fragment;

    .line 6
    iput-object p4, p0, Lcom/join/mgps/adapter/o3;->l:Lcom/join/android/app/component/video/c;

    const-string p2, "layout_inflater"

    .line 7
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/o3;->f:Ljava/util/Map;

    .line 9
    iput-object p5, p0, Lcom/join/mgps/adapter/o3;->i:Lc2/f;

    .line 10
    iput-object p3, p0, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    return-void
.end method

.method static synthetic A()Lcom/join/mgps/adapter/o3$u2;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    return-object v0
.end method

.method static synthetic B(Lcom/join/mgps/adapter/o3;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/o3;->k:Landroid/os/Handler;

    return-object p0
.end method

.method private C(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/business/RecomDatabeanBusiness;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 2
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/AppBeanMain;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p2

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "0"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->T(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private D(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic E(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p0

    new-instance v0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic F(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p0

    new-instance v0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic G(Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p3

    const/4 p5, 0x0

    if-nez p3, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    const p3, 0x7f090d5b

    .line 3
    :try_start_0
    invoke-virtual {p4, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ProgressBar;

    const v0, 0x7f0914f9

    .line 4
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p5, 0x4

    :cond_2
    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p3

    .line 7
    invoke-virtual {p3}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :goto_2
    iget-object p3, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    if-eqz p3, :cond_3

    .line 9
    invoke-interface {p3, p2, p1}, Lcom/join/mgps/adapter/o3$l1;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_3
    return-void
.end method

.method private synthetic H(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    const-string p1, "3-1"

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->T(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic I(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const-class v2, Lcom/join/kotlin/EverdayNewGameActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    const-string p1, "3-3"

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->T(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic J(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    const-string p1, "3-2"

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->T(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic K(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;ILandroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p4

    if-nez p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p1, p4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 2
    iget-object p4, p2, Lcom/join/mgps/adapter/o3$p1;->n:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x4

    :goto_1
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iget-object p2, p2, Lcom/join/mgps/adapter/o3$p1;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p4

    if-eqz p4, :cond_2

    const/4 v0, 0x4

    :cond_2
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p2, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    if-eqz p2, :cond_3

    invoke-interface {p2, p3, p1}, Lcom/join/mgps/adapter/o3$l1;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_3
    return-void
.end method

.method private synthetic L(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->U(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic M(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    .line 2
    new-instance p2, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p2}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 p3, 0x1

    .line 3
    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    if-nez p3, :cond_0

    .line 6
    new-instance p3, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p3}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 7
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->get_from()I

    move-result p4

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->get_from_type()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p3

    iget-object p4, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {p3, p4, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->U(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic N(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic O(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    .line 3
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->U(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic P(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->U(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/ProgressBar;Landroid/widget/TextView;ILandroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p5

    const/4 v0, 0x0

    if-nez p5, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p5

    if-nez p5, :cond_0

    const/4 p5, 0x1

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    invoke-virtual {p1, p5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p5

    const/4 v1, 0x4

    if-eqz p5, :cond_1

    const/4 p5, 0x0

    goto :goto_1

    :cond_1
    const/4 p5, 0x4

    :goto_1
    invoke-virtual {p2, p5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x4

    :cond_2
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p2, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    if-eqz p2, :cond_3

    invoke-interface {p2, p4, p1}, Lcom/join/mgps/adapter/o3$l1;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_3
    return-void
.end method

.method private R(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-nez p2, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p2

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->isHasExposure()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "home"

    .line 6
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v3, "204"

    .line 7
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    iget-object v3, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v1, v5}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->setHasExposure(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private S(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-nez p2, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p2

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isHasExposure()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "home"

    .line 6
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v3, "206"

    .line 7
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0, v3}, Lcom/join/mgps/adapter/o3;->D(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    iget-object v3, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0, v5}, Lcom/join/mgps/adapter/o3;->D(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v1, v5}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setHasExposure(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private T(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "22-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private U(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private V(Lcom/psk/eventmodule/Event;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V
    .locals 15

    const-string v0, "-"

    move-object/from16 v1, p2

    .line 1
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 2
    array-length v1, v0

    const-string v2, "\u6a21\u5757"

    const-string v3, "0"

    const-string v4, "\u5927\u5bb6\u90fd\u5728\u73a9"

    const-string v5, "\u7f51\u6e38\u63a8\u8350"

    const-string v6, "\u6700\u65b0\u7f51\u6e38"

    if-lez v1, :cond_7

    const/4 v1, 0x0

    .line 3
    aget-object v7, v0, v1

    const-string v8, "4"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    .line 4
    array-length v1, v0

    if-le v1, v8, :cond_0

    aget-object v3, v0, v8

    :cond_0
    move-object v8, v3

    move-object v7, v4

    goto :goto_1

    .line 5
    :cond_1
    aget-object v4, v0, v1

    const-string v7, "7"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 6
    array-length v1, v0

    if-le v1, v8, :cond_2

    aget-object v3, v0, v8

    :cond_2
    move-object v8, v3

    move-object v7, v5

    goto :goto_1

    .line 7
    :cond_3
    aget-object v4, v0, v1

    const-string v5, "5"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 8
    array-length v1, v0

    if-le v1, v8, :cond_4

    aget-object v3, v0, v8

    :cond_4
    move-object v8, v3

    move-object v7, v6

    goto :goto_1

    .line 9
    :cond_5
    aget-object v1, v0, v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 10
    array-length v1, v0

    const/4 v4, 0x2

    if-le v1, v4, :cond_6

    .line 11
    aget-object v3, v0, v4

    .line 12
    :cond_6
    array-length v1, v0

    const/4 v4, 0x3

    if-le v1, v4, :cond_8

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v0, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 14
    aget-object v3, v0, v4

    goto :goto_0

    :cond_7
    const-string v2, ""

    :cond_8
    :goto_0
    move-object v7, v2

    move-object v8, v3

    .line 15
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "volcannoEvent"

    invoke-static {v1, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->Companion:Lcom/psk/eventmodule/StatFactory$Companion;

    move-object v1, p0

    iget-object v2, v1, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/psk/eventmodule/StatFactory$Companion;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/StatFactory;

    move-result-object v0

    new-instance v2, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    new-instance v12, Lcom/psk/eventmodule/StatFactory$SpmData;

    const/4 v9, 0x0

    const-string v5, "wufun"

    const-string v6, "home"

    move-object v4, v12

    invoke-direct/range {v4 .. v9}, Lcom/psk/eventmodule/StatFactory$SpmData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v9, v2

    move-object/from16 v10, p1

    move-object/from16 v11, p3

    move-object/from16 v13, p4

    move/from16 v14, p5

    invoke-direct/range {v9 .. v14}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;-><init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    invoke-virtual {v0, v2}, Lcom/psk/eventmodule/StatFactory;->sendEvent(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;)V

    return-void
.end method

.method private W(Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V
    .locals 6

    .line 1
    sget-object v1, Lcom/psk/eventmodule/Event;->click:Lcom/psk/eventmodule/Event;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/adapter/o3;->V(Lcom/psk/eventmodule/Event;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    return-void
.end method

.method private X(Lcom/papa/sim/statistic/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/e;->j(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/p;->s(Lcom/papa/sim/statistic/e;)V

    return-void
.end method

.method private Y(Lcom/join/mgps/dto/AppBean;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/papa/sim/statistic/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getIco_remote()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f08016b

    invoke-static {p3, v0, p2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 5
    new-instance p2, Lcom/join/mgps/adapter/o3$z0;

    invoke-direct {p2, p0, p4, p1}, Lcom/join/mgps/adapter/o3$z0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/papa/sim/statistic/e;Lcom/join/mgps/dto/AppBean;)V

    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->P(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method private a0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/adapter/o3;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->N(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/adapter/o3;->F(Landroid/view/View;)V

    return-void
.end method

.method private c0()V
    .locals 10

    .line 1
    sget-object v0, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/join/mgps/Util/y;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " 23:59:59"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/y;->F(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v6, v0, v2

    const-wide/16 v0, 0x0

    cmp-long v2, v6, v0

    if-lez v2, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->g:Landroid/os/CountDownTimer;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lcom/join/mgps/adapter/o3$f1;

    const-wide/16 v8, 0x3e8

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lcom/join/mgps/adapter/o3$f1;-><init>(Lcom/join/mgps/adapter/o3;JJ)V

    iput-object v0, p0, Lcom/join/mgps/adapter/o3;->g:Landroid/os/CountDownTimer;

    .line 6
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    :cond_1
    return-void
.end method

.method public static synthetic d(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/adapter/o3;->E(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->H(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method private e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v7, p6

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const v4, 0x7f080983

    .line 2
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getIco_remote()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v8, p3

    invoke-static {v8, v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_1

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getSize()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "M"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    invoke-static {v5, v7, v4}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v5}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v5, 0x7f080c43

    const v8, 0x7f06002b

    if-eqz v3, :cond_3

    .line 9
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v2, "\u5f00\u59cb"

    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v2, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v0, 0x8

    .line 12
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u66f4\u65b0"

    const v3, 0x7f060034

    const v9, 0x7f1000f7

    const v10, 0x7f080c4f

    const v11, 0x7f060031

    const v12, 0x7f080c48

    if-nez v4, :cond_7

    .line 13
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 14
    iget-object v4, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v5, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v5, v8}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 15
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_5

    .line 16
    iget-object v4, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v5, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v5, v8}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v4

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v4, v2, :cond_4

    .line 18
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 21
    :cond_4
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 22
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 24
    :cond_5
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 25
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 26
    invoke-static {v0, v7, v2}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_0

    .line 27
    :cond_6
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 28
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 29
    invoke-static {v0, v7, v2}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_0

    .line 30
    :cond_7
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v13

    .line 31
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v14

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v14

    const/16 v15, 0x2b

    if-lez v14, :cond_8

    const/16 v13, 0x2b

    :cond_8
    if-eqz v13, :cond_e

    const/16 v14, 0x1b

    if-eq v13, v14, :cond_d

    const/16 v14, 0x30

    if-eq v13, v14, :cond_c

    const/4 v14, 0x2

    if-eq v13, v14, :cond_b

    const/4 v4, 0x3

    if-eq v13, v4, :cond_a

    const/4 v4, 0x5

    if-eq v13, v4, :cond_9

    const/4 v4, 0x6

    if-eq v13, v4, :cond_a

    const/4 v4, 0x7

    if-eq v13, v4, :cond_e

    const/16 v4, 0x2a

    if-eq v13, v4, :cond_9

    if-eq v13, v15, :cond_e

    packed-switch v13, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const v1, 0x7f080c5c

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u89e3\u538b"

    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :pswitch_1
    const v1, 0x7f08043a

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u89e3\u538b\u4e2d"

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060032

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 38
    :pswitch_2
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u5b89\u88c5"

    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 41
    :pswitch_3
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u7b49\u5f85"

    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 44
    :pswitch_4
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 47
    :cond_9
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 48
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 50
    :cond_a
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u7ee7\u7eed"

    .line 51
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 53
    :cond_b
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 54
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u6682\u505c"

    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 57
    :cond_c
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v1, "\u5b89\u88c5\u4e2d"

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object v1, v6, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_d
    const-string v1, "\u6682\u505c\u4e2d"

    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 61
    :cond_e
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 62
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 63
    invoke-static {v0, v7, v2}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    .line 64
    :goto_0
    new-instance v8, Lcom/join/mgps/adapter/o3$k1;

    const/4 v3, 0x1

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/adapter/o3$k1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic f(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->J(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method private f0(Lcom/join/mgps/adapter/o3$s1;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;ZI)V
    .locals 17

    move-object/from16 v0, p1

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v1, v0, Lcom/join/mgps/adapter/o3$s1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    iget-object v2, v0, Lcom/join/mgps/adapter/o3$s1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 3
    iget-object v5, v0, Lcom/join/mgps/adapter/o3$s1;->c:Landroid/widget/TextView;

    .line 4
    iget-object v6, v0, Lcom/join/mgps/adapter/o3$s1;->i:Landroid/widget/TextView;

    .line 5
    iget-object v7, v0, Lcom/join/mgps/adapter/o3$s1;->j:Landroid/widget/FrameLayout;

    .line 6
    iget-object v14, v0, Lcom/join/mgps/adapter/o3$s1;->k:Landroid/widget/TextView;

    .line 7
    iget-object v15, v0, Lcom/join/mgps/adapter/o3$s1;->d:Landroid/widget/LinearLayout;

    .line 8
    iget-object v4, v0, Lcom/join/mgps/adapter/o3$s1;->e:Landroid/widget/TextView;

    .line 9
    iget-object v3, v0, Lcom/join/mgps/adapter/o3$s1;->f:Landroid/widget/TextView;

    .line 10
    iget-object v13, v0, Lcom/join/mgps/adapter/o3$s1;->g:Landroid/widget/ProgressBar;

    .line 11
    iget-object v12, v0, Lcom/join/mgps/adapter/o3$s1;->h:Landroid/widget/ProgressBar;

    .line 12
    iget-object v11, v0, Lcom/join/mgps/adapter/o3$s1;->l:Landroid/widget/ProgressBar;

    .line 13
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    sget-object v8, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v2, v0, v8}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 14
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    if-nez v0, :cond_1

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    .line 16
    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v8, 0x4

    .line 17
    invoke-virtual {v11, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 19
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v0

    const-string v9, ","

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    .line 21
    :goto_1
    array-length v10, v0

    if-ge v9, v10, :cond_3

    .line 22
    aget-object v10, v0, v9

    .line 23
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " | "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v10, 0x1

    if-lt v9, v10, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 24
    :cond_3
    :goto_2
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {v8, v2, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    :cond_4
    new-instance v0, Lcom/join/mgps/adapter/g3;

    move-object/from16 v2, p0

    move-object/from16 v10, p2

    invoke-direct {v0, v2, v10}, Lcom/join/mgps/adapter/g3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    new-instance v0, Lcom/join/mgps/adapter/k3;

    move-object v8, v0

    move-object/from16 v9, p0

    move-object v1, v12

    move-object v12, v14

    move-object/from16 v16, v13

    move/from16 v13, p4

    invoke-direct/range {v8 .. v13}, Lcom/join/mgps/adapter/k3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/ProgressBar;Landroid/widget/TextView;I)V

    invoke-virtual {v7, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object v0, v3

    move-object/from16 v3, p0

    move-object v10, v4

    move-object/from16 v4, p2

    move-object v8, v14

    move-object v9, v15

    move-object v11, v0

    move-object/from16 v12, v16

    move-object v13, v1

    .line 27
    invoke-direct/range {v3 .. v13}, Lcom/join/mgps/adapter/o3;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V

    return-void
.end method

.method public static synthetic g(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->L(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/o3;->K(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;ILandroid/view/View;)V

    return-void
.end method

.method private h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p5, :cond_0

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p6, :cond_1

    .line 7
    invoke-virtual {p4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic i(Lcom/join/mgps/adapter/o3;Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/o3;->O(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic j(Lcom/join/mgps/adapter/o3;Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/o3;->M(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/ProgressBar;Landroid/widget/TextView;ILandroid/view/View;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/join/mgps/adapter/o3;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/ProgressBar;Landroid/widget/TextView;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/join/mgps/adapter/o3;Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/join/mgps/adapter/o3;->G(Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/adapter/o3;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->I(Landroid/view/View;)V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/adapter/o3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/adapter/o3;->c0()V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/adapter/o3;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic p(Lcom/join/mgps/adapter/o3;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->T(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q(Lcom/join/mgps/adapter/o3;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/o3;->W(Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    return-void
.end method

.method static synthetic r(Lcom/join/mgps/adapter/o3;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->C(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic s(Lcom/join/mgps/adapter/o3;)Lc2/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/o3;->i:Lc2/f;

    return-object p0
.end method

.method static synthetic t(Lcom/join/mgps/adapter/o3;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u(Lcom/join/mgps/adapter/o3;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->U(Ljava/lang/String;)V

    return-void
.end method

.method private update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v0, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v14

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v15

    const-wide/16 v16, 0x0

    if-eqz v14, :cond_0

    .line 3
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    move-wide/from16 v18, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v18, v16

    :goto_0
    if-eqz v15, :cond_1

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "\u5f00\u59cb"

    .line 5
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0x8

    move-object/from16 v1, p2

    .line 6
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_5

    :cond_1
    const-string v7, "\u66f4\u65b0"

    const-string v6, "\u542f\u52a8"

    const-string v5, "\u83b7\u53d6"

    if-nez v14, :cond_6

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object v13, v5

    move-object/from16 v5, p9

    move-object v12, v6

    move v6, v10

    move-object v10, v7

    move v7, v11

    .line 7
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 8
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v15, :cond_2

    return-void

    .line 9
    :cond_2
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 10
    iget-object v1, v8, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, v8, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    .line 12
    iget-object v0, v8, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, v8, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 13
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 14
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 15
    :cond_3
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 16
    :cond_4
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 17
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_5

    .line 18
    :cond_5
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 19
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_5

    :cond_6
    move-object v3, v5

    move-object v2, v6

    move-object v1, v7

    .line 20
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    const/16 v5, 0x2b

    if-eqz v15, :cond_7

    .line 21
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_7

    const/16 v4, 0x2b

    :cond_7
    if-eqz v4, :cond_f

    const/16 v6, 0x1b

    const-string v7, "\u6682\u505c"

    if-eq v4, v6, :cond_e

    const/16 v6, 0x30

    if-eq v4, v6, :cond_d

    const/4 v6, 0x2

    move-object/from16 p1, v7

    const-string v7, "/"

    if-eq v4, v6, :cond_b

    const/4 v6, 0x3

    if-eq v4, v6, :cond_9

    const/4 v6, 0x5

    if-eq v4, v6, :cond_8

    const/4 v6, 0x6

    if-eq v4, v6, :cond_9

    const/4 v6, 0x7

    if-eq v4, v6, :cond_f

    const/16 v6, 0x2a

    if-eq v4, v6, :cond_8

    if-eq v4, v5, :cond_f

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const/4 v6, 0x0

    const/4 v0, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    move-object v15, v7

    move v7, v0

    .line 22
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 24
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v12, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b"

    .line 26
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :pswitch_1
    move-object v15, v7

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 27
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 29
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v12, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 31
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :pswitch_2
    const-string v0, "\u5b89\u88c5"

    .line 32
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 33
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    :pswitch_3
    move-object v15, v7

    const-string v0, "\u7b49\u5f85"

    .line 34
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 35
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    :try_start_0
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 39
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 40
    :pswitch_4
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 41
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    .line 42
    :cond_8
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 43
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u7ee7\u7eed"

    .line 44
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v0, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    move-object v15, v7

    move v7, v0

    .line 45
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 46
    :try_start_1
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-nez v2, :cond_a

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 48
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    :goto_2
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    const-string v0, "\u6682\u505c\u4e2d"

    .line 51
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :cond_b
    move-object v15, v7

    .line 52
    invoke-static {v14}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    move-object/from16 v0, p1

    .line 53
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 54
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 55
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-nez v2, :cond_c

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 57
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    :goto_4
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 59
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/S"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_d
    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 61
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 62
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto :goto_5

    :cond_e
    move-object v0, v7

    .line 63
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 64
    :cond_f
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 66
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 67
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/o3;->h0(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic v(Lcom/join/mgps/adapter/o3;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->R(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method static synthetic w(Lcom/join/mgps/adapter/o3;)Lcom/join/mgps/adapter/o3$l1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    return-object p0
.end method

.method static synthetic x(Lcom/join/mgps/adapter/o3;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/o3;->S(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method static synthetic y(Lcom/join/mgps/adapter/o3;Lcom/papa/sim/statistic/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/o3;->X(Lcom/papa/sim/statistic/e;)V

    return-void
.end method

.method static synthetic z(Lcom/join/mgps/adapter/o3;Lcom/psk/eventmodule/Event;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/join/mgps/adapter/o3;->V(Lcom/psk/eventmodule/Event;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    return-void
.end method


# virtual methods
.method public Z(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public b0(Lcom/join/mgps/adapter/o3$l1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o3;->n:Lcom/join/mgps/adapter/o3$l1;

    return-void
.end method

.method public d0()V
    .locals 3

    .line 1
    sget-object v0, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/join/mgps/adapter/o3$u2;->l(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    sget-object v0, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v0}, Lcom/join/mgps/adapter/o3$u2;->g(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    sget-object v0, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v0}, Lcom/join/mgps/adapter/o3$u2;->i(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/join/mgps/adapter/o3;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method g0(Lcom/join/mgps/adapter/o3$w1;Lcom/join/mgps/business/RecomDatabeanBusiness;II)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_0

    move-object v2, v4

    move-object v8, v2

    move-object v9, v8

    const/4 v10, 0x0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    .line 1
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->c(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void

    .line 2
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->c(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/LinearLayout;

    move-result-object v2

    const v4, 0x7f090e44

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/TextView;

    .line 3
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->c(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->g(Lcom/join/mgps/adapter/o3$w1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    .line 5
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->k(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/TextView;

    move-result-object v8

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->o(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/TextView;

    move-result-object v9

    mul-int/lit8 v10, p3, 0x2

    move-object/from16 v16, v4

    move-object v4, v2

    move-object v2, v8

    move-object v8, v9

    move-object/from16 v9, v16

    goto :goto_0

    .line 7
    :cond_2
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->e(Lcom/join/mgps/adapter/o3$w1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    .line 8
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->i(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/TextView;

    move-result-object v2

    .line 9
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->m(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/TextView;

    move-result-object v8

    mul-int/lit8 v9, p3, 0x2

    add-int/lit8 v10, v9, -0x1

    .line 10
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/adapter/o3$w1;->a(Lcom/join/mgps/adapter/o3$w1;)Landroid/widget/LinearLayout;

    move-result-object v9

    const v11, 0x7f090e42

    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    :goto_0
    if-nez v1, :cond_3

    return-void

    .line 11
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_18

    .line 12
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-lez v12, :cond_18

    .line 13
    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/AppBeanMain;

    .line 14
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v12

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v13

    if-eqz v13, :cond_17

    .line 16
    invoke-virtual {v12}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v14

    const/4 v15, 0x5

    const v7, 0x7f080c55

    const v5, 0x7f0800a8

    if-eq v14, v6, :cond_5

    const/high16 v1, 0x41400000    # 12.0f

    if-eq v14, v3, :cond_4

    if-eq v14, v15, :cond_4

    .line 17
    invoke-virtual {v13}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    iget-object v6, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v6}, Lcom/join/android/app/common/utils/MyImageLoader;->D(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v6

    invoke-static {v4, v7, v3, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 18
    invoke-virtual {v13}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 20
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u67e5\u770b"

    .line 21
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x2

    .line 22
    invoke-virtual {v8, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 23
    new-instance v1, Lcom/join/mgps/adapter/o3$d1;

    invoke-direct {v1, v0, v12, v10}, Lcom/join/mgps/adapter/o3$d1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/Util/IntentDateBean;I)V

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 24
    :cond_4
    invoke-virtual {v13}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    iget-object v6, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v6}, Lcom/join/android/app/common/utils/MyImageLoader;->D(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v6

    invoke-static {v4, v7, v3, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 25
    invoke-virtual {v13}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 27
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u6253\u5f00"

    .line 28
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x2

    .line 29
    invoke-virtual {v8, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 30
    new-instance v1, Lcom/join/mgps/adapter/o3$b1;

    invoke-direct {v1, v0, v12, v10}, Lcom/join/mgps/adapter/o3$b1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/Util/IntentDateBean;I)V

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 31
    :cond_5
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v3

    if-eqz v3, :cond_17

    .line 32
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v14

    invoke-static {v14, v9}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 33
    invoke-virtual {v13}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v9

    iget-object v13, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v13}, Lcom/join/android/app/common/utils/MyImageLoader;->D(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v13

    invoke-static {v4, v7, v9, v13}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 34
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v7}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v13, "\u5f00\u59cb"

    const v14, 0x7f080c43

    const v15, 0x7f06002b

    if-eqz v2, :cond_6

    .line 36
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 37
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 39
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 40
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 41
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 43
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    const-string v6, "\u66f4\u65b0"

    const v7, 0x7f060034

    const v9, 0x7f1000f7

    const v13, 0x7f0800ac

    if-nez v2, :cond_e

    .line 44
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 45
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v15, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v15, v14}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    .line 46
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v14

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v15

    invoke-virtual {v15}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v14

    if-lez v14, :cond_8

    const/4 v2, 0x0

    :cond_8
    if-eqz v2, :cond_a

    .line 47
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v11, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v11, v14}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v2

    .line 48
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    if-ge v2, v11, :cond_9

    .line 49
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 50
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060031

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 52
    :cond_9
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 53
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 55
    :cond_a
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 56
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 57
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 58
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v2

    if-lez v2, :cond_b

    .line 59
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v2

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 60
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const v6, 0x7f100305

    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 61
    :cond_b
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f1000f6

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :goto_1
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060031

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 64
    invoke-static {v8, v3}, Lcom/join/mgps/Util/UtilsMy;->c3(Landroid/widget/TextView;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_4

    .line 65
    :cond_c
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 66
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 67
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 68
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v2

    if-lez v2, :cond_d

    .line 69
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v2

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_d

    .line 70
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const v6, 0x7f100305

    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 71
    :cond_d
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f1000f6

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    :goto_2
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060031

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 73
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 74
    invoke-static {v8, v3}, Lcom/join/mgps/Util/UtilsMy;->c3(Landroid/widget/TextView;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_4

    .line 75
    :cond_e
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v14

    invoke-static {v2, v14}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    const/16 v14, 0x2b

    if-lez v2, :cond_f

    .line 76
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    invoke-virtual {v2, v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 77
    :cond_f
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const v15, 0x7f0800a3

    if-eqz v2, :cond_15

    const/16 v7, 0x1b

    if-eq v2, v7, :cond_14

    const/16 v7, 0x30

    if-eq v2, v7, :cond_13

    const/4 v7, 0x2

    if-eq v2, v7, :cond_12

    const/4 v7, 0x3

    if-eq v2, v7, :cond_11

    const/4 v7, 0x5

    if-eq v2, v7, :cond_10

    const/4 v7, 0x6

    if-eq v2, v7, :cond_11

    const/4 v7, 0x7

    if-eq v2, v7, :cond_15

    const/16 v7, 0x2a

    if-eq v2, v7, :cond_10

    if-eq v2, v14, :cond_15

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_4

    .line 78
    :pswitch_0
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 79
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f06002b

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u89e3\u538b"

    .line 80
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :pswitch_1
    const v2, 0x7f0800a7

    .line 81
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string v2, "\u89e3\u538b\u4e2d"

    .line 82
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060032

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 84
    :pswitch_2
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 85
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060031

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u5b89\u88c5"

    .line 86
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 87
    :pswitch_3
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 88
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f06002b

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u7b49\u5f85"

    .line 89
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 90
    :pswitch_4
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 91
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060031

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 92
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 93
    :cond_10
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 94
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060034

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 96
    :cond_11
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 97
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f06002b

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u7ee7\u7eed"

    .line 98
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_12
    const v5, 0x7f06002b

    .line 99
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 100
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u6682\u505c"

    .line 101
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_13
    const v5, 0x7f06002b

    .line 102
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 103
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u5b89\u88c5\u4e2d"

    .line 104
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_14
    const-string v2, "\u6682\u505c\u4e2d"

    .line 105
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 106
    :cond_15
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 107
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f06002b

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    if-eqz v2, :cond_16

    .line 109
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    if-eqz v2, :cond_16

    .line 110
    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v2

    if-lez v2, :cond_16

    .line 111
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v2

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_16

    .line 112
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v11}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const v6, 0x7f100305

    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 113
    :cond_16
    iget-object v2, v0, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f1000f6

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    :goto_3
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 115
    invoke-static {v8, v3}, Lcom/join/mgps/Util/UtilsMy;->c3(Landroid/widget/TextView;Lcom/join/mgps/dto/AppBean;)V

    .line 116
    :goto_4
    new-instance v2, Lcom/join/mgps/adapter/o3$a1;

    invoke-direct {v2, v0, v1, v3, v10}, Lcom/join/mgps/adapter/o3$a1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/AppBean;I)V

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    :cond_17
    :goto_5
    new-instance v1, Lcom/join/mgps/adapter/o3$e1;

    invoke-direct {v1, v0, v10, v12}, Lcom/join/mgps/adapter/o3$e1;-><init>(Lcom/join/mgps/adapter/o3;ILcom/join/mgps/Util/IntentDateBean;)V

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_18
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result p1

    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 47

    move-object/from16 v12, p0

    move/from16 v1, p1

    .line 1
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/adapter/o3;->getItemViewType(I)I

    move-result v2

    const/16 v3, 0x15

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    .line 2
    iget-object v1, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0546

    invoke-virtual {v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    return-object v1

    :cond_0
    const v3, 0x7f091461

    const/4 v10, 0x0

    if-nez p2, :cond_1

    const v5, 0x7f0908a9

    const v6, 0x7f09109f

    const v7, 0x7f0900f1

    const v8, 0x7f090109

    const v9, 0x7f09063c

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move-object/from16 v6, p2

    :goto_0
    move-object v5, v4

    move-object v7, v5

    :goto_1
    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    goto/16 :goto_6

    .line 3
    :pswitch_1
    new-instance v5, Lcom/join/mgps/adapter/o3$n2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$n2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 4
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c062d

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_e

    const v7, 0x7f090c6b

    .line 5
    :try_start_1
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$n2;->a:Landroid/view/View;

    .line 6
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_0

    .line 7
    :pswitch_2
    :try_start_2
    new-instance v5, Lcom/join/mgps/adapter/o3$i2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$i2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 8
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06cd

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_e

    const v7, 0x7f0910e9

    .line 9
    :try_start_3
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v23, v21

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v22, v5

    goto :goto_2

    .line 11
    :pswitch_3
    :try_start_4
    new-instance v5, Lcom/join/mgps/adapter/o3$l2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$l2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 12
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06ce

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_e

    const v7, 0x7f0912df

    .line 13
    :try_start_5
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$l2;->b(Lcom/join/mgps/adapter/o3$l2;Landroid/view/View;)Landroid/view/View;

    .line 14
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v18, v16

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v17, v5

    :goto_2
    move-object/from16 v5, v39

    goto/16 :goto_6

    .line 15
    :pswitch_4
    :try_start_6
    new-instance v5, Lcom/join/mgps/adapter/o3$f2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$f2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 16
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0347

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_e

    const v7, 0x7f0911a2

    .line 17
    :try_start_7
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$f2;->b(Lcom/join/mgps/adapter/o3$f2;Landroidx/constraintlayout/widget/ConstraintLayout;)Landroidx/constraintlayout/widget/ConstraintLayout;

    const v7, 0x7f091356

    .line 18
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$f2;->d(Lcom/join/mgps/adapter/o3$f2;Lcom/join/mgps/customview/SlidingTabLayout6;)Lcom/join/mgps/customview/SlidingTabLayout6;

    const v7, 0x7f0917b0

    .line 19
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/viewpager/widget/ViewPager;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$f2;->f(Lcom/join/mgps/adapter/o3$f2;Landroidx/viewpager/widget/ViewPager;)Landroidx/viewpager/widget/ViewPager;

    const v7, 0x7f090e60

    .line 20
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$f2;->h(Lcom/join/mgps/adapter/o3$f2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 21
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v30, v28

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v29, v5

    goto :goto_2

    .line 22
    :pswitch_5
    :try_start_8
    new-instance v5, Lcom/join/mgps/adapter/o3$z1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$z1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 23
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06cf

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_e

    const v7, 0x7f091573

    .line 24
    :try_start_9
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$z1;->b(Lcom/join/mgps/adapter/o3$z1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091569

    .line 25
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$z1;->d(Lcom/join/mgps/adapter/o3$z1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 26
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v16, v5

    goto/16 :goto_2

    .line 27
    :pswitch_6
    :try_start_a
    new-instance v5, Lcom/join/mgps/adapter/o3$u1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$u1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 28
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06cc

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_e

    const v7, 0x7f0910e9

    .line 29
    :try_start_b
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/customview/HorizontalRecyclerView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$u1;->b(Lcom/join/mgps/adapter/o3$u1;Lcom/join/mgps/customview/HorizontalRecyclerView;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    const v7, 0x7f0905a7

    .line 30
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$u1;->c(Lcom/join/mgps/adapter/o3$u1;Landroid/widget/FrameLayout;)Landroid/widget/FrameLayout;

    .line 31
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v32, v30

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v31, v5

    goto/16 :goto_2

    .line 32
    :pswitch_7
    :try_start_c
    new-instance v5, Lcom/join/mgps/adapter/o3$p1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$p1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 33
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v8, 0x7f0c06d6

    invoke-virtual {v6, v8, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_e

    const v8, 0x7f0911a2

    .line 34
    :try_start_d
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$p1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v8, 0x7f0908e4

    .line 35
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$p1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v8, 0x7f09151e

    .line 36
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$p1;->c:Landroid/widget/TextView;

    const v8, 0x7f090cb4

    .line 37
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$p1;->d:Landroid/widget/LinearLayout;

    .line 38
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->e:Landroid/widget/TextView;

    const v7, 0x7f090d81

    .line 39
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->f:Landroid/widget/TextView;

    const v7, 0x7f091051

    .line 40
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->g:Landroid/widget/ProgressBar;

    const v7, 0x7f09104a

    .line 41
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->h:Landroid/widget/ProgressBar;

    const v7, 0x7f091521

    .line 42
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->i:Landroid/widget/TextView;

    const v7, 0x7f09059f

    .line 43
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->j:Landroid/widget/FrameLayout;

    const v7, 0x7f0914f9

    .line 44
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->k:Landroid/widget/TextView;

    const v7, 0x7f090154

    .line 45
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f091792

    .line 46
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->m:Landroid/widget/FrameLayout;

    const v7, 0x7f090d5b

    .line 47
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$p1;->n:Landroid/widget/ProgressBar;

    .line 48
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v20, v18

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v19, v5

    goto/16 :goto_2

    .line 49
    :pswitch_8
    :try_start_e
    new-instance v5, Lcom/join/mgps/adapter/o3$s1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$s1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 50
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v8, 0x7f0c06c6

    invoke-virtual {v6, v8, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    const v8, 0x7f09089b

    .line 51
    :try_start_f
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$s1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v8, 0x7f0908e5

    .line 52
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$s1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v8, 0x7f09151e

    .line 53
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$s1;->c:Landroid/widget/TextView;

    const v8, 0x7f090cb4

    .line 54
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, v5, Lcom/join/mgps/adapter/o3$s1;->d:Landroid/widget/LinearLayout;

    .line 55
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->e:Landroid/widget/TextView;

    const v7, 0x7f090d81

    .line 56
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->f:Landroid/widget/TextView;

    const v7, 0x7f091051

    .line 57
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->g:Landroid/widget/ProgressBar;

    const v7, 0x7f09104a

    .line 58
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->h:Landroid/widget/ProgressBar;

    const v7, 0x7f091521

    .line 59
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->i:Landroid/widget/TextView;

    const v7, 0x7f09059f

    .line 60
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->j:Landroid/widget/FrameLayout;

    const v7, 0x7f0914f9

    .line 61
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->k:Landroid/widget/TextView;

    const v7, 0x7f090d5b

    .line 62
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ProgressBar;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$s1;->l:Landroid/widget/ProgressBar;

    .line 63
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v22, v20

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v21, v5

    goto/16 :goto_2

    .line 64
    :pswitch_9
    :try_start_10
    new-instance v5, Lcom/join/mgps/adapter/o3$r1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$r1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 65
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0628

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    const v7, 0x7f0911ba

    .line 66
    :try_start_11
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$r1;->b(Lcom/join/mgps/adapter/o3$r1;Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object/from16 v16, v14

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v15, v5

    goto/16 :goto_2

    .line 68
    :pswitch_a
    :try_start_12
    new-instance v5, Lcom/join/mgps/adapter/o3$t2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$t2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 69
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0630

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_e

    const v7, 0x7f090704

    .line 70
    :try_start_13
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->b(Lcom/join/mgps/adapter/o3$t2;Landroid/view/View;)Landroid/view/View;

    const v7, 0x7f09114b

    .line 71
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->d(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    const v7, 0x7f09057d

    .line 72
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->f(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09057e

    .line 73
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->h(Lcom/join/mgps/adapter/o3$t2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09114d

    .line 74
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->j(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    const v7, 0x7f091513

    .line 75
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->l(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091514

    .line 76
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->n(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f0908df

    .line 77
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->p(Lcom/join/mgps/adapter/o3$t2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09114c

    .line 78
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->r(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    const v7, 0x7f09150f

    .line 79
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->s(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091509

    .line 80
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->u(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f090ca9

    .line 81
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$t2;->w(Lcom/join/mgps/adapter/o3$t2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 82
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v26, v24

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v25, v5

    goto/16 :goto_2

    .line 83
    :pswitch_b
    :try_start_14
    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v6, 0x7f0c010d

    invoke-virtual {v5, v6, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_e

    .line 84
    :try_start_15
    new-instance v6, Lcom/join/mgps/adapter/o3$k2;

    invoke-direct {v6, v12}, Lcom/join/mgps/adapter/o3$k2;-><init>(Lcom/join/mgps/adapter/o3;)V

    const v7, 0x7f0910e8

    .line 85
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$k2;->b(Lcom/join/mgps/adapter/o3$k2;Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    new-instance v7, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v8, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-direct {v7, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 87
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 88
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$k2;->a(Lcom/join/mgps/adapter/o3$k2;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 89
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v35, v33

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v34, v6

    :goto_3
    move-object v6, v5

    goto/16 :goto_2

    :catch_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v25, v5

    goto/16 :goto_51

    .line 90
    :pswitch_c
    :try_start_16
    new-instance v5, Lcom/join/mgps/adapter/o3$g2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$g2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 91
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0346

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_e

    const v7, 0x7f091356

    .line 92
    :try_start_17
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$g2;->f(Lcom/join/mgps/adapter/o3$g2;Lcom/join/mgps/customview/SlidingTabLayout6;)Lcom/join/mgps/customview/SlidingTabLayout6;

    const v7, 0x7f0917b0

    .line 93
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/viewpager/widget/ViewPager;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$g2;->b(Lcom/join/mgps/adapter/o3$g2;Landroidx/viewpager/widget/ViewPager;)Landroidx/viewpager/widget/ViewPager;

    const v7, 0x7f090e60

    .line 94
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$g2;->d(Lcom/join/mgps/adapter/o3$g2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 95
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v34, v32

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v33, v5

    goto/16 :goto_2

    .line 96
    :pswitch_d
    :try_start_18
    new-instance v5, Lcom/join/mgps/adapter/o3$v1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$v1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 97
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c07c4

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_e

    const v7, 0x7f0900e1

    .line 98
    :try_start_19
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->b(Lcom/join/mgps/adapter/o3$v1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0900e2

    .line 99
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->d(Lcom/join/mgps/adapter/o3$v1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0900e3

    .line 100
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->f(Lcom/join/mgps/adapter/o3$v1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0900e4

    .line 101
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->h(Lcom/join/mgps/adapter/o3$v1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09010a

    .line 102
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->j(Lcom/join/mgps/adapter/o3$v1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09010b

    .line 103
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->l(Lcom/join/mgps/adapter/o3$v1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09010c

    .line 104
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->n(Lcom/join/mgps/adapter/o3$v1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09010d

    .line 105
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v1;->p(Lcom/join/mgps/adapter/o3$v1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 106
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v13, v5

    goto/16 :goto_2

    .line 107
    :pswitch_e
    :try_start_1a
    new-instance v5, Lcom/join/mgps/adapter/o3$j2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$j2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 108
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c07c5

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_e

    const v7, 0x7f090c57

    .line 109
    :try_start_1b
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$j2;->b(Lcom/join/mgps/adapter/o3$j2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09113b

    .line 110
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$j2;->d(Lcom/join/mgps/adapter/o3$j2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 111
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v29, v27

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v28, v5

    goto/16 :goto_2

    .line 112
    :pswitch_f
    :try_start_1c
    new-instance v5, Lcom/join/mgps/adapter/o3$e2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$e2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 113
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c015e

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_e

    const v7, 0x7f0903cb

    .line 114
    :try_start_1d
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/customview/CubeRotateView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$e2;->b(Lcom/join/mgps/adapter/o3$e2;Lcom/join/mgps/customview/CubeRotateView;)Lcom/join/mgps/customview/CubeRotateView;

    const v7, 0x7f09014a

    .line 115
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$e2;->c(Lcom/join/mgps/adapter/o3$e2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0905cf

    .line 116
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$e2;->d(Lcom/join/mgps/adapter/o3$e2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0903de

    .line 117
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$e2;->f(Lcom/join/mgps/adapter/o3$e2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 118
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_3

    move-object v8, v4

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v7, v5

    goto/16 :goto_2

    .line 119
    :pswitch_10
    :try_start_1e
    new-instance v5, Lcom/join/mgps/adapter/o3$d2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$d2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 120
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06d3

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_e

    .line 121
    :try_start_1f
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$d2;->b(Lcom/join/mgps/adapter/o3$d2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091348

    .line 122
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$d2;->d(Lcom/join/mgps/adapter/o3$d2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f090d8e

    .line 123
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$d2;->f(Lcom/join/mgps/adapter/o3$d2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 124
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_3

    move-object v7, v4

    move-object v9, v7

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v8, v5

    goto/16 :goto_2

    .line 125
    :pswitch_11
    :try_start_20
    new-instance v11, Lcom/join/mgps/adapter/o3$c2;

    invoke-direct {v11, v12}, Lcom/join/mgps/adapter/o3$c2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 126
    iget-object v13, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v14, 0x7f0c06d2

    invoke-virtual {v13, v14, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_e

    const v14, 0x7f09069f

    .line 127
    :try_start_21
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$c2;->b(Lcom/join/mgps/adapter/o3$c2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v14, 0x7f0906a0

    .line 128
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$c2;->d(Lcom/join/mgps/adapter/o3$c2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v14, 0x7f0906a1

    .line 129
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$c2;->f(Lcom/join/mgps/adapter/o3$c2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 130
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v14, v11, Lcom/join/mgps/adapter/o3$c2;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 131
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v11, Lcom/join/mgps/adapter/o3$c2;->e:Landroid/widget/TextView;

    .line 132
    invoke-virtual {v13, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v11, Lcom/join/mgps/adapter/o3$c2;->f:Landroid/widget/TextView;

    .line 133
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$c2;->g:Landroid/widget/RelativeLayout;

    const v6, 0x7f090648

    .line 134
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$c2;->h:Landroid/widget/LinearLayout;

    .line 135
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->i:Landroid/widget/TextView;

    const v5, 0x7f090100

    .line 136
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->j:Landroid/widget/TextView;

    .line 137
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v5, 0x7f09010b

    .line 138
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->l:Landroid/widget/TextView;

    const v5, 0x7f0900f2

    .line 139
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->m:Landroid/widget/TextView;

    const v5, 0x7f0910a0

    .line 140
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->n:Landroid/widget/RelativeLayout;

    const v5, 0x7f090649

    .line 141
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->o:Landroid/widget/LinearLayout;

    const v5, 0x7f0908aa

    .line 142
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->p:Landroid/widget/TextView;

    const v5, 0x7f090101

    .line 143
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->q:Landroid/widget/TextView;

    const v5, 0x7f09063e

    .line 144
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v5, 0x7f09010c

    .line 145
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->s:Landroid/widget/TextView;

    const v5, 0x7f0900f3

    .line 146
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->t:Landroid/widget/TextView;

    const v5, 0x7f0910a1

    .line 147
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->u:Landroid/widget/RelativeLayout;

    const v5, 0x7f09064a

    .line 148
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->v:Landroid/widget/LinearLayout;

    const v5, 0x7f0908ab

    .line 149
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->w:Landroid/widget/TextView;

    const v5, 0x7f090102

    .line 150
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->x:Landroid/widget/TextView;

    const v5, 0x7f09063f

    .line 151
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->r:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v5, 0x7f090e43

    .line 152
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->y:Landroid/widget/TextView;

    const v5, 0x7f090e44

    .line 153
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->z:Landroid/widget/TextView;

    const v5, 0x7f090e45

    .line 154
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$c2;->A:Landroid/widget/TextView;

    .line 155
    invoke-virtual {v13, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_6

    move-object v5, v4

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v38, v36

    move-object/from16 v39, v38

    move-object/from16 v37, v11

    goto/16 :goto_4

    .line 156
    :pswitch_12
    :try_start_22
    new-instance v11, Lcom/join/mgps/adapter/o3$b2;

    invoke-direct {v11, v12}, Lcom/join/mgps/adapter/o3$b2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 157
    iget-object v13, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v14, 0x7f0c06d1

    invoke-virtual {v13, v14, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_e

    const v14, 0x7f09069f

    .line 158
    :try_start_23
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$b2;->b(Lcom/join/mgps/adapter/o3$b2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v14, 0x7f0906a0

    .line 159
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$b2;->d(Lcom/join/mgps/adapter/o3$b2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v14, 0x7f0906a1

    .line 160
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$b2;->f(Lcom/join/mgps/adapter/o3$b2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 161
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v9, v11, Lcom/join/mgps/adapter/o3$b2;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 162
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v11, Lcom/join/mgps/adapter/o3$b2;->e:Landroid/widget/TextView;

    .line 163
    invoke-virtual {v13, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v11, Lcom/join/mgps/adapter/o3$b2;->f:Landroid/widget/TextView;

    .line 164
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$b2;->g:Landroid/widget/RelativeLayout;

    const v6, 0x7f090648

    .line 165
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$b2;->h:Landroid/widget/RelativeLayout;

    .line 166
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$b2;->i:Landroid/widget/TextView;

    const v5, 0x7f09145e

    .line 167
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$b2;->j:Landroid/widget/LinearLayout;

    .line 168
    invoke-virtual {v13, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_6

    move-object v5, v4

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v37, v35

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v36, v11

    :goto_4
    move-object v6, v13

    move-object/from16 v11, v39

    goto/16 :goto_5

    .line 169
    :pswitch_13
    :try_start_24
    new-instance v5, Lcom/join/mgps/adapter/o3$m2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$m2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 170
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06d0

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_e

    const v7, 0x7f0906f0

    .line 171
    :try_start_25
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$m2;->d:Landroid/widget/LinearLayout;

    const v7, 0x7f091002

    .line 172
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$m2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f091348

    .line 173
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$m2;->b:Landroid/widget/TextView;

    const v7, 0x7f091532

    .line 174
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$m2;->e:Landroid/widget/LinearLayout;

    .line 175
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$m2;->c:Landroid/widget/TextView;

    .line 176
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v21, v19

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v20, v5

    goto/16 :goto_2

    .line 177
    :pswitch_14
    :try_start_26
    new-instance v7, Lcom/join/mgps/adapter/o3$q1;

    invoke-direct {v7, v12}, Lcom/join/mgps/adapter/o3$q1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 178
    iget-object v11, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v13, 0x7f0c06c3

    invoke-virtual {v11, v13, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_e

    const v13, 0x7f091792

    .line 179
    :try_start_27
    invoke-virtual {v11, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/FrameLayout;

    invoke-static {v7, v13}, Lcom/join/mgps/adapter/o3$q1;->b(Lcom/join/mgps/adapter/o3$q1;Landroid/widget/FrameLayout;)Landroid/widget/FrameLayout;

    const v13, 0x7f090154

    .line 180
    invoke-virtual {v11, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v7, v13}, Lcom/join/mgps/adapter/o3$q1;->d(Lcom/join/mgps/adapter/o3$q1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 181
    invoke-virtual {v11, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v9, v7, Lcom/join/mgps/adapter/o3$q1;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 182
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v7, Lcom/join/mgps/adapter/o3$q1;->d:Landroid/widget/TextView;

    const v8, 0x7f0903fc

    .line 183
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v7, Lcom/join/mgps/adapter/o3$q1;->e:Landroid/widget/TextView;

    .line 184
    invoke-virtual {v11, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v7, Lcom/join/mgps/adapter/o3$q1;->f:Landroid/widget/RelativeLayout;

    .line 185
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v7, Lcom/join/mgps/adapter/o3$q1;->g:Landroid/widget/TextView;

    const v5, 0x7f090152

    .line 186
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    iput-object v5, v7, Lcom/join/mgps/adapter/o3$q1;->h:Landroid/widget/RelativeLayout;

    .line 187
    invoke-virtual {v11, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_1

    move-object v5, v4

    move-object v8, v5

    move-object v9, v8

    move-object v13, v9

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v36, v34

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v35, v7

    move-object v6, v11

    move-object/from16 v7, v39

    move-object v11, v7

    goto/16 :goto_6

    :catch_1
    move-exception v0

    move-object v1, v0

    move-object/from16 v25, v11

    goto/16 :goto_51

    .line 188
    :pswitch_15
    :try_start_28
    new-instance v11, Lcom/join/mgps/adapter/o3$m1;

    invoke-direct {v11, v12}, Lcom/join/mgps/adapter/o3$m1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 189
    iget-object v13, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v14, 0x7f0c06d5

    invoke-virtual {v13, v14, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_e

    const v14, 0x7f090154

    .line 190
    :try_start_29
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$m1;->b(Lcom/join/mgps/adapter/o3$m1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v14, 0x7f091792

    .line 191
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/FrameLayout;

    iput-object v14, v11, Lcom/join/mgps/adapter/o3$m1;->i:Landroid/widget/FrameLayout;

    .line 192
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v9, v11, Lcom/join/mgps/adapter/o3$m1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 193
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v11, Lcom/join/mgps/adapter/o3$m1;->c:Landroid/widget/TextView;

    .line 194
    invoke-virtual {v13, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v11, Lcom/join/mgps/adapter/o3$m1;->d:Landroid/widget/TextView;

    .line 195
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$m1;->e:Landroid/widget/RelativeLayout;

    .line 196
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$m1;->f:Landroid/widget/TextView;

    const v5, 0x7f090152

    .line 197
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$m1;->g:Landroid/widget/LinearLayout;

    const v5, 0x7f09145e

    .line 198
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$m1;->h:Landroid/widget/LinearLayout;

    .line 199
    invoke-virtual {v13, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_6

    move-object v5, v4

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v11

    move-object v6, v13

    move-object/from16 v11, v38

    :goto_5
    move-object v13, v11

    goto/16 :goto_6

    .line 200
    :pswitch_16
    :try_start_2a
    new-instance v5, Lcom/join/mgps/adapter/o3$n1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$n1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 201
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06be

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_e

    .line 202
    :try_start_2b
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$n1;->b(Lcom/join/mgps/adapter/o3$n1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091348

    .line 203
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$n1;->d(Lcom/join/mgps/adapter/o3$n1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f090278

    .line 204
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$n1;->f(Lcom/join/mgps/adapter/o3$n1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 205
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v13, v9

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v11, v5

    goto/16 :goto_2

    .line 206
    :pswitch_17
    :try_start_2c
    new-instance v5, Lcom/join/mgps/adapter/o3$o1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$o1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 207
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06bf

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_e

    const v7, 0x7f0908ad

    .line 208
    :try_start_2d
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->b(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f0908b8

    .line 209
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->d(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f090104

    .line 210
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->f(Lcom/join/mgps/adapter/o3$o1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f090105

    .line 211
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->h(Lcom/join/mgps/adapter/o3$o1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 212
    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->j(Lcom/join/mgps/adapter/o3$o1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09063e

    .line 213
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->l(Lcom/join/mgps/adapter/o3$o1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 214
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->n(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09010b

    .line 215
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->p(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09049a

    .line 216
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->r(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09049b

    .line 217
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->t(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f0901bb

    .line 218
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->v(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f0901ba

    .line 219
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o1;->x(Lcom/join/mgps/adapter/o3$o1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 220
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v33, v31

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v32, v5

    goto/16 :goto_2

    .line 221
    :pswitch_18
    :try_start_2e
    new-instance v5, Lcom/join/mgps/adapter/o3$o2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$o2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 222
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06c1

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_e

    const v7, 0x7f090697

    .line 223
    :try_start_2f
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->b(Lcom/join/mgps/adapter/o3$o2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f09069b

    .line 224
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->d(Lcom/join/mgps/adapter/o3$o2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09069c

    .line 225
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->f(Lcom/join/mgps/adapter/o3$o2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f090698

    .line 226
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->h(Lcom/join/mgps/adapter/o3$o2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f090699

    .line 227
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->j(Lcom/join/mgps/adapter/o3$o2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f09069a

    .line 228
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$o2;->l(Lcom/join/mgps/adapter/o3$o2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 229
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v28, v26

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v27, v5

    goto/16 :goto_2

    .line 230
    :pswitch_19
    :try_start_30
    new-instance v5, Lcom/join/mgps/adapter/o3$w1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$w1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 231
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06c7

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_e

    const v7, 0x7f0908ad

    .line 232
    :try_start_31
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->b(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f0908b8

    .line 233
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->d(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f090104

    .line 234
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->f(Lcom/join/mgps/adapter/o3$w1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f090105

    .line 235
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->h(Lcom/join/mgps/adapter/o3$w1;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 236
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->j(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09010b

    .line 237
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->l(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09049a

    .line 238
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->n(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09049b

    .line 239
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$w1;->p(Lcom/join/mgps/adapter/o3$w1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 240
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v11, v8

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v9, v5

    goto/16 :goto_2

    .line 241
    :pswitch_1a
    :try_start_32
    new-instance v5, Lcom/join/mgps/adapter/o3$x1;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$x1;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 242
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06c8

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_32} :catch_e

    const v7, 0x7f090721

    .line 243
    :try_start_33
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$x1;->b(Lcom/join/mgps/adapter/o3$x1;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09074e

    .line 244
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$x1;->d(Lcom/join/mgps/adapter/o3$x1;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 245
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_33} :catch_3

    move-object v7, v4

    goto/16 :goto_1

    .line 246
    :pswitch_1b
    :try_start_34
    new-instance v11, Lcom/join/mgps/adapter/o3$p2;

    invoke-direct {v11, v12}, Lcom/join/mgps/adapter/o3$p2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 247
    iget-object v13, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v14, 0x7f0c06c0

    invoke-virtual {v13, v14, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_e

    const v14, 0x7f0906a4

    .line 248
    :try_start_35
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/LinearLayout;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$p2;->b(Lcom/join/mgps/adapter/o3$p2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v14, 0x7f0906a5

    .line 249
    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v14}, Lcom/join/mgps/adapter/o3$p2;->d(Lcom/join/mgps/adapter/o3$p2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 250
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v9, v11, Lcom/join/mgps/adapter/o3$p2;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 251
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v11, Lcom/join/mgps/adapter/o3$p2;->f:Landroid/widget/TextView;

    const v8, 0x7f0906a6

    .line 252
    invoke-virtual {v13, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    invoke-static {v11, v8}, Lcom/join/mgps/adapter/o3$p2;->f(Lcom/join/mgps/adapter/o3$p2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 253
    invoke-virtual {v13, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v11, Lcom/join/mgps/adapter/o3$p2;->g:Landroid/widget/TextView;

    const v7, 0x7f0906a7

    .line 254
    invoke-virtual {v13, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v11, v7}, Lcom/join/mgps/adapter/o3$p2;->h(Lcom/join/mgps/adapter/o3$p2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 255
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$p2;->h:Landroid/widget/RelativeLayout;

    const v6, 0x7f090648

    .line 256
    invoke-virtual {v13, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v11, Lcom/join/mgps/adapter/o3$p2;->i:Landroid/widget/RelativeLayout;

    .line 257
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$p2;->j:Landroid/widget/TextView;

    const v5, 0x7f0904df

    .line 258
    invoke-virtual {v13, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v11, Lcom/join/mgps/adapter/o3$p2;->k:Landroid/widget/TextView;

    .line 259
    invoke-virtual {v13, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_35} :catch_6

    move-object v5, v4

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v39, v37

    move-object/from16 v38, v11

    goto/16 :goto_4

    .line 260
    :pswitch_1c
    :try_start_36
    new-instance v5, Lcom/join/mgps/adapter/o3$q2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$q2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 261
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06c2

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_36
    .catch Ljava/lang/Exception; {:try_start_36 .. :try_end_36} :catch_e

    const v7, 0x7f09069e

    .line 262
    :try_start_37
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->b(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f0914b4

    .line 263
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->d(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f0906a2

    .line 264
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->f(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f0906a3

    .line 265
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->h(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f0910cf

    .line 266
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->j(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09034b

    .line 267
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->l(Lcom/join/mgps/adapter/o3$q2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f09069f

    .line 268
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->n(Lcom/join/mgps/adapter/o3$q2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0906a0

    .line 269
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->p(Lcom/join/mgps/adapter/o3$q2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v7, 0x7f0906a1

    .line 270
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$q2;->r(Lcom/join/mgps/adapter/o3$q2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 271
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_37} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v27, v25

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v26, v5

    goto/16 :goto_2

    .line 272
    :pswitch_1d
    :try_start_38
    new-instance v5, Lcom/join/mgps/adapter/o3$r2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$r2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 273
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06c9

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_38} :catch_e

    const v7, 0x7f090885

    .line 274
    :try_start_39
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lit/sephiroth/android/library/widget/HListView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$r2;->b(Lcom/join/mgps/adapter/o3$r2;Lit/sephiroth/android/library/widget/HListView;)Lit/sephiroth/android/library/widget/HListView;

    .line 275
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_39
    .catch Ljava/lang/Exception; {:try_start_39 .. :try_end_39} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v25, v23

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v24, v5

    goto/16 :goto_2

    .line 276
    :pswitch_1e
    :try_start_3a
    new-instance v5, Lcom/join/mgps/adapter/o3$s2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$s2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 277
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06cb

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_3a .. :try_end_3a} :catch_e

    const v7, 0x7f090884

    .line 278
    :try_start_3b
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$s2;->b(Lcom/join/mgps/adapter/o3$s2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 279
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_3b
    .catch Ljava/lang/Exception; {:try_start_3b .. :try_end_3b} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v24, v22

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v23, v5

    goto/16 :goto_2

    .line 280
    :pswitch_1f
    :try_start_3c
    new-instance v5, Lcom/join/mgps/adapter/o3$h2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$h2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 281
    iget-object v8, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v9, 0x7f0c00b9

    invoke-virtual {v8, v9, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8
    :try_end_3c
    .catch Ljava/lang/Exception; {:try_start_3c .. :try_end_3c} :catch_e

    const v9, 0x7f090e0c

    .line 282
    :try_start_3d
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v9, v5, Lcom/join/mgps/adapter/o3$h2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v9, 0x7f0906da

    .line 283
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/ImageView;

    iput-object v9, v5, Lcom/join/mgps/adapter/o3$h2;->n:Landroid/widget/ImageView;

    const v9, 0x7f091101

    .line 284
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/RelativeLayout;

    iput-object v9, v5, Lcom/join/mgps/adapter/o3$h2;->m:Landroid/widget/RelativeLayout;

    const v9, 0x7f090e0a

    .line 285
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, v5, Lcom/join/mgps/adapter/o3$h2;->b:Landroid/widget/TextView;

    .line 286
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    const v6, 0x7f090e0d

    .line 287
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v6, 0x7f090e0b

    .line 288
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->e:Landroid/widget/TextView;

    const v6, 0x7f090c7d

    .line 289
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->f:Landroid/widget/LinearLayout;

    const v6, 0x7f09145e

    .line 290
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->g:Landroid/widget/LinearLayout;

    .line 291
    invoke-virtual {v8, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    const v6, 0x7f090d81

    .line 292
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    const v6, 0x7f09104a

    .line 293
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ProgressBar;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    const v6, 0x7f091051

    .line 294
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ProgressBar;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    const v6, 0x7f090e42

    .line 295
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->j:Landroid/widget/TextView;

    const v6, 0x7f090c6b

    .line 296
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v5, Lcom/join/mgps/adapter/o3$h2;->o:Landroid/view/View;

    const v6, 0x7f090c6b

    .line 297
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 298
    invoke-virtual {v6, v10}, Landroid/view/View;->setVisibility(I)V

    .line 299
    invoke-virtual {v8, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_3d} :catch_2

    move-object v7, v4

    move-object v9, v7

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v31, v29

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v30, v5

    move-object v6, v8

    move-object/from16 v5, v39

    move-object v8, v5

    goto/16 :goto_6

    :catch_2
    move-exception v0

    move-object v1, v0

    move-object/from16 v25, v8

    goto/16 :goto_51

    .line 300
    :pswitch_20
    :try_start_3e
    new-instance v5, Lcom/join/mgps/adapter/o3$a2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$a2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 301
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c06dd

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_3e
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_3e} :catch_e

    const v7, 0x7f091479

    .line 302
    :try_start_3f
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$a2;->b(Lcom/join/mgps/adapter/o3$a2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f091348

    .line 303
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$a2;->d(Lcom/join/mgps/adapter/o3$a2;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v7, 0x7f090d8e

    .line 304
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$a2;->f(Lcom/join/mgps/adapter/o3$a2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f090c6b

    .line 305
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, v5, Lcom/join/mgps/adapter/o3$a2;->d:Landroid/view/View;

    .line 306
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_3f
    .catch Ljava/lang/Exception; {:try_start_3f .. :try_end_3f} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v15, v13

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object v14, v5

    goto/16 :goto_2

    .line 307
    :pswitch_21
    :try_start_40
    new-instance v5, Lcom/join/mgps/adapter/o3$u2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$u2;-><init>(Lcom/join/mgps/adapter/o3;)V

    sput-object v5, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    .line 308
    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v6, 0x7f0c062f

    invoke-virtual {v5, v6, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_40} :catch_e

    .line 309
    :try_start_41
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f090d77

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->A(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    .line 310
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910e1

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->C(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    .line 311
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910e0

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->E(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    .line 312
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09057d

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->G(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 313
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09050b

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->I(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 314
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09057e

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->K(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 315
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910dd

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->b(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 316
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910de

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->d(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 317
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910dc

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->f(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 318
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09173c

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->h(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 319
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09050f

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->j(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 320
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f090510

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->k(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 321
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f090511

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->m(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 322
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910db

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->o(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 323
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910da

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->q(Lcom/join/mgps/adapter/o3$u2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 324
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f090dbd

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    iput-object v7, v6, Lcom/join/mgps/adapter/o3$u2;->t:Landroid/widget/LinearLayout;

    .line 325
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f0910d9

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->s(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 326
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09062a

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->u(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 327
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09062b

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->w(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 328
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    const v7, 0x7f09062c

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v6, v7}, Lcom/join/mgps/adapter/o3$u2;->y(Lcom/join/mgps/adapter/o3$u2;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 329
    sget-object v6, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_41 .. :try_end_41} :catch_0

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    goto/16 :goto_3

    .line 330
    :pswitch_22
    :try_start_42
    new-instance v5, Lcom/join/mgps/adapter/o3$v2;

    invoke-direct {v5, v12}, Lcom/join/mgps/adapter/o3$v2;-><init>(Lcom/join/mgps/adapter/o3;)V

    .line 331
    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->b:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0786

    invoke-virtual {v6, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6
    :try_end_42
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_42} :catch_e

    const v7, 0x7f0914b5

    .line 332
    :try_start_43
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v2;->b(Lcom/join/mgps/adapter/o3$v2;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    const v7, 0x7f0914b6

    .line 333
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v2;->d(Lcom/join/mgps/adapter/o3$v2;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    const v7, 0x7f0914bf

    .line 334
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-static {v5, v7}, Lcom/join/mgps/adapter/o3$v2;->f(Lcom/join/mgps/adapter/o3$v2;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 335
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_43} :catch_3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v18, v5

    goto/16 :goto_2

    :catch_3
    move-exception v0

    move-object v1, v0

    move-object/from16 v25, v6

    goto/16 :goto_51

    :goto_6
    move-object/from16 p2, v18

    move-object/from16 v3, v19

    move-object/from16 v40, v20

    move-object/from16 v41, v21

    move-object/from16 v4, v22

    move-object/from16 v42, v30

    move-object/from16 v19, v31

    move-object/from16 v20, v35

    move-object/from16 v43, v36

    move-object/from16 v44, v37

    move-object/from16 v21, v38

    move-object/from16 v22, v39

    move-object/from16 v46, v13

    move-object v13, v6

    move-object/from16 v6, v46

    goto/16 :goto_1b

    :cond_1
    packed-switch v2, :pswitch_data_1

    :pswitch_23
    goto/16 :goto_7

    .line 336
    :pswitch_24
    :try_start_44
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/adapter/o3$n2;

    goto/16 :goto_7

    .line 337
    :pswitch_25
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v5

    check-cast v22, Lcom/join/mgps/adapter/o3$i2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v23, v21

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v4, v22

    move-object/from16 v22, v44

    goto/16 :goto_1b

    .line 338
    :pswitch_26
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lcom/join/mgps/adapter/o3$l2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v19, v16

    goto/16 :goto_10

    .line 339
    :pswitch_27
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v29, v5

    check-cast v29, Lcom/join/mgps/adapter/o3$f2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v32, v28

    goto/16 :goto_17

    .line 340
    :pswitch_28
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v5

    check-cast v16, Lcom/join/mgps/adapter/o3$z1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v17, v15

    goto/16 :goto_f

    .line 341
    :pswitch_29
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v31, v5

    check-cast v31, Lcom/join/mgps/adapter/o3$u1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v20, v17

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v19, v31

    goto/16 :goto_1b

    .line 342
    :pswitch_2a
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v19, v5

    check-cast v19, Lcom/join/mgps/adapter/o3$p1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v5, p2

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v20, v17

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v3, v19

    move-object/from16 v19, v44

    goto/16 :goto_1b

    .line 343
    :pswitch_2b
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v21, v5

    check-cast v21, Lcom/join/mgps/adapter/o3$s1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v22, v20

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v42, v40

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v41, v21

    move-object/from16 v21, v44

    goto/16 :goto_1b

    .line 344
    :pswitch_2c
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Lcom/join/mgps/adapter/o3$r1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object/from16 v16, v14

    goto/16 :goto_e

    .line 345
    :pswitch_2d
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v25, v5

    check-cast v25, Lcom/join/mgps/adapter/o3$t2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v26, v24

    goto/16 :goto_13

    .line 346
    :pswitch_2e
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v34, v5

    check-cast v34, Lcom/join/mgps/adapter/o3$k2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v40, v33

    goto/16 :goto_1a

    .line 347
    :pswitch_2f
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v33, v5

    check-cast v33, Lcom/join/mgps/adapter/o3$g2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v34, v32

    goto/16 :goto_19

    .line 348
    :pswitch_30
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lcom/join/mgps/adapter/o3$v1;

    move-object v3, v4

    move-object v5, v3

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object v6, v13

    move-object/from16 v13, p2

    move-object/from16 p2, v44

    goto/16 :goto_1b

    .line 349
    :pswitch_31
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v28, v5

    check-cast v28, Lcom/join/mgps/adapter/o3$j2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v29, v27

    goto/16 :goto_16

    .line 350
    :pswitch_32
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lcom/join/mgps/adapter/o3$e2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v8, v6

    goto/16 :goto_9

    .line 351
    :pswitch_33
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/join/mgps/adapter/o3$d2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v9, v7

    goto/16 :goto_a

    .line 352
    :pswitch_34
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v37, v5

    check-cast v37, Lcom/join/mgps/adapter/o3$c2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v37

    goto/16 :goto_1b

    .line 353
    :pswitch_35
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v36, v5

    check-cast v36, Lcom/join/mgps/adapter/o3$b2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v44, v42

    move-object/from16 v43, v36

    goto/16 :goto_1b

    .line 354
    :pswitch_36
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v20, v5

    check-cast v20, Lcom/join/mgps/adapter/o3$m2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v21, v19

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v41, v34

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v40, v20

    move-object/from16 v20, v44

    goto/16 :goto_1b

    .line 355
    :pswitch_37
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v35, v5

    check-cast v35, Lcom/join/mgps/adapter/o3$q1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v21, v19

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v20, v35

    goto/16 :goto_1b

    .line 356
    :pswitch_38
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v39, v5

    check-cast v39, Lcom/join/mgps/adapter/o3$m1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v23, v21

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v22, v39

    goto/16 :goto_1b

    .line 357
    :pswitch_39
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/join/mgps/adapter/o3$n1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    goto/16 :goto_c

    .line 358
    :pswitch_3a
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v32, v5

    check-cast v32, Lcom/join/mgps/adapter/o3$o1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v33, v29

    goto/16 :goto_18

    .line 359
    :pswitch_3b
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v27, v5

    check-cast v27, Lcom/join/mgps/adapter/o3$o2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v28, v26

    goto/16 :goto_15

    .line 360
    :pswitch_3c
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lcom/join/mgps/adapter/o3$w1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v11, v8

    goto/16 :goto_b

    .line 361
    :pswitch_3d
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/adapter/o3$x1;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v6, v3

    goto/16 :goto_8

    .line 362
    :pswitch_3e
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v38, v5

    check-cast v38, Lcom/join/mgps/adapter/o3$p2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v22, v20

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v21, v38

    goto/16 :goto_1b

    .line 363
    :pswitch_3f
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v26, v5

    check-cast v26, Lcom/join/mgps/adapter/o3$q2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v27, v25

    goto/16 :goto_14

    .line 364
    :pswitch_40
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v24, v5

    check-cast v24, Lcom/join/mgps/adapter/o3$r2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v25, v23

    goto/16 :goto_12

    .line 365
    :pswitch_41
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v23, v5

    check-cast v23, Lcom/join/mgps/adapter/o3$s2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v24, v22

    goto/16 :goto_11

    .line 366
    :pswitch_42
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v30, v5

    check-cast v30, Lcom/join/mgps/adapter/o3$h2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v43, v41

    move-object/from16 v44, v43

    move-object/from16 v42, v30

    goto/16 :goto_1b

    .line 367
    :pswitch_43
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Lcom/join/mgps/adapter/o3$a2;

    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v15, v11

    goto/16 :goto_d

    .line 368
    :pswitch_44
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/adapter/o3$u2;

    sput-object v5, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    goto :goto_7

    .line 369
    :pswitch_45
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Lcom/join/mgps/adapter/o3$v2;
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_44 .. :try_end_44} :catch_e

    move-object/from16 v13, p2

    move-object v3, v4

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v40, v34

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 p2, v18

    goto :goto_1b

    :goto_7
    move-object/from16 v13, p2

    move-object/from16 p2, v4

    move-object/from16 v3, p2

    move-object v5, v3

    move-object v6, v5

    :goto_8
    move-object v7, v6

    move-object v8, v7

    :goto_9
    move-object v9, v8

    :goto_a
    move-object v11, v9

    :goto_b
    move-object v14, v11

    :goto_c
    move-object v15, v14

    :goto_d
    move-object/from16 v16, v15

    :goto_e
    move-object/from16 v17, v16

    :goto_f
    move-object/from16 v19, v17

    :goto_10
    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    :goto_11
    move-object/from16 v25, v24

    :goto_12
    move-object/from16 v26, v25

    :goto_13
    move-object/from16 v27, v26

    :goto_14
    move-object/from16 v28, v27

    :goto_15
    move-object/from16 v29, v28

    :goto_16
    move-object/from16 v32, v29

    :goto_17
    move-object/from16 v33, v32

    :goto_18
    move-object/from16 v34, v33

    :goto_19
    move-object/from16 v40, v34

    :goto_1a
    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    .line 370
    :goto_1b
    :try_start_45
    iget-object v10, v12, Lcom/join/mgps/adapter/o3;->e:Ljava/util/List;

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/join/mgps/dto/MgpapaMainItemBean;
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_45} :catch_d

    move-object/from16 v31, v14

    const-string v14, ""

    move-object/from16 v35, v11

    const-string v11, "-"

    move-object/from16 v36, v9

    const/4 v9, 0x1

    packed-switch v2, :pswitch_data_2

    :cond_2
    :goto_1c
    :pswitch_46
    move-object v7, v13

    goto/16 :goto_4e

    .line 371
    :pswitch_47
    :try_start_46
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_2

    .line 372
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 373
    iget-object v3, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    if-eqz v3, :cond_3

    iget-object v3, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 374
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    invoke-virtual {v3}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 375
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    .line 376
    invoke-virtual {v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto :goto_1c

    .line 377
    :cond_3
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/4 v6, 0x0

    invoke-direct {v3, v5, v6, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 378
    new-instance v5, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    invoke-direct {v5, v2}, Lcom/join/mgps/adapter/HomeRecommendAdapter;-><init>(Ljava/util/List;)V

    .line 379
    iget-object v6, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/SimpleItemAnimator;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 380
    iget-object v6, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 381
    iget-object v6, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 382
    iget-object v3, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 383
    new-instance v3, Lcom/join/mgps/adapter/d3;

    invoke-direct {v3, v12, v2}, Lcom/join/mgps/adapter/d3;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v5, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 384
    new-instance v3, Lcom/join/mgps/adapter/c3;

    invoke-direct {v3, v12, v2, v1}, Lcom/join/mgps/adapter/c3;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;I)V

    invoke-virtual {v5, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemChildClickListener(Lcom/join/mgps/base/BaseQuickAdapter$h;)V

    .line 385
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$i2;->a:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/join/mgps/adapter/o3$y0;

    invoke-direct {v3, v12, v2, v4}, Lcom/join/mgps/adapter/o3$y0;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;Lcom/join/mgps/adapter/o3$i2;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    goto/16 :goto_1c

    .line 386
    :pswitch_48
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 387
    invoke-static/range {v17 .. v17}, Lcom/join/mgps/adapter/o3$l2;->a(Lcom/join/mgps/adapter/o3$l2;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    float-to-int v1, v1

    .line 388
    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 389
    invoke-static/range {v17 .. v17}, Lcom/join/mgps/adapter/o3$l2;->a(Lcom/join/mgps/adapter/o3$l2;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_1c

    .line 390
    :pswitch_49
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    if-eqz v1, :cond_7

    .line 391
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getTxt()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 392
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->a(Lcom/join/mgps/adapter/o3$f2;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 393
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v2

    .line 394
    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    if-nez v3, :cond_6

    .line 395
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getTxt()Ljava/lang/String;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 396
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 397
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    .line 398
    :goto_1d
    array-length v5, v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v10, v5, :cond_5

    .line 399
    aget-object v5, v1, v10

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 400
    aget-object v5, v1, v10

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    aget-object v5, v1, v10

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    add-int/lit16 v7, v10, 0x5015

    invoke-static {v9, v5, v6, v7}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->j0(ZLjava/lang/String;Ljava/util/List;I)Landroidx/fragment/app/Fragment;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_1d

    .line 402
    :cond_5
    new-instance v1, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->d:Landroidx/fragment/app/Fragment;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    invoke-direct {v1, v5, v4, v3}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object v1, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    .line 403
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/customview/NavigationAdapter;->d(Ljava/util/List;Ljava/util/List;)V

    .line 404
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->e(Lcom/join/mgps/adapter/o3$f2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v1, v3}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 405
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->e(Lcom/join/mgps/adapter/o3$f2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 406
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->c(Lcom/join/mgps/adapter/o3$f2;)Lcom/join/mgps/customview/SlidingTabLayout6;

    move-result-object v1

    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->e(Lcom/join/mgps/adapter/o3$f2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 407
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->g(Lcom/join/mgps/adapter/o3$f2;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v3, Lcom/join/mgps/adapter/b3;

    invoke-direct {v3, v12}, Lcom/join/mgps/adapter/b3;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 408
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->e(Lcom/join/mgps/adapter/o3$f2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    new-instance v3, Lcom/join/mgps/adapter/o3$x0;

    invoke-direct {v3, v12, v2}, Lcom/join/mgps/adapter/o3$x0;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v1, v3}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    goto/16 :goto_1c

    .line 409
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/customview/NavigationAdapter;->c()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v10, 0x0

    .line 410
    :goto_1e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v10, v3, :cond_2

    .line 411
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/fragment/RankingItemV2Fragment;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {v3, v4}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->r0(Ljava/util/List;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1e

    .line 412
    :cond_7
    invoke-static/range {v29 .. v29}, Lcom/join/mgps/adapter/o3$f2;->a(Lcom/join/mgps/adapter/o3$f2;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_1c

    .line 413
    :pswitch_4a
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAItemTitle2;

    if-eqz v1, :cond_2

    .line 414
    invoke-static/range {v16 .. v16}, Lcom/join/mgps/adapter/o3$z1;->a(Lcom/join/mgps/adapter/o3$z1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    invoke-static/range {v16 .. v16}, Lcom/join/mgps/adapter/o3$z1;->c(Lcom/join/mgps/adapter/o3$z1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getSubTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    invoke-static/range {v16 .. v16}, Lcom/join/mgps/adapter/o3$z1;->c(Lcom/join/mgps/adapter/o3$z1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v10, 0x8

    goto :goto_1f

    :cond_8
    const/4 v10, 0x0

    :goto_1f
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1c

    .line 417
    :pswitch_4b
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 418
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    const/4 v3, 0x5

    .line 419
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->setInitialPrefetchItemCount(I)V

    .line 420
    new-instance v3, Lcom/join/mgps/adapter/HomeGameListGameNewsAdapter;

    invoke-direct {v3, v1}, Lcom/join/mgps/adapter/HomeGameListGameNewsAdapter;-><init>(Ljava/util/List;)V

    .line 421
    new-instance v4, Lcom/join/mgps/adapter/e3;

    invoke-direct {v4, v12, v1}, Lcom/join/mgps/adapter/e3;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 422
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 423
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    const/16 v5, 0xa

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 424
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 425
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 426
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 427
    invoke-static/range {v19 .. v19}, Lcom/join/mgps/adapter/o3$u1;->a(Lcom/join/mgps/adapter/o3$u1;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$w0;

    move-object/from16 v4, v19

    invoke-direct {v3, v12, v1, v4}, Lcom/join/mgps/adapter/o3$w0;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;Lcom/join/mgps/adapter/o3$u1;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    goto/16 :goto_1c

    .line 428
    :pswitch_4c
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 429
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v4

    if-eqz v4, :cond_b

    .line 430
    iget-object v5, v3, Lcom/join/mgps/adapter/o3$p1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getIco()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 431
    iget-object v5, v3, Lcom/join/mgps/adapter/o3$p1;->c:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 432
    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 433
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v4

    const-string v6, ","

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    .line 435
    :goto_20
    array-length v7, v4

    if-ge v6, v7, :cond_a

    .line 436
    aget-object v7, v4, v6

    .line 437
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " | "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v6, v9, :cond_9

    goto :goto_21

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_20

    .line 438
    :cond_a
    :goto_21
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->i:Landroid/widget/TextView;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    const/4 v7, 0x3

    sub-int/2addr v6, v7

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    :cond_b
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 440
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f08016b

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    add-int/lit8 v4, v1, 0x1

    .line 441
    iget-object v5, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 442
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v5

    .line 443
    new-instance v6, Lcom/join/android/app/component/video/c$l;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v8

    invoke-direct {v6, v4, v5, v7, v8}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 444
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/join/android/app/component/video/c$l;->n(Ljava/lang/String;)V

    .line 445
    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->l:Lcom/join/android/app/component/video/c;

    const/4 v7, 0x0

    new-array v8, v7, [Z

    invoke-virtual {v5, v4, v6, v8}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    .line 446
    iget-object v5, v3, Lcom/join/mgps/adapter/o3$p1;->m:Landroid/widget/FrameLayout;

    new-instance v6, Lcom/join/mgps/adapter/o3$t0;

    invoke-direct {v6, v12, v4}, Lcom/join/mgps/adapter/o3$t0;-><init>(Lcom/join/mgps/adapter/o3;I)V

    invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_22

    .line 447
    :cond_c
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 448
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 449
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f08016b

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 450
    :goto_22
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->m:Landroid/widget/FrameLayout;

    new-instance v5, Lcom/join/mgps/adapter/o3$u0;

    invoke-direct {v5, v12, v2}, Lcom/join/mgps/adapter/o3$u0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v5, Lcom/join/mgps/adapter/o3$v0;

    invoke-direct {v5, v12, v2}, Lcom/join/mgps/adapter/o3$v0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->j:Landroid/widget/FrameLayout;

    new-instance v5, Lcom/join/mgps/adapter/l3;

    invoke-direct {v5, v12, v2, v3, v1}, Lcom/join/mgps/adapter/l3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;I)V

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    iget-object v1, v3, Lcom/join/mgps/adapter/o3$p1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v4, Lcom/join/mgps/adapter/j3;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/j3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 454
    iget-object v1, v3, Lcom/join/mgps/adapter/o3$p1;->k:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 455
    iget-object v1, v3, Lcom/join/mgps/adapter/o3$p1;->n:Landroid/widget/ProgressBar;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 456
    iget-object v4, v3, Lcom/join/mgps/adapter/o3$p1;->c:Landroid/widget/TextView;

    iget-object v5, v3, Lcom/join/mgps/adapter/o3$p1;->i:Landroid/widget/TextView;

    iget-object v6, v3, Lcom/join/mgps/adapter/o3$p1;->j:Landroid/widget/FrameLayout;

    iget-object v7, v3, Lcom/join/mgps/adapter/o3$p1;->k:Landroid/widget/TextView;

    iget-object v8, v3, Lcom/join/mgps/adapter/o3$p1;->d:Landroid/widget/LinearLayout;

    iget-object v9, v3, Lcom/join/mgps/adapter/o3$p1;->e:Landroid/widget/TextView;

    iget-object v10, v3, Lcom/join/mgps/adapter/o3$p1;->f:Landroid/widget/TextView;

    iget-object v11, v3, Lcom/join/mgps/adapter/o3$p1;->g:Landroid/widget/ProgressBar;

    iget-object v14, v3, Lcom/join/mgps/adapter/o3$p1;->h:Landroid/widget/ProgressBar;

    move-object/from16 v1, p0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v14

    invoke-direct/range {v1 .. v11}, Lcom/join/mgps/adapter/o3;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V

    goto/16 :goto_1c

    .line 457
    :pswitch_4d
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_2

    .line 458
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_2

    const/4 v3, 0x0

    .line 459
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-object/from16 v3, v41

    invoke-direct {v12, v3, v4, v9, v1}, Lcom/join/mgps/adapter/o3;->f0(Lcom/join/mgps/adapter/o3$s1;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;ZI)V

    .line 460
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/4 v4, 0x0

    invoke-direct {v12, v3, v2, v4, v1}, Lcom/join/mgps/adapter/o3;->f0(Lcom/join/mgps/adapter/o3$s1;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;ZI)V

    goto/16 :goto_1c

    .line 461
    :pswitch_4e
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2

    .line 462
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/adapter/FastEntryAdapter;

    if-eqz v2, :cond_d

    .line 463
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/FastEntryAdapter;

    .line 464
    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 465
    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto/16 :goto_1c

    .line 466
    :cond_d
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 467
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 468
    new-instance v2, Lcom/join/mgps/adapter/FastEntryAdapter;

    invoke-direct {v2, v1}, Lcom/join/mgps/adapter/FastEntryAdapter;-><init>(Ljava/util/List;)V

    .line 469
    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/4 v5, 0x5

    invoke-direct {v3, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 470
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 471
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$r1;->a(Lcom/join/mgps/adapter/o3$r1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 472
    new-instance v3, Lcom/join/mgps/adapter/o3$s0;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$s0;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    goto/16 :goto_1c

    .line 473
    :pswitch_4f
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    if-eqz v1, :cond_2

    .line 474
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getDiscover()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 475
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getDiscover()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    .line 476
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->g(Lcom/join/mgps/adapter/o3$t2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 477
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->e(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->c(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/h3;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/h3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 479
    :cond_e
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getTheNew()Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 480
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getTheNew()Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;

    move-result-object v2

    .line 481
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->t(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;->getCount()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\u6b3e"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 482
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->q(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/f3;

    invoke-direct {v4, v12}, Lcom/join/mgps/adapter/f3;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;->getList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 484
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_f

    .line 485
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->v(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 486
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$ListDTO;

    .line 487
    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const v5, 0x7f0c062b

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090ee6

    .line 488
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 489
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$ListDTO;->getIco()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 490
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->v(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_23

    .line 491
    :cond_f
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBroadcast()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 492
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBroadcast()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    .line 493
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->k(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 494
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->m(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 495
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->o(Lcom/join/mgps/adapter/o3$t2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 496
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->i(Lcom/join/mgps/adapter/o3$t2;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/i3;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/i3;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 497
    :cond_10
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBg_color()Ljava/lang/String;

    move-result-object v1

    .line 498
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_11

    const-string v1, "#F7F8F9"

    .line 499
    :cond_11
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v3, 0x0

    .line 500
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 501
    sget-object v4, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const/4 v4, 0x2

    new-array v4, v4, [I

    .line 502
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    aput v1, v4, v3

    const-string v1, "#F7F8F9"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    aput v1, v4, v9

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 503
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 504
    invoke-static/range {v25 .. v25}, Lcom/join/mgps/adapter/o3$t2;->a(Lcom/join/mgps/adapter/o3$t2;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_1c

    .line 505
    :pswitch_50
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 506
    new-instance v2, Lcom/join/mgps/adapter/HomeGameListAdapter;

    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-direct {v2, v3, v1}, Lcom/join/mgps/adapter/HomeGameListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 507
    invoke-static/range {v34 .. v34}, Lcom/join/mgps/adapter/o3$k2;->a(Lcom/join/mgps/adapter/o3$k2;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto/16 :goto_1c

    .line 508
    :pswitch_51
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameRankingBean;

    .line 509
    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    const/16 v3, 0x2dba

    if-nez v2, :cond_1d

    .line 510
    new-instance v2, Lcom/join/mgps/pref/PrefDef_;

    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-direct {v2, v4}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->rankingMenu()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 511
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto/16 :goto_1c

    :cond_12
    const-string v4, ","

    .line 512
    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 513
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 514
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 515
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getRanking_title()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1c

    const/4 v10, 0x0

    .line 516
    :goto_24
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ge v10, v6, :cond_1c

    .line 517
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_13

    goto/16 :goto_2a

    .line 518
    :cond_13
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v7, v10, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v10, :cond_15

    .line 519
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getOnline_ranking()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v11, 0x1

    :goto_25
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 520
    invoke-virtual {v15, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 521
    invoke-virtual {v15, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 522
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "home-ranking-"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 523
    invoke-virtual {v15, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    add-int/lit8 v11, v11, 0x1

    const/16 v3, 0x2dba

    const/4 v9, 0x1

    goto :goto_25

    .line 524
    :cond_14
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getOnline_ranking()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x1

    invoke-static {v8, v6, v7, v3}, Lcom/join/mgps/fragment/RankingItemFragment;->p0(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_29

    :cond_15
    const/4 v3, 0x1

    if-ne v10, v3, :cond_17

    .line 525
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSingle_ranking()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CollectionBeanSub;

    const/16 v9, 0x2dba

    .line 526
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 527
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_26

    .line 528
    :cond_16
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSingle_ranking()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x1

    invoke-static {v8, v6, v7, v3}, Lcom/join/mgps/fragment/RankingItemFragment;->p0(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_17
    const/4 v3, 0x2

    if-ne v10, v3, :cond_19

    .line 529
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSimulator_ranking()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_27
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CollectionBeanSub;

    const/16 v9, 0x2dba

    .line 530
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 531
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_27

    .line 532
    :cond_18
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSimulator_ranking()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x1

    invoke-static {v8, v6, v7, v3}, Lcom/join/mgps/fragment/RankingItemFragment;->p0(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_19
    const/4 v3, 0x3

    if-ne v10, v3, :cond_1b

    .line 533
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSimulator_ranking()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CollectionBeanSub;

    const/16 v9, 0x2dba

    .line 534
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 535
    invoke-virtual {v8, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_28

    .line 536
    :cond_1a
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getFree_play_ranking()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x1

    invoke-static {v8, v6, v7, v3}, Lcom/join/mgps/fragment/RankingItemFragment;->p0(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    :cond_1b
    :goto_29
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    new-instance v3, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->d:Landroidx/fragment/app/Fragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v6

    invoke-direct {v3, v6, v2, v4}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object v3, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    .line 539
    invoke-virtual {v3, v2, v4}, Lcom/join/mgps/customview/NavigationAdapter;->d(Ljava/util/List;Ljava/util/List;)V

    .line 540
    invoke-static/range {v33 .. v33}, Lcom/join/mgps/adapter/o3$g2;->a(Lcom/join/mgps/adapter/o3$g2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v3

    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v3, v6}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 541
    invoke-static/range {v33 .. v33}, Lcom/join/mgps/adapter/o3$g2;->a(Lcom/join/mgps/adapter/o3$g2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v3

    const/4 v6, 0x3

    invoke-virtual {v3, v6}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 542
    invoke-static/range {v33 .. v33}, Lcom/join/mgps/adapter/o3$g2;->e(Lcom/join/mgps/adapter/o3$g2;)Lcom/join/mgps/customview/SlidingTabLayout6;

    move-result-object v3

    invoke-static/range {v33 .. v33}, Lcom/join/mgps/adapter/o3$g2;->a(Lcom/join/mgps/adapter/o3$g2;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 543
    invoke-static/range {v33 .. v33}, Lcom/join/mgps/adapter/o3$g2;->c(Lcom/join/mgps/adapter/o3$g2;)Landroid/widget/TextView;

    move-result-object v3

    sget-object v6, Lcom/join/mgps/adapter/m3;->b:Lcom/join/mgps/adapter/m3;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2a
    add-int/lit8 v10, v10, 0x1

    const/16 v3, 0x2dba

    const/4 v9, 0x1

    goto/16 :goto_24

    .line 544
    :cond_1c
    iget-object v1, v12, Lcom/join/mgps/adapter/o3;->m:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    goto/16 :goto_1c

    .line 545
    :cond_1d
    invoke-virtual {v2}, Lcom/join/mgps/customview/NavigationAdapter;->c()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v10, 0x0

    .line 546
    :goto_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v10, v3, :cond_2

    if-nez v10, :cond_1e

    .line 547
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/fragment/RankingItemFragment;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getOnline_ranking()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x2dba

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/fragment/RankingItemFragment;->x0(Ljava/util/List;I)V

    goto :goto_2c

    :cond_1e
    const/4 v3, 0x1

    if-ne v10, v3, :cond_1f

    .line 548
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/fragment/RankingItemFragment;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSingle_ranking()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x2dba

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/fragment/RankingItemFragment;->x0(Ljava/util/List;I)V

    goto :goto_2c

    :cond_1f
    const/4 v3, 0x2

    if-ne v10, v3, :cond_20

    .line 549
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/fragment/RankingItemFragment;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getSimulator_ranking()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x2dba

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/fragment/RankingItemFragment;->x0(Ljava/util/List;I)V

    goto :goto_2c

    :cond_20
    const/4 v3, 0x3

    if-ne v10, v3, :cond_21

    .line 550
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/fragment/RankingItemFragment;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameRankingBean;->getFree_play_ranking()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x2dba

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/fragment/RankingItemFragment;->x0(Ljava/util/List;I)V
    :try_end_46
    .catch Ljava/lang/Exception; {:try_start_46 .. :try_end_46} :catch_6

    goto :goto_2d

    :cond_21
    :goto_2c
    const/16 v5, 0x2dba

    :goto_2d
    add-int/lit8 v10, v10, 0x1

    goto :goto_2b

    .line 551
    :pswitch_52
    :try_start_47
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 552
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->i(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 553
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->a(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 554
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->k(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 555
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->c(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 556
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->m(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 557
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->e(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 558
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->o(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 559
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->g(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v2, 0x0

    .line 560
    :goto_2e
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 561
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBean;

    if-eqz v2, :cond_25

    const/4 v4, 0x1

    if-eq v2, v4, :cond_24

    const/4 v4, 0x2

    if-eq v2, v4, :cond_23

    const/4 v4, 0x3

    if-eq v2, v4, :cond_22

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_2f

    .line 562
    :cond_22
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->o(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v4

    .line 563
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->g(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    goto :goto_2f

    .line 564
    :cond_23
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->m(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v4

    .line 565
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->e(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    goto :goto_2f

    .line 566
    :cond_24
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->k(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v4

    .line 567
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->c(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    goto :goto_2f

    .line 568
    :cond_25
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->i(Lcom/join/mgps/adapter/o3$v1;)Landroid/widget/TextView;

    move-result-object v4

    .line 569
    invoke-static {v6}, Lcom/join/mgps/adapter/o3$v1;->a(Lcom/join/mgps/adapter/o3$v1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    .line 570
    :goto_2f
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u7ec4\u4ef6"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 571
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_26

    add-int/lit8 v8, v2, 0x1

    goto :goto_30

    :cond_26
    add-int/lit8 v8, v2, 0x5

    .line 572
    :goto_30
    new-instance v9, Lcom/papa/sim/statistic/e;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    move-object/from16 p1, v1

    add-int/lit8 v1, v17, 0x7

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v14, v7, v1, v8}, Lcom/papa/sim/statistic/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    invoke-direct {v12, v3, v4, v5, v9}, Lcom/join/mgps/adapter/o3;->Y(Lcom/join/mgps/dto/AppBean;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/papa/sim/statistic/e;)V
    :try_end_47
    .catch Ljava/lang/Exception; {:try_start_47 .. :try_end_47} :catch_4

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_2e

    :catch_4
    move-exception v0

    move-object v1, v0

    .line 574
    :try_start_48
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_48
    .catch Ljava/lang/Exception; {:try_start_48 .. :try_end_48} :catch_6

    goto/16 :goto_1c

    .line 575
    :pswitch_53
    :try_start_49
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2

    .line 576
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    .line 577
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/BannerBean;

    if-nez v2, :cond_27

    return-object v13

    .line 578
    :cond_27
    invoke-static/range {v28 .. v28}, Lcom/join/mgps/adapter/o3$j2;->a(Lcom/join/mgps/adapter/o3$j2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BannerBean;->getPic_remote()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f08016b

    invoke-static {v3, v5, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 579
    invoke-static/range {v28 .. v28}, Lcom/join/mgps/adapter/o3$j2;->a(Lcom/join/mgps/adapter/o3$j2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/o3$v;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/o3$v;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/BannerBean;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v2, 0x1

    .line 580
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/BannerBean;

    .line 581
    invoke-static/range {v28 .. v28}, Lcom/join/mgps/adapter/o3$j2;->c(Lcom/join/mgps/adapter/o3$j2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/BannerBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f08016b

    invoke-static {v2, v4, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 582
    invoke-static/range {v28 .. v28}, Lcom/join/mgps/adapter/o3$j2;->c(Lcom/join/mgps/adapter/o3$j2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$g0;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$g0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/BannerBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_49
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_49} :catch_5

    goto/16 :goto_1c

    :catch_5
    move-exception v0

    move-object v1, v0

    .line 583
    :try_start_4a
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1c

    .line 584
    :pswitch_54
    invoke-static {v7}, Lcom/join/mgps/adapter/o3$e2;->e(Lcom/join/mgps/adapter/o3$e2;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/y;->D(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 585
    invoke-static {v7}, Lcom/join/mgps/adapter/o3$e2;->a(Lcom/join/mgps/adapter/o3$e2;)Lcom/join/mgps/customview/CubeRotateView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/customview/CubeRotateView;->setTimeAnim()V

    .line 586
    invoke-static {v7}, Lcom/join/mgps/adapter/o3$e2;->a(Lcom/join/mgps/adapter/o3$e2;)Lcom/join/mgps/customview/CubeRotateView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$q0;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$q0;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1c

    .line 587
    :pswitch_55
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v1

    .line 588
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->a(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 589
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->c(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 590
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->e(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 591
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v2

    const/4 v9, 0x2

    if-ne v2, v9, :cond_2

    .line 592
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2b

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_2b

    .line 593
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    if-nez v2, :cond_28

    goto :goto_32

    .line 594
    :cond_28
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    if-eqz v2, :cond_2a

    .line 595
    invoke-virtual {v2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v3

    const/4 v14, 0x3

    if-ne v3, v14, :cond_29

    const-string v3, "9"

    invoke-virtual {v2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_31

    .line 596
    :cond_29
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->e(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_33

    .line 597
    :cond_2a
    :goto_31
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->e(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_33

    .line 598
    :cond_2b
    :goto_32
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->e(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 599
    :goto_33
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$d2;->e(Lcom/join/mgps/adapter/o3$d2;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$i0;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$i0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_4a .. :try_end_4a} :catch_6

    goto/16 :goto_1c

    :catch_6
    move-exception v0

    move-object v1, v0

    move-object/from16 v25, v13

    goto/16 :goto_51

    :pswitch_56
    const/4 v9, 0x2

    const/4 v14, 0x3

    .line 600
    :try_start_4b
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v15

    move-object/from16 v8, v44

    .line 601
    iget-object v1, v8, Lcom/join/mgps/adapter/o3$c2;->v:Landroid/widget/LinearLayout;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 602
    iget-object v1, v8, Lcom/join/mgps/adapter/o3$c2;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-eqz v15, :cond_2c

    .line 603
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2c

    const/4 v1, 0x0

    .line 604
    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 605
    iget-object v2, v8, Lcom/join/mgps/adapter/o3$c2;->j:Landroid/widget/TextView;

    invoke-virtual {v7}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 606
    invoke-static {v8}, Lcom/join/mgps/adapter/o3$c2;->a(Lcom/join/mgps/adapter/o3$c2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v7}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v6, 0x7f080983

    invoke-static {v1, v6, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 607
    iget-object v2, v8, Lcom/join/mgps/adapter/o3$c2;->i:Landroid/widget/TextView;

    iget-object v4, v8, Lcom/join/mgps/adapter/o3$c2;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v8, Lcom/join/mgps/adapter/o3$c2;->e:Landroid/widget/TextView;

    iget-object v3, v8, Lcom/join/mgps/adapter/o3$c2;->f:Landroid/widget/TextView;

    iget-object v1, v8, Lcom/join/mgps/adapter/o3$c2;->g:Landroid/widget/RelativeLayout;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v17
    :try_end_4b
    .catch Ljava/lang/Exception; {:try_start_4b .. :try_end_4b} :catch_7

    move-object/from16 v18, v1

    move-object/from16 v1, p0

    move-object v6, v3

    move-object v3, v7

    const v19, 0x7f080983

    move-object v14, v7

    move-object/from16 v7, v18

    move-object/from16 v25, v13

    move-object v13, v8

    move-object/from16 v8, v16

    move-object/from16 v16, v11

    const/4 v11, 0x1

    move-object/from16 v9, v17

    :try_start_4c
    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 608
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->h:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$n0;

    invoke-direct {v2, v12, v10, v14}, Lcom/join/mgps/adapter/o3$n0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 609
    invoke-virtual {v14}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$c2;->y:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    goto :goto_34

    :cond_2c
    move-object/from16 v16, v11

    move-object/from16 v25, v13

    const/4 v11, 0x1

    move-object v13, v8

    :goto_34
    if-eqz v15, :cond_2d

    .line 610
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v11, :cond_2d

    .line 611
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->o:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 612
    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 613
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->q:Landroid/widget/TextView;

    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 614
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$c2;->c(Lcom/join/mgps/adapter/o3$c2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f080983

    invoke-static {v1, v3, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 615
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$c2;->p:Landroid/widget/TextView;

    iget-object v4, v13, Lcom/join/mgps/adapter/o3$c2;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v13, Lcom/join/mgps/adapter/o3$c2;->l:Landroid/widget/TextView;

    iget-object v6, v13, Lcom/join/mgps/adapter/o3$c2;->m:Landroid/widget/TextView;

    iget-object v7, v13, Lcom/join/mgps/adapter/o3$c2;->n:Landroid/widget/RelativeLayout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v14, 0x2

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v9, v16

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v1, p0

    move-object v3, v11

    move-object/from16 v45, v9

    move-object/from16 v9, v16

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->o:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$o0;

    invoke-direct {v2, v12, v10, v11}, Lcom/join/mgps/adapter/o3$o0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 617
    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$c2;->z:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    goto :goto_35

    :cond_2d
    move-object/from16 v45, v16

    const/4 v14, 0x2

    :goto_35
    if-eqz v15, :cond_48

    .line 618
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v14, :cond_48

    .line 619
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 620
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->v:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 621
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->x:Landroid/widget/TextView;

    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 622
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$c2;->e(Lcom/join/mgps/adapter/o3$c2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f080983

    invoke-static {v1, v3, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 623
    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$c2;->A:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 624
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$c2;->w:Landroid/widget/TextView;

    iget-object v4, v13, Lcom/join/mgps/adapter/o3$c2;->r:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v13, Lcom/join/mgps/adapter/o3$c2;->s:Landroid/widget/TextView;

    iget-object v6, v13, Lcom/join/mgps/adapter/o3$c2;->t:Landroid/widget/TextView;

    iget-object v7, v13, Lcom/join/mgps/adapter/o3$c2;->u:Landroid/widget/RelativeLayout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v45

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v1, p0

    move-object v3, v11

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$c2;->v:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$p0;

    invoke-direct {v2, v12, v10, v11}, Lcom/join/mgps/adapter/o3$p0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :catch_7
    move-exception v0

    move-object/from16 v25, v13

    goto/16 :goto_50

    :pswitch_57
    move-object/from16 v25, v13

    const/16 v9, 0x8

    const/4 v11, 0x1

    const/4 v13, 0x2

    .line 626
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v15

    move-object/from16 v8, v43

    .line 627
    iget-object v2, v8, Lcom/join/mgps/adapter/o3$b2;->i:Landroid/widget/TextView;

    iget-object v4, v8, Lcom/join/mgps/adapter/o3$b2;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v8, Lcom/join/mgps/adapter/o3$b2;->e:Landroid/widget/TextView;

    iget-object v6, v8, Lcom/join/mgps/adapter/o3$b2;->f:Landroid/widget/TextView;

    iget-object v7, v8, Lcom/join/mgps/adapter/o3$b2;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v1, p0

    move-object v3, v15

    move-object v13, v8

    move-object v8, v14

    const/16 v14, 0x8

    move-object/from16 v9, v16

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    invoke-virtual {v15}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2f

    invoke-virtual {v15}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2f

    .line 629
    invoke-virtual {v15}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    .line 630
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$b2;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 631
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getScore()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getDown_count()I

    move-result v17

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSize()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v19

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v20

    iget-object v1, v13, Lcom/join/mgps/adapter/o3$b2;->j:Landroid/widget/LinearLayout;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const-string v3, "3"

    invoke-virtual {v15}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBeanMain;->getTpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const/16 v23, 0x1

    goto :goto_36

    :cond_2e
    const/16 v23, 0x0

    :goto_36
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    invoke-static/range {v16 .. v23}, Lcom/join/mgps/Util/UtilsMy;->O(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;Z)V

    .line 632
    :cond_2f
    invoke-virtual {v15}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\|"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 633
    array-length v2, v1

    if-lez v2, :cond_30

    .line 634
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->a(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v3, v1, v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 635
    :cond_30
    array-length v2, v1

    if-le v2, v11, :cond_31

    .line 636
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->c(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    aget-object v3, v1, v11

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 637
    :cond_31
    array-length v2, v1

    const/4 v3, 0x2

    if-le v2, v3, :cond_32

    .line 638
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->e(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    aget-object v1, v1, v3

    invoke-static {v2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 639
    :cond_32
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$b2;->h:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$j0;

    invoke-direct {v2, v12, v15, v10}, Lcom/join/mgps/adapter/o3$j0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 640
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->a(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$k0;

    invoke-direct {v2, v12, v15, v10}, Lcom/join/mgps/adapter/o3$k0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 641
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->c(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$l0;

    invoke-direct {v2, v12, v15, v10}, Lcom/join/mgps/adapter/o3$l0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 642
    invoke-static {v13}, Lcom/join/mgps/adapter/o3$b2;->e(Lcom/join/mgps/adapter/o3$b2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$m0;

    invoke-direct {v2, v12, v15, v10}, Lcom/join/mgps/adapter/o3$m0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_58
    move-object v3, v11

    move-object/from16 v25, v13

    .line 643
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PapaMainLive;

    .line 644
    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getList()Ljava/util/List;

    move-result-object v2

    .line 645
    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getFirst()Lcom/join/mgps/dto/PapaMainLiveFirst;

    move-result-object v4

    if-eqz v4, :cond_33

    move-object/from16 v4, v40

    .line 646
    iget-object v5, v4, Lcom/join/mgps/adapter/o3$m2;->c:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getFirst()Lcom/join/mgps/dto/PapaMainLiveFirst;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PapaMainLiveFirst;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 647
    iget-object v5, v4, Lcom/join/mgps/adapter/o3$m2;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getFirst()Lcom/join/mgps/dto/PapaMainLiveFirst;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PapaMainLiveFirst;->getReason()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 648
    iget-object v5, v4, Lcom/join/mgps/adapter/o3$m2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getFirst()Lcom/join/mgps/dto/PapaMainLiveFirst;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLiveFirst;->getCover_img()Ljava/lang/String;

    move-result-object v1

    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/high16 v7, 0x40c00000    # 6.0f

    invoke-static {v6}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/android/app/common/utils/n;->g()F

    move-result v8

    mul-float v8, v8, v7

    invoke-static {v6, v8}, Lcom/join/android/app/common/utils/MyImageLoader;->E(Landroid/content/Context;F)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v6

    const v7, 0x7f080983

    invoke-static {v5, v7, v1, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    goto :goto_37

    :cond_33
    move-object/from16 v4, v40

    if-eqz v2, :cond_34

    .line 649
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_34

    const/4 v1, 0x0

    .line 650
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PapaMainLivelistItem;

    .line 651
    iget-object v5, v4, Lcom/join/mgps/adapter/o3$m2;->c:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 652
    iget-object v5, v4, Lcom/join/mgps/adapter/o3$m2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getCover_img()Ljava/lang/String;

    move-result-object v1

    iget-object v6, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/high16 v7, 0x40c00000    # 6.0f

    invoke-static {v6}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/android/app/common/utils/n;->g()F

    move-result v8

    mul-float v8, v8, v7

    invoke-static {v6, v8}, Lcom/join/android/app/common/utils/MyImageLoader;->E(Landroid/content/Context;F)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v6

    const v7, 0x7f080983

    invoke-static {v5, v7, v1, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    :cond_34
    :goto_37
    if-eqz v2, :cond_37

    .line 653
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$m2;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 654
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PapaMainLivelistItem;

    .line 655
    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    const v6, 0x7f0c06d4

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091461

    .line 656
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    const v8, 0x7f091446

    .line 657
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    const v9, 0x7f09078d

    .line 658
    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 659
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getCover_img()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const/high16 v13, 0x40a00000    # 5.0f

    invoke-static {v11}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/android/app/common/utils/n;->g()F

    move-result v14

    mul-float v14, v14, v13

    invoke-static {v11, v14}, Lcom/join/android/app/common/utils/MyImageLoader;->E(Landroid/content/Context;F)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v11

    const v13, 0x7f080983

    invoke-static {v9, v13, v10, v11}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 660
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 661
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getStart_timestamp()J

    move-result-wide v9

    .line 662
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaMainLivelistItem;->getEnd_timestamp()J

    move-result-wide v13

    const-wide/16 v15, 0x3e8

    mul-long v9, v9, v15

    .line 663
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    cmp-long v2, v9, v15

    if-gez v2, :cond_35

    const-wide/16 v15, 0x3e8

    mul-long v15, v15, v13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v19

    cmp-long v2, v15, v19

    if-lez v2, :cond_35

    const v2, -0xb8b00

    .line 664
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, -0xb8b00

    .line 665
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 666
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u6b63\u5728\u64ad\u51fa\uff1a"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v15 .. v16}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_39

    .line 667
    :cond_35
    invoke-static {v9, v10}, Lcom/join/android/app/common/utils/g;->g(J)Z

    move-result v2

    if-eqz v2, :cond_36

    .line 668
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v9, 0x3e8

    mul-long v13, v13, v9

    invoke-static {v13, v14}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_39

    .line 669
    :cond_36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->z(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\u65e5"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v9, 0x3e8

    mul-long v13, v13, v9

    invoke-static {v13, v14}, Lcom/join/mgps/Util/y;->A(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 670
    :goto_39
    iget-object v2, v4, Lcom/join/mgps/adapter/o3$m2;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_38

    .line 671
    :cond_37
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$m2;->d:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$e0;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$e0;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 672
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$m2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v2, Lcom/join/mgps/adapter/o3$f0;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$f0;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 673
    iget-object v1, v4, Lcom/join/mgps/adapter/o3$m2;->e:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$h0;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$h0;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_59
    move-object v3, v11

    move-object/from16 v25, v13

    const/4 v11, 0x1

    .line 674
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 675
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_39

    .line 676
    invoke-static/range {v20 .. v20}, Lcom/join/mgps/adapter/o3$q1;->c(Lcom/join/mgps/adapter/o3$q1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f08016b

    invoke-static {v2, v5, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    add-int/2addr v1, v11

    .line 677
    invoke-static/range {v20 .. v20}, Lcom/join/mgps/adapter/o3$q1;->c(Lcom/join/mgps/adapter/o3$q1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 678
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_38

    .line 679
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    .line 680
    new-instance v4, Lcom/join/android/app/component/video/c$l;

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v6

    invoke-direct {v4, v1, v2, v5, v6}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 681
    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->l:Lcom/join/android/app/component/video/c;

    new-array v5, v7, [Z

    invoke-virtual {v2, v1, v4, v5}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    .line 682
    :cond_38
    invoke-static/range {v20 .. v20}, Lcom/join/mgps/adapter/o3$q1;->a(Lcom/join/mgps/adapter/o3$q1;)Landroid/widget/FrameLayout;

    move-result-object v2

    new-instance v4, Lcom/join/mgps/adapter/o3$c0;

    invoke-direct {v4, v12, v1}, Lcom/join/mgps/adapter/o3$c0;-><init>(Lcom/join/mgps/adapter/o3;I)V

    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3a

    .line 683
    :cond_39
    invoke-static/range {v20 .. v20}, Lcom/join/mgps/adapter/o3$q1;->c(Lcom/join/mgps/adapter/o3$q1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 684
    invoke-static/range {v20 .. v20}, Lcom/join/mgps/adapter/o3$q1;->c(Lcom/join/mgps/adapter/o3$q1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v4, 0x7f08016b

    invoke-static {v1, v4, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    :goto_3a
    move-object/from16 v11, v20

    .line 685
    iget-object v1, v11, Lcom/join/mgps/adapter/o3$q1;->e:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 686
    iget-object v2, v11, Lcom/join/mgps/adapter/o3$q1;->g:Landroid/widget/TextView;

    iget-object v4, v11, Lcom/join/mgps/adapter/o3$q1;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v11, Lcom/join/mgps/adapter/o3$q1;->d:Landroid/widget/TextView;

    const/4 v6, 0x0

    iget-object v7, v11, Lcom/join/mgps/adapter/o3$q1;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v1, p0

    move-object v3, v13

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    iget-object v1, v11, Lcom/join/mgps/adapter/o3$q1;->h:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$d0;

    invoke-direct {v2, v12, v13, v10}, Lcom/join/mgps/adapter/o3$d0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_5a
    move-object/from16 v25, v13

    const/4 v11, 0x1

    const/16 v14, 0x8

    .line 688
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v13

    .line 689
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3b

    .line 690
    invoke-static/range {v22 .. v22}, Lcom/join/mgps/adapter/o3$m1;->a(Lcom/join/mgps/adapter/o3$m1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f08016b

    invoke-static {v2, v4, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    add-int/2addr v1, v11

    .line 691
    invoke-static/range {v22 .. v22}, Lcom/join/mgps/adapter/o3$m1;->a(Lcom/join/mgps/adapter/o3$m1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 692
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3a

    .line 693
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v2

    .line 694
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v3

    .line 695
    invoke-virtual {v3}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v4

    .line 696
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 697
    invoke-virtual {v3, v4}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 698
    new-instance v4, Lcom/join/android/app/component/video/c$l;

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v2, v5, v3}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 699
    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->l:Lcom/join/android/app/component/video/c;

    const/4 v3, 0x0

    new-array v5, v3, [Z

    invoke-virtual {v2, v1, v4, v5}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    :cond_3a
    move-object/from16 v15, v22

    .line 700
    iget-object v2, v15, Lcom/join/mgps/adapter/o3$m1;->i:Landroid/widget/FrameLayout;

    new-instance v3, Lcom/join/mgps/adapter/o3$z;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$z;-><init>(Lcom/join/mgps/adapter/o3;I)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3b

    :cond_3b
    move-object/from16 v15, v22

    .line 701
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$m1;->a(Lcom/join/mgps/adapter/o3$m1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 702
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$m1;->a(Lcom/join/mgps/adapter/o3$m1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f08016b

    invoke-static {v1, v3, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 703
    :goto_3b
    iget-object v2, v15, Lcom/join/mgps/adapter/o3$m1;->f:Landroid/widget/TextView;

    iget-object v4, v15, Lcom/join/mgps/adapter/o3$m1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v15, Lcom/join/mgps/adapter/o3$m1;->c:Landroid/widget/TextView;

    iget-object v6, v15, Lcom/join/mgps/adapter/o3$m1;->d:Landroid/widget/TextView;

    iget-object v7, v15, Lcom/join/mgps/adapter/o3$m1;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v1

    const-string v3, "-x"

    const-string v8, "-1-"

    invoke-virtual {v1, v3, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v1, p0

    move-object v3, v13

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3d

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3d

    .line 705
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    .line 706
    iget-object v2, v15, Lcom/join/mgps/adapter/o3$m1;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 707
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getScore()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getDown_count()I

    move-result v17

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSize()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v19

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v20

    iget-object v1, v15, Lcom/join/mgps/adapter/o3$m1;->h:Landroid/widget/LinearLayout;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const-string v3, "3"

    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBeanMain;->getTpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3c

    const/16 v23, 0x1

    goto :goto_3c

    :cond_3c
    const/16 v23, 0x0

    :goto_3c
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    invoke-static/range {v16 .. v23}, Lcom/join/mgps/Util/UtilsMy;->O(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;Z)V

    .line 708
    :cond_3d
    iget-object v1, v15, Lcom/join/mgps/adapter/o3$m1;->g:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$a0;

    invoke-direct {v2, v12, v13, v10}, Lcom/join/mgps/adapter/o3$a0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 709
    invoke-static {v15}, Lcom/join/mgps/adapter/o3$m1;->a(Lcom/join/mgps/adapter/o3$m1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$b0;

    invoke-direct {v2, v12, v13, v10}, Lcom/join/mgps/adapter/o3$b0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_5b
    move-object/from16 v25, v13

    .line 710
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PapaMainGameBespeakInfo;

    .line 711
    invoke-static/range {v35 .. v35}, Lcom/join/mgps/adapter/o3$n1;->a(Lcom/join/mgps/adapter/o3$n1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainGameBespeakInfo;->getGame_bespeak_count()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 712
    invoke-static/range {v35 .. v35}, Lcom/join/mgps/adapter/o3$n1;->c(Lcom/join/mgps/adapter/o3$n1;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainGameBespeakInfo;->getMember_bespeak_count()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    sget-object v4, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 713
    invoke-static/range {v35 .. v35}, Lcom/join/mgps/adapter/o3$n1;->e(Lcom/join/mgps/adapter/o3$n1;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$y;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$y;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PapaMainGameBespeakInfo;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_5c
    move-object/from16 v25, v13

    const/4 v11, 0x1

    .line 714
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v1

    .line 715
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanRight()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v2

    .line 716
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3f

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3f

    .line 717
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBeanMain;

    .line 718
    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/drawee/generic/b;->t(Landroid/content/res/Resources;)Lcom/facebook/drawee/generic/b;

    move-result-object v4

    const/high16 v5, 0x41200000    # 10.0f

    invoke-static {v5}, Lcom/facebook/drawee/generic/RoundingParams;->d(F)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/drawee/generic/b;->Y(Lcom/facebook/drawee/generic/RoundingParams;)Lcom/facebook/drawee/generic/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/drawee/generic/b;->a()Lcom/facebook/drawee/generic/a;

    move-result-object v4

    .line 719
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->e(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/facebook/drawee/view/DraweeView;->setHierarchy(Lo0/b;)V

    .line 720
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->i(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getIco_remote()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f080983

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 721
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->e(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 722
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->m(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 723
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->w(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u5df2\u6709<font color = \'#000000\'>"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</font>\u4eba\u9884\u7ea6"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v5

    sget-object v6, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 724
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->a(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/LinearLayout;

    move-result-object v4

    new-instance v5, Lcom/join/mgps/adapter/o3$t;

    invoke-direct {v5, v12, v3, v1}, Lcom/join/mgps/adapter/o3$t;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 725
    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBean;->getIs_bespeak()I

    move-result v4

    if-ne v4, v11, :cond_3e

    .line 726
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u5df2\u9884\u7ea6"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 727
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 728
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 729
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const v3, 0x7f08040a

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_3d

    .line 730
    :cond_3e
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f080ebe

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 731
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 732
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    const v5, -0xb8b00

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 733
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v5, Lcom/join/mgps/adapter/o3$u;

    invoke-direct {v5, v12, v3, v1}, Lcom/join/mgps/adapter/o3$u;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 734
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->q(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u9884\u7ea6"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 735
    :cond_3f
    :goto_3d
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_41

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_41

    .line 736
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->c(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 737
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    .line 738
    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/drawee/generic/b;->t(Landroid/content/res/Resources;)Lcom/facebook/drawee/generic/b;

    move-result-object v3

    const/high16 v4, 0x41200000    # 10.0f

    invoke-static {v4}, Lcom/facebook/drawee/generic/RoundingParams;->d(F)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/drawee/generic/b;->Y(Lcom/facebook/drawee/generic/RoundingParams;)Lcom/facebook/drawee/generic/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/drawee/generic/b;->a()Lcom/facebook/drawee/generic/a;

    move-result-object v3

    .line 739
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->g(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/facebook/drawee/view/DraweeView;->setHierarchy(Lo0/b;)V

    .line 740
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->k(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBean;->getIco_remote()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f080983

    invoke-static {v3, v5, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 741
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->g(Lcom/join/mgps/adapter/o3$o1;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 742
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->o(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 743
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->u(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5df2\u6709<font color = \'#000000\'>"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "</font>\u4eba\u9884\u7ea6"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v4

    sget-object v5, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 744
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->c(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/LinearLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/o3$w;

    invoke-direct {v4, v12, v1, v2}, Lcom/join/mgps/adapter/o3$w;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 745
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/AppBean;->getIs_bespeak()I

    move-result v3

    if-ne v3, v11, :cond_40

    .line 746
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "\u5df2\u9884\u7ea6"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 747
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 748
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 749
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f08040a

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_3f

    .line 750
    :cond_40
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    const v4, 0x7f080ebe

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 751
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    const-string v4, "\u9884\u7ea6"

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 752
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    const v4, -0xb8b00

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 753
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 754
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->s(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/o3$x;

    invoke-direct {v4, v12, v1, v2}, Lcom/join/mgps/adapter/o3$x;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    .line 755
    :cond_41
    invoke-static/range {v32 .. v32}, Lcom/join/mgps/adapter/o3$o1;->c(Lcom/join/mgps/adapter/o3$o1;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_3f

    :pswitch_5d
    move-object/from16 v25, v13

    const/4 v11, 0x1

    .line 756
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_48

    .line 757
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_48

    const/4 v2, 0x0

    .line 758
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v2, :cond_42

    .line 759
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    .line 760
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->c(Lcom/join/mgps/adapter/o3$o2;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 761
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->e(Lcom/join/mgps/adapter/o3$o2;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 762
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->g(Lcom/join/mgps/adapter/o3$o2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 763
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->a(Lcom/join/mgps/adapter/o3$o2;)Landroid/widget/LinearLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/o3$p;

    invoke-direct {v4, v12, v2, v10}, Lcom/join/mgps/adapter/o3$p;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 764
    :cond_42
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v2, :cond_43

    .line 765
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    .line 766
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->i(Lcom/join/mgps/adapter/o3$o2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_43
    const/4 v3, 0x2

    .line 767
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v2, :cond_48

    .line 768
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 769
    invoke-static/range {v27 .. v27}, Lcom/join/mgps/adapter/o3$o2;->k(Lcom/join/mgps/adapter/o3$o2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto/16 :goto_3f

    :pswitch_5e
    move-object/from16 v25, v13

    const/4 v11, 0x1

    .line 770
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v1

    .line 771
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanRight()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v2

    .line 772
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v3

    move-object/from16 v4, v36

    const/4 v5, 0x0

    invoke-virtual {v12, v4, v1, v3, v5}, Lcom/join/mgps/adapter/o3;->g0(Lcom/join/mgps/adapter/o3$w1;Lcom/join/mgps/business/RecomDatabeanBusiness;II)V

    .line 773
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v1

    invoke-virtual {v12, v4, v2, v1, v11}, Lcom/join/mgps/adapter/o3;->g0(Lcom/join/mgps/adapter/o3$w1;Lcom/join/mgps/business/RecomDatabeanBusiness;II)V

    goto/16 :goto_3f

    :pswitch_5f
    move-object/from16 v25, v13

    .line 774
    invoke-static {v5}, Lcom/join/mgps/adapter/o3$x1;->a(Lcom/join/mgps/adapter/o3$x1;)Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "\u731c\u4f60\u559c\u6b22"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 775
    invoke-static {v5}, Lcom/join/mgps/adapter/o3$x1;->c(Lcom/join/mgps/adapter/o3$x1;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$s;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$s;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_60
    move-object v3, v11

    move-object/from16 v25, v13

    const/16 v14, 0x8

    .line 776
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v11

    if-eqz v11, :cond_48

    .line 777
    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 778
    invoke-static/range {v21 .. v21}, Lcom/join/mgps/adapter/o3$p2;->e(Lcom/join/mgps/adapter/o3$p2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 779
    invoke-static/range {v21 .. v21}, Lcom/join/mgps/adapter/o3$p2;->g(Lcom/join/mgps/adapter/o3$p2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 780
    invoke-static/range {v21 .. v21}, Lcom/join/mgps/adapter/o3$p2;->c(Lcom/join/mgps/adapter/o3$p2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 781
    invoke-static/range {v21 .. v21}, Lcom/join/mgps/adapter/o3$p2;->a(Lcom/join/mgps/adapter/o3$p2;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$q;

    invoke-direct {v2, v12, v11, v10}, Lcom/join/mgps/adapter/o3$q;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 782
    invoke-virtual {v11}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    if-nez v1, :cond_44

    move-object/from16 v13, v21

    .line 783
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$p2;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v14}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 784
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$p2;->k:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3e

    :cond_44
    move-object/from16 v13, v21

    .line 785
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$p2;->i:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 786
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$p2;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 787
    :goto_3e
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$p2;->j:Landroid/widget/TextView;

    iget-object v4, v13, Lcom/join/mgps/adapter/o3$p2;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v5, v13, Lcom/join/mgps/adapter/o3$p2;->f:Landroid/widget/TextView;

    iget-object v6, v13, Lcom/join/mgps/adapter/o3$p2;->g:Landroid/widget/TextView;

    iget-object v7, v13, Lcom/join/mgps/adapter/o3$p2;->h:Landroid/widget/RelativeLayout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v1, p0

    move-object v3, v11

    invoke-direct/range {v1 .. v9}, Lcom/join/mgps/adapter/o3;->e0(Landroid/widget/TextView;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$p2;->i:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$r;

    invoke-direct {v2, v12, v11, v10}, Lcom/join/mgps/adapter/o3$r;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3f

    :pswitch_61
    move-object/from16 v25, v13

    const/4 v11, 0x1

    .line 789
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_48

    .line 790
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_48

    const/4 v2, 0x0

    .line 791
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v1, :cond_48

    .line 792
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    .line 793
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->e(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v4

    sget-object v5, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 794
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->g(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 795
    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 796
    array-length v4, v3

    if-lez v4, :cond_45

    .line 797
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->m(Lcom/join/mgps/adapter/o3$q2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v5, v3, v5

    const v6, 0x7f080983

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 798
    :cond_45
    array-length v4, v3

    if-le v4, v11, :cond_46

    .line 799
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->o(Lcom/join/mgps/adapter/o3$q2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    aget-object v5, v3, v11

    const v6, 0x7f080983

    invoke-static {v4, v6, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 800
    :cond_46
    array-length v4, v3

    const/4 v5, 0x2

    if-le v4, v5, :cond_47

    .line 801
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->q(Lcom/join/mgps/adapter/o3$q2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    aget-object v3, v3, v5

    const v5, 0x7f080983

    invoke-static {v4, v5, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 802
    :cond_47
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->k(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getComment_count()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 803
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->i(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPv_count()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 804
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->m(Lcom/join/mgps/adapter/o3$q2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$l;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$l;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 805
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->c(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$m;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$m;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 806
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->o(Lcom/join/mgps/adapter/o3$q2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$n;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$n;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 807
    invoke-static/range {v26 .. v26}, Lcom/join/mgps/adapter/o3$q2;->a(Lcom/join/mgps/adapter/o3$q2;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$o;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$o;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3f

    :pswitch_62
    move-object/from16 v25, v13

    .line 808
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    .line 809
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 810
    new-instance v3, Lcom/join/mgps/adapter/x1;

    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-direct {v3, v4, v2}, Lcom/join/mgps/adapter/x1;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 811
    invoke-static/range {v24 .. v24}, Lcom/join/mgps/adapter/o3$r2;->a(Lcom/join/mgps/adapter/o3$r2;)Lit/sephiroth/android/library/widget/HListView;

    move-result-object v4

    invoke-virtual {v4, v3}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 812
    invoke-static/range {v24 .. v24}, Lcom/join/mgps/adapter/o3$r2;->a(Lcom/join/mgps/adapter/o3$r2;)Lit/sephiroth/android/library/widget/HListView;

    move-result-object v4

    new-instance v5, Lcom/join/mgps/adapter/o3$j;

    invoke-direct {v5, v12, v2}, Lcom/join/mgps/adapter/o3$j;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/ArrayList;)V

    invoke-virtual {v4, v5}, Lit/sephiroth/android/library/widget/AdapterView;->setOnItemClickListener(Lit/sephiroth/android/library/widget/AdapterView$d;)V

    .line 813
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 814
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 815
    invoke-virtual {v3}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_3f

    :pswitch_63
    move-object/from16 v25, v13

    .line 816
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_48

    .line 817
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_48

    const/4 v2, 0x0

    .line 818
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 819
    invoke-static/range {v23 .. v23}, Lcom/join/mgps/adapter/o3$s2;->a(Lcom/join/mgps/adapter/o3$s2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f08016b

    invoke-static {v2, v4, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 820
    invoke-static/range {v23 .. v23}, Lcom/join/mgps/adapter/o3$s2;->a(Lcom/join/mgps/adapter/o3$s2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$i;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$i;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_4c
    .catch Ljava/lang/Exception; {:try_start_4c .. :try_end_4c} :catch_8

    :cond_48
    :goto_3f
    move-object/from16 v7, v25

    goto/16 :goto_4e

    :catch_8
    move-exception v0

    goto/16 :goto_50

    :pswitch_64
    move-object/from16 v25, v13

    const/4 v3, 0x3

    const/16 v7, 0x8

    const/4 v11, 0x1

    .line 821
    :try_start_4d
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v4

    .line 822
    invoke-virtual {v4}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_48

    .line 823
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_48

    const/4 v2, 0x0

    .line 824
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/join/mgps/dto/AppBeanMain;

    .line 825
    invoke-virtual {v8}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v9

    .line 826
    invoke-virtual {v4}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 827
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getGift_package_switch()I

    move-result v2
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_4d .. :try_end_4d} :catch_b

    if-ne v2, v11, :cond_49

    move-object/from16 v13, v42

    .line 828
    :try_start_4e
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->n:Landroid/widget/ImageView;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_4e
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_4e} :catch_8

    goto :goto_40

    :cond_49
    move-object/from16 v13, v42

    .line 829
    :try_start_4f
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 830
    :goto_40
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->b:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getGame_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 831
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->e:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getInfo()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_4f
    .catch Ljava/lang/Exception; {:try_start_4f .. :try_end_4f} :catch_b

    const-wide/16 v5, 0x0

    if-eqz v1, :cond_4a

    .line 832
    :try_start_50
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5
    :try_end_50
    .catch Ljava/lang/Exception; {:try_start_50 .. :try_end_50} :catch_8

    .line 833
    :cond_4a
    :try_start_51
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getGif_ico_remote()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_51 .. :try_end_51} :catch_b

    if-eqz v2, :cond_4b

    .line 834
    :try_start_52
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getGif_ico_remote()Ljava/lang/String;

    move-result-object v15

    invoke-static {v2, v15}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_52 .. :try_end_52} :catch_8

    goto :goto_41

    .line 835
    :cond_4b
    :try_start_53
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getIco_remote()Ljava/lang/String;

    move-result-object v15

    invoke-static {v2, v15}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 836
    :goto_41
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getScore()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getDown_count()I

    move-result v17

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getSize()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v19

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v20

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->g:Landroid/widget/LinearLayout;

    iget-object v15, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    const-string v3, "3"

    invoke-virtual {v8}, Lcom/join/mgps/dto/AppBeanMain;->getTpl_type()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4c

    const/16 v23, 0x1

    goto :goto_42

    :cond_4c
    const/16 v23, 0x0

    :goto_42
    move-object/from16 v21, v2

    move-object/from16 v22, v15

    invoke-static/range {v16 .. v23}, Lcom/join/mgps/Util/UtilsMy;->O(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;Z)V

    .line 837
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v2
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_53 .. :try_end_53} :catch_b

    move-object/from16 v7, v25

    :try_start_54
    invoke-static {v2, v7, v1}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 838
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v11}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 839
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v3}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const v3, 0x7f080c43

    const v11, 0x7f06002b

    if-eqz v2, :cond_4d

    .line 840
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 841
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 842
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u5f00\u59cb"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 843
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 844
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->g:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 845
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->n:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_47

    :cond_4d
    const v2, 0x7f080c48

    if-nez v1, :cond_51

    .line 846
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v3}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 847
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_50

    .line 848
    iget-object v1, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4f

    .line 849
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4f

    .line 850
    iget-object v1, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v1

    .line 851
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4e

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v1

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ge v1, v3, :cond_4e

    .line 852
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 853
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 854
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u66f4\u65b0"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 855
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_47

    .line 856
    :cond_4e
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v2, 0x7f080c4f

    .line 857
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 858
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1000f7

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 859
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060034

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_47

    .line 860
    :cond_4f
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 861
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 862
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 863
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, v9}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_47

    .line 864
    :cond_50
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 865
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 866
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 867
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, v9}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    goto/16 :goto_47

    .line 868
    :cond_51
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v14

    .line 869
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v15

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_54} :catch_c

    if-lez v3, :cond_52

    const/16 v14, 0x2b

    :cond_52
    if-eqz v14, :cond_5a

    const/16 v3, 0x1b

    if-eq v14, v3, :cond_59

    const/16 v3, 0x30

    if-eq v14, v3, :cond_58

    const-string v3, "/"

    const/4 v15, 0x2

    if-eq v14, v15, :cond_56

    const/4 v15, 0x3

    if-eq v14, v15, :cond_54

    const/4 v15, 0x5

    if-eq v14, v15, :cond_53

    const/4 v15, 0x6

    if-eq v14, v15, :cond_54

    const/4 v15, 0x7

    if-eq v14, v15, :cond_5a

    const/16 v15, 0x2a

    if-eq v14, v15, :cond_53

    const/16 v15, 0x2b

    if-eq v14, v15, :cond_5a

    packed-switch v14, :pswitch_data_3

    goto/16 :goto_47

    .line 870
    :pswitch_65
    :try_start_55
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v2, v14}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 871
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 872
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    const-string v3, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 873
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v1, v5

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 874
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v2, 0x7f080c5c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 875
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u89e3\u538b"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 876
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_47

    .line 877
    :pswitch_66
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v2, v11}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 878
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 879
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    const-string v3, "\u89e3\u538b\u4e2d.."

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 880
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v1, v5

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 881
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v2, 0x7f08043a

    .line 882
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 883
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u89e3\u538b\u4e2d"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 884
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060032

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_47

    .line 885
    :pswitch_67
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 886
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u5b89\u88c5"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 887
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 888
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_47

    .line 889
    :pswitch_68
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v14, 0x7f080c43

    .line 890
    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 891
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v14, "\u7b49\u5f85"

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 892
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v14, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 893
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v2, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 894
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v14

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_55 .. :try_end_55} :catch_c

    .line 895
    :try_start_56
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v1, v5

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_56 .. :try_end_56} :catch_9

    goto :goto_43

    :catch_9
    move-exception v0

    move-object v1, v0

    .line 896
    :try_start_57
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 897
    :goto_43
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    const-string v2, "\u7b49\u5f85\u4e2d"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_47

    .line 898
    :pswitch_69
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 899
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 900
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u66f4\u65b0"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 901
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 902
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_47

    .line 903
    :cond_53
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v2, 0x7f080c4f

    .line 904
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 905
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1000f7

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 906
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060034

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 907
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v1}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_47

    .line 908
    :cond_54
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v14, 0x7f080c43

    .line 909
    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 910
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v14, "\u7ee7\u7eed"

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 911
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v14, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 912
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v2, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_57 .. :try_end_57} :catch_c

    .line 913
    :try_start_58
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    cmp-long v2, v14, v16

    if-nez v2, :cond_55

    .line 914
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v14

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_44

    .line 915
    :cond_55
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v14

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 916
    :goto_44
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v1, v5

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_58
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_58} :catch_a

    goto :goto_45

    :catch_a
    move-exception v0

    move-object v1, v0

    .line 917
    :try_start_59
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 918
    :goto_45
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    const-string v2, "\u6682\u505c\u4e2d"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_47

    .line 919
    :cond_56
    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 920
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v14, 0x7f080c43

    .line 921
    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 922
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v14, "\u6682\u505c"

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 923
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v14, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 924
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v2, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 925
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    cmp-long v2, v14, v16

    if-nez v2, :cond_57

    .line 926
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v14

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_46

    .line 927
    :cond_57
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->h:Landroid/widget/TextView;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v14

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 928
    :goto_46
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 929
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v1

    .line 930
    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->i:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/S"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_47

    .line 931
    :cond_58
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const v2, 0x7f080c43

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 932
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u5b89\u88c5\u4e2d"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 933
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 934
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_47

    .line 935
    :cond_59
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    const-string v2, "\u6682\u505c\u4e2d"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_47

    .line 936
    :cond_5a
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    .line 937
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 938
    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v9}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 939
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->d:Landroid/widget/TextView;

    iget-object v2, v13, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, v9}, Lcom/join/mgps/Util/UtilsMy;->Y2(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/AppBean;)V

    .line 940
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v13, v1, v2}, Lcom/join/mgps/adapter/o3;->i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 941
    :goto_47
    iget-object v11, v13, Lcom/join/mgps/adapter/o3$h2;->c:Landroid/widget/RelativeLayout;

    new-instance v14, Lcom/join/mgps/adapter/o3$k1;

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v5

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getReMarks()Ljava/lang/String;

    move-result-object v15

    move-object v1, v14

    move-object/from16 v2, p0

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/adapter/o3$k1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v14}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 942
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->m:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/adapter/o3$h;

    invoke-direct {v2, v12, v8, v10, v9}, Lcom/join/mgps/adapter/o3$h;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/dto/MgpapaMainItemBean;Lcom/join/mgps/dto/AppBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 943
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->m:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 944
    iget-object v1, v13, Lcom/join/mgps/adapter/o3$h2;->o:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4e

    :catch_b
    move-exception v0

    move-object/from16 v7, v25

    goto/16 :goto_50

    :pswitch_6a
    move-object v7, v13

    .line 945
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans2()Ljava/util/List;

    move-result-object v1

    .line 946
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    .line 947
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v2

    .line 948
    invoke-static/range {v31 .. v31}, Lcom/join/mgps/adapter/o3$a2;->c(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 949
    invoke-static/range {v31 .. v31}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 950
    invoke-static/range {v31 .. v31}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v4, v31

    .line 951
    iget-object v3, v4, Lcom/join/mgps/adapter/o3$a2;->d:Landroid/view/View;

    if-eqz v3, :cond_5b

    const/16 v5, 0x8

    .line 952
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_5b
    if-eqz v1, :cond_5c

    .line 953
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_5c

    .line 954
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 955
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 956
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v5

    new-instance v6, Lcom/join/mgps/adapter/o3$b;

    invoke-direct {v6, v12, v3}, Lcom/join/mgps/adapter/o3$b;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 957
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Lcom/join/mgps/adapter/o3$c;

    invoke-direct {v6, v12, v3}, Lcom/join/mgps/adapter/o3$c;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_48

    .line 958
    :cond_5c
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v3

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 959
    :goto_48
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType()I

    move-result v3

    if-eqz v3, :cond_62

    const/4 v5, 0x2

    if-eq v3, v5, :cond_5f

    packed-switch v3, :pswitch_data_4

    goto/16 :goto_4e

    .line 960
    :pswitch_6b
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "\u70ed\u95e8\u6e38\u620f\u5355"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 961
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 962
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/adapter/n3;->b:Lcom/join/mgps/adapter/n3;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4e

    .line 963
    :pswitch_6c
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 964
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4e

    .line 965
    :pswitch_6d
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u731c\u4f60\u559c\u6b22"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_6f

    .line 966
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 967
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4e

    .line 968
    :pswitch_6e
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PapaMainLive;

    .line 969
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapaMainLive;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4e

    .line 970
    :pswitch_6f
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u7f51\u6e38\u7cbe\u9009\u63a8\u8350"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_6f

    .line 971
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 972
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4e

    .line 973
    :pswitch_70
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u6e38\u620f\u9884\u7ea6"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_6f

    .line 974
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 975
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4e

    .line 976
    :pswitch_71
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v3

    const-string v5, "\u6700\u65b0\u7f51\u6e38"

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 977
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-eqz v2, :cond_5d

    .line 978
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    .line 979
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5d
    if-eqz v1, :cond_5e

    .line 980
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5e

    const/4 v2, 0x0

    .line 981
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 982
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$f;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$f;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 983
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$g;

    invoke-direct {v3, v12, v1, v10}, Lcom/join/mgps/adapter/o3$g;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/business/RecomDatabeanBusiness;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4e

    .line 984
    :cond_5e
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_4e

    .line 985
    :cond_5f
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    const-string v3, "\u5927\u603b\u7ba1\u64ad\u62a5"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_60

    .line 986
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_60

    const/4 v2, 0x0

    .line 987
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v1, :cond_61

    .line 988
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 989
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_49

    .line 990
    :cond_60
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->c(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 991
    :cond_61
    :goto_49
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 992
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->e(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$d;

    invoke-direct {v2, v12, v10}, Lcom/join/mgps/adapter/o3$d;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 993
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$e;

    invoke-direct {v2, v12, v10}, Lcom/join/mgps/adapter/o3$e;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4e

    .line 994
    :cond_62
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v1

    const-string v3, "\u8fd1\u671f\u70ed\u95e8"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_63

    .line 995
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    .line 996
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$a2;->a(Lcom/join/mgps/adapter/o3$a2;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_63
    const v1, 0x7f090dbd

    .line 997
    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 998
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 999
    iget-object v3, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0713b0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1000
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_4e

    :pswitch_72
    move-object v7, v13

    const/4 v11, 0x1

    .line 1001
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_65

    .line 1002
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_65

    const/4 v2, 0x0

    .line 1003
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 1004
    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    if-eqz v2, :cond_65

    .line 1005
    sget-object v4, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v4}, Lcom/join/mgps/adapter/o3$u2;->F(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1006
    sget-object v4, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v4}, Lcom/join/mgps/adapter/o3$u2;->J(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    iget-object v5, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/MyImageLoader;->D(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v5

    const v6, 0x7f080983

    invoke-static {v4, v6, v2, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 1007
    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_64

    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1008
    :cond_64
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->z(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/RelativeLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$g1;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$g1;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1009
    :cond_65
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans2()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_66

    .line 1010
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_66

    const/4 v2, 0x0

    .line 1011
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 1012
    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    if-eqz v2, :cond_66

    .line 1013
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->a(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1014
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->c(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1015
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->e(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/MyImageLoader;->D(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v4

    const v5, 0x7f080983

    invoke-static {v3, v5, v2, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->f(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 1016
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->B(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/RelativeLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$h1;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$h1;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1017
    :cond_66
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans3()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_67

    .line 1018
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_67

    const/4 v2, 0x0

    .line 1019
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 1020
    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    if-eqz v2, :cond_67

    .line 1021
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->n(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1022
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->p(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1023
    sget-object v3, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v3}, Lcom/join/mgps/adapter/o3$u2;->r(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v2

    const v4, 0x7f080983

    invoke-static {v3, v4, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 1024
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->D(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/RelativeLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$i1;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/o3$i1;-><init>(Lcom/join/mgps/adapter/o3;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1025
    :cond_67
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameDiscoverTheNewBean;

    if-eqz v1, :cond_6a

    .line 1026
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->i(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameDiscoverTheNewBean;->getGame_count()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "\u6b3e"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1027
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameDiscoverTheNewBean;->getGame_list()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_68

    .line 1028
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_68

    .line 1029
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->t(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/activity/vipzone/bean/IconGame;

    invoke-virtual {v3}, Lcom/join/mgps/activity/vipzone/bean/IconGame;->getGame_ico()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_68
    if-eqz v1, :cond_69

    .line 1030
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v11, :cond_69

    .line 1031
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->v(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/activity/vipzone/bean/IconGame;

    invoke-virtual {v3}, Lcom/join/mgps/activity/vipzone/bean/IconGame;->getGame_ico()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_69
    if-eqz v1, :cond_6a

    .line 1032
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_6a

    .line 1033
    sget-object v2, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v2}, Lcom/join/mgps/adapter/o3$u2;->x(Lcom/join/mgps/adapter/o3$u2;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/activity/vipzone/bean/IconGame;

    invoke-virtual {v1}, Lcom/join/mgps/activity/vipzone/bean/IconGame;->getGame_ico()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 1034
    :cond_6a
    sget-object v1, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v1}, Lcom/join/mgps/adapter/o3$u2;->H(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$j1;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$j1;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1035
    sget-object v1, Lcom/join/mgps/adapter/o3;->p1:Lcom/join/mgps/adapter/o3$u2;

    invoke-static {v1}, Lcom/join/mgps/adapter/o3$u2;->g(Lcom/join/mgps/adapter/o3$u2;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/adapter/o3$a;

    invoke-direct {v2, v12}, Lcom/join/mgps/adapter/o3$a;-><init>(Lcom/join/mgps/adapter/o3;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4e

    :pswitch_73
    move-object v7, v13

    const/4 v5, 0x0

    .line 1036
    invoke-virtual {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeans()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6e

    .line 1037
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_6e

    const/4 v6, 0x0

    .line 1038
    :goto_4a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v6, v2, :cond_6f

    .line 1039
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-nez v2, :cond_6b

    move-object/from16 v4, p2

    const/4 v8, 0x0

    goto/16 :goto_4d

    .line 1040
    :cond_6b
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_6c

    .line 1041
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_6c

    const/4 v4, 0x0

    .line 1042
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/AppBeanMain;

    goto :goto_4b

    :cond_6c
    move-object v3, v5

    .line 1043
    :goto_4b
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v4

    .line 1044
    invoke-virtual {v4}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v4

    .line 1045
    new-instance v8, Lcom/join/mgps/pref/PrefDef_;

    iget-object v9, v12, Lcom/join/mgps/adapter/o3;->c:Landroid/content/Context;

    invoke-direct {v8, v9}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    .line 1046
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6d

    invoke-virtual {v8}, Lcom/join/mgps/pref/PrefDef_;->lastTopTip()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v8

    invoke-virtual {v8}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6d

    .line 1047
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/adapter/o3$v2;->a(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/LinearLayout;

    move-result-object v4

    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1048
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/adapter/o3$v2;->e(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModleBean;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4c

    :cond_6d
    const/4 v8, 0x0

    .line 1049
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/adapter/o3$v2;->a(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1050
    :goto_4c
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/adapter/o3$v2;->a(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v4, Lcom/join/mgps/adapter/o3$r0;

    invoke-direct {v4, v12, v3}, Lcom/join/mgps/adapter/o3$r0;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;)V

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1051
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/adapter/o3$v2;->c(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/ImageView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/o3$c1;

    move-object/from16 v4, p2

    invoke-direct {v3, v12, v4}, Lcom/join/mgps/adapter/o3$c1;-><init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/adapter/o3$v2;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_4d
    add-int/lit8 v6, v6, 0x1

    move-object/from16 p2, v4

    goto/16 :goto_4a

    :cond_6e
    move-object/from16 v4, p2

    .line 1052
    invoke-static {v4}, Lcom/join/mgps/adapter/o3$v2;->a(Lcom/join/mgps/adapter/o3$v2;)Landroid/widget/LinearLayout;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_59
    .catch Ljava/lang/Exception; {:try_start_59 .. :try_end_59} :catch_c

    goto :goto_4e

    :catch_c
    move-exception v0

    goto :goto_4f

    :cond_6f
    :goto_4e
    move-object v13, v7

    goto :goto_52

    :catch_d
    move-exception v0

    move-object v7, v13

    :goto_4f
    move-object v1, v0

    move-object/from16 v25, v7

    goto :goto_51

    :catch_e
    move-exception v0

    move-object/from16 v25, p2

    :goto_50
    move-object v1, v0

    .line 1053
    :goto_51
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object/from16 v13, v25

    :goto_52
    return-object v13

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_23
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_23
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_2b
        :pswitch_25
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_24
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_73
        :pswitch_72
        :pswitch_6a
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_46
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_46
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_4d
        :pswitch_47
        :pswitch_4c
        :pswitch_4d
        :pswitch_4d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x4
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    const/16 v0, 0x28

    return v0
.end method

.method i0(Lcom/join/mgps/adapter/o3$h2;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 5
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object p1, p1, Lcom/join/mgps/adapter/o3$h2;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 7
    :cond_0
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 9
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->l:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 12
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->k:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 13
    :goto_0
    iget-object p2, p1, Lcom/join/mgps/adapter/o3$h2;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14
    iget-object p1, p1, Lcom/join/mgps/adapter/o3$h2;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method
