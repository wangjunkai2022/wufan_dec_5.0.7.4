.class Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity$a;
.super Ljava/lang/Object;
.source "HideAppNotebookActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;

    iget-boolean p2, p1, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;->e:Z

    if-nez p2, :cond_0

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity_;->A2(Landroid/content/Context;)Lcom/join/mgps/activity/MGMainActivity_$q3;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity$a;->b:Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method
