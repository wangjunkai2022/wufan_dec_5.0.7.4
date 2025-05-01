.class public Lcom/join/mgps/fragment/MGManageFragment;
.super Landroidx/fragment/app/Fragment;
.source "MGManageFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c061e
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/join/mgps/adapter/a2;

.field private d:Lcom/wufan/user/service/protobuf/n0;

.field e:Lcom/join/mgps/customview/XListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/mgps/rpc/b;

.field g:Lcom/join/mgps/rpc/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method V(Landroid/content/Intent;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.apkinstal.action.broadcast"
        }
    .end annotation

    const-string v0, "packageName"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "actionFrom"

    .line 2
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "android.intent.action.PACKAGE_ADDED"

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "com.papa91.gba"

    const-string v3, "com.papa91.vba"

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {p1, v0, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/a2;->e(Z)V

    goto :goto_0

    :cond_1
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {p1, v0, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez p1, :cond_2

    if-eqz v0, :cond_4

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/a2;->e(Z)V

    goto :goto_0

    :cond_3
    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    return-void
.end method

.method W()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MGManageFragment;->a0()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    :try_start_0
    invoke-static {}, Lcom/wufan/user/service/protobuf/b0;->k3()Lcom/wufan/user/service/protobuf/b0$b;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->e3(I)Lcom/wufan/user/service/protobuf/b0$b;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb3/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->Y2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 8
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v2, "uid"

    .line 9
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

    const-string/jumbo v2, "token"

    .line 10
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0$b;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "appVersion"

    .line 11
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0$b;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/b0$b;->a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;

    .line 13
    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->g:Lcom/join/mgps/rpc/c;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/c;->e(Lcom/wufan/user/service/protobuf/b0;)Lcom/wufan/user/service/protobuf/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    .line 15
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/MGManageFragment;->Z(Lcom/wufan/user/service/protobuf/n0;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/d0;->getError()I

    move-result v0

    const/16 v1, 0x2bd

    if-ne v0, v1, :cond_2

    .line 17
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/MGManageFragment;->X(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method X(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/b;->accountLoginOut(Landroid/content/Context;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo v0, "\u9a8c\u8bc1\u767b\u5f55\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55."

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/a2;->d(Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method

.method Z(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0$b;

    .line 3
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->F3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->K3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->O1()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->e4(J)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->a4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->v1()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->P3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->p4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->V3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->F3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->c4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->k4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->Y0()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->M3(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->z0()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/wufan/user/service/protobuf/n0$b;->h4(I)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lcom/wufan/user/service/protobuf/n0;

    iput-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    .line 15
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/a2;->d(Lcom/wufan/user/service/protobuf/n0;)V

    :cond_0
    return-void
.end method

.method a0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/a2;->d(Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method

.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->f:Lcom/join/mgps/rpc/b;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/b;->k()Lcom/join/mgps/rpc/c;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->g:Lcom/join/mgps/rpc/c;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    .line 4
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    .line 5
    new-instance v0, Lcom/join/mgps/adapter/a2;

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/a2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->d:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/a2;->d(Lcom/wufan/user/service/protobuf/n0;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->e:Lcom/join/mgps/customview/XListView;

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    const-string v2, "com.papa91.vba"

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/MGManageFragment;->b:Landroid/content/Context;

    const-string v3, "com.papa91.gba"

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/MGManageFragment;->c:Lcom/join/mgps/adapter/a2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/a2;->e(Z)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MGManageFragment;->W()V

    return-void
.end method
