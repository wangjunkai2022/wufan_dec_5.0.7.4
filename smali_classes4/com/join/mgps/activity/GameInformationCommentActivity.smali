.class public Lcom/join/mgps/activity/GameInformationCommentActivity;
.super Lcom/BaseActivity;
.source "GameInformationCommentActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0352
.end annotation


# instance fields
.field private A:Landroid/content/Context;

.field private B:Lcom/join/mgps/adapter/InformationAdapterV2;

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;"
        }
    .end annotation
.end field

.field private D:Z

.field private E:Lcom/wufan/user/service/protobuf/n0;

.field F:Landroid/os/Handler;

.field private G:I

.field private H:Landroid/view/ViewTreeObserver;

.field private I:Z

.field private J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/InformationAdapterV2$n;",
            ">;"
        }
    .end annotation
.end field

.field private K:Lcom/join/mgps/dialog/d1;

.field L:Lcom/join/mgps/customview/o;

.field b:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/ImageView;
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

.field f:Lcom/join/mgps/customview/XListView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/android/app/common/view/ClearEditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Lit/sephiroth/android/library/widget/HListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Lcom/join/mgps/customview/KeyboardListenLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w:Lcom/join/mgps/rpc/e;

.field x:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field y:Lcom/join/mgps/dto/InformationCommentBeanV2;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    .line 4
    new-instance v1, Lcom/join/mgps/activity/GameInformationCommentActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity$a;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->F:Landroid/os/Handler;

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->I:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->K:Lcom/join/mgps/dialog/d1;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->L:Lcom/join/mgps/customview/o;

    return-void
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

