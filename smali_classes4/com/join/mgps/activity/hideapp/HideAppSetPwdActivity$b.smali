.class Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;
.super Ljava/lang/Object;
.source "HideAppSetPwdActivity.java"

# interfaces
.implements Lcom/join/mgps/dialog/a1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    iget v1, v0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    .line 2
    iget-object v0, v0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->hide_app_pwd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    const-string v0, "\u91cd\u7f6e\u5bc6\u7801\u6210\u529f"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->showMessage(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    .line 5
    :cond_0
    invoke-static {v0, p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/lang/String;)V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V

    return-void
.end method
