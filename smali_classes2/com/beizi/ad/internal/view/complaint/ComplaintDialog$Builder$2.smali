.class Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;
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
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$202(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Z)Z

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;->val$context:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$300(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/EditText;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$400(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;Landroid/widget/EditText;)V

    return-void
.end method
