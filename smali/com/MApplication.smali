.class public Lcom/MApplication;
.super Lcom/join/kotlin/base/BaseApp;
.source "MApplication.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/ViewModelStoreOwner;


# static fields
.field public static A:Ljava/lang/String;

.field public static A1:Ljava/lang/String;

.field public static B:Ljava/lang/String;

.field public static B1:Lcom/join/android/app/common/servcie/i;

.field public static C:Ljava/lang/String;

.field public static C1:Z

.field public static D:Ljava/lang/String;

.field public static D1:Z

.field public static E:I

.field public static E1:Z

.field public static F:Ljava/lang/String;

.field public static F1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static G:Ljava/lang/String;

.field public static G1:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
            ">;"
        }
    .end annotation
.end field

.field public static H:Ljava/lang/String;

.field public static H1:I

.field public static I:Ljava/lang/String;

.field public static I1:Z

.field public static J:Ljava/lang/String;

.field private static J1:I

.field public static K:Ljava/lang/String;

.field public static L:Ljava/lang/String;

.field public static M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

.field public static N:Z

.field public static O:Ljava/lang/String;

.field public static P:I

.field public static Q:I

.field public static R:Lcom/join/mgps/dto/HomeViewSwich;

.field public static S:Lcom/join/mgps/activity/login/LoginCfgsBean;

.field public static T:Z

.field public static U:Z

.field public static V:I

.field public static W:Lcom/join/mgps/dto/GameHeadAd;

.field public static X:Landroid/graphics/Bitmap;

.field public static Y:Z

.field public static Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorRunAdTextCfgBean;",
            ">;"
        }
    .end annotation
.end field

.field public static p0:Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;

.field public static p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

.field private static final v:Ljava/lang/String;

.field public static v1:I

.field public static w:Z

.field public static x:Lcom/MApplication;

.field public static y:Ljava/lang/String;

.field public static z:Ljava/lang/String;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/join/mgps/pref/PrefDef_;

.field private d:Ljava/lang/String;

.field e:Z

.field private final f:Landroid/content/BroadcastReceiver;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Landroid/content/BroadcastReceiver;

.field private k:Lcom/danikula/videocache/i;

.field private l:Landroid/app/Activity;

.field private m:Z

.field public n:Z

.field private o:Landroidx/lifecycle/ViewModelStore;

.field p:Lcom/papa91/arc/CContext$IVideoAdListener;

.field q:Lcom/join/mgps/ad/x;

.field r:Lcom/join/mgps/ad/j;

.field s:Lcom/join/mgps/ad/z;

.field t:Lcom/join/mgps/ad/f;

