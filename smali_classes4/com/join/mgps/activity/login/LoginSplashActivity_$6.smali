.class Lcom/join/mgps/activity/login/LoginSplashActivity_$6;
.super Lorg/androidannotations/api/a$c;
.source "LoginSplashActivity_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginSplashActivity_;->oneKeyLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginSplashActivity_;

.field final synthetic val$accessToken:Ljava/lang/String;

.field final synthetic val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

.field final synthetic val$token:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginSplashActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity_;

    iput-object p6, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$token:Ljava/lang/String;

    iput-object p7, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$accessToken:Ljava/lang/String;

    iput-object p8, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    invoke-direct {p0, p2, p3, p4, p5}, Lorg/androidannotations/api/a$c;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$token:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$accessToken:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/login/LoginSplashActivity_$6;->val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->access$501(Lcom/join/mgps/activity/login/LoginSplashActivity_;Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
