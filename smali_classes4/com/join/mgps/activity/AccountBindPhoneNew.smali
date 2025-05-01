.class public Lcom/join/mgps/activity/AccountBindPhoneNew;
.super Lcom/join/mgps/activity/BaseAccountActivity;
.source "AccountBindPhoneNew.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c00df
.end annotation


# instance fields
.field A:Z

.field B:Lcom/join/mgps/dto/AccountAnonymousReginRequest;

.field C:I

.field private D:Landroid/os/Handler;

.field d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field e:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Lcom/facebook/drawee/view/SimpleDraweeView;
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

.field j:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Lcom/join/mgps/rpc/b;

.field u:Lcom/join/mgps/rpc/c;

.field v:Landroid/app/Dialog;

.field w:I

.field x:I

.field y:Lcom/wufan/user/service/protobuf/n0;

.field z:Lcom/wufan/user/service/protobuf/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/BaseAccountActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->w:I

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->x:I

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->A:Z

    const/16 v0, 0x3c

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->C:I

    .line 6
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$f;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->D:Landroid/os/Handler;

    return-void
.end method

.method private getChineseCount(Ljava/lang/String;)I
    .locals 4

    const-string v0, "[\\u4e00-\\u9fa5]"

    .line 1
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v3

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private getStringLength(Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->getChineseCount(Ljava/lang/String;)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/AccountBindPhoneNew;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->showKeyborad(Landroid/widget/EditText;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/AccountBindPhoneNew;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->D:Landroid/os/Handler;

    return-object p0
.end method

.method private matchStringLength(Ljava/lang/String;II)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->getStringLength(Ljava/lang/String;)I

    move-result p1

    if-lt p1, p2, :cond_0

    if-gt p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private showKeyborad(Landroid/widget/EditText;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    const-string p1, "input_method"

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    return-void
.end method


# virtual methods
.method afterview()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    const-string v0, "\u7ed1\u5b9a\u624b\u673a\u53f7"

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/BaseAccountActivity;->h0(Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/b;->k()Lcom/join/mgps/rpc/c;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->u:Lcom/join/mgps/rpc/c;

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->z:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->n2()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->A:Z

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/AccountBindPhoneNew$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$a;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/AccountBindPhoneNew$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$b;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/AccountBindPhoneNew$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$c;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/AccountBindPhoneNew$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$d;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/AccountBindPhoneNew$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew$e;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    invoke-static {v0}, Lcom/join/mgps/Util/o;->g(Landroid/widget/EditText;)V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method joinDevice()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    new-instance v0, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v0}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "token"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->S(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/JPushJoinDeviceResult;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JPushJoinDeviceResult;->isResult()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/JPushJoinDeviceResult;

    invoke-virtual {v0}, Lcom/join/mgps/dto/JPushJoinDeviceResult;->getMsg()Ljava/lang/String;

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->Q(Landroid/content/Context;)V

    return-void
.end method

.method k0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->setMobile(Ljava/lang/String;)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->setDevice_id(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->setMac(Ljava/lang/String;)V

    .line 7
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->setSign(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountCheckReginCodeRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/b;->B(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountLoginresultData;->is_success()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    new-instance v0, Lcom/join/mgps/dto/AccountAnonymousReginRequest;

    invoke-direct {v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;-><init>()V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setMobile(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setCode(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setPassword(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->u0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->getError_msg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 17
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 19
    throw v0

    :cond_2
    const-string v0, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method l0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const/16 v0, 0x3c

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->C:I

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->s0()V

    return-void
.end method

.method m0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method

.method n0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/AccountChangeNickNameRequest;

    invoke-direct {v0}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;-><init>()V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setUid(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setToken(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setNick_name(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setAvatar_src(Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setSign(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/join/mgps/rpc/b;->G(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->is_success()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x2711

    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getError_msg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 14
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 16
    throw p1

    :cond_2
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method nextStep()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->s0()V

    return-void
.end method

.method nickNameBution()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x14

    .line 2
    invoke-direct {p0, v0, v1, v2}, Lcom/join/mgps/activity/AccountBindPhoneNew;->matchStringLength(Ljava/lang/String;II)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v0, "\u7528\u6237\u540d\u683c\u5f0f\u6709\u8bef\uff0c\u8f93\u51651\u81f324\u4f4d\u5b57\u6bcd\u6216\u6570\u5b57\u6216\u6c49\u5b57"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 5
    iget-boolean v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->A:Z

    if-eqz v2, :cond_2

    .line 6
    iget v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->e:I

    if-ne v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->B:Lcom/join/mgps/dto/AccountAnonymousReginRequest;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->q0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->B:Lcom/join/mgps/dto/AccountAnonymousReginRequest;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->r0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    goto :goto_0

    .line 9
    :cond_2
    iget v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->e:I

    if-ne v2, v1, :cond_3

    .line 10
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->n0(Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->o0(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/AccountChangeNickNameRequest;

    invoke-direct {v0}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;-><init>()V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setUid(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setToken(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setNick_name(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setAvatar_src(Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->setSign(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountChangeNickNameRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/join/mgps/rpc/b;->a0(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->is_success()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x2711

    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getError_msg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 14
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 16
    throw p1

    :cond_2
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x2711

    if-ne p1, p3, :cond_0

    if-ne p2, p3, :cond_0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    return-void
.end method

.method p0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/16 v2, 0x10

    invoke-direct {p0, v0, v1, v2}, Lcom/join/mgps/activity/AccountBindPhoneNew;->matchStringLength(Ljava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\u5bc6\u7801\u683c\u5f0f\u6709\u8bef\uff0c\u8f93\u51656\u81f316\u4f4d\u5b57\u6bcd\u6216\u6570\u5b57"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->v:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 4
    iget-boolean v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->A:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->k0()V

    goto :goto_0

    .line 6
    :cond_1
    iget v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->phoneRegin()V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->thirdRegin()V

    :goto_0
    return-void
.end method

.method phoneRegin()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    invoke-static {}, Lcom/wufan/user/service/protobuf/x;->t3()Lcom/wufan/user/service/protobuf/x$b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->g3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->k3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    const-string v1, "mob"

    .line 6
    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->e3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    .line 7
    invoke-static {p0}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    .line 8
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "account"

    .line 9
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/x$b;->getAccount()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "password"

    .line 10
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/x$b;->getPassword()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "smsCode"

    .line 11
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/x$b;->r()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "codeType"

    .line 12
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/x$b;->v()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 13
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/x$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/x$b;->i3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/x$b;

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->u:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/x;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->g(Lcom/wufan/user/service/protobuf/x;)Lcom/wufan/user/service/protobuf/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 18
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->joinDevice()V

    .line 21
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 23
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "\u6570\u636e\u83b7\u53d6\u5f02\u5e38\uff0c\u8bf7\u91cd\u8bd5"

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 25
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 27
    throw v0

    :cond_3
    const-string v0, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 28
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method q0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->z:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setUid(I)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->z:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setToken(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setNick_name(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setDevice_id(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setMac(Ljava/lang/String;)V

    .line 7
    invoke-static {p1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setSign(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->getParamsPhone()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/b;->H(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->is_success()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getUser_info()Lcom/join/mgps/dto/AccountBean;

    move-result-object p1

    invoke-static {p1}, Lb3/a;->a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->joinDevice()V

    const/16 p1, 0x2711

    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getError_msg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 17
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 19
    throw p1

    :cond_2
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method r0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->z:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setUid(I)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->z:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setToken(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getUnique_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setUnique_id(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getType()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setType(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setNick_name(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setDevice_id(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setMac(Ljava/lang/String;)V

    .line 9
    invoke-static {p1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->setSign(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->t:Lcom/join/mgps/rpc/b;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountAnonymousReginRequest;->getParamsThird()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/b;->o(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->is_success()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getUser_info()Lcom/join/mgps/dto/AccountBean;

    move-result-object p1

    invoke-static {p1}, Lb3/a;->a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->joinDevice()V

    const/16 p1, 0x2711

    .line 16
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getError_msg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 21
    throw p1

    :cond_2
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 22
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method s0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    invoke-static {}, Lcom/wufan/user/service/protobuf/h0;->t3()Lcom/wufan/user/service/protobuf/h0$b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->k3(I)Lcom/wufan/user/service/protobuf/h0$b;

    .line 5
    :cond_0
    invoke-static {p0}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/h0$b;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AESUtils;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->e3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/h0$b;

    .line 7
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/SourceType;->PLATFORM:Lcom/wufan/user/service/protobuf/enumeration/SourceType;

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->i3(Lcom/wufan/user/service/protobuf/enumeration/SourceType;)Lcom/wufan/user/service/protobuf/h0$b;

    .line 8
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/ContentType;->MOBILE_REG:Lcom/wufan/user/service/protobuf/enumeration/ContentType;

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->c3(Lcom/wufan/user/service/protobuf/enumeration/ContentType;)Lcom/wufan/user/service/protobuf/h0$b;

    .line 9
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "uid"

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/h0$b;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "mobile"

    .line 11
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/h0$b;->z()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sourceType"

    .line 12
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/h0$b;->P1()Lcom/wufan/user/service/protobuf/enumeration/SourceType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 13
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/h0$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "contentType"

    .line 14
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/h0$b;->getContentType()Lcom/wufan/user/service/protobuf/enumeration/ContentType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/h0$b;->g3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/h0$b;

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->u:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/h0;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->j(Lcom/wufan/user/service/protobuf/h0;)Lcom/wufan/user/service/protobuf/f0;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f0;->getError()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 18
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f0;->getStatus()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->t0()V

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/f0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 21
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 23
    throw v0

    :cond_3
    const-string v0, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_2
    return-void
.end method

.method showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u8bbe\u7f6e\u5934\u50cf/\u6635\u79f0"

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/BaseAccountActivity;->h0(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->e:I

    const v1, 0x7f080f33

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3e8

    invoke-virtual {p1, v3}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getAvatar_src()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method t0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u8bbe\u7f6e\u5bc6\u7801"

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/BaseAccountActivity;->h0(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->o:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->i:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->D:Landroid/os/Handler;

    const/4 v2, 0x1

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method

.method thirdRegin()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    invoke-static {}, Lcom/wufan/user/service/protobuf/l0;->B3()Lcom/wufan/user/service/protobuf/l0$b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->i3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getUnique_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->q3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 6
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;->UNRECOGNIZED:Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getType()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 8
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;->T_QQ:Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;

    goto :goto_0

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getType()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 10
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;->T_WEI_XIN:Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;

    goto :goto_0

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;->getType()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    .line 12
    sget-object v1, Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;->T_WEI_BO:Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->o3(Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->m3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    const-string v1, "mob"

    .line 15
    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->g3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 16
    invoke-static {p0}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->e3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 17
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "theThirdPartLoginType"

    .line 18
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/l0$b;->t()Lcom/wufan/user/service/protobuf/enumeration/TheThirdPartLoginType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "smsCode"

    .line 19
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/l0$b;->r()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "codeType"

    .line 20
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/l0$b;->v()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 21
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/l0$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/l0$b;->k3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/l0$b;

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->u:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/l0;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->f(Lcom/wufan/user/service/protobuf/l0;)Lcom/wufan/user/service/protobuf/d0;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 24
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_4

    .line 25
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->m()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 26
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->joinDevice()V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->y:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V

    goto :goto_1

    .line 30
    :cond_3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 31
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    goto :goto_3

    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    .line 33
    throw v0

    :cond_5
    const-string v0, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"

    .line 34
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    :goto_3
    return-void
.end method

.method u0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u8bbe\u7f6e\u5934\u50cf/\u6635\u79f0"

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/BaseAccountActivity;->h0(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iput-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->B:Lcom/join/mgps/dto/AccountAnonymousReginRequest;

    return-void
.end method

.method userIcon()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/MGChooseIconActivity_;->x0(Landroid/content/Context;)Lcom/join/mgps/activity/MGChooseIconActivity_$m;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/MGChooseIconActivity_$m;->a(I)Lcom/join/mgps/activity/MGChooseIconActivity_$m;

    move-result-object v0

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/MGChooseIconActivity_$m;->startForResult(I)Lorg/androidannotations/api/builder/f;

    return-void
.end method
