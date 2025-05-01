.class public Lcom/join/mgps/activity/FaceTransferHomePageActivity;
.super Lcom/BaseActivity;
.source "FaceTransferHomePageActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c022c
.end annotation


# static fields
.field private static final v:Ljava/lang/String; = "FaceTransferHomePageActivity"


# instance fields
.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091489
    .end annotation
.end field

.field c:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        value = 0x7f100487
    .end annotation
.end field

.field d:Landroid/content/Context;

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field g:I

.field private h:Z

.field private i:Lcom/join/mgps/Util/WifiUtils;

.field private j:Z

.field k:Ljava/lang/String;

.field l:Z

.field private m:Lru/alexbykov/nopermission/b;

.field n:Z

.field o:Z

.field p:Z

.field q:Lcom/join/mgps/service/SocketServerService$a;

.field r:Landroid/content/ServiceConnection;

.field s:Z

.field t:Lcom/join/mgps/service/SocketClientService$a;

.field u:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const-string v0, "AndroidShare_"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->f:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->h:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->j:Z

    const-string v1, ""

    .line 5
    iput-object v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->k:Ljava/lang/String;

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->l:Z

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    .line 8
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->q:Lcom/join/mgps/service/SocketServerService$a;

    .line 10
    new-instance v1, Lcom/join/mgps/activity/FaceTransferHomePageActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$c;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->r:Landroid/content/ServiceConnection;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->t:Lcom/join/mgps/service/SocketClientService$a;

    .line 12
    new-instance v0, Lcom/join/mgps/activity/FaceTransferHomePageActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$d;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->u:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->onNeverAskAgain()V

    return-void
.end method

