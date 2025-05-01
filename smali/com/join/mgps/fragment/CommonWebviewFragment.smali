.class public Lcom/join/mgps/fragment/CommonWebviewFragment;
.super Landroidx/fragment/app/Fragment;
.source "CommonWebviewFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/LJNestScrollWebView$b;
.implements Lcom/join/mgps/Util/h2$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/CommonWebviewFragment$m;,
        Lcom/join/mgps/fragment/CommonWebviewFragment$n;,
        Lcom/join/mgps/fragment/CommonWebviewFragment$o;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c025b
.end annotation


# static fields
.field public static final E1:I = 0x1

.field public static final F1:I = 0x2

.field public static final G1:I = 0x1388

.field public static final H1:I = 0x1389

.field public static final I1:I = 0x138a

.field public static final J1:I = 0x138b

.field private static final K1:I = 0x2

.field private static final L1:I = 0x1010

.field private static final M1:I = 0x64

.field private static final N1:I = 0xc8

.field private static final O1:I = 0xa


# instance fields
.field A:Landroid/app/Dialog;

.field private A1:Lnet/bither/util/b$e;

.field B:Landroidx/appcompat/app/AlertDialog$Builder;

.field private B1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final C:Lcom/join/mgps/activity/posting/PostingActivity$m;

.field private C1:Lcom/mgsim/common/fragment/BackHandledFragment;

.field private D:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private D1:Z

.field E:Z

.field F:J

.field private G:Lcom/join/mgps/socket/fight/arena/b;

.field private H:Ljava/lang/String;

.field I:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
    .end annotation
.end field

.field private final J:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:Lcom/papa91/battle/protocol/GameRoom;

.field private Q:Lcom/join/mgps/dialog/b1;

.field private R:Lcom/join/mgps/dialog/d1;

.field S:Z

.field T:Z

.field private U:Landroid/app/Dialog;

.field private V:Landroid/net/Uri;

.field private W:Landroid/net/Uri;

.field private X:Z

.field private Y:Lcom/join/mgps/Util/h2;

.field Z:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/os/Handler;

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/mgps/customview/LJNestScrollWebView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/rpc/e;

.field k:Lcom/join/mgps/rpc/b;

.field l:Lcom/join/mgps/rpc/c;

.field m:Ljava/lang/String;

.field private n:J

.field private o:Landroid/content/Context;

.field private p:Z

.field private p0:Z

.field private p1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private q:Landroid/view/View;

.field private r:Lcom/wufan/user/service/protobuf/n0;

.field private s:Z

.field t:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private u:Z

.field private v:Lcom/join/mgps/dialog/g0;

.field v1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private w:Lcom/join/mgps/dialog/y1;

.field private x:Landroid/webkit/WebChromeClient;

.field private y:Z

.field z:Lcom/join/mgps/dialog/d1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string v0, "ShareWebActivity"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v0, "PAPA_EMU_INTENT_EXTRA_ACTION_FROM"

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->c:Ljava/lang/String;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->d:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->s:Z

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->y:Z

    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    .line 9
    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->B:Landroidx/appcompat/app/AlertDialog$Builder;

    .line 10
    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$e;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->C:Lcom/join/mgps/activity/posting/PostingActivity$m;

    .line 11
    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$g;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->D:Landroid/os/Handler;

    .line 12
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->E:Z

    const-wide/16 v1, 0x0

    .line 13
    iput-wide v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->F:J

    .line 14
    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$j;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->J:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    .line 16
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    .line 17
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    .line 18
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->X:Z

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p0:Z

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    .line 22
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$c;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->A1:Lnet/bither/util/b$e;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->B1:Ljava/util/List;

    return-void
.end method

