.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->getAccount()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/dto/WebAccountDataBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/WebAccountDataBean;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->x0(Lcom/join/mgps/fragment/CommonWebviewFragment;Lcom/wufan/user/service/protobuf/n0;)Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->w0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/dto/AccountBean;->convert(Lcom/wufan/user/service/protobuf/n0;)Lcom/join/mgps/dto/AccountBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/WebAccountDataBean;->setAccountBean(Lcom/join/mgps/dto/AccountBean;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->w0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/WebAccountDataBean;->setHasLogin(Z)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "javascript:papaPutAccountData("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v0, v2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->y0(Lcom/join/mgps/fragment/CommonWebviewFragment;Z)Z

    .line 8
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e0;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;II)V

    :goto_0
    return-void
.end method