.field u:Lcom/join/mgps/ad/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lcom/MApplication;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/MApplication;->v:Ljava/lang/String;

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/MApplication;->w:Z

    const/4 v0, 0x0

    .line 3
    sput-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const-string v1, ""

    .line 4
    sput-object v1, Lcom/MApplication;->y:Ljava/lang/String;

    .line 5
    sput-object v1, Lcom/MApplication;->z:Ljava/lang/String;

    .line 6
    sput-object v1, Lcom/MApplication;->A:Ljava/lang/String;

    .line 7
    sput-object v1, Lcom/MApplication;->B:Ljava/lang/String;

    .line 8
    sput-object v1, Lcom/MApplication;->C:Ljava/lang/String;

    .line 9
    sput-object v1, Lcom/MApplication;->D:Ljava/lang/String;

    const/4 v2, 0x0

    .line 10
    sput v2, Lcom/MApplication;->E:I

    .line 11
    sput-object v1, Lcom/MApplication;->F:Ljava/lang/String;

    .line 12
    sput-object v1, Lcom/MApplication;->I:Ljava/lang/String;

    const-string v3, "0"

    .line 13
    sput-object v3, Lcom/MApplication;->J:Ljava/lang/String;

    .line 14
    sput-object v1, Lcom/MApplication;->K:Ljava/lang/String;

    .line 15
    sput-object v3, Lcom/MApplication;->L:Ljava/lang/String;

    .line 16
    sput-object v0, Lcom/MApplication;->M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

    .line 17
    sput-boolean v2, Lcom/MApplication;->N:Z

    .line 18
    sput-object v1, Lcom/MApplication;->O:Ljava/lang/String;

    .line 19
    sput v2, Lcom/MApplication;->P:I

    .line 20
    sput v2, Lcom/MApplication;->Q:I

    .line 21
    sput-boolean v2, Lcom/MApplication;->T:Z

    .line 22
    sput-boolean v2, Lcom/MApplication;->U:Z

    .line 23
    sput v2, Lcom/MApplication;->V:I

    .line 24
    sput-object v0, Lcom/MApplication;->W:Lcom/join/mgps/dto/GameHeadAd;

    .line 25
    sput-object v0, Lcom/MApplication;->X:Landroid/graphics/Bitmap;

    .line 26
    sput-boolean v2, Lcom/MApplication;->Y:Z

    const/4 v0, 0x2

    .line 27
    sput v0, Lcom/MApplication;->v1:I

    .line 28
    sput-object v1, Lcom/MApplication;->A1:Ljava/lang/String;

    .line 29
    sput-boolean v2, Lcom/MApplication;->C1:Z

    .line 30
    sput-boolean v2, Lcom/MApplication;->D1:Z

    .line 31
    sput-boolean v2, Lcom/MApplication;->E1:Z

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    .line 33
    sput-boolean v2, Lcom/MApplication;->I1:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/BaseApp;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/MApplication;->b:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/MApplication;->e:Z

    .line 4
    new-instance v1, Lcom/MApplication$h;

    invoke-direct {v1, p0}, Lcom/MApplication$h;-><init>(Lcom/MApplication;)V

    iput-object v1, p0, Lcom/MApplication;->f:Landroid/content/BroadcastReceiver;

    const-string v1, "reason"

    .line 5
    iput-object v1, p0, Lcom/MApplication;->g:Ljava/lang/String;

    const-string v1, "homekey"

    .line 6
    iput-object v1, p0, Lcom/MApplication;->h:Ljava/lang/String;

    const-string v1, "recentapps"

    .line 7
    iput-object v1, p0, Lcom/MApplication;->i:Ljava/lang/String;

    .line 8
    new-instance v1, Lcom/MApplication$i;

    invoke-direct {v1, p0}, Lcom/MApplication$i;-><init>(Lcom/MApplication;)V

    iput-object v1, p0, Lcom/MApplication;->j:Landroid/content/BroadcastReceiver;

    .line 9
    iput-boolean v0, p0, Lcom/MApplication;->n:Z

    return-void
.end method

.method private D()Lcom/danikula/videocache/i;
    .locals 3

    .line 1
    new-instance v0, Lcom/danikula/videocache/i$b;

    invoke-direct {v0, p0}, Lcom/danikula/videocache/i$b;-><init>(Landroid/content/Context;)V

    const-wide/32 v1, 0x40000000

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/danikula/videocache/i$b;->i(J)Lcom/danikula/videocache/i$b;

    move-result-object v0

    const/16 v1, 0x14

    .line 3
    invoke-virtual {v0, v1}, Lcom/danikula/videocache/i$b;->h(I)Lcom/danikula/videocache/i$b;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/danikula/videocache/i$b;->b()Lcom/danikula/videocache/i;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/MApplication;)V
    .locals 0

    invoke-direct {p0}, Lcom/MApplication;->w()V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/MApplication;->x()V

    return-void
.end method

