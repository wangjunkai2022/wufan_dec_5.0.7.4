.class Lcom/join/mgps/activity/MGMainActivity$k$a;
.super Ljava/lang/Object;
.source "MGMainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity$k;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGMainActivity$k;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$k;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity;->access$1700(Lcom/join/mgps/activity/MGMainActivity;)Lcom/join/android/app/common/dialog/f;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$k;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity;->access$1700(Lcom/join/mgps/activity/MGMainActivity;)Lcom/join/android/app/common/dialog/f;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$k;->b:Lcom/join/mgps/activity/MGMainActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/MGMainActivity;->access$1702(Lcom/join/mgps/activity/MGMainActivity;Lcom/join/android/app/common/dialog/f;)Lcom/join/android/app/common/dialog/f;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$k;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity;->access$1400(Lcom/join/mgps/activity/MGMainActivity;)Lcom/join/android/app/common/dialog/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/common/dialog/k;->a()Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    :try_start_1
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$k$a;->b:Lcom/join/mgps/activity/MGMainActivity$k;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$k;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity;->access$1400(Lcom/join/mgps/activity/MGMainActivity;)Lcom/join/android/app/common/dialog/k;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method
