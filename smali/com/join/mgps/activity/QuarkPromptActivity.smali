.class public Lcom/join/mgps/activity/QuarkPromptActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "QuarkPromptActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/QuarkPromptActivity$e;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c008e
.end annotation


# instance fields
.field A:Z

.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroidx/recyclerview/widget/RecyclerView;
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

.field j:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field l:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field m:Lcom/join/mgps/dto/DownloadArgs;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field n:Lcom/join/mgps/dto/WebDiskCfg;

.field o:Lcom/join/mgps/dto/WebDiskInfo;

.field p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field r:Z

.field s:Z

.field t:Z

.field u:Z

.field v:I

.field private w:Lcom/join/mgps/dto/CollectionBeanSub;

.field private x:Lcom/join/mgps/activity/QuarkPromptActivity$e;

.field y:Landroid/os/Handler;

.field z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->r:Z

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->s:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->u:Z

    const/16 v1, 0xa

    .line 6
    iput v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    .line 7
    new-instance v1, Landroid/os/Handler;

    new-instance v2, Lcom/join/mgps/activity/QuarkPromptActivity$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$a;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->y:Landroid/os/Handler;

    .line 8
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->z:Z

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->A:Z

    return-void
.end method

.method private downloadQuark()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->z:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/q1;->o()Z

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/q1;->r()Z

    move-result v0

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v1

    const-string v2, "action"

    const-string v3, "downloadQuark"

    invoke-virtual {v1, v2, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/service/CommonService_$h2;

    const-string v2, "isOm"

    invoke-virtual {v1, v2, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    const v0, 0x7f100334

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 6
    sget-object v0, Lcom/papa/sim/statistic/Event;->clickInstallQkButton:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    if-eqz v2, :cond_1

    const-string v2, "detail"

    goto :goto_1

    :cond_1
    const-string v2, "list"

    :goto_1
    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/QuarkPromptActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->h0()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    return-object p0
.end method

.method private h0()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    div-int/lit16 v1, v0, 0xe10

    mul-int/lit16 v2, v1, 0xe10

    sub-int v2, v0, v2

    .line 2
    div-int/lit8 v2, v2, 0x3c

    .line 3
    rem-int/lit8 v0, v0, 0x3c

    .line 4
    iget-object v3, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->d:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "0"

    const/16 v6, 0xa

    if-ge v1, v6, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v2, v6, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v0, v6, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static i0(Ljava/util/Date;)Ljava/lang/Integer;
    .locals 4

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x5

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    const/16 v1, 0xb

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xc

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xd

    .line 6
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xe

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 8
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private isOutOfBounds(Landroid/content/Context;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result p1

    .line 5
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 6
    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    neg-int p1, p1

    if-lt v2, p1, :cond_2

    if-lt p2, p1, :cond_2

    .line 7
    invoke-virtual {v3, v2, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method afterViews()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->web_disk_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->web_disk_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/WebDiskCfg;

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    const/16 v1, 0x65

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getGameInfo()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getFrom()I

    move-result v0

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->o:Lcom/join/mgps/dto/WebDiskInfo;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->m2(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->z:Z

    if-eqz v0, :cond_6

    .line 13
    invoke-static {}, Lcom/join/mgps/Util/q1;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->A:Z

    goto :goto_4

    .line 14
    :cond_6
    invoke-static {}, Lcom/join/mgps/Util/q1;->r()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->A:Z

    .line 15
    :goto_4
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    const-string v4, "com.quark.browser"

    invoke-virtual {v0, p0, v4}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->u:Z

    if-eqz v0, :cond_8

    .line 16
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const-string v4, "2057111073"

    invoke-virtual {v0, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    goto :goto_5

    .line 17
    :cond_8
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->A:Z

    if-eqz v0, :cond_9

    .line 18
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const-string v4, "3875871586"

    invoke-virtual {v0, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 19
    :cond_9
    :goto_5
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    if-eqz v0, :cond_c

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 21
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    .line 22
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getGameInfo()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->m:Lcom/join/mgps/dto/DownloadArgs;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadArgs;->getFrom()I

    move-result v0

    if-ne v0, v1, :cond_b

    const/4 v0, 0x1

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    :goto_6
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz v0, :cond_c

    .line 25
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->o:Lcom/join/mgps/dto/WebDiskInfo;

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    .line 28
    :try_start_0
    iget-object v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->w:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getAppSize()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    mul-double v4, v4, v0

    double-to-long v0, v4

    .line 29
    iget-object v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->j:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "2023-03-21 15:30 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 31
    :cond_c
    :goto_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->k0()V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 34
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->y:Landroid/os/Handler;

    const-wide/16 v4, 0x3e8

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 35
    new-instance v0, Lcom/join/mgps/activity/QuarkPromptActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$e;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->x:Lcom/join/mgps/activity/QuarkPromptActivity$e;

    .line 36
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->x:Lcom/join/mgps/activity/QuarkPromptActivity$e;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 38
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/QuarkPromptActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$b;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    if-eqz v0, :cond_f

    .line 40
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 41
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<time>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->h:Landroid/widget/TextView;

    aget-object v4, v0, v3

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->e:Landroid/widget/TextView;

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 46
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 47
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->i0(Ljava/util/Date;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    add-int/lit16 v0, v0, 0x3840

    .line 48
    iput v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    .line 49
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->h0()V

    goto :goto_8

    .line 50
    :cond_d
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 52
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 53
    :cond_e
    :goto_8
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getSub_title()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getSub_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n<font color=\'#2251FF\'>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getSub_title_v2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "</font>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<br/>"

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->x:Lcom/join/mgps/activity/QuarkPromptActivity$e;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    :cond_f
    return-void
.end method

.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_click_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getClick_count()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isQuarkEnable()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_display_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getDisplay_count()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_click_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isQuarkEnable()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method j0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/join/mgps/activity/QuarkPromptActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$d;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->finish()V

    return-void
.end method

.method k0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_btn_txt()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_btn_txt()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x7f1000f5

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    :goto_0
    iget-boolean v2, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->s:Z

    if-eqz v2, :cond_2

    .line 6
    sget-object v2, Lcom/papa/sim/statistic/Event;->speedDownQkExp:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    if-eqz v4, :cond_1

    const-string v4, "detail"

    goto :goto_1

    :cond_1
    const-string v4, "list"

    :goto_1
    invoke-static {p0, v2, v3, v4}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iput-boolean v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->s:Z

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method l0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->A:Z

    if-nez v0, :cond_b

    const/4 v0, 0x0

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    const-string v2, "com.quark.browser"

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->u:Z

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    const-string v2, "2057111073"

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 5
    iput-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    :cond_0
    iget-boolean v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->u:Z

    if-nez v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    const-string v0, "\u5938\u514b\u6b63\u5728\u4e0b\u8f7d"

    .line 7
    invoke-static {v0}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez v1, :cond_3

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_2

    if-nez v0, :cond_3

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->downloadQuark()V

    return-void

    :cond_3
    const-string v2, "detail"

    const-string v3, "list"

    if-nez v1, :cond_9

    .line 11
    iget-object v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x6

    if-eqz v4, :cond_4

    const/16 v4, 0xb

    if-eq v0, v4, :cond_5

    :cond_4
    if-ne v0, v5, :cond_9

    .line 12
    :cond_5
    new-instance v1, Ljava/io/File;

    iget-object v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    iget-object v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v4

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_8

    if-ne v0, v5, :cond_6

    goto :goto_1

    .line 15
    :cond_6
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->x(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    sget-object v0, Lcom/papa/sim/statistic/Event;->clickInstallQkButton:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    if-eqz v4, :cond_7

    goto :goto_0

    :cond_7
    move-object v2, v3

    :goto_0
    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 17
    :cond_8
    :goto_1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v1}, Lp1/b;->delete(Ljava/lang/Object;)I

    .line 18
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->downloadQuark()V

    return-void

    :cond_9
    if-nez v1, :cond_b

    .line 19
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_b

    const/4 v4, 0x5

    if-eq v0, v4, :cond_b

    .line 20
    invoke-static {v1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 22
    sget-object v0, Lcom/papa/sim/statistic/Event;->clickInstallQkButton:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    if-eqz v4, :cond_a

    goto :goto_2

    :cond_a
    move-object v2, v3

    :goto_2
    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 23
    :cond_b
    new-instance v0, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {v0, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 24
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$c;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 25
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 2
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.quark.browser"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity;->p:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->k0()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->k0()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p0, p1}, Lcom/join/mgps/activity/QuarkPromptActivity;->shouldCloseOnTouch(Landroid/content/Context;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->finish()V

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public shouldCloseOnTouch(Landroid/content/Context;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/QuarkPromptActivity;->isOutOfBounds(Landroid/content/Context;Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkPromptActivity;->getContentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method
