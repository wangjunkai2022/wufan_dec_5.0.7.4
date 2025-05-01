.class Lcom/join/mgps/activity/login/LoginSplashActivity$2;
.super Lcom/netease/nis/quicklogin/listener/LoginListener;
.source "LoginSplashActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginSplashActivity;->gotoOneKeyLogin()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$2;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-direct {p0}, Lcom/netease/nis/quicklogin/listener/LoginListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisagreePrivacy(Landroid/widget/TextView;Landroid/widget/Button;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$2;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    const-string p2, "\u8bf7\u70b9\u51fb\u540c\u610f\u9690\u79c1\u534f\u8bae"

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    const/16 p2, 0x11

    .line 2
    invoke-virtual {p1, p2, v0, v0}, Landroid/widget/Toast;->setGravity(III)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, 0x1

    return p1
.end method
