.class Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;
.super Ljava/lang/Object;
.source "AndroidPermissionDialogActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->l0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object p1

    instance-of p1, p1, Lw1/a;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->m0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object p1

    check-cast p1, Lw1/a;

    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-interface {p1, v0}, Lw1/a;->b(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method