.method private getDeviceInfo()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->m:Lru/alexbykov/nopermission/b;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v3, "android.permission.READ_PHONE_STATE"

    const-string v4, "android.permission.READ_SMS"

    const-string v5, "android.permission.READ_PHONE_NUMBERS"

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lru/alexbykov/nopermission/b;->d([Ljava/lang/String;)Lru/alexbykov/nopermission/b;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/o;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/o;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    .line 2
    invoke-virtual {v0, v1}, Lru/alexbykov/nopermission/b;->r(Ljava/lang/Runnable;)Lru/alexbykov/nopermission/b;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/n;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/n;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    invoke-virtual {v0, v1}, Lru/alexbykov/nopermission/b;->n(Ljava/lang/Runnable;)Lru/alexbykov/nopermission/b;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/m;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/m;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    invoke-virtual {v0, v1}, Lru/alexbykov/nopermission/b;->p(Ljava/lang/Runnable;)Lru/alexbykov/nopermission/b;

    move-result-object v0

    invoke-virtual {v0}, Lru/alexbykov/nopermission/b;->s()V

    return-void
.end method

.method public static synthetic h0(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->onDenied()V

    return-void
.end method

.method public static synthetic i0(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->onSuccess()V

    return-void
.end method

.method static synthetic j0()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/FaceTransferHomePageActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->h:Z

    return p1
.end method

.method private onDenied()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u4f60\u5df2\u62d2\u7edd\u6743\u9650\u7533\u8bf7\uff0c\u65e0\u6cd5\u5bf9\u6218\uff01"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private onNeverAskAgain()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u4f60\u5df2\u62d2\u7edd\u6743\u9650\u7533\u8bf7\uff0c\u65e0\u6cd5\u5bf9\u6218\uff01"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private onSuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->l:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/WifiUtils;->getApSSIDAll(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->k:Ljava/lang/String;

    return-void
.end method

.method private q0()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "\u514d\u6d41\u91cf\u53d1\u9001\u7ed9\u597d\u53cb"

    aput-object v2, v0, v1

    const v1, 0x7f1002d3

    .line 1
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 3
    new-instance v3, Lcom/join/mgps/activity/FaceTransferHomePageActivity$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$a;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v2, v0, 0x8

    const/16 v4, 0x11

    .line 5
    invoke-virtual {v1, v3, v0, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method


# virtual methods
.method init()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->d:Landroid/content/Context;

    return-void
.end method

.method initView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->b:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->q0()V

    return-void
.end method

.method l0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->s0()V

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    const-string v2, "\u6b63\u5728\u7b49\u5f85\u8fde\u63a5..."

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    .line 6
    :cond_1
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 7
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/service/SocketServerService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x1

    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->r:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0, v2, v1}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    return-void
.end method

.method m0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->stopService()V

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    const-string v2, "\u6b63\u5728\u8fde\u63a5\u4e2d..."

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    .line 6
    :cond_1
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 7
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/join/mgps/service/SocketClientService;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v2}, Lcom/join/mgps/Util/WifiUtils;->getLocalIPAddress()Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    .line 9
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".1"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connected2Service: host"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":::\u672c\u5730\u5730\u5740:::"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "host"

    .line 12
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->u:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 15
    iput-boolean v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    return-void
.end method

.method n0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    new-instance v0, Lru/alexbykov/nopermission/b;

    invoke-direct {v0, p0}, Lru/alexbykov/nopermission/b;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->m:Lru/alexbykov/nopermission/b;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    .line 3
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x384

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->g:I

    .line 5
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->t(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->init()V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->initView()V

    return-void
.end method

.method o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/WifiUtils;->getApSSID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    .line 3
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->l:Z

    if-nez v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->getDeviceInfo()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/WifiUtils;->getApSSIDAll(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->k:Ljava/lang/String;

    const-string v2, "unknown id"

    .line 6
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u4f60\u5df2\u62d2\u7edd\u6743\u9650\u7533\u8bf7\uff0c\u65e0\u6cd5\u5bf9\u6218\uff01"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    :cond_2
    const/16 v2, 0x1a

    if-lt v1, v2, :cond_4

    .line 8
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->k(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    :cond_3
    new-instance v0, Lcom/join/mgps/customview/l;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/l;-><init>(Landroid/content/Context;)V

    .line 11
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/l;->c(Ljava/lang/String;)V

    .line 13
    new-instance v1, Lcom/join/mgps/activity/FaceTransferHomePageActivity$g;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$g;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;Lcom/join/mgps/customview/l;)V

    const-string v2, "\u53bb\u8fde\u63a5"

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/customview/l;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->m0()V

    return-void
.end method

.method onClick(Landroid/view/View;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090548,
            0x7f090549,
            0x7f090146
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/16 v0, 0x1a

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 2
    :sswitch_0
    :try_start_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/e;->f(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "\u8bf7\u786e\u4fdd\u672c\u673a\u70ed\u70b9\u5904\u4e8e\u5173\u95ed\u72b6\u6001"

    const/4 v0, 0x0

    .line 4
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/p;->p0(Ljava/lang/String;)V

    .line 8
    new-instance p1, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {p1, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    const-string v0, "android.permission.CAMERA"

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/activity/FaceTransferHomePageActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$b;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    goto :goto_1

    .line 10
    :sswitch_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->p0()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 11
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v0, :cond_2

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "location permission: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_2

    .line 14
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 15
    :cond_2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/p;->o0(Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/IntentUtil;->goBuildQRCodeActivity(Landroid/content/Context;)V

    goto :goto_1

    .line 18
    :sswitch_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f090146 -> :sswitch_2
        0x7f090548 -> :sswitch_1
        0x7f090549 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->stopService()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->s0()V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    .line 2
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/papa/sim/statistic/p;->o0(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/IntentUtil;->goBuildQRCodeActivity(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onSocketStatusEvent(Lcom/join/mgps/socket/entity/f;)V
    .locals 6
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    .line 1
    sget-object v2, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->v:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "onSocketStatusEvent: 0000"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p1, Lcom/join/mgps/socket/entity/f;->a:I

    if-eq p1, v5, :cond_2

    if-eq p1, v0, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->s0()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->stopService()V

    .line 5
    iput-boolean v3, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    .line 6
    iput-boolean v3, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    goto :goto_1

    :cond_2
    new-array p1, v0, [Ljava/lang/String;

    aput-object v2, p1, v3

    const-string v1, "onSocketStatusEvent: \u6210\u529f"

    aput-object v1, p1, v5

    .line 7
    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/papa/sim/statistic/p;->l0(Ljava/lang/String;)V

    .line 10
    iget-boolean p1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    if-eqz p1, :cond_3

    .line 11
    invoke-static {p0}, Lcom/join/mgps/activity/GameTransferActivity_;->w1(Landroid/content/Context;)Lcom/join/mgps/activity/GameTransferActivity_$k;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/join/mgps/activity/GameTransferActivity_$k;->a(I)Lcom/join/mgps/activity/GameTransferActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 12
    :cond_3
    iget-boolean p1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    if-eqz p1, :cond_4

    .line 13
    invoke-static {p0}, Lcom/join/mgps/activity/GameTransferActivity_;->w1(Landroid/content/Context;)Lcom/join/mgps/activity/GameTransferActivity_$k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GameTransferActivity_$k;->a(I)Lcom/join/mgps/activity/GameTransferActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 14
    :cond_4
    :goto_0
    iput-boolean v3, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->o:Z

    .line 15
    iput-boolean v3, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->n:Z

    :goto_1
    return-void
.end method

.method p0()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_4

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->g:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v2}, Lcom/join/mgps/Util/WifiUtils;->getWifiApStateInt()I

    move-result v2

    const/16 v3, 0xb

    if-eq v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->h:Z

    if-nez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v0}, Lcom/join/mgps/Util/WifiUtils;->getWifiApStateInt()I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->i:Lcom/join/mgps/Util/WifiUtils;

    invoke-virtual {v0}, Lcom/join/mgps/Util/WifiUtils;->getWifiApStateInt()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 5
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/activity/BuildQRCodeActivity_;->y0(Landroid/content/Context;)Lcom/join/mgps/activity/BuildQRCodeActivity_$c;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ssid"

    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/BuildQRCodeActivity_$c;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_1

    .line 6
    :cond_2
    :goto_0
    iput-boolean v1, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->j:Z

    .line 7
    new-instance v1, Lcom/join/mgps/customview/l;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/l;-><init>(Landroid/content/Context;)V

    .line 8
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 9
    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/l;->b(Ljava/lang/String;)V

    .line 10
    new-instance v2, Lcom/join/mgps/activity/FaceTransferHomePageActivity$e;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$e;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/join/mgps/customview/l;->a(Landroid/view/View$OnClickListener;)V

    .line 11
    new-instance v0, Lcom/join/mgps/activity/FaceTransferHomePageActivity$f;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/FaceTransferHomePageActivity$f;-><init>(Lcom/join/mgps/activity/FaceTransferHomePageActivity;Lcom/join/mgps/customview/l;)V

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/l;->d(Landroid/view/View$OnClickListener;)V

    :cond_3
    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_4
    return v1
.end method

.method r0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    const-string v1, "3269874"

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goFormDetial(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method s0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->s:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->u:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/service/SocketClientService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->stopService(Landroid/content/Intent;)Z

    :cond_0
    return-void
.end method

.method stopService()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->p:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FaceTransferHomePageActivity;->r:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/service/SocketServerService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->stopService(Landroid/content/Intent;)Z

    :cond_0
    return-void
.end method
