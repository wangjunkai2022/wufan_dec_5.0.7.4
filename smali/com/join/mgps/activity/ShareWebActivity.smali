.class public Lcom/join/mgps/activity/ShareWebActivity;
.super Lcom/BaseFragmentActivity;
.source "ShareWebActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/LJWebView$b;
.implements Lcom/join/mgps/Util/h2$e;
.implements Lcom/mgsim/common/fragment/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ShareWebActivity$o;,
        Lcom/join/mgps/activity/ShareWebActivity$p;,
        Lcom/join/mgps/activity/ShareWebActivity$q;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0746
.end annotation


# static fields
.field public static final V1:I = 0x1

.field public static final W1:I = 0x2

.field public static final X1:I = 0x1388

.field public static final Y1:I = 0x1389

.field public static final Z1:I = 0x138a

.field public static final a2:I = 0x138b

.field private static final b2:I = 0x2

.field private static final c2:I = 0x1010

.field private static final d2:I = 0x64

.field private static final e2:I = 0xc8

.field private static final f2:I = 0xa


# instance fields
.field private A:Z

.field private A1:I

.field private B:Lcom/wufan/user/service/protobuf/n0;

.field private B1:I

.field private C:Z

.field private C1:I

.field D:Lcom/join/mgps/Util/IntentDateBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private D1:Lcom/papa91/battle/protocol/GameRoom;

.field E:Lcom/join/mgps/dto/IntentDataMain;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private E1:Lcom/join/mgps/dialog/b1;

.field F:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private F1:Lcom/join/mgps/dialog/d1;

.field private G:Landroid/view/View;

.field G1:Z

.field private H:I

.field H1:Z

.field private I:Landroid/webkit/WebChromeClient;

.field private I1:Landroid/app/Dialog;

.field private J:Z

.field private J1:Landroid/net/Uri;

.field K:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private K1:Landroid/net/Uri;

.field private L:Z

.field private L1:Z

.field private M:Lcom/join/mgps/dialog/g0;

.field private M1:Lcom/join/mgps/Util/h2;

.field private N:Lcom/join/mgps/dialog/y1;

.field N1:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field O:Lcom/join/mgps/dialog/d1;

.field private O1:Z

.field P:Z

.field private P1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field Q:Landroid/app/Dialog;

.field Q1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field R:Landroidx/appcompat/app/AlertDialog$Builder;

.field private R1:Lnet/bither/util/b$e;

.field private final S:Lcom/join/mgps/activity/posting/PostingActivity$m;

.field private S1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private T:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private T1:Lcom/mgsim/common/fragment/BackHandledFragment;

.field U:Lcom/join/mgps/rpc/k;

.field private U1:Z

.field V:Z

.field W:J

.field private X:Lcom/join/mgps/socket/fight/arena/b;

.field private Y:Ljava/lang/String;

.field Z:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
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

.field g:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/join/mgps/customview/LJWebView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final p0:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field private p1:I

.field q:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f0917a0
    .end annotation
.end field

.field t:Lcom/join/mgps/rpc/e;

.field u:Lcom/join/mgps/rpc/b;

.field v:Lcom/join/mgps/rpc/c;

.field private v1:I

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:J

.field private z:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/BaseFragmentActivity;-><init>()V

    const-string v0, "ShareWebActivity"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v0, "PAPA_EMU_INTENT_EXTRA_ACTION_FROM"

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->c:Ljava/lang/String;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->d:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->A:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->C:Z

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->F:Z

    .line 8
    iput v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->H:I

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->J:Z

    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->P:Z

    .line 12
    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->R:Landroidx/appcompat/app/AlertDialog$Builder;

    .line 13
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$h;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->S:Lcom/join/mgps/activity/posting/PostingActivity$m;

    .line 14
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$k;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->T:Landroid/os/Handler;

    .line 15
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->V:Z

    const-wide/16 v1, 0x0

    .line 16
    iput-wide v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->W:J

    .line 17
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$n;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$n;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->p0:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    const/4 v1, -0x1

    .line 18
    iput v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    .line 20
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    .line 21
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->L1:Z

    .line 22
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O1:Z

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    .line 25
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity$e;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->R1:Lnet/bither/util/b$e;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->S1:Ljava/util/List;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/ShareWebActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B1:I

    return p0
.end method

.method private A1()V
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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-string v2, "Image Chooser"

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const v2, 0xa8e2

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/papa91/battle/protocol/GameRoom;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    return-object p0
.end method

