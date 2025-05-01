.class public Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;
.super Lcom/BaseAppCompatActivity;
.source "ChangeAccountNickNameActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c00f5
.end annotation


# instance fields
.field accountBean:Lcom/wufan/user/service/protobuf/n0;

.field close:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field context:Landroid/content/Context;

.field dialogLoding:Landroid/app/Dialog;

.field nickName:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field nickNameBution:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field userIcon:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    return-void
.end method

.method private changeNickName(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/login/ChangeNiknameRequest;

    invoke-direct {v0}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;-><init>()V

    const-string v1, ""

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setDeviceId(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setMac(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setNickName(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setUid(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setUserToken(Ljava/lang/String;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/n;->y()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/ChangeNiknameRequest;->setVersion(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/j;->b()Lcom/join/mgps/rpc/impl/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/j;->a()Le2/j;

    move-result-object v1

    invoke-interface {v1, v0}, Le2/j;->c(Lcom/join/mgps/activity/login/ChangeNiknameRequest;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity$2;-><init>(Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

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

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->getChineseCount(Ljava/lang/String;)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method private matchStringLength(Ljava/lang/String;II)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->getStringLength(Ljava/lang/String;)I

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


# virtual methods
.method afterview()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->dialogLoding:Landroid/app/Dialog;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V

    .line 4
    iput-object p0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->context:Landroid/content/Context;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    new-instance v1, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity$1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity$1;-><init>(Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    invoke-static {v0}, Lcom/join/mgps/Util/o;->g(Landroid/widget/EditText;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->showNicknameEditPage:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method close()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

.method nickNameBution()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x14

    .line 2
    invoke-direct {p0, v0, v1, v2}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->matchStringLength(Ljava/lang/String;II)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "\u6635\u79f0\u683c\u5f0f\u6709\u8bef\uff0c\u8f93\u51651\u81f324\u4f4d\u5b57\u6bcd\u6216\u6570\u5b57\u6216\u6c49\u5b57"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->error(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "\u6635\u79f0\u4e0d\u80fd\u548c\u8d26\u53f7\u76f8\u540c"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->error(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->submitNewNickname:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->dialogLoding:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 8
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->changeNickName(Ljava/lang/String;)V

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
    iget-object p2, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->userIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->dialogLoding:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->accountBean:Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->userIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    return-void
.end method

.method showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->userIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f080f33

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->userIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->t(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->nickName:Landroid/widget/EditText;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity;->showKeyborad(Landroid/widget/EditText;)V

    return-void
.end method

.method showKeyborad(Landroid/widget/EditText;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x258L
    .end annotation

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