.method static synthetic d(Lcom/MApplication;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/MApplication;->l:Landroid/app/Activity;

    return-object p0
.end method

.method public static g()I
    .locals 1

    .line 1
    sget v0, Lcom/MApplication;->J1:I

    return v0
.end method

.method static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    .line 4
    :cond_0
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "/yg"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static i()Lcom/netease/nis/quicklogin/QuickLogin;
    .locals 3

    .line 1
    invoke-static {}, Lcom/netease/nis/quicklogin/QuickLogin;->getInstance()Lcom/netease/nis/quicklogin/QuickLogin;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "7fb44e42eeec4a95a2d0905f5c54d52f"

    invoke-virtual {v0, v1, v2}, Lcom/netease/nis/quicklogin/QuickLogin;->init(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/QuickLogin;->setDebugMode(Z)V

    return-object v0
.end method

.method public static j()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    return-object v0
.end method

.method private k(Ljava/util/List;I)Lcom/join/mgps/dto/PlayCfgBean;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PlayCfgBean;",
            ">;I)",
            "Lcom/join/mgps/dto/PlayCfgBean;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    .line 2
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PlayCfgBean;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static m(Landroid/content/Context;)Lcom/danikula/videocache/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/MApplication;

    .line 2
    iget-object v0, p0, Lcom/MApplication;->k:Lcom/danikula/videocache/i;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/MApplication;->D()Lcom/danikula/videocache/i;

    move-result-object v0

    iput-object v0, p0, Lcom/MApplication;->k:Lcom/danikula/videocache/i;

    :cond_0
    return-object v0
.end method

.method public static n()Lcom/netease/nis/quicklogin/QuickLogin;
    .locals 3

    .line 1
    invoke-static {}, Lcom/netease/nis/quicklogin/QuickLogin;->getInstance()Lcom/netease/nis/quicklogin/QuickLogin;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "543ff4f5e60441349f54f8716f84e97b"

    invoke-virtual {v0, v1, v2}, Lcom/netease/nis/quicklogin/QuickLogin;->init(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/QuickLogin;->setDebugMode(Z)V

    return-object v0
.end method

.method private q()V
    .locals 1

    .line 1
    new-instance v0, Lcom/MApplication$j;

    invoke-direct {v0, p0}, Lcom/MApplication$j;-><init>(Lcom/MApplication;)V

    iput-object v0, p0, Lcom/MApplication;->p:Lcom/papa91/arc/CContext$IVideoAdListener;

    .line 2
    invoke-static {v0}, Lcom/papa91/arc/CContext;->setVideoAdListener(Lcom/papa91/arc/CContext$IVideoAdListener;)V

    .line 3
    new-instance v0, Lcom/e;

    invoke-direct {v0, p0}, Lcom/e;-><init>(Lcom/MApplication;)V

    invoke-static {v0}, Lcom/papa91/arc/CContext;->setLifeListener(Lcom/papa91/arc/CContext$IActivityLifeCycleListener;)V

    return-void
.end method

.method private synthetic w()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.tools.AdBroadcast"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "action"

    const/16 v2, 0x3f1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method private static synthetic x()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/MApplication;->t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public B(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/MApplication;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public C(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/MApplication;->v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public E()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/h;->H()Ljava/lang/String;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".papakey"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, ""

    if-eqz v1, :cond_2

    .line 6
    :try_start_1
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 7
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/g0;->x(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/k;->b([B)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/k;->b([B)Ljava/lang/String;

    move-result-object v2

    .line 10
    :cond_2
    :goto_0
    sget-object v0, Lcom/MApplication;->F:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/MApplication;->G:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    :cond_3
    invoke-virtual {p0}, Lcom/MApplication;->p()V

    .line 12
    :cond_4
    new-instance v0, Lcom/papa91/arc/bean/RequestHeaders;

    invoke-direct {v0}, Lcom/papa91/arc/bean/RequestHeaders;-><init>()V

    .line 13
    invoke-virtual {v0, v2}, Lcom/papa91/arc/bean/RequestHeaders;->setWufankey(Ljava/lang/String;)V

    .line 14
    sget-object v1, Lcom/MApplication;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_d(Ljava/lang/String;)V

    .line 15
    sget-object v1, Lcom/MApplication;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_a(Ljava/lang/String;)V

    .line 16
    sget-object v1, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_ad(Ljava/lang/String;)V

    .line 17
    sget-object v1, Lcom/MApplication;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_m(Ljava/lang/String;)V

    .line 18
    sget-object v1, Lcom/MApplication;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_i(Ljava/lang/String;)V

    .line 19
    sget-object v1, Lcom/MApplication;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_pm(Ljava/lang/String;)V

    .line 20
    sget-object v1, Lcom/MApplication;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_sn(Ljava/lang/String;)V

    .line 21
    sget-object v1, Lcom/MApplication;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setAndroid_ver(Ljava/lang/String;)V

    .line 22
    sget-object v1, Lcom/MApplication;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_o(Ljava/lang/String;)V

    .line 23
    sget-object v1, Lcom/MApplication;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setArm64(Ljava/lang/String;)V

    .line 24
    sget v1, Lcom/MApplication;->E:I

    invoke-virtual {v0, v1}, Lcom/papa91/arc/bean/RequestHeaders;->setWf_single(I)V

    .line 25
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v1

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/pref/h;->p0(Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/util/DeviceIdUtil;

    move-result-object v0

    .line 27
    sget-object v1, Lcom/MApplication;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->setOaid(Ljava/lang/String;)V

    .line 28
    sget-object v1, Lcom/MApplication;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->setImei(Ljava/lang/String;)V

    .line 29
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/umeng/commonsdk/UMConfigure;->getUMIDString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->setUmengKey(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "eventName"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "gameId"

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public G(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/MApplication;->n:Z

    return-void
.end method

.method public H(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->r:Lcom/join/mgps/ad/j;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public I(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->q:Lcom/join/mgps/ad/x;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public J(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->s:Lcom/join/mgps/ad/z;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/va/overmind/VApp;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    invoke-static {p1}, Landroidx/multidex/MultiDex;->install(Landroid/content/Context;)V

    return-void
.end method

.method public e(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/MApplication;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 2
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/MApplication;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->l:Landroid/app/Activity;

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/ViewModelStore;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/MApplication;->o:Landroidx/lifecycle/ViewModelStore;

    return-object v0
.end method

.method public l()Lcom/join/mgps/pref/PrefDef_;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/MApplication;->c:Lcom/join/mgps/pref/PrefDef_;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/MApplication;->c:Lcom/join/mgps/pref/PrefDef_;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/MApplication;->c:Lcom/join/mgps/pref/PrefDef_;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/MApplication;->A1:Ljava/lang/String;

    return-object v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/MApplication;->l:Landroid/app/Activity;

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const v0, 0x7f09074c

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/MApplication;->l:Landroid/app/Activity;

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/MApplication;->l:Landroid/app/Activity;

    .line 2
    sget v0, Lcom/MApplication;->J1:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    sput v0, Lcom/MApplication;->J1:I

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v2, 0x7f09074c

    .line 4
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    sget v0, Lcom/MApplication;->J1:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/MApplication;->m:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/MApplication;->n:Z

    if-nez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/UtilsMy;->A0()V

    :cond_1
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/MApplication;->m:Z

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.join"

    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "com.papa"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 13
    :cond_2
    iput-boolean v0, p0, Lcom/MApplication;->n:Z

    :cond_3
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget p1, Lcom/MApplication;->J1:I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    sput p1, Lcom/MApplication;->J1:I

    .line 2
    iget-object p1, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    sget p1, Lcom/MApplication;->J1:I

    if-gtz p1, :cond_0

    iget-boolean p1, p0, Lcom/MApplication;->m:Z

    if-nez p1, :cond_0

    .line 4
    iput-boolean v0, p0, Lcom/MApplication;->m:Z

    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 10

    .line 1
    invoke-super {p0}, Lcom/join/kotlin/base/BaseApp;->onCreate()V

    const-string v0, "com.join.android.app.mgsim.wufun"

    .line 2
    sput-object v0, Lcom/papa91/arc/common/constants/BAction;->APPLICATION_ID:Ljava/lang/String;

    .line 3
    new-instance v0, Landroidx/lifecycle/ViewModelStore;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelStore;-><init>()V

    iput-object v0, p0, Lcom/MApplication;->o:Landroidx/lifecycle/ViewModelStore;

    const-string v0, "55af129367e58e94ba0025b7"

    const-string v1, "channel_1028"

    .line 4
    invoke-static {p0, v0, v1}, Lcom/umeng/commonsdk/UMConfigure;->preInit(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    sput-object v2, Lcom/MApplication;->B1:Lcom/join/android/app/common/servcie/i;

    .line 6
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->D()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "0"

    goto :goto_0

    :cond_0
    const-string v2, "1"

    :goto_0
    sput-object v2, Lcom/MApplication;->J:Ljava/lang/String;

    .line 7
    sput-object p0, Lcom/MApplication;->x:Lcom/MApplication;

    .line 8
    invoke-static {p0}, Lcom/papa91/arc/ext/ToastManager;->init(Landroid/content/Context;)V

    .line 9
    new-instance v2, Lcom/join/mgps/pref/PrefDef_;

    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-direct {v2, v3}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/MApplication;->c:Lcom/join/mgps/pref/PrefDef_;

    const/16 v2, 0x8

    .line 10
    invoke-static {v2}, Lcom/papa/gsyvideoplayer/player/d;->r(I)V

    .line 11
    invoke-static {p0}, Lcom/join/android/app/common/utils/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/MApplication;->d:Ljava/lang/String;

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "packageName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", process:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/VApp;->isMindProcess()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    invoke-direct {p0}, Lcom/MApplication;->q()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/VApp;->isEmulator()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_4

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/VApp;->isMindProcess()Z

    move-result v2

    const-string v4, "com.join.android.app.mgsim.wufun.addon"

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 16
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->isVirtualProcess()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17
    iput-boolean v3, p0, Lcom/MApplication;->e:Z

    .line 18
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/join/mgps/Util/v;->e(Landroid/content/Context;)V

    .line 19
    :try_start_0
    iget-object v0, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 20
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    const-string v1, "mgdb"

    invoke-virtual {v0, v1}, Lp1/e;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 22
    :cond_2
    :goto_1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/join/mgps/Util/s1;->a(Landroid/content/Context;)Ljava/util/List;

    .line 23
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "before onCreate:processName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/MApplication;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 24
    :cond_4
    invoke-static {p0}, Lcom/papa/sim/statistic/o;->m(Landroid/content/Context;)Lcom/papa/sim/statistic/o;

    move-result-object v2

    new-instance v4, Lcom/MApplication$d;

    invoke-direct {v4, p0}, Lcom/MApplication$d;-><init>(Lcom/MApplication;)V

    invoke-virtual {v2, v4}, Lcom/papa/sim/statistic/o;->o0(Lcom/papa/sim/statistic/o$g;)V

    .line 25
    iget-object v2, p0, Lcom/MApplication;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->video_init_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 26
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 27
    :try_start_1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    const-class v7, Ljava/util/List;

    new-array v8, v3, [Ljava/lang/Class;

    const-class v9, Lcom/join/mgps/dto/VideoInitCfgBean;

    aput-object v9, v8, v5

    invoke-virtual {v6, v7, v8}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    invoke-virtual {v4, v2, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_6

    .line 28
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    .line 29
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/VideoInitCfgBean;

    if-eqz v4, :cond_5

    .line 30
    invoke-virtual {v4}, Lcom/join/mgps/dto/VideoInitCfgBean;->getSdkType()I

    move-result v4

    const/16 v6, 0x9

    if-ne v4, v6, :cond_5

    .line 31
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, ""

    sget-object v6, Lcom/f;->a:Lcom/f;

    invoke-static {v2, v4, v6}, Lcom/join/mgps/ad/adapter/d;->a(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 33
    :cond_6
    :goto_2
    invoke-virtual {p0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 34
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    sput-object v2, Lcom/MApplication;->B1:Lcom/join/android/app/common/servcie/i;

    .line 35
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v2}, Lcom/join/mgps/Util/v;->e(Landroid/content/Context;)V

    .line 36
    new-instance v2, Ljava/lang/Thread;

    new-instance v4, Lcom/MApplication$e;

    invoke-direct {v4, p0}, Lcom/MApplication$e;-><init>(Lcom/MApplication;)V

    invoke-direct {v2, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 37
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 38
    invoke-static {p0}, Lcom/constant/a;->c(Landroid/content/Context;)V

    .line 39
    sput-boolean v5, Lcom/join/mgps/Util/b2;->f1:Z

    .line 40
    invoke-static {p0}, Lcom/join/android/app/component/album/lib/ImageLoader;->u(Landroid/content/Context;)V

    .line 41
    invoke-static {p0}, Lcom/join/android/app/component/optimizetext/a;->m(Landroid/content/Context;)V

    .line 42
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/pref/h;->w()Lcom/join/mgps/dto/HomeViewSwich;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 43
    sput-object v2, Lcom/MApplication;->R:Lcom/join/mgps/dto/HomeViewSwich;

    .line 44
    :cond_7
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/pref/h;->J()Lcom/join/mgps/activity/login/LoginCfgsBean;

    move-result-object v4

    if-eqz v2, :cond_8

    .line 45
    sput-object v4, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    .line 46
    :cond_8
    invoke-static {p0}, Lcom/join/mgps/Util/d1;->b(Landroid/content/Context;)I

    move-result v2

    const/16 v4, 0x1a

    if-lt v2, v4, :cond_9

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v4, :cond_9

    goto :goto_3

    .line 47
    :cond_9
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/android/app/common/servcie/DownloadService_;->c0(Landroid/content/Context;)Lcom/join/android/app/common/servcie/DownloadService_$l;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 48
    :goto_3
    new-instance v2, Lcom/MApplication$f;

    invoke-direct {v2, p0}, Lcom/MApplication$f;-><init>(Lcom/MApplication;)V

    .line 49
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 50
    invoke-static {}, Lcom/join/android/app/common/exception/a;->e()Lcom/join/android/app/common/exception/a;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/join/android/app/common/exception/a;->j(Landroid/content/Context;)V

    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "applicationcreatFinish time ="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 52
    :try_start_2
    new-instance v2, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v2, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->firstShowUserPermiss()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_a

    const/4 v2, 0x0

    .line 53
    invoke-static {p0, v0, v1, v3, v2}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 54
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->AUTO:Lcom/umeng/analytics/MobclickAgent$PageMode;

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->setPageCollectionMode(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    const-string v0, "563efaa5a8fe"

    const-string v1, "47378ac7ef1e9db5870c9cf62ee34a1d"

    .line 55
    invoke-static {p0, v0, v1}, Lcom/mob/MobSDK;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-static {p0}, Lcom/join/android/app/common/utils/l;->o(Landroid/content/Context;)V

    .line 57
    invoke-static {p0}, Lcom/join/mgps/Util/d2;->b(Landroid/content/Context;)V

    .line 58
    new-instance v0, Lcom/join/android/app/common/http/MiitHelper;

    new-instance v1, Lcom/MApplication$g;

    invoke-direct {v1, p0}, Lcom/MApplication$g;-><init>(Lcom/MApplication;)V

    invoke-direct {v0, v1}, Lcom/join/android/app/common/http/MiitHelper;-><init>(Lcom/join/android/app/common/http/MiitHelper$a;)V

    .line 59
    invoke-virtual {v0, p0}, Lcom/join/android/app/common/http/MiitHelper;->getDeviceIds(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 60
    :catch_2
    :cond_a
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.intent.downloadService.destroyed"

    .line 61
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 62
    iget-object v1, p0, Lcom/MApplication;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Application;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 63
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 64
    iget-object v1, p0, Lcom/MApplication;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Application;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 65
    :try_start_3
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/h;->c()Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 67
    sput-object v0, Lcom/MApplication;->K:Ljava/lang/String;

    .line 68
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/android/app/common/http/DNSDataResult;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/common/http/DNSDataResult;

    .line 69
    invoke-virtual {v0}, Lcom/join/android/app/common/http/DNSDataResult;->updateRpcConstant()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 71
    :cond_b
    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "anv9.ctapi"

    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "anv3cjapi"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "anv5cjapi"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "anv6cjapi"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "comment"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "anctapi"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "ansearchapi"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    sget-object v0, Lcom/MApplication;->F1:Ljava/util/List;

    const-string v1, "testsanv9"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    iget-boolean v0, p0, Lcom/MApplication;->e:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/MApplication;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Application;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    iget-object v0, p0, Lcom/MApplication;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Application;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public p()V
    .locals 4

    const-string v0, ""

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/r0;->j(Landroid/content/Context;I)V

    .line 2
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/n;->i()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->y:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 3
    :try_start_1
    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->y:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :goto_0
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/papa/sim/statistic/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->z:Ljava/lang/String;

    .line 6
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/pref/h;->y()Ljava/lang/String;

    move-result-object v1

    .line 7
    sget-object v2, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "0"

    sget-object v3, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "-1"

    sget-object v3, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v1

    sget-object v2, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/pref/h;->m0(Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v1

    sget-object v2, Lcom/MApplication;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/pref/h;->l0(Ljava/lang/String;)V

    .line 10
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->G:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 11
    :try_start_3
    sput-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    .line 12
    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->G:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 13
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 14
    :goto_1
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/n;->o()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->A:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 15
    :try_start_5
    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->A:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    .line 16
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    :goto_2
    invoke-static {}, Lcom/join/mgps/Util/m0;->e()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->B:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 18
    :try_start_7
    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->B:Ljava/lang/String;

    .line 19
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/MApplication;->C:Ljava/lang/String;

    .line 20
    invoke-virtual {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/join/mgps/Util/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/MApplication;->D:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    .line 21
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 22
    :goto_3
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sput-object v0, Lcom/MApplication;->F:Ljava/lang/String;

    .line 23
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/constant/a;->b(Landroid/content/Context;)I

    move-result v0

    sput v0, Lcom/MApplication;->E:I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    return-void
.end method

.method public r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->t:Lcom/join/mgps/ad/f;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/MApplication$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/MApplication$b;-><init>(Lcom/MApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/MApplication;->t:Lcom/join/mgps/ad/f;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/f;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/MApplication;->t:Lcom/join/mgps/ad/f;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/f;->h(Z)V

    :goto_0
    return-void
.end method

.method public s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->u:Lcom/join/mgps/ad/h;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/MApplication$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/MApplication$c;-><init>(Lcom/MApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/MApplication;->u:Lcom/join/mgps/ad/h;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/h;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/MApplication;->u:Lcom/join/mgps/ad/h;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/h;->h(Z)V

    :goto_0
    return-void
.end method

.method public t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->r:Lcom/join/mgps/ad/j;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/MApplication$l;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/MApplication$l;-><init>(Lcom/MApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/MApplication;->r:Lcom/join/mgps/ad/j;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/j;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/MApplication;->r:Lcom/join/mgps/ad/j;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/j;->h(Z)V

    :goto_0
    return-void
.end method

.method public u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->q:Lcom/join/mgps/ad/x;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/MApplication$k;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/MApplication$k;-><init>(Lcom/MApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/MApplication;->q:Lcom/join/mgps/ad/x;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/x;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/MApplication;->q:Lcom/join/mgps/ad/x;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/x;->h(Z)V

    :goto_0
    return-void
.end method

.method public v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication;->s:Lcom/join/mgps/ad/z;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/MApplication$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/MApplication$a;-><init>(Lcom/MApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/MApplication;->s:Lcom/join/mgps/ad/z;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/z;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/MApplication;->s:Lcom/join/mgps/ad/z;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/z;->h(Z)V

    :goto_0
    return-void
.end method

.method public y(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/MApplication;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public z(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/MApplication;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