.method private B1(Ljava/lang/String;)V
    .locals 10

    const-string v0, "download"

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/DownloadManager;

    .line 2
    new-instance v1, Landroid/app/DownloadManager$Query;

    invoke-direct {v1}, Landroid/app/DownloadManager$Query;-><init>()V

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;

    move-result-object v1

    .line 4
    :cond_0
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "_id"

    .line 5
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v3, "title"

    .line 6
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "local_uri"

    .line 7
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "status"

    .line 8
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const-string v6, "bytes_so_far"

    .line 9
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "total_size"

    .line 10
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 11
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "downId:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ",status:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",title:"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",address:"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",size:"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",sizeTotal:"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "/"

    .line 13
    invoke-virtual {v4, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x1

    add-int/2addr v3, v5

    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 14
    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 15
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "temp_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 17
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 19
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 20
    :cond_1
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 22
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    :cond_2
    new-array v3, v5, [J

    const/4 v4, 0x0

    int-to-long v5, v2

    aput-wide v5, v3, v4

    .line 23
    invoke-virtual {v0, v3}, Landroid/app/DownloadManager;->remove([J)I

    goto/16 :goto_0

    .line 24
    :cond_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/ShareWebActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    return p0
.end method

.method private C1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->s:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->H:I

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    .line 7
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 9
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, v1, -0x401

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x200

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/ShareWebActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->J1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/ShareWebActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->j1(I)V

    return-void
.end method

.method private E1(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "UTF-8"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    const/16 v5, 0x3e8

    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/y0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "{requestId}"

    .line 3
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "{requestTime}"

    .line 5
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->d(Landroid/content/Context;)B

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_4

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    const/4 v4, 0x4

    if-eq v2, v4, :cond_1

    const/4 v4, 0x5

    if-eq v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "13-1-7"

    goto :goto_1

    :cond_1
    const-string v2, "13-1-4"

    goto :goto_1

    :cond_2
    const-string v2, "13-1-5"

    goto :goto_1

    :cond_3
    const-string v2, "13-1-6"

    goto :goto_1

    :cond_4
    const-string v2, "13-1-2"

    goto :goto_1

    :cond_5
    const-string v2, "13-1-0"

    goto :goto_1

    :cond_6
    :goto_0
    move-object v2, v3

    :goto_1
    const-string v4, "{network}"

    .line 8
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :try_start_0
    sget-object v2, Lcom/MApplication;->B:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    move-object v2, v3

    :goto_2
    const-string v4, "{clientIp}"

    .line 11
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/ShareWebActivity;->v1(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "13-3-3"

    goto :goto_3

    :cond_7
    const-string v2, "13-3-2"

    :goto_3
    const-string v4, "{deviceType}"

    .line 13
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    :try_start_1
    const-string v2, "http.agent"

    .line 14
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 15
    :try_start_2
    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception v4

    goto :goto_4

    :catch_2
    move-exception v4

    move-object v2, v3

    .line 16
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    const-string v4, "{ua}"

    .line 17
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 18
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    :try_start_3
    const-string v4, "{brand}"

    .line 19
    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    :catch_3
    move-exception v2

    .line 20
    invoke-virtual {v2}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 21
    :goto_6
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    :try_start_4
    const-string v4, "{model}"

    .line 22
    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_7

    :catch_4
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 24
    :goto_7
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->g1(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "{carrier}"

    .line 25
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{platid}"

    const-string v2, "android"

    .line 26
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{imei}"

    .line 27
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{imeiMd5}"

    .line 28
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 29
    sget-object v0, Lcom/MApplication;->I:Ljava/lang/String;

    const-string v2, "{oaid}"

    .line 30
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 32
    invoke-static {v0}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_8
    move-object v0, v3

    :goto_8
    const-string v2, "{oaidMd5}"

    .line 33
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{androidId}"

    .line 34
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-static {v1}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{androidIdMd5}"

    .line 36
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{idfa}"

    .line 37
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{idfaMd5}"

    .line 38
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{caid}"

    .line 39
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{caidMd5}"

    .line 40
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method static synthetic F0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/join/mgps/dialog/y1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->N:Lcom/join/mgps/dialog/y1;

    return-object p0
.end method

.method private F1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/ShareWebActivity;)Landroid/app/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    return-object p0
.end method

.method static synthetic H0(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/dialog/y1;)Lcom/join/mgps/dialog/y1;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->N:Lcom/join/mgps/dialog/y1;

    return-object p1
.end method

.method private H1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->E1:Lcom/join/mgps/dialog/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/b1;->a()V

    .line 2
    :cond_0
    new-instance v0, Lcom/join/mgps/dialog/b1;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/join/mgps/dialog/b1;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->E1:Lcom/join/mgps/dialog/b1;

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->E1:Lcom/join/mgps/dialog/b1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/b1;->e()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/ShareWebActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->S1:Ljava/util/List;

    return-object p0
.end method

.method static synthetic J0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->S1()V

    return-void
.end method

.method private J1(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->F1:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->F1:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/join/mgps/Util/a0;->z(Landroid/content/Context;Ljava/lang/String;Z)Lcom/join/mgps/dialog/d1;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->F1:Lcom/join/mgps/dialog/d1;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dialog/d1;->b()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/ShareWebActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->O1:Z

    return p1
.end method

.method static synthetic L0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/join/mgps/activity/posting/PostingActivity$m;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->S:Lcom/join/mgps/activity/posting/PostingActivity$m;

    return-object p0
.end method

.method static synthetic M0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->A1()V

    return-void
.end method

.method private M1(I)V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-class v2, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v2}, Lcom/papa91/battle/protocol/GameRoom;->getGameId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "gameId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    const-string v2, "hasPlug"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4
    iget-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    const-string v2, "hasRom"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/ShareWebActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic O0(Lcom/join/mgps/activity/ShareWebActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic P0(Lcom/join/mgps/activity/ShareWebActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->A:Z

    return p0
.end method

.method private P1(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity$l;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/ShareWebActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->A:Z

    return p1
.end method

.method static synthetic R0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->F1()V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/ShareWebActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->d:Landroid/os/Handler;

    return-object p0
.end method

.method private S1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->S1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->N1:Ljava/util/Iterator;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->N1:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->M1:Lcom/join/mgps/Util/h2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/join/mgps/Util/h2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->N1:Ljava/util/Iterator;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "javascript:papaChoiceAndUploadImg(\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private W0()Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 3
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v1, "android.permission.CAMERA"

    .line 5
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v1, "android.permission.READ_PHONE_STATE"

    .line 7
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v2, 0x2

    .line 11
    invoke-static {p0, v0, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private X0(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 4
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

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

    const/4 p1, 0x0

    const-string v0, "\u751f\u6210\u5c01\u9762\u5931\u8d25"

    .line 12
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 13
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".fileprovider"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-static {p0, p1, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method private accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method private checkGameIsInstall(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

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
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    .line 6
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {v2, p1, v0, v3}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v2, p1}, Lcom/join/mgps/Util/UtilsMy;->B0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    goto :goto_1

    .line 10
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    goto :goto_1

    .line 11
    :cond_3
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    .line 12
    :goto_1
    iget-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->H1:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->G1:Z

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method private e1()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentUtil;->getSplashActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentUtil;->setSplashActivity(Landroid/app/Activity;)V

    .line 4
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 5
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    .line 6
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x20000000

    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->backModGame()V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/ShareWebActivity;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/ShareWebActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->B1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/ShareWebActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->P1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/activity/ShareWebActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->T:Landroid/os/Handler;

    return-object p0
.end method

.method private i1(Landroid/content/Intent;)Ljava/util/List;
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

.method static synthetic j0(Lcom/join/mgps/activity/ShareWebActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->y:J

    return-wide v0
.end method

.method private j1(I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->L:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const p1, 0x7f10047f

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->X0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->J1:Landroid/net/Uri;

    .line 10
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "image/*"

    .line 11
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1

    :cond_4
    const-string p1, ""

    .line 13
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->X0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->J1:Landroid/net/Uri;

    .line 14
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->J1:Landroid/net/Uri;

    const-string v2, "output"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 16
    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/ShareWebActivity;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->y:J

    return-wide p1
.end method

.method static synthetic l0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/ShareWebActivity;Lcom/wufan/user/service/protobuf/n0;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    return-object p1
.end method

.method static synthetic n0(Lcom/join/mgps/activity/ShareWebActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->C:Z

    return p1
.end method

.method static synthetic o0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/ShareWebActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->H:I

    return p1
.end method

.method static synthetic q0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->r1()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->C1()V

    return-void
.end method

.method private r1()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x7f1104fc

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    const v1, 0x7f0c01dc

    .line 2
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    const v1, 0x7f0902f9

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    const v2, 0x7f091003

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    const v3, 0x7f090232

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 13
    new-instance v3, Lcom/join/mgps/activity/ShareWebActivity$b;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ShareWebActivity$b;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity$c;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity$d;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->I1:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/ShareWebActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Y:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic t0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/join/mgps/dialog/g0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->M:Lcom/join/mgps/dialog/g0;

    return-object p0
.end method

.method private t1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP1()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 3
    iput v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->p1:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Z:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 5
    iput v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    .line 6
    :cond_1
    iput v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->p1:I

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP2()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_2

    .line 9
    iput v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->v1:I

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Z:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 11
    iput v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    .line 12
    :cond_3
    iput v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->v1:I

    .line 13
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP3()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_4

    .line 15
    iput v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->A1:I

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Z:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x2

    .line 17
    iput v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    .line 18
    :cond_5
    iput v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->A1:I

    .line 19
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getP4()Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v1

    if-nez v1, :cond_6

    .line 21
    iput v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->B1:I

    goto :goto_3

    .line 22
    :cond_6
    invoke-virtual {v0}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Z:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v0, v1, :cond_7

    const/4 v0, 0x3

    .line 23
    iput v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->C1:I

    .line 24
    :cond_7
    iput v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->B1:I

    :goto_3
    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/ShareWebActivity;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method private u1(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

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

.method static synthetic v0(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/dialog/g0;)Lcom/join/mgps/dialog/g0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->M:Lcom/join/mgps/dialog/g0;

    return-object p1
.end method

.method private v1(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 p1, p1, 0xf

    const/4 v0, 0x3

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic w0(Lcom/join/mgps/activity/ShareWebActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->t1()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/ShareWebActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->p1:I

    return p0
.end method

.method private x1(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

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
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07156b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setBarHeight(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setClickable(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setUseWideViewPort(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setSupportZoom(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setBuiltInZoomControls(Z)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJWebView;->setJavaScriptEnabled(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setCacheMode(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$q;

    invoke-direct {v1, p0, p0}, Lcom/join/mgps/activity/ShareWebActivity$q;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 13
    iget-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->F:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$o;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$o;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->r(Ljava/lang/Object;)V

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$p;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$p;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->s(Ljava/lang/Object;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity$i;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJWebView;->setonShowFileChooser(Lcom/join/mgps/customview/LJWebView$c;)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {p1, p0}, Lcom/join/mgps/customview/LJWebView;->setActivity(Landroid/app/Activity;)V

    goto :goto_0

    .line 18
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->showLodingFailed()V
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

.method static synthetic y0(Lcom/join/mgps/activity/ShareWebActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->v1:I

    return p0
.end method

.method static synthetic z0(Lcom/join/mgps/activity/ShareWebActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->A1:I

    return p0
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
    iget-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O1:Z

    const-string v1, "\')"

    const-string v2, "\u8bf7\u7a0d\u5019..."

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->N1:Ljava/util/Iterator;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->S1()V

    goto/16 :goto_2

    .line 6
    :cond_1
    new-instance p1, Lcom/join/mgps/dto/LiveUploadData;

    invoke-direct {p1}, Lcom/join/mgps/dto/LiveUploadData;-><init>()V

    .line 7
    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/LiveUploadData;->setCode(I)V

    .line 8
    :try_start_0
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

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
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:papaChoiceAndUploadImg(\'"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {p1, v2}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 14
    iput-boolean v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->O1:Z

    goto :goto_2

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    if-nez p1, :cond_3

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:papaLiveCropImage2(\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    const-string p1, "\u4e0a\u4f20\u6210\u529f"

    .line 18
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 19
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u4e0a\u4f20\u5931\u8d25\uff0c\u9519\u8bef\u7801 "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 20
    :goto_1
    iput-boolean v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->L1:Z

    :goto_2
    return-void
.end method

.method D1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->x1(Ljava/lang/String;)V

    return-void
.end method

.method G1(Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->pdReceiveCoupon:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object p1

    const-string v0, "real_name"

    invoke-static {p0, p1, v0, p2}, Lcom/join/mgps/Util/UtilsMy;->i4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method I1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/customview/input/a;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-string v2, "\u8bf7\u8f93\u5165\u623f\u95f4\u5bc6\u7801"

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/mgps/customview/input/a;-><init>(Landroid/content/Context;Ljava/lang/String;IZ)V

    .line 2
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$a;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/activity/ShareWebActivity$a;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/customview/input/a;Lcom/papa91/battle/protocol/GameRoom;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/input/a;->g(Lcom/join/mgps/customview/input/InputNumView$d;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->h()V

    return-void
.end method

.method K1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->j(Landroid/content/Context;)V

    return-void
.end method

.method L1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "showMain() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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

.method N1(Lcom/join/mgps/dto/DetailResultBean;)V
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
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v6

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, p0, v8}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_4

    .line 21
    :cond_d
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBean;)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_4

    .line 25
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

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

.method public O1(Lcom/join/mgps/dto/PapayOrder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/activity/PayNowActivity_;->L0(Landroid/content/Context;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/PayNowActivity_$k;->c(Lcom/join/mgps/dto/PapayOrder;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method Q1(Lcom/join/mgps/dto/CreateVipData;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, ""

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    iput v2, v1, Lcom/join/mgps/dto/PapayOrder;->PA_OPEN_UID:I

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/join/mgps/dto/PapayOrder;->APP_USER_ID:Ljava/lang/String;

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/join/mgps/dto/PapayOrder;->TOKEN:Ljava/lang/String;

    .line 22
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->O1(Lcom/join/mgps/dto/PapayOrder;)V
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

.method public R1(Landroid/net/Uri;)V
    .locals 3

    const-string v0, "_crop"

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->X0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

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
    invoke-virtual {p0, v0, p1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method T0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "javascript:papaBackPageUp()"

    .line 5
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    :goto_0
    return-void
.end method

.method T1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

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

.method U0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    return-void
.end method

.method public V(Lcom/mgsim/common/fragment/BackHandledFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->T1:Lcom/mgsim/common/fragment/BackHandledFragment;

    return-void
.end method

.method V0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "--- removeObserver---"

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->p0:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    :cond_0
    return-void
.end method

.method Y0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/VipMoneyRequest;

    invoke-direct {v0}, Lcom/join/mgps/dto/VipMoneyRequest;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/VipMoneyRequest;->setMonth(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/VipMoneyRequest;->setToken(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/VipMoneyRequest;->setUid(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->u:Lcom/join/mgps/rpc/b;

    invoke-virtual {v0}, Lcom/join/mgps/dto/VipMoneyRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->w(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->dismissLoadingDialog()V

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
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->Q1(Lcom/join/mgps/dto/CreateVipData;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result p1

    const/16 v0, 0x2bd

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->C:Z

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 15
    :catch_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->dismissLoadingDialog()V

    :cond_1
    :goto_0
    return-void
.end method

.method Z0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    const-string v1, "\u6b63\u5728\u4e0a\u4f20\u56fe\u7247\u8bf7\u7a0d\u5019"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method a1(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

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

.method afterview()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->t:Lcom/join/mgps/rpc/e;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->u:Lcom/join/mgps/rpc/b;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/b;->k()Lcom/join/mgps/rpc/c;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->v:Lcom/join/mgps/rpc/c;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "afterView() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExt1()Ljava/lang/String;

    move-result-object v0

    const-string v2, "modGame"

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    .line 7
    :cond_0
    :try_start_0
    iput-object p0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-string v0, "com.join.mgps.papa.share_webview_raiseVip"

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 9
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "gameId"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/member/vip_view/welcome?gameId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    const-string v3, "1"

    .line 13
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/battle_bullet_screen?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto/16 :goto_0

    :cond_1
    const-string v3, "2"

    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_level?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto/16 :goto_0

    :cond_2
    const-string v3, "3"

    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_one_key_skill?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto/16 :goto_0

    :cond_3
    const-string v3, "4"

    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_more_archive?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto/16 :goto_0

    :cond_4
    const-string v3, "5"

    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_bug?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto/16 :goto_0

    :cond_5
    const-string v3, "6"

    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_practice?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto :goto_0

    :cond_6
    const-string v3, "7"

    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/game_enhance?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto :goto_0

    :cond_7
    const-string v3, "8"

    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/member/vip_view/welfare/ad?gameId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    goto :goto_0

    :cond_8
    const-string v2, "9"

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 31
    :cond_9
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 32
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->P:Z

    .line 33
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    .line 34
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 35
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    .line 36
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getFrom()Ljava/lang/String;

    move-result-object v1

    const-string v2, "11"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    .line 37
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ShareWebActivity;->s1(Z)V

    .line 38
    :cond_b
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    if-nez v1, :cond_c

    const-string v1, ""

    .line 39
    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 40
    :cond_c
    sget-boolean v1, Lcom/join/android/app/common/http/c;->c:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const-string v3, "https://"

    const-string v4, "http://"

    if-eqz v1, :cond_d

    :try_start_1
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 41
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 42
    :cond_d
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    const-string v4, "file://"

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 44
    :cond_e
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    const-string v3, "jump_url_type"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 45
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->E1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    :cond_f
    :try_start_2
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 47
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    .line 48
    instance-of v3, v1, Lcom/join/mgps/dto/UpdateIntentDataBean;

    if-eqz v3, :cond_10

    .line 49
    check-cast v1, Lcom/join/mgps/dto/UpdateIntentDataBean;

    .line 50
    invoke-virtual {v1}, Lcom/join/mgps/dto/UpdateIntentDataBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 51
    invoke-virtual {v1}, Lcom/join/mgps/dto/UpdateIntentDataBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-static {v1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 52
    :catch_0
    :cond_10
    :try_start_3
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    const-string v3, "?"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const-string v3, "&type="

    if-eqz v1, :cond_11

    .line 53
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&ver="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->x1(Ljava/lang/String;)V

    goto :goto_1

    .line 54
    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "?ver="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->x1(Ljava/lang/String;)V

    .line 55
    :goto_1
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_12

    .line 56
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    :cond_12
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->i:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    const-string v2, "\u7f51\u9875\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 58
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    :cond_13
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v1, :cond_14

    .line 60
    invoke-virtual {v1, p0}, Lcom/join/mgps/customview/LJWebView;->setMethodListenter(Lcom/join/mgps/customview/LJWebView$b;)V

    .line 61
    :cond_14
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    .line 62
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 63
    new-instance v1, Lcom/join/mgps/Util/h2;

    invoke-direct {v1, p0, p0}, Lcom/join/mgps/Util/h2;-><init>(Landroid/content/Context;Lcom/join/mgps/Util/h2$e;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->M1:Lcom/join/mgps/Util/h2;

    .line 64
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/activity/ShareWebActivity$f;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/activity/ShareWebActivity$f;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/Util/IntentDateBean;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method b1(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const-string v1, "register_type_NewArenaMainFragment"

    invoke-static {v1, p1}, Lapp/mgsim/arena/ArenaRequestFactory;->searchRoomById(Ljava/lang/String;I)Lapp/mgsim/arena/ArenaRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    return-void
.end method

.method backModGame()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExt1()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    invoke-virtual {v1}, Lcom/join/mgps/Util/IntentDateBean;->getExt2()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    invoke-virtual {v2}, Lcom/join/mgps/Util/IntentDateBean;->getExt3()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    invoke-virtual {v3}, Lcom/join/mgps/Util/IntentDateBean;->getExt4()Ljava/lang/String;

    move-result-object v3

    const-string v4, "3ds"

    .line 6
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const/4 v3, 0x0

    const-string v4, "1"

    invoke-static {v1, v0, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    :cond_1
    return-void

    .line 9
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "modGame"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v2, "0"

    .line 11
    :cond_4
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, p0, v2, v1}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method c1(Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1
    :try_start_0
    new-instance v1, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {v1, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    const-string v2, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tbruyelle/rxpermissions2/c;->s([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/activity/ShareWebActivity$g;

    invoke-direct {v2, p0, p2, p1}, Lcom/join/mgps/activity/ShareWebActivity$g;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 4
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method checkToken()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->e3(I)Lcom/wufan/user/service/protobuf/k$b;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/k$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/k$b;

    .line 6
    invoke-static {p0}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->v:Lcom/join/mgps/rpc/c;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    .line 20
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0, v1, p0}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 21
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->R(Landroid/content/Context;)V
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

.method d1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method dismissLoadingDialog()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->F1:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    return-void
.end method

.method f1(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.wufun.finish.activity"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public g1(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "13-4-0"

    :try_start_0
    const-string v1, "phone"

    .line 1
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 2
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "46000"

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "46002"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "46001"

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p1, "13-4-2"

    return-object p1

    :cond_2
    const-string v1, "46003"

    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "13-4-3"

    return-object p1

    :cond_3
    :goto_0
    const-string p1, "13-4-1"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    return-object v0
.end method

.method public goMyAlbumActivity4PickPic()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_2

    .line 5
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->P1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    check-cast v2, Ljava/io/Serializable;

    const-string v3, "key_selected_images"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 v1, 0x100

    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    return-void
.end method

.method h1(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

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
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v0, v4}, Lcom/join/mgps/Util/RequestBeanUtil;->getAppDetialBean(Ljava/lang/String;ILcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/RecomRequestBean;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->t:Lcom/join/mgps/rpc/e;

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
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->startDown(Lcom/join/mgps/dto/DetailResultBean;)V

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result p1

    if-eqz p1, :cond_4

    .line 15
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->showTost(Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->showTost(Ljava/lang/String;)V

    goto :goto_1

    .line 19
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->showTost(Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void
.end method

.method handleFailure(Lapp/mgsim/arena/ArenaResponse;)V
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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->dismissLoadingDialog()V

    return-void
.end method

.method k1(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->U:Lcom/join/mgps/rpc/k;

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->U:Lcom/join/mgps/rpc/k;

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestDomainInfoArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestDomainInfoArgs;-><init>()V

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestDomainInfoArgs;->setLocation(Ljava/lang/Integer;)V

    .line 6
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1, p0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->U:Lcom/join/mgps/rpc/k;

    invoke-virtual {p1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/k;->W(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity;->G1(Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0, p3}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_2
    const-string p1, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5"

    .line 15
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method l1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->V:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->V:Z

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->e3(I)Lcom/wufan/user/service/protobuf/b0$b;

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 9
    invoke-static {p0}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->v:Lcom/join/mgps/rpc/c;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    .line 31
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0, v1, p0}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

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
    invoke-virtual {p0, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_5
    :goto_1
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->V:Z

    return-void
.end method

.method public m1(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/activity/label/MainLabelActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

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

.method public n1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, p0, p1, v0, p3}, Lcom/join/mgps/Util/IntentUtil;->goMainLabelActivity(Landroid/content/Context;IILjava/lang/String;)V

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

.method public noMethod()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    :goto_0
    return-void
.end method

.method public o1()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/SearchLabelActivity_;->u(Landroid/content/Context;)Lcom/join/mgps/activity/SearchLabelActivity_$j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SearchLabelActivity_$j;->a(I)Lcom/join/mgps/activity/SearchLabelActivity_$j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
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
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/join/mgps/Util/h0;->s(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 2
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ShareWebActivity;->R1(Landroid/net/Uri;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->J1:Landroid/net/Uri;

    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ShareWebActivity;->R1(Landroid/net/Uri;)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    .line 5
    iput-boolean v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->L1:Z

    .line 6
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->getImagePipeline()Lcom/facebook/imagepipeline/core/g;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->h(Landroid/net/Uri;)V

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->f(Landroid/net/Uri;)V

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Lcom/facebook/imagepipeline/core/g;->e(Landroid/net/Uri;)V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->M1:Lcom/join/mgps/Util/h2;

    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->K1:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/join/mgps/Util/h2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v2}, Lcom/join/mgps/dialog/d1;->b()V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    const-string v3, "\u6b63\u5728\u4e0a\u4f20\u76f4\u64ad\u5c01\u9762"

    invoke-virtual {v2, v3}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_3
    :goto_0
    const/16 v2, 0x100

    if-ne p1, v2, :cond_5

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->Q1:Ljava/util/List;

    invoke-direct {p0, p3}, Lcom/join/mgps/activity/ShareWebActivity;->i1(Landroid/content/Intent;)Ljava/util/List;

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
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->I1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_1

    .line 20
    :cond_6
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->I1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_1

    :cond_7
    const-string v1, "\u6b63\u5728\u83b7\u53d6\u623f\u95f4..."

    .line 22
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->J1(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/activity/ShareWebActivity;->a1(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    .line 24
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0, p1, p2, p3}, Lcom/join/mgps/customview/LJWebView;->q(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->T1:Lcom/mgsim/common/fragment/BackHandledFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mgsim/common/fragment/BackHandledFragment;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->V0()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->J:Z

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->E:Lcom/join/mgps/dto/IntentDataMain;

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->moveTaskToBack(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->R1:Lnet/bither/util/b$e;

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->R1:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->z(Lnet/bither/util/b$e;)V

    .line 10
    :cond_1
    invoke-super {p0}, Lcom/BaseFragmentActivity;->onDestroy()V

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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v0, "javascript:papaPayResult(5003)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v0, "javascript:papaPayResult(5002)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v0, "javascript:papaPayResult(5001)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v0, "javascript:papaPayResult(5000)"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->G:Landroid/view/View;

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->C1()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "onKeyDown() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_6

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->q1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->I:Landroid/webkit/WebChromeClient;

    invoke-virtual {p1}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    return v1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    return v1

    :cond_2
    const-string v2, "?"

    .line 9
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 11
    :cond_3
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 12
    iget-object v3, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v3, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    .line 13
    :cond_4
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->x:Ljava/lang/String;

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->e1()V

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 16
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string p1, "javascript:papaBackPageUp()"

    .line 17
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v1

    .line 18
    :cond_6
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onPause()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

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
    invoke-super {p0}, Lcom/BaseFragmentActivity;->onPause()V

    return-void
.end method

.method public onReceivedTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
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
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

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
    iput-boolean p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->L:Z

    :goto_1
    return-void
.end method

.method protected onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/BaseFragmentActivity;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const-string v1, "javascript:papaActivityOnResume()"

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "onResume"

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v2}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    .line 9
    iget-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->C:Z

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/dto/WebAccountDataBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/WebAccountDataBean;-><init>()V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

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
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->B:Lcom/wufan/user/service/protobuf/n0;

    invoke-static {v2}, Lcom/join/mgps/dto/AccountBean;->convert(Lcom/wufan/user/service/protobuf/n0;)Lcom/join/mgps/dto/AccountBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/WebAccountDataBean;->setAccountBean(Lcom/join/mgps/dto/AccountBean;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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

    invoke-virtual {v2, v0}, Lcom/join/mgps/customview/LJWebView;->w(Ljava/lang/String;)V

    .line 17
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->C:Z

    .line 18
    :cond_3
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->R1:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->e(Lnet/bither/util/b$e;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Landroid/webkit/WebChromeClient;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->G:Landroid/view/View;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p3, p0, Lcom/join/mgps/activity/ShareWebActivity;->I:Landroid/webkit/WebChromeClient;

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->l:Landroid/widget/RelativeLayout;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, p3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {p2}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 6
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->s:Landroid/widget/FrameLayout;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 7
    iget-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity;->s:Landroid/widget/FrameLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {p0, p3}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;->F1()V

    return-void
.end method

.method p1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->dismissLoadingDialog()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    .line 3
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getAllowPeripheralJoin()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/socket/fight/arena/c;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u7981\u6b62\u5916\u8bbe\u7528\u6237\u52a0\u5165!"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getBattleArea()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v0

    sget-object v1, Lcom/papa91/battle/protocol/BattleArea;->ALL:Lcom/papa91/battle/protocol/BattleArea;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->D1:Lcom/papa91/battle/protocol/GameRoom;

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/GameRoom;->getBattleArea()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->n()Lcom/papa91/battle/protocol/BattleArea;

    move-result-object v1

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/BattleArea;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->H1(Lcom/papa91/battle/protocol/GameRoom;)V

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
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->checkGameIsInstall(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 p1, 0x1010

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->M1(I)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/GameRoom;->getHasJoinPassword()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->I1(Lcom/papa91/battle/protocol/GameRoom;)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/activity/ShareWebActivity;->a1(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public q1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->G:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method s1(Z)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u6b63\u5728\u8fde\u63a5\u670d\u52a1\u5668\uff0c\u8bf7\u7a0d\u5019..."

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 2
    :cond_0
    new-instance p1, Lcom/join/mgps/socket/fight/arena/b;

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity$m;-><init>(Lcom/join/mgps/activity/ShareWebActivity;)V

    invoke-direct {p1, v0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    return-void
.end method

.method search()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/activity/SearchHintActivity_;->G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method setNetwork()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "setNetwork() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "showLoding() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "showLodingFailed() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

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

.method public showMainWebview()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->L1()V

    :cond_0
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method startDown(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 7
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

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    .line 8
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getTag_info()Ljava/util/ArrayList;

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "VIRTUAL_SINGLE"

    goto :goto_1

    :cond_1
    const-string v1, ""

    .line 10
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "7"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v2, v1

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    const-string v2, "ANDROID_SINGLE"

    :goto_2
    const/4 v4, 0x2

    if-nez v1, :cond_6

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    .line 12
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->m2(I)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_5

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->Z1(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    if-ne v1, v4, :cond_4

    const-string v2, "SO_SIMULATOR"

    goto :goto_4

    :cond_4
    const-string v2, "RAW_SIMULATOR"

    :cond_5
    :goto_4
    move v1, v3

    .line 16
    :cond_6
    :try_start_0
    new-instance v3, Lcom/join/mgps/pref/PrefDef_;

    iget-object v5, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-direct {v3, v5}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->androidIdNullsKey()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 17
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 18
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v5

    const-class v6, Ljava/util/List;

    invoke-virtual {v5, v3, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 19
    sget-object v5, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v5, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    if-eqz v1, :cond_7

    .line 20
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v3

    iget-object v5, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-virtual {v3, v5}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_7

    return-void

    :catch_0
    nop

    .line 21
    :cond_7
    new-instance v3, Lcom/join/mgps/pref/PrefDef_;

    iget-object v5, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-direct {v3, v5}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->download_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v1, :cond_8

    if-eqz v3, :cond_8

    .line 22
    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    new-instance v3, Lcom/join/mgps/activity/ShareWebActivity$j;

    invoke-direct {v3, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity$j;-><init>(Lcom/join/mgps/activity/ShareWebActivity;Lcom/join/mgps/dto/DetailResultBean;)V

    invoke-static {v1, v4, v0, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_5

    .line 23
    :cond_8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->N1(Lcom/join/mgps/dto/DetailResultBean;)V

    :goto_5
    return-void
.end method

.method w1(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Y:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    const/4 v0, 0x0

    const-string v1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc"

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->T1()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->K1()V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ShareWebActivity;->s1(Z)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity;->p0:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v2}, Lcom/join/mgps/socket/fight/arena/ArenaService;->z(Lapp/mgsim/arena/SocketListener$NotifyObserver;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->O:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->X:Lcom/join/mgps/socket/fight/arena/b;

    const-string v0, "register_type_NewArenaMainFragment"

    invoke-static {v0}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->b1(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method y1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->b:Ljava/lang/String;

    const-string v1, "loding_faile() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->A:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->w:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ShareWebActivity;->x1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method z1(Lapp/mgsim/arena/SocketError;)V
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
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5!"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    iget-object p1, p1, Lapp/mgsim/arena/SocketError;->errorInfo:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->K1()V

    return-void
.end method
