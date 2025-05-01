.class Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;
.super Ljava/lang/Object;
.source "ComplaintDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$200(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$202(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Z)Z

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->val$context:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$300(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/EditText;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$400(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;Landroid/widget/EditText;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$500(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$500(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$600(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$600(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;->onDialogCloseClick()V

    :cond_2
    :goto_0
    return-void
.end method
