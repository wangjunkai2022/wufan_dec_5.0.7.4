.class Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;
.super Ljava/lang/Object;
.source "HideAppSetPwdActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string p2, "."

    .line 2
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const-string p2, "\u00d7"

    .line 3
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;

    invoke-static {p2, p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
