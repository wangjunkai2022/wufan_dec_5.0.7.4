.class public Lcom/join/mgps/activity/OemDetailActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "OemDetailActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c05a6
.end annotation


# static fields
.field public static final I:Ljava/lang/String; = "key_oem_detail"

.field public static final J:I = 0x1


# instance fields
.field A:Z

.field B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

.field final C:I

.field final D:I

.field E:Landroid/os/Handler;

.field F:Z

.field G:Lcom/join/mgps/customview/o;

.field H:Lcom/join/mgps/customview/o;

.field private b:Ljava/lang/String;

.field c:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/RelativeLayout;
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

.field g:Lcom/join/mgps/customview/ForumLoadingView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Lcom/join/mgps/rpc/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->A:Z

    const/4 v1, 0x1

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->C:I

    const/4 v1, 0x2

    .line 5
    iput v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->D:I

    .line 6
    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$b;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->E:Landroid/os/Handler;

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->F:Z

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/activity/OemDetailActivity;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/OemDetailActivity;->h0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic f0(Lcom/join/mgps/activity/OemDetailActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->q0()V

    return-void
.end method

.method private h0(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const v0, 0x7f10051d

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    const-string v3, "6"

    .line 4
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-static {v2}, Lcom/join/mgps/Util/b;->piv(Lcom/wufan/user/service/protobuf/n0;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->D0()V

    goto :goto_1

    :cond_2
    const-string v3, "7"

    .line 7
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 8
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->j1()I

    move-result p1

    if-lez p1, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->B0()V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method private i0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private j0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private m0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->e:Landroid/widget/TextView;

    const-string v1, "\u8be6\u60c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private n0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    return-void
.end method

.method private p0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->o0(I)V

    return-void
.end method

.method private q0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->p0()V

    goto :goto_0

    :cond_0
    const v0, 0x7f100299

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V

    const/16 v0, 0x9

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    :goto_0
    return-void
.end method

.method private r0(ILcom/join/mgps/dto/OemData$GiftDetailData;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    if-nez p1, :cond_0

    new-instance p1, Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p2

    const-class v0, Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {p2, p1, v0}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/OemBean$OemDetailBean;

    iput-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->u0()V

    return-void
.end method

.method private s0(Lcom/join/mgps/dto/OemData$GiftGetCdkData;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/OemData$GiftGetCdkData;->getGift_cdk()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->setIs_used(Ljava/lang/Boolean;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->setGift_cdk(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getMy_oem()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getMy_oem()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->setMy_oem(Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->setSurplus(I)V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->u0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method A0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getIs_used()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "receivedOemDetail"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method B0()V
    .locals 1
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->c0(Landroid/content/Context;)Lcom/join/mgps/customview/o;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->G:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method C0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method D0()V
    .locals 1
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->e0(Landroid/content/Context;)Lcom/join/mgps/customview/o;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->H:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->m0()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->n0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->k0()V

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/m;->c()Lcom/join/mgps/rpc/impl/m;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->z:Lcom/join/mgps/rpc/m;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/ForumLoadingView;->m()V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->q0()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->A0()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method g0(I)V
    .locals 5
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const v1, 0x7f080c64

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedReloadingRes(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const v1, 0x7f080cd2

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedImgRes(I)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/16 v0, 0x9

    if-eq p1, v0, :cond_2

    const v0, 0x7f0807aa

    const v1, 0x7f0802c3

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eq p1, v2, :cond_1

    const/16 v4, 0x10

    if-eq p1, v4, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const-string v2, "\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    new-instance v2, Lcom/join/mgps/activity/OemDetailActivity$a;

    invoke-direct {v2, p0, p1}, Lcom/join/mgps/activity/OemDetailActivity$a;-><init>(Lcom/join/mgps/activity/OemDetailActivity;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/ForumLoadingView;->setReloadingVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedImgVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedImgRes(I)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedReloadingRes(I)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const-string v2, "\u6ca1\u6709\u66f4\u591a\u8be6\u60c5\u54e6~"

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    new-instance v2, Lcom/join/mgps/activity/OemDetailActivity$j;

    invoke-direct {v2, p0, p1}, Lcom/join/mgps/activity/OemDetailActivity$j;-><init>(Lcom/join/mgps/activity/OemDetailActivity;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {p1, v2}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/ForumLoadingView;->setReloadingVisibility(I)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedImgVisibility(I)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedImgRes(I)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedReloadingRes(I)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$i;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/OemDetailActivity$i;-><init>(Lcom/join/mgps/activity/OemDetailActivity;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 19
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 20
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/OemDetailActivity;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    :goto_0
    return-void
.end method

.method public k0()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key_oem_detail"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/OemBean$OemDetailBean;

    iput-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method l0()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getMoney_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getMoney_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->O1()J

    move-result-wide v2

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method o0(I)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->A:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x10

    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Lcom/join/mgps/dto/OemRequestBean$GetOemDetailRequestBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/OemRequestBean$GetOemDetailRequestBean;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 6
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    .line 7
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 8
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, ""

    if-eqz v3, :cond_2

    .line 9
    :try_start_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v5

    .line 10
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/OemRequestBean$GetOemDetailRequestBean;->setUid(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/OemRequestBean$GetOemDetailRequestBean;->setOid(Ljava/lang/String;)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/OemDetailActivity;->z:Lcom/join/mgps/rpc/m;

    invoke-interface {v2, v4, v3}, Lcom/join/mgps/rpc/m;->b(ILjava/lang/String;)Lcom/join/mgps/dto/OemResponse;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v2}, Lcom/join/mgps/dto/OemResponse;->getError()I

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/join/mgps/dto/OemResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 14
    invoke-virtual {v2}, Lcom/join/mgps/dto/OemResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/OemData$GiftDetailData;

    if-nez v2, :cond_4

    const/4 v2, 0x1

    if-ne p1, v2, :cond_3

    const/16 p1, 0xa

    .line 15
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :cond_3
    iput-boolean v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->A:Z

    return-void

    .line 17
    :cond_4
    :try_start_2
    invoke-direct {p0, p1, v2}, Lcom/join/mgps/activity/OemDetailActivity;->r0(ILcom/join/mgps/dto/OemData$GiftDetailData;)V

    const/4 p1, 0x2

    .line 18
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    goto :goto_2

    .line 19
    :cond_5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 20
    :try_start_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    :goto_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->A:Z

    goto :goto_4

    :goto_3
    iput-boolean v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->A:Z

    .line 23
    throw p1

    :cond_6
    const p1, 0x7f100299

    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V

    const/16 p1, 0x9

    .line 25
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/OemDetailActivity;->g0(I)V

    :goto_4
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->back_image()V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->j0()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/OemDetailActivity;->i0()V

    .line 3
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->E:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    iput v1, v0, Landroid/os/Message;->what:I

    .line 3
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method t0()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->F:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    const-string v1, "\u793c\u5305\u7801\u83b7\u53d6\u5931\u8d25"

    const-string v2, "\u793c\u5305\u7801\u83b7\u53d6\u6210\u529f"

    .line 3
    new-instance v3, Lcom/join/mgps/dto/OemRequestBean$ReceiveCdkRequestBean;

    invoke-direct {v3}, Lcom/join/mgps/dto/OemRequestBean$ReceiveCdkRequestBean;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v4

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, ""

    if-eqz v5, :cond_1

    .line 6
    :try_start_1
    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    .line 7
    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v6

    const/4 v5, 0x0

    .line 8
    :goto_0
    iget-object v7, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    if-eqz v7, :cond_2

    .line 9
    invoke-virtual {v7}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_2
    move-object v7, v6

    .line 10
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/join/mgps/dto/OemRequestBean$ReceiveCdkRequestBean;->setUid(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v3, v7}, Lcom/join/mgps/dto/OemRequestBean$ReceiveCdkRequestBean;->setOid(Ljava/lang/String;)V

    .line 12
    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->z:Lcom/join/mgps/rpc/m;

    invoke-interface {v3, v5, v4, v7}, Lcom/join/mgps/rpc/m;->a(ILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/OemResponse;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 13
    invoke-virtual {v3}, Lcom/join/mgps/dto/OemResponse;->getError()I

    move-result v4

    if-nez v4, :cond_5

    .line 14
    invoke-virtual {v3}, Lcom/join/mgps/dto/OemResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/OemData$GiftGetCdkData;

    if-eqz v3, :cond_3

    .line 15
    invoke-virtual {v3}, Lcom/join/mgps/dto/OemData$GiftGetCdkData;->getGift_cdk()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 16
    invoke-direct {p0, v3}, Lcom/join/mgps/activity/OemDetailActivity;->s0(Lcom/join/mgps/dto/OemData$GiftGetCdkData;)V

    .line 17
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V

    goto :goto_3

    .line 18
    :cond_3
    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, v6

    .line 19
    :goto_2
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V

    goto :goto_3

    .line 20
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    .line 21
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    :goto_3
    iput-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->F:Z

    goto :goto_5

    :goto_4
    iput-boolean v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->F:Z

    .line 23
    throw v1

    :cond_6
    const v0, 0x7f100299

    .line 24
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OemDetailActivity;->showToast(Ljava/lang/String;)V

    :goto_5
    return-void
.end method

.method u0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->E:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    .line 2
    iput v1, v0, Landroid/os/Message;->what:I

    .line 3
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method v0()V
    .locals 7
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->m:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getEnd_time()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    invoke-static {v3, v4}, Lcom/join/mgps/Util/y;->D(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f100088

    invoke-virtual {p0, v3, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getContent()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getUse_method()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    const/16 v3, 0x8

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :goto_0
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->x:Landroid/view/View;

    new-instance v2, Lcom/join/mgps/activity/OemDetailActivity$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/OemDetailActivity$c;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10028d

    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getMy_oem()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06013a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getType()Ljava/lang/String;

    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "4"

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060138

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->z0()V

    goto :goto_2

    :cond_2
    const-string v1, "3"

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060139

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->y0()V

    goto :goto_2

    :cond_3
    const-string v1, "2"

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->x0()V

    goto :goto_2

    :cond_4
    const-string v1, "1"

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 37
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/OemDetailActivity;->w0()V

    .line 38
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    return-void
.end method

.method w0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, "0"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\u4e2a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f100089

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v0, v5, v1

    .line 6
    invoke-virtual {p0, v2, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getSurplus()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 8
    :goto_1
    iget-object v3, p0, Lcom/join/mgps/activity/OemDetailActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getIs_used()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const v3, 0x7f080c3d

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/OemDetailActivity;->B:Lcom/join/mgps/dto/OemBean$OemDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/OemBean$OemDetailBean;->getGift_cdk()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    const-string v1, "\u590d\u5236"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$d;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    if-ge v2, v4, :cond_3

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->h:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f10033c

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    const-string v1, "\u9886\u53d6"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->r:Landroid/widget/Button;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$e;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method x0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    const v1, 0x7f100338

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$f;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method y0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    const v1, 0x7f100339

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$g;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method z0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    const v1, 0x7f10033a

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/OemDetailActivity;->s:Landroid/widget/Button;

    new-instance v1, Lcom/join/mgps/activity/OemDetailActivity$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/OemDetailActivity$h;-><init>(Lcom/join/mgps/activity/OemDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
