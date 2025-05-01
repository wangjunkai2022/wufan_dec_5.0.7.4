.class Lcom/join/mgps/activity/AndroidPermissionDialogActivity$a;
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
    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$a;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$a;->b:Lcom/join/mgps/activity/AndroidPermissionDialogActivity;

    invoke-virtual {p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method