.method private B0(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_3

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    .line 6
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {v2, p1, v0, v3}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v2, p1}, Lcom/join/mgps/Util/UtilsMy;->B0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    goto :goto_1

    .line 10
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    goto :goto_1

    .line 11
    :cond_3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    .line 12
    :goto_1
    iget-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method private C0()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.CAMERA"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v3, 0x2

    .line 12
    invoke-static {v1, v0, v3}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return v2

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private E0(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ".jpg"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/wufan91/live"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    const/4 p1, 0x0

    return-object p1

    .line 6
    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 9
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    const-string v2, "\u751f\u6210\u5c01\u9762\u5931\u8d25"

    invoke-static {p1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".fileprovider"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {p1, v0, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method private M0(Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_selected_images"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 3
    :cond_1
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method private N0(I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->u:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f10047f

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/wufan91/live"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    .line 7
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 8
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 v0, 0x64

    if-eq p1, v0, :cond_4

    const/16 v0, 0xc8

    if-eq p1, v0, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "_select"

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->E0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->V:Landroid/net/Uri;

    .line 10
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "image/*"

    .line 11
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1

    :cond_4
    const-string p1, ""

    .line 13
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->E0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->V:Landroid/net/Uri;

    .line 14
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->V:Landroid/net/Uri;

    const-string v2, "output"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 16
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    return-void
.end method

.method private U0()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f1104fc

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    const v1, 0x7f0c01dc

    .line 2
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/16 v3, 0x50

    .line 7
    invoke-virtual {v1, v3}, Landroid/view/Window;->setGravity(I)V

    .line 8
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    const v1, 0x7f0902f9

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 11
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    const v2, 0x7f091003

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    const v3, 0x7f090232

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 13
    new-instance v3, Lcom/join/mgps/fragment/CommonWebviewFragment$l;

    invoke-direct {v3, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$l;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$a;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$b;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/webkit/WebChromeClient;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->x:Landroid/webkit/WebChromeClient;

    return-object p0
.end method

.method static synthetic W(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/join/mgps/dialog/y1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->w:Lcom/join/mgps/dialog/y1;

    return-object p0
.end method

.method private W0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP1()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 3
    iput v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->K:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->I:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 5
    iput v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    .line 6
    :cond_1
    iput v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->K:I

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP2()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_2

    .line 9
    iput v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->L:I

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->I:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 11
    iput v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    .line 12
    :cond_3
    iput v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->L:I

    .line 13
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP3()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_4

    .line 15
    iput v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->M:I

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->I:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x2

    .line 17
    iput v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    .line 18
    :cond_5
    iput v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->M:I

    .line 19
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP4()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_6

    .line 21
    iput v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->N:I

    goto :goto_3

    .line 22
    :cond_6
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->I:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_7

    const/4 v0, 0x3

    .line 23
    iput v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    .line 24
    :cond_7
    iput v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->N:I

    :goto_3
    return-void
.end method

.method static synthetic X(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->U0()V

    return-void
.end method

.method private X0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->setFullScreen()V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->H:Ljava/lang/String;

    return-object p0
.end method

.method private a1()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.OPENABLE"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "*/*"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Image Chooser"

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const v2, 0xa8e2

    invoke-virtual {v1, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->W0()V

    return-void
.end method

.method private c1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Q:Lcom/join/mgps/dialog/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/b1;->a()V

    .line 2
    :cond_0
    new-instance v0, Lcom/join/mgps/dialog/b1;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/dialog/b1;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Q:Lcom/join/mgps/dialog/b1;

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u52a0\u5165\u5931\u8d25\uff0c\u60a8\u4e0e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getRoomId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\u623f\u95f4\u4e0d\u5728\u540c\u4e00\u6218\u533a\n\u8bf7\u8fdb\u5165\u8be5\u6e38\u620f\u623f\u95f4\u5217\u8868\uff0c\u5e76\u5207\u6362\u81f3\u3010"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getBattleArea()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/socket/fight/arena/c;->d(Lcom/papa91/battle/protocol/BattleArea;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u3011\u540e\u518d\u67e5\u627e\u623f\u95f4\u53f7\u8fdb\u5165"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/b1;->d(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Q:Lcom/join/mgps/dialog/b1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/b1;->e()V

    return-void
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/CommonWebviewFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->K:I

    return p0
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/CommonWebviewFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->L:I

    return p0
.end method

.method private e1(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->R:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->R:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/join/mgps/Util/a0;->z(Landroid/content/Context;Ljava/lang/String;Z)Lcom/join/mgps/dialog/d1;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->R:Lcom/join/mgps/dialog/d1;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dialog/d1;->b()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/CommonWebviewFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->M:I

    return p0
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/CommonWebviewFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->N:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/papa91/battle/protocol/GameRoom;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    return-object p0
.end method

.method private h1(I)V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const-class v2, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v2}, Lcom/papa91/battle/protocol/GameRoom;->getGameId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "gameId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->T:Z

    const-string v2, "hasPlug"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4
    iget-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->S:Z

    const-string v2, "hasRom"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->a1()V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/CommonWebviewFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->O:I

    return p0
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/CommonWebviewFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->e1(Ljava/lang/String;)V

    return-void
.end method

.method private k1(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment$h;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/CommonWebviewFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->N0(I)V

    return-void
.end method

.method private lodeWebView(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lodeWebView() called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07156b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setBarHeight(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setClickable(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setUseWideViewPort(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setSupportZoom(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setBuiltInZoomControls(Z)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setJavaScriptEnabled(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setCacheMode(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$o;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/fragment/CommonWebviewFragment$o;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$m;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->r(Ljava/lang/Object;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$n;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$n;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->s(Ljava/lang/Object;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$f;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->setonShowFileChooser(Lcom/join/mgps/customview/LJNestScrollWebView$c;)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->setActivity(Landroid/app/Activity;)V

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/app/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->U:Landroid/app/Dialog;

    return-object p0
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->B1:Ljava/util/List;

    return-object p0
.end method

.method private n1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->B1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Z:Ljava/util/Iterator;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Z:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Y:Lcom/join/mgps/Util/h2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/join/mgps/Util/h2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Z:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Lcom/join/mgps/dto/LiveUploadData;

    invoke-direct {v0}, Lcom/join/mgps/dto/LiveUploadData;-><init>()V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/LiveUploadData;->setCode(I)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/LiveUploadData;->setCode(I)V

    goto :goto_0

    .line 10
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/LiveUploadData;->setData([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    :goto_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "javascript:papaChoiceAndUploadImg(\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->n1()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/fragment/CommonWebviewFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p0:Z

    return p1
.end method

.method static synthetic q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic r0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p:Z

    return p0
.end method

.method static synthetic s0(Lcom/join/mgps/fragment/CommonWebviewFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p:Z

    return p1
.end method

.method private setFullScreen()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/CommonWebviewFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->k1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->D:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic v0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->d:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic w0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    return-object p0
.end method

.method static synthetic x0(Lcom/join/mgps/fragment/CommonWebviewFragment;Lcom/wufan/user/service/protobuf/n0;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    return-object p1
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/CommonWebviewFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->s:Z

    return p1
.end method

.method private z0(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A(ILjava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  onUploadResult "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "uploadData"

    invoke-static {v1, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p0:Z

    const-string v1, "\')"

    const-string v2, "\u8bf7\u7a0d\u5019..."

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Z:Ljava/util/Iterator;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->n1()V

    goto/16 :goto_2

    .line 6
    :cond_1
    new-instance p1, Lcom/join/mgps/dto/LiveUploadData;

    invoke-direct {p1}, Lcom/join/mgps/dto/LiveUploadData;-><init>()V

    .line 7
    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/LiveUploadData;->setCode(I)V

    .line 8
    :try_start_0
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/LiveUploadData;->setData([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 9
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 11
    iget-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:papaChoiceAndUploadImg(\'"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {p1, v2}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 14
    iput-boolean v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p0:Z

    goto :goto_2

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    if-nez p1, :cond_3

    .line 17
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:papaLiveCropImage2(\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "\u4e0a\u4f20\u6210\u529f"

    invoke-static {p1, p2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 19
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4e0a\u4f20\u5931\u8d25\uff0c\u9519\u8bef\u7801 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 20
    :goto_1
    iput-boolean v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->X:Z

    :goto_2
    return-void
.end method

.method A0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "--- removeObserver---"

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->J:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    :cond_0
    return-void
.end method

.method D0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->n2()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/k;->k3()Lcom/wufan/user/service/protobuf/k$b;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->e3(I)Lcom/wufan/user/service/protobuf/k$b;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/k$b;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->Y2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/k$b;

    .line 7
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "uid"

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/k$b;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "token"

    .line 9
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/k$b;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 10
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/k$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/k$b;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->l:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/k;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->d(Lcom/wufan/user/service/protobuf/k;)Lcom/wufan/user/service/protobuf/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n;->getData()Lcom/wufan/user/service/protobuf/f;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 14
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n;->getData()Lcom/wufan/user/service/protobuf/f;

    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v1

    check-cast v1, Lcom/wufan/user/service/protobuf/n0$b;

    .line 16
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f;->M()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->s4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v1

    .line 17
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f;->V1()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->j4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v1

    .line 18
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f;->y()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->q4(J)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v1

    .line 19
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f;->G()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/wufan/user/service/protobuf/n0$b;->k4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->R(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method F0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/VipMoneyRequest;

    invoke-direct {v0}, Lcom/join/mgps/dto/VipMoneyRequest;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/VipMoneyRequest;->setMonth(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/VipMoneyRequest;->setToken(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/VipMoneyRequest;->setUid(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->k:Lcom/join/mgps/rpc/b;

    invoke-virtual {v0}, Lcom/join/mgps/dto/VipMoneyRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->w(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->H0()V

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CreateVipData;

    .line 10
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/CreateVipData;->setMonth(I)V

    .line 11
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->l1(Lcom/join/mgps/dto/CreateVipData;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result p1

    const/16 v0, 0x2bd

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->s:Z

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 15
    :catch_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->H0()V

    :cond_1
    :goto_0
    return-void
.end method

.method G0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    const-string v1, "\u6b63\u5728\u4e0a\u4f20\u56fe\u7247\u8bf7\u7a0d\u5019"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method H0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->R:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    return-void
.end method

.method I0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getRoomId()I

    move-result v1

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getElite()Z

    move-result p1

    const-string v2, "register_type_NewArenaMainFragment"

    invoke-static {v2, v1, p2, p1}, Lapp/mgsim/arena/ArenaRequestFactory;->joinRoom(Ljava/lang/String;ILjava/lang/String;Z)Lapp/mgsim/arena/ArenaRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    return-void
.end method

.method J0(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const-string v1, "register_type_NewArenaMainFragment"

    invoke-static {v1, p1}, Lapp/mgsim/arena/ArenaRequestFactory;->searchRoomById(Ljava/lang/String;I)Lapp/mgsim/arena/ArenaRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    return-void
.end method

.method K0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method L0(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v0, v4}, Lcom/join/mgps/Util/RequestBeanUtil;->getAppDetialBean(Ljava/lang/String;ILcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/RecomRequestBean;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->j:Lcom/join/mgps/rpc/e;

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/e;->R(Lcom/join/mgps/dto/RecomRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_6

    .line 9
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DetailResultBean;

    const/16 v0, 0x6e

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    if-lez p3, :cond_1

    .line 11
    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    :cond_1
    if-eqz p2, :cond_2

    .line 12
    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/DetailResultBean;->setDown_url_remote(Ljava/lang/String;)V

    .line 13
    :cond_2
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->g1(Lcom/join/mgps/dto/DetailResultBean;)V

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result p1

    if-eqz p1, :cond_4

    .line 15
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showTost(Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showTost(Ljava/lang/String;)V

    goto :goto_1

    .line 19
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showTost(Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public O0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_2

    .line 5
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    check-cast v2, Ljava/io/Serializable;

    const-string v3, "key_selected_images"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 v1, 0x100

    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    return-void
.end method

.method public P0(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/activity/label/MainLabelActivity_;->P0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->d(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    :cond_0
    const-string p1, "uploadData"

    const-string v0, "  goMyMainLabel tag_id is null "

    .line 3
    invoke-static {p1, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 3
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p3, ""

    .line 4
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, v1, p1, v0, p3}, Lcom/join/mgps/Util/IntentUtil;->goMainLabelActivity(Landroid/content/Context;IILjava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "uploadData"

    const-string p2, "  goMyMainLabel tag_id is null "

    .line 5
    invoke-static {p1, p2}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public R0()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/SearchLabelActivity_;->v(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/SearchLabelActivity_$j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SearchLabelActivity_$j;->a(I)Lcom/join/mgps/activity/SearchLabelActivity_$j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method S0(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget v0, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_6

    const/16 v1, 0x8

    if-eq v0, v1, :cond_5

    const/16 v1, 0x9

    if-eq v0, v1, :cond_4

    const/16 v1, 0xd

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3e9

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-static {p1}, Lcom/join/mgps/socket/fight/arena/c;->g(Lapp/mgsim/arena/ArenaResponse;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    const-string p1, ""

    goto :goto_0

    :cond_0
    const-string p1, "\u8be5\u623f\u95f4\u4e3a\u6bd4\u8d5b\u4e13\u7528\u623f\u95f4,\u975e\u53c2\u8d5b\u9009\u624b\u65e0\u6cd5\u52a0\u5165"

    goto :goto_0

    :cond_1
    const-string p1, "\u65e0\u6cd5\u52a0\u5165\uff0c\u4f60\u88ab\u7981\u6b62\u52a0\u5165\u8be5\u623f\u95f4"

    goto :goto_0

    .line 3
    :cond_2
    iget-object p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorInfo:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u52a0\u5165\u623f\u95f4"

    goto :goto_0

    :cond_4
    const-string p1, "\u623f\u95f4\u5df2\u6ee1\uff0c\u65e0\u6cd5\u52a0\u5165!"

    goto :goto_0

    :cond_5
    const-string p1, "\u623f\u95f4\u4e0d\u5b58\u5728"

    goto :goto_0

    :cond_6
    const-string p1, "\u5bc6\u7801\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u8bd5"

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->H0()V

    return-void
.end method

.method T0(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->H0()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    .line 3
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getAllowPeripheralJoin()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/socket/fight/arena/c;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u7981\u6b62\u5916\u8bbe\u7528\u6237\u52a0\u5165!"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getBattleArea()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v0

    sget-object v1, Lcom/papa91/battle/protocol/BattleArea;->ALL:Lcom/papa91/battle/protocol/BattleArea;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getBattleArea()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->n()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v1

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->c1(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getGameId()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->B0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 p1, 0x1010

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->h1(I)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->d1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->I0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method V0(Z)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u6b63\u5728\u8fde\u63a5\u670d\u52a1\u5668\uff0c\u8bf7\u7a0d\u5019..."

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 2
    :cond_0
    new-instance p1, Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$i;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$i;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-direct {p1, v0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    return-void
.end method

.method Y0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->H:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const/4 v0, 0x0

    const-string v1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc"

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->o1()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->f1()V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->V0(Z)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->J:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v2}, Lcom/join/mgps/socket/fight/arena/ArenaService;->z(Lapp/mgsim/arena/SocketListener$NotifyObserver;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->G:Lcom/join/mgps/socket/fight/arena/b;

    const-string v0, "register_type_NewArenaMainFragment"

    invoke-static {v0}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->J0(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method Z0(Lapp/mgsim/arena/SocketError;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget v0, p1, Lapp/mgsim/arena/SocketError;->errorType:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5!"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    iget-object p1, p1, Lapp/mgsim/arena/SocketError;->errorInfo:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->f1()V

    return-void
.end method

.method afterview()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    const-string v0, "http://"

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->j:Lcom/join/mgps/rpc/e;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->k:Lcom/join/mgps/rpc/b;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/b;->k()Lcom/join/mgps/rpc/c;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->l:Lcom/join/mgps/rpc/c;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v2, "afterView() called."

    invoke-static {v1, v2}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "url"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    .line 7
    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    const-string v2, "file://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&ver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->lodeWebView(Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?ver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->lodeWebView(Ljava/lang/String;)V

    .line 13
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    const-string v1, "\u7f51\u9875\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/LJNestScrollWebView;->setMethodListenter(Lcom/join/mgps/customview/LJNestScrollWebView$b;)V

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    .line 18
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 19
    new-instance v0, Lcom/join/mgps/Util/h2;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/join/mgps/Util/h2;-><init>(Landroid/content/Context;Lcom/join/mgps/Util/h2$e;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Y:Lcom/join/mgps/Util/h2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method b1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/SearchHintActivity_;->G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method d1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/customview/input/a;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    const-string v2, "\u8bf7\u8f93\u5165\u623f\u95f4\u5bc6\u7801"

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/mgps/customview/input/a;-><init>(Landroid/content/Context;Ljava/lang/String;IZ)V

    .line 2
    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$k;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment$k;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;Lcom/join/mgps/customview/input/a;Lcom/papa91/battle/protocol/GameRoom;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/input/a;->g(Lcom/join/mgps/customview/input/InputNumView$d;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->h()V

    return-void
.end method

.method f1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->j(Landroid/content/Context;)V

    return-void
.end method

.method g1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    .line 8
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getTag_info()Ljava/util/ArrayList;

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "7"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->m2(I)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->Z1(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    .line 16
    :cond_2
    :try_start_0
    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->androidIdNullsKey()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 17
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 18
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    const-class v3, Ljava/util/List;

    invoke-virtual {v2, v1, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 19
    sget-object v2, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 20
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_3

    return-void

    .line 21
    :catch_0
    :cond_3
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->i1(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method getUserInfo()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->E:Z

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    .line 6
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/wufan/user/service/protobuf/b0;->k3()Lcom/wufan/user/service/protobuf/b0$b;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->e3(I)Lcom/wufan/user/service/protobuf/b0$b;

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->Y2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 10
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "uid"

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0$b;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "token"

    .line 12
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0$b;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 13
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 15
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->l:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->e(Lcom/wufan/user/service/protobuf/b0;)Lcom/wufan/user/service/protobuf/d0;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 16
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_3

    .line 17
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 18
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-eqz v1, :cond_5

    .line 19
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v1

    check-cast v1, Lcom/wufan/user/service/protobuf/n0$b;

    .line 20
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->j1()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->j4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 21
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->M()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->s4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 22
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->x2()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->W3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 23
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->O2()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->Q3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 24
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->O1()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/wufan/user/service/protobuf/n0$b;->e4(J)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 25
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->F2()Lcom/wufan/user/service/protobuf/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->Z3(Lcom/wufan/user/service/protobuf/h;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 26
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->Y0()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->M3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    .line 27
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->G()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/wufan/user/service/protobuf/n0$b;->k4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 28
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 29
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/wufan/user/service/protobuf/n0$b;->c4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 30
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    goto :goto_1

    .line 32
    :cond_3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 34
    :cond_4
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_login_701"

    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_5
    :goto_1
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->E:Z

    return-void
.end method

.method i1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-virtual {v1, v4}, Lp1/f;->G([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPackage_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    :goto_0
    const/4 v4, 0x5

    if-eqz v1, :cond_a

    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_a

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    sget-object v8, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 7
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v5

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v4, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    goto :goto_1

    .line 8
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    if-ne v6, v4, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    if-eqz v5, :cond_6

    if-eqz v6, :cond_6

    .line 9
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 11
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_8

    .line 12
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    goto :goto_2

    .line 13
    :cond_8
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 14
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_9
    if-nez v0, :cond_a

    .line 15
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_a
    :goto_2
    if-nez v0, :cond_c

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-nez v0, :cond_b

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    goto :goto_3

    .line 18
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->Z0(Landroid/content/Context;Lcom/join/mgps/dto/DetailResultBean;)V

    return-void

    :cond_c
    :goto_3
    if-eqz v0, :cond_10

    .line 19
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v1

    if-lez v1, :cond_d

    .line 20
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_4

    .line 21
    :cond_d
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBean;)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_4

    .line 23
    :cond_e
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getDown_status()I

    move-result p1

    if-ne p1, v4, :cond_f

    .line 24
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_4

    .line 25
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v3

    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_10
    :goto_4
    return-void
.end method

.method public inCustomView()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->q:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j1(Lcom/join/mgps/dto/PapayOrder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/PayNowActivity_;->L0(Landroid/content/Context;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/PayNowActivity_$k;->c(Lcom/join/mgps/dto/PapayOrder;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method l1(Lcom/join/mgps/dto/CreateVipData;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, ""

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    new-instance v1, Lcom/join/mgps/dto/PapayOrder;

    invoke-direct {v1}, Lcom/join/mgps/dto/PapayOrder;-><init>()V

    const-string v2, "16000431"

    .line 3
    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APPKEY:Ljava/lang/String;

    const/4 v2, 0x0

    .line 4
    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->PAYTYPE:I

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/buy_vip/callback"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->NOTIFY_URI:Ljava/lang/String;

    const-string v2, "\u609f\u996d\u5145\u503c"

    .line 6
    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_NAME:Ljava/lang/String;

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "papavip"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_ORDER_ID:Ljava/lang/String;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->PA_OPEN_UID:I

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_USER_ID:Ljava/lang/String;

    .line 10
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_USER_NAME:Ljava/lang/String;

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "month"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CreateVipData;->getMonth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->PRODUCT_ID:Ljava/lang/String;

    const-string v2, "\u4f1a\u5458\u5145\u503c"

    .line 12
    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->PRODUCT_NAME:Ljava/lang/String;

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/CreateVipData;->getAmount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->MONEY_AMOUNT:Ljava/lang/String;

    const/4 v2, 0x1

    .line 14
    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_DISTRICT:I

    .line 15
    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_SERVER:I

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/CreateVipData;->getExtra()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/join/mgps/dto/PapayOrder;->APP_EXT1:Ljava/lang/String;

    .line 17
    iput-object v0, v1, Lcom/join/mgps/dto/PapayOrder;->APP_EXT2:Ljava/lang/String;

    .line 18
    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->PAYORRECHARGE:I

    .line 19
    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->ORDERTYPE:I

    const/4 p1, 0x3

    .line 20
    iput p1, v1, Lcom/join/mgps/dto/PapayOrder;->PAYSHOWTYPE:I

    .line 21
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/join/mgps/dto/PapayOrder;->TOKEN:Ljava/lang/String;

    .line 22
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->j1(Lcom/join/mgps/dto/PapayOrder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method loding_faile()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "loding_faile() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->p:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->m:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->lodeWebView(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public m1(Landroid/net/Uri;)V
    .locals 3

    const-string v0, "_crop"

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->E0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.camera.action.CROP"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "image/*"

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "crop"

    const-string v1, "true"

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "aspectX"

    const/16 v1, 0x154

    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "aspectY"

    const/16 v2, 0x122

    .line 6
    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "outputX"

    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "outputY"

    .line 8
    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "scale"

    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "scaleUpIfNeeded"

    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "return-data"

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 12
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    const-string v1, "output"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "outputFormat"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 p1, 0xa

    .line 14
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public noMethod()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    return-void
.end method

.method o1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->z0(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    const-string v0, ""

    const/4 v1, -0x1

    if-ne p2, v1, :cond_3

    const/16 v2, 0xa

    if-eq p1, v2, :cond_2

    const/16 v2, 0x64

    if-eq p1, v2, :cond_1

    const/16 v2, 0xc8

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/h0;->s(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 2
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->m1(Landroid/net/Uri;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->V:Landroid/net/Uri;

    invoke-virtual {p0, v2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->m1(Landroid/net/Uri;)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    .line 5
    iput-boolean v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->X:Z

    .line 6
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->getImagePipeline()Lcom/facebook/imagepipeline/core/g;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->h(Landroid/net/Uri;)V

    .line 8
    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->f(Landroid/net/Uri;)V

    .line 9
    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->e(Landroid/net/Uri;)V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->Y:Lcom/join/mgps/Util/h2;

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->W:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/join/mgps/Util/h2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v2}, Lcom/join/mgps/dialog/d1;->b()V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    const-string v3, "\u6b63\u5728\u4e0a\u4f20\u76f4\u64ad\u5c01\u9762"

    invoke-virtual {v2, v3}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->z:Lcom/join/mgps/dialog/d1;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_3
    :goto_0
    const/16 v2, 0x100

    if-ne p1, v2, :cond_5

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->v1:Ljava/util/List;

    invoke-direct {p0, p3}, Lcom/join/mgps/fragment/CommonWebviewFragment;->M0(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    invoke-virtual {v0}, Lnet/bither/util/b;->y()V

    goto :goto_1

    :cond_5
    const/16 v2, 0x1010

    if-ne p1, v2, :cond_8

    if-ne p2, v1, :cond_8

    .line 18
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->d1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_1

    .line 20
    :cond_6
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 21
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->d1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_1

    :cond_7
    const-string v1, "\u6b63\u5728\u83b7\u53d6\u623f\u95f4..."

    .line 22
    invoke-direct {p0, v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->e1(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->P:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->I0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    .line 24
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, p1, p2, p3}, Lcom/join/mgps/customview/LJNestScrollWebView;->q(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    if-eqz p3, :cond_0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/fragment/CommonWebviewFragment$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment$d;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->A0()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->y:Z

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->A1:Lnet/bither/util/b$e;

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->A1:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->z(Lnet/bither/util/b$e;)V

    :cond_0
    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/dto/PapayResult;)V
    .locals 1
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    if-eqz p1, :cond_4

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayResult;->getStatus()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v0, "javascript:papaPayResult(5003)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v0, "javascript:papaPayResult(5002)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v0, "javascript:papaPayResult(5001)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v0, "javascript:papaPayResult(5000)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 5
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    const-string v1, ")"

    const-string v2, ","

    const-string v3, "javascript:papaGameStatusNotify("

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->q:Landroid/view/View;

    return-void
.end method

.method public onPause()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    return-void
.end method

.method public onReceivedTitle(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    array-length p1, p3

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_2

    aget v0, p3, p2

    if-eqz v0, :cond_1

    return-void

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->u:Z

    :goto_1
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v1, "javascript:papaActivityOnResume()"

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "onResume"

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    .line 9
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->s:Z

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/dto/WebAccountDataBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/WebAccountDataBean;-><init>()V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/WebAccountDataBean;->setHasLogin(Z)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/WebAccountDataBean;->setHasLogin(Z)V

    .line 15
    :goto_1
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->r:Lcom/wufan/user/service/protobuf/n0;

    invoke-static {v2}, Lcom/join/mgps/dto/AccountBean;->convert(Lcom/wufan/user/service/protobuf/n0;)Lcom/join/mgps/dto/AccountBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/WebAccountDataBean;->setAccountBean(Lcom/join/mgps/dto/AccountBean;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:papaPutAccountData("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 17
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->s:Z

    .line 18
    :cond_3
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->A1:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->e(Lnet/bither/util/b$e;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Landroid/webkit/WebChromeClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->q:Landroid/view/View;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->h:Landroid/widget/RelativeLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->setFullScreen()V

    return-void
.end method

.method setNetwork()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "setNetwork() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "showLoding() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "showLodingFailed() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->b:Ljava/lang/String;

    const-string v1, "showMain() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public showMainWebview()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showMain()V

    :cond_0
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