.method static synthetic g0(Lcom/join/mgps/activity/GameInformationCommentActivity;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/GameInformationCommentActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    return p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/GameInformationCommentActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    return p1
.end method

.method private isLogined(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->L:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->L:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method


# virtual methods
.method afterview()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->w:Lcom/join/mgps/rpc/e;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->E:Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iput-object p0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLoding()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->K:Lcom/join/mgps/dialog/d1;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->d:Landroid/widget/TextView;

    const-string v1, "\u8bc4\u8bba"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const-string v1, "\u8bc4\u8bba\u4e00\u4e0b\u5427"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->k:Landroid/widget/Button;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->J:Ljava/util/List;

    .line 15
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity$b;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-eqz v2, :cond_0

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "@"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v4}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->requestFocus()Z

    .line 21
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 22
    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 23
    :cond_0
    new-instance v2, Lcom/join/mgps/adapter/InformationAdapterV2;

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->F:Landroid/os/Handler;

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->J:Ljava/util/List;

    invoke-direct {v2, v3, v4, v5}, Lcom/join/mgps/adapter/InformationAdapterV2;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/util/List;)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->B:Lcom/join/mgps/adapter/InformationAdapterV2;

    .line 24
    invoke-virtual {v2, v0}, Lcom/join/mgps/adapter/InformationAdapterV2;->m(Lcom/join/mgps/adapter/InformationAdapterV2$l;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->B:Lcom/join/mgps/adapter/InformationAdapterV2;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/XListView2;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/XListView2;->setPreLoadCount(I)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/GameInformationCommentActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity$c;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/GameInformationCommentActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity$d;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullRefreshEnable(Lcom/join/mgps/customview/g;)V

    .line 30
    new-instance v0, Ljava/util/Random;

    const-wide/16 v1, 0x7d0

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    .line 31
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->G:I

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method j0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u4e0d\u80fd\u53d1\u8868\u7a7a\u5b57\u7b26\u4e32"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u53d1\u8868\u8bc4\u8bba\u4e0d\u80fd\u5c0f\u4e8e4\u4e2a"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v2, "input_method"

    .line 8
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v2, v3, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->q0(Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method l0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->K:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method m0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    if-nez v0, :cond_5

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 4
    :try_start_0
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v4, Lcom/join/mgps/dto/GameInformationCommentRequestV2;

    invoke-direct {v4}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;-><init>()V

    .line 7
    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->x:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setInformation_id(Ljava/lang/String;)V

    .line 8
    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-eqz v5, :cond_0

    .line 9
    invoke-virtual {v5}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setComment_id(Ljava/lang/String;)V

    .line 10
    :cond_0
    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setUid(Ljava/lang/String;)V

    .line 11
    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setToken(Ljava/lang/String;)V

    .line 12
    iget v5, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setPage(I)V

    .line 13
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 14
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v3

    invoke-interface {v4, v3}, Le2/i;->h0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v3

    invoke-interface {v3}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v3

    invoke-virtual {v3}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v3, :cond_4

    .line 15
    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v4

    const/16 v5, 0xc8

    if-ne v4, v5, :cond_4

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 16
    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/InformationCommentBackV2;

    if-eqz v3, :cond_1

    .line 17
    invoke-virtual {v3}, Lcom/join/mgps/dto/InformationCommentBackV2;->getComments()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lcom/join/mgps/dto/InformationCommentBackV2;->getComments()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_1

    .line 18
    invoke-virtual {v3}, Lcom/join/mgps/dto/InformationCommentBackV2;->getComments()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 20
    iget v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    add-int/2addr v3, v0

    iput v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    .line 21
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->u0(Ljava/util/List;)V

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->x0()V

    goto :goto_0

    .line 23
    :cond_2
    iget v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    if-ne v3, v0, :cond_3

    .line 24
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->u0(Ljava/util/List;)V

    .line 25
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->x0()V

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->o0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 27
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->x0()V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLodingFailed()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :cond_4
    :goto_0
    iput-boolean v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    goto :goto_2

    :goto_1
    iput-boolean v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->D:Z

    .line 31
    throw v0

    .line 32
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->x0()V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLodingFailed()V

    :goto_2
    return-void
.end method

.method n0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    return-void
.end method

.method o0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    return-void
.end method

.method protected onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->E:Lcom/wufan/user/service/protobuf/n0;

    return-void
.end method

.method p0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 5
    new-instance v3, Lcom/join/mgps/adapter/InformationAdapterV2$n;

    sget-object v4, Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;->COMMENT:Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;

    new-instance v5, Lcom/join/mgps/adapter/InformationAdapterV2$n$a;

    invoke-direct {v5, v2}, Lcom/join/mgps/adapter/InformationAdapterV2$n$a;-><init>(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/adapter/InformationAdapterV2$n;-><init>(Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;Ljava/lang/Object;)V

    .line 6
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->J:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 8
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 9
    new-instance v3, Lcom/join/mgps/adapter/InformationAdapterV2$n;

    sget-object v4, Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;->REPLY:Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;

    new-instance v5, Lcom/join/mgps/adapter/InformationAdapterV2$n$b;

    .line 10
    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-direct {v5, v6, v2, v0, v7}, Lcom/join/mgps/adapter/InformationAdapterV2$n$b;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)V

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/adapter/InformationAdapterV2$n;-><init>(Lcom/join/mgps/adapter/InformationAdapterV2$ViewType;Ljava/lang/Object;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->J:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->B:Lcom/join/mgps/adapter/InformationAdapterV2;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/InformationAdapterV2;->notifyDataSetChanged()V

    return-void
.end method

.method q0(Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u8bc4\u8bba\u5931\u8d25"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->t0()V

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v2, Lcom/join/mgps/dto/AddGameInformationCommentArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;-><init>()V

    .line 7
    invoke-virtual {v2, p2}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setMsg(Ljava/lang/String;)V

    .line 8
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->x:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setInformation_id(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setUserToken(Ljava/lang/String;)V

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setUid(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-eqz p1, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setRuid(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/AddGameInformationCommentArgs;->setComment_id(Ljava/lang/String;)V

    .line 14
    :cond_1
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 15
    :try_start_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p2

    invoke-interface {p1, p2}, Le2/i;->k(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p1

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_2

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p2

    const/16 v1, 0x2c2

    if-ne p2, v1, :cond_2

    const p1, 0x7f100490

    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->l0()V

    return-void

    :cond_2
    if-eqz p1, :cond_3

    .line 20
    :try_start_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p2

    const/16 v1, 0x326

    if-ne p2, v1, :cond_3

    .line 21
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 22
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p1

    const/16 p2, 0xc8

    if-ne p1, p2, :cond_4

    const-string p1, "\u8bc4\u8bba\u6210\u529f"

    .line 23
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->w0()V

    goto :goto_0

    .line 25
    :cond_4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 26
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 27
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->l0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->l0()V

    .line 29
    throw p1

    :cond_5
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u5148\u68c0\u67e5\u7f51\u7edc\u3002"

    .line 30
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method r0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u70b9\u8d5e\u5931\u8d25"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 4
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 5
    new-instance v2, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;-><init>()V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setCommentId(Ljava/lang/String;)V

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->E:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setUid(Ljava/lang/String;)V

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->E:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setUserToken(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v2, v1}, Le2/i;->P(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v1

    invoke-interface {v1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v1

    invoke-virtual {v1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0x2c2

    if-ne v2, v3, :cond_1

    const-string p1, "\u5b8c\u5584\u8d44\u6599\u540e\u5c31\u53ef\u70b9\u8d5e\u54e6"

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    return-void

    :cond_1
    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_2

    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 17
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setLike(I)V

    .line 19
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->v0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    .line 20
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 21
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 22
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showToast(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string p1, "\u6ca1\u6709\u7f51\u7edc"

    .line 25
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showToast(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLoding()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    return-void
.end method

.method s0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const-string v1, "\u6dfb\u52a0\u8bc4\u8bba"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->l()V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    return-void
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f100299

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->K:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    return-void
.end method

.method toastData(Lcom/join/mgps/dto/RewardBean;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/RewardBean;->getOn_off()I

    :cond_0
    return-void
.end method

.method u0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 6
    iget v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->p0()V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->I:Z

    if-eqz p1, :cond_2

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->I:Z

    .line 12
    new-instance p1, Landroid/os/Message;

    invoke-direct {p1}, Landroid/os/Message;-><init>()V

    const/4 v0, 0x3

    .line 13
    iput v0, p1, Landroid/os/Message;->what:I

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->F:Landroid/os/Handler;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-eqz p1, :cond_2

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    return-void

    .line 17
    :cond_3
    :goto_0
    iget p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_4

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->i:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method v0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->p0()V

    return-void
.end method

.method w0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const-string v1, "\u6dfb\u52a0\u8bc4\u8bba"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->z:I

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    return-void
.end method

.method x0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    return-void
.end method

.method y0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->A:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
